package cairo;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.text.CharArrayUtil;
import com.intellij.psi.TokenType;
import cairo.psi.CairoTokens;

%%

%class CairoLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%{

    public enum CallGenericType {
            FN_DECL, STRUCT_DECL, IMPL_DECL, RETURN_TYPE, FN_PARA_TYPE, ITEM_TYPE
    }
    public enum CallItemType {
                FN_PARA, FN_RETURN, STRUCT_FIELD, IMPL_FIRST
    }
    public enum CallCommentType {
                LET, STRUCT_FIELD
    }
	private int start_comment;
	private int start_raw_string;
	private int raw_string_hashes;
	private int comment_depth, item_type_parenthesis_depth = 0;
    private int generic_para_depth = 0;
    private CallGenericType call_generic_type;
    private CallItemType call_item_type;
    private CallCommentType call_comment_type;
	private boolean doc_comment;
%}

WHITE_SPACE = [\ \t\n\r]
XID_START = [a-zA-Z_]
XID_CONTINUE = [a-zA-Z0-9_]
HEX_DIGIT = [a-fA-F0-9]
DOUBLE_QUOTE = \x22
SINGLE_QUOTE = \x27
COMMON_ESCAPE = ( [nrt0\n\r\\] | "x" {HEX_DIGIT} {2} | "u" {HEX_DIGIT} {4} | "U" {HEX_DIGIT} {8} )
CHAR = {SINGLE_QUOTE} (( [^'\\] | "\\" ( {SINGLE_QUOTE} | {COMMON_ESCAPE}) ) | [^\x20-\x7E]{1,2}) {SINGLE_QUOTE}
STRING = {DOUBLE_QUOTE} ( [^\"\\] | "\\" ( {DOUBLE_QUOTE} | {SINGLE_QUOTE} | {COMMON_ESCAPE}) )* {DOUBLE_QUOTE}
NUM_SUFFIX = {INT_SUFFIX} | {FLOAT_SUFFIX}
INT_SUFFIX = [ui] ( "8" | "16" | "32" | "64" )?
EXPONENT = [eE] [-+]? ([0-9] | "_" )+
FLOAT_SUFFIX = ( {EXPONENT} | "." [0-9_]+ {EXPONENT}?)? ("f" ("32" | "64")?)?
DEC_LIT = [0-9] [0-9_]* {NUM_SUFFIX}?
BIN_LIT = "0b" [01_]+ {INT_SUFFIX}?
OCT_LIT = "0o" [0-7_]+ {INT_SUFFIX}?
HEX_LIT = "0x" [a-fA-F0-9_]+ {INT_SUFFIX}?

%state IN_BLOCK_COMMENT
%state IN_RAW_STRING
%state FN_DECL_START, FN_DECL_PARA, FN_RETURN_DECL_TYPE
%state LET_START, LET_SINGLE_IDENTIFY
%state CONST_START, CONST_SINGLE_IDENTIFY
%state HASH_START
%state GENERIC_PARAM_STATE, NESTED_GENERIC_PARAM_STATE
%state STATE_STRUCT_FIELD, STRUCT_DECL_START,STATE_STRUCT_FIELD_TYPE
%state IMPL_DECL
%state ITEM_TYPE

%%

<YYINITIAL> {
	{WHITE_SPACE}+                                  { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

	// Keywords
	"as"                                            { yybegin(YYINITIAL); return CairoTokens.KW_AS; }
	"break"                                         { yybegin(YYINITIAL); return CairoTokens.KW_BREAK; }
	"const"                                         { yybegin(CONST_START); return CairoTokens.KW_CONST; }
	"crate"                                         { yybegin(YYINITIAL); return CairoTokens.KW_CRATE; }
	"else"                                          { yybegin(YYINITIAL); return CairoTokens.KW_ELSE; }
	"enum"                                          { yybegin(YYINITIAL); return CairoTokens.KW_ENUM; }
	"extern"                                        { yybegin(YYINITIAL); return CairoTokens.KW_EXTERN; }
	"false"                                         { yybegin(YYINITIAL); return CairoTokens.KW_FALSE; }
	"fn"                                            { yybegin(FN_DECL_START); return CairoTokens.KW_FN; }
	"for"                                           { yybegin(YYINITIAL); return CairoTokens.KW_FOR; }
	"if"                                            { yybegin(YYINITIAL); return CairoTokens.KW_IF; }
	"impl"                                          { yybegin(IMPL_DECL); return CairoTokens.KW_IMPL; }
	"in"                                            { yybegin(YYINITIAL); return CairoTokens.KW_IN; }
	"let"                                           { yybegin(LET_START); return CairoTokens.KW_LET; }
	"loop"                                          { yybegin(YYINITIAL); return CairoTokens.KW_LOOP; }
	"match"                                         { yybegin(YYINITIAL); return CairoTokens.KW_MATCH; }
	"mod"                                           { yybegin(YYINITIAL); return CairoTokens.KW_MOD; }
	"mut"                                           { yybegin(YYINITIAL); return CairoTokens.KW_MUT; }
	"priv"                                          { yybegin(YYINITIAL); return CairoTokens.KW_PRIV; }
	"proc"                                          { yybegin(YYINITIAL); return CairoTokens.KW_PROC; }
	"move"                                          { yybegin(YYINITIAL); return CairoTokens.KW_MOVE; }
	"pub"                                           { yybegin(YYINITIAL); return CairoTokens.KW_PUB; }
    "pub("                                          { yybegin(YYINITIAL); zzMarkedPos = zzMarkedPos - 1; return CairoTokens.KW_PUB; }
	"ref"                                           { yybegin(YYINITIAL); return CairoTokens.KW_REF; }
	"return"                                        { yybegin(YYINITIAL); return CairoTokens.KW_RETURN; }
	"self"                                          { yybegin(YYINITIAL); return CairoTokens.KW_SELF; }
	"static"                                        { yybegin(YYINITIAL); return CairoTokens.KW_STATIC; }
	"struct"                                        { yybegin(STRUCT_DECL_START); return CairoTokens.KW_STRUCT; }
	"super"                                         { yybegin(YYINITIAL); return CairoTokens.KW_SUPER; }
	"true"                                          { yybegin(YYINITIAL); return CairoTokens.KW_TRUE; }
	"trait"                                         { yybegin(YYINITIAL); return CairoTokens.KW_TRAIT; }
	"type"                                          { yybegin(YYINITIAL); return CairoTokens.KW_TYPE; }
	"unsafe"                                        { yybegin(YYINITIAL); return CairoTokens.KW_UNSAFE; }
	"use"                                           { yybegin(YYINITIAL); return CairoTokens.KW_USE; }
	"while"                                         { yybegin(YYINITIAL); return CairoTokens.KW_WHILE; }
	"continue"                                      { yybegin(YYINITIAL); return CairoTokens.KW_CONTINUE; }
//	"box"                                           { yybegin(YYINITIAL); return CairoTokens.KW_BOX; }
	"where"                                         { yybegin(YYINITIAL); return CairoTokens.KW_WHERE; }
	"macro_rules!"                                  { yybegin(YYINITIAL); return CairoTokens.KW_MACRO_RULES; }
    "of"                                            { yybegin(YYINITIAL); return CairoTokens.KW_OF; }
    "nopanic"                                       { yybegin(YYINITIAL); return CairoTokens.KW_NOPANIC; }

	"/*" ("!"|"*"[^*/])                             { yybegin(IN_BLOCK_COMMENT); start_comment = zzStartRead; doc_comment = true; comment_depth = 1; }
	"/**" / "/"                                     { yybegin(IN_BLOCK_COMMENT); start_comment = zzStartRead; doc_comment = true; comment_depth = 1; }
	"/*"                                            { yybegin(IN_BLOCK_COMMENT); start_comment = zzStartRead; doc_comment = false; comment_depth = 1; }
	"///" $                                         { yybegin(YYINITIAL); return CairoTokens.LINE_DOC_COMMENT; }
	"//" ("!"|"/"[^/\n\r])[^\n\r]*                  { yybegin(YYINITIAL); return CairoTokens.LINE_DOC_COMMENT; }
	"//" [^\n\r]*                                   { yybegin(YYINITIAL); return CairoTokens.LINE_COMMENT; }
	{CHAR}                                          { yybegin(YYINITIAL); return CairoTokens.CHAR_LIT; }
	{STRING}                                        { yybegin(YYINITIAL); return CairoTokens.STRING_LIT; }
	"r" "#"* {DOUBLE_QUOTE}                         { yybegin(IN_RAW_STRING); start_raw_string = zzStartRead; raw_string_hashes = yytext().length() - 1; }

	{BIN_LIT}                                       { yybegin(YYINITIAL); return CairoTokens.BIN_LIT; }
	{OCT_LIT}                                       { yybegin(YYINITIAL); return CairoTokens.OCT_LIT; }
	{HEX_LIT}                                       { yybegin(YYINITIAL); return CairoTokens.HEX_LIT; }
	// The 0. syntax can get ambiguious with range matches
	// ie 0..9 could be tokenized as 0. . 9, which would be bad.
	[0-9] [0-9_]* "." /[^\.0-9e]                         { yybegin(YYINITIAL); return CairoTokens.DEC_LIT; }
	{DEC_LIT}                                       { yybegin(YYINITIAL); return CairoTokens.DEC_LIT; }

    {XID_START}{XID_CONTINUE}*"("                   { yybegin(YYINITIAL); zzMarkedPos = zzMarkedPos - 1; return CairoTokens.EXPR_CALL; }
	{XID_START}{XID_CONTINUE}*"!("                  { yybegin(YYINITIAL); zzMarkedPos = zzMarkedPos - 1; return CairoTokens.MACRO_EXPR_CALL; }
	{XID_START}{XID_CONTINUE}*                      { yybegin(YYINITIAL); return CairoTokens.IDENTIFIER; }


	"..."                                           { yybegin(YYINITIAL); return CairoTokens.TRIPLE_DOT; }
	".."                                            { yybegin(YYINITIAL); return CairoTokens.DOUBLE_DOT; }
	">>="                                           { yybegin(YYINITIAL); return CairoTokens.ASSIGN_RIGHT_SHIFT; }
	"<<="                                           { yybegin(YYINITIAL); return CairoTokens.ASSIGN_LEFT_SHIFT; }
	"=>"                                            { yybegin(YYINITIAL); return CairoTokens.FAT_ARROW; }
	"->"                                            { yybegin(FN_RETURN_DECL_TYPE); return CairoTokens.THIN_ARROW; }
	"."                                             { yybegin(YYINITIAL); return CairoTokens.DOT; }

	"&"                                             { yybegin(YYINITIAL); return CairoTokens.BITWISE_AND; }
	"|"                                             { yybegin(YYINITIAL); return CairoTokens.BITWISE_OR; }
	"^"                                             { yybegin(YYINITIAL); return CairoTokens.BITWISE_XOR; }

	"::"                                            { yybegin(YYINITIAL); return CairoTokens.DOUBLE_COLON; }
	":"                                             { yybegin(YYINITIAL); return CairoTokens.COLON; }

	"+"                                             { yybegin(YYINITIAL); return CairoTokens.PLUS; }
	"-"                                             { yybegin(YYINITIAL); return CairoTokens.MINUS; }
	"*"                                             { yybegin(YYINITIAL); return CairoTokens.MULTIPLY; }
	"/"                                             { yybegin(YYINITIAL); return CairoTokens.DIVIDE; }
	"%"                                             { yybegin(YYINITIAL); return CairoTokens.REMAINDER; }

	"=="                                            { yybegin(YYINITIAL); return CairoTokens.EQUAL; }
	"="                                             { yybegin(YYINITIAL); return CairoTokens.ASSIGN; }
	"!="                                            { yybegin(YYINITIAL); return CairoTokens.NOT_EQUAL; }
	"<="                                            { yybegin(YYINITIAL); return CairoTokens.LESS_THAN_OR_EQUAL; }
	"<"                                             { yybegin(YYINITIAL); return CairoTokens.LESS_THAN; }
	">="                                            { yybegin(YYINITIAL); return CairoTokens.GREATER_THAN_OR_EQUAL; }
	">"                                             { yybegin(YYINITIAL); return CairoTokens.GREATER_THAN; }

	"!"                                             { yybegin(YYINITIAL); return CairoTokens.NOT; }
	"~"                                             { yybegin(YYINITIAL); return CairoTokens.BOX; }
	"@"                                             { yybegin(YYINITIAL); return CairoTokens.AT; }
	"'"                                             { yybegin(YYINITIAL); return CairoTokens.SINGLE_QUOTE; }
	"$"                                             { yybegin(YYINITIAL); return CairoTokens.DOLLAR; }

    "#["                                             { yybegin(HASH_START); return CairoTokens.HASH; }
	"#"                                             { yybegin(YYINITIAL); return CairoTokens.HASH; }
	"["                                             { yybegin(YYINITIAL); return CairoTokens.OPEN_SQUARE_BRACKET; }
	"]"                                             { yybegin(YYINITIAL); return CairoTokens.CLOSE_SQUARE_BRACKET; }
	"("                                             { yybegin(YYINITIAL); return CairoTokens.OPEN_PAREN; }
	")"                                             { yybegin(YYINITIAL); return CairoTokens.CLOSE_PAREN; }
	"{"                                             { yybegin(YYINITIAL); return CairoTokens.OPEN_BRACE; }
	"}"                                             { yybegin(YYINITIAL); return CairoTokens.CLOSE_BRACE; }
	","                                             { yybegin(YYINITIAL); return CairoTokens.COMMA; }
	";"                                             { yybegin(YYINITIAL); return CairoTokens.SEMICOLON; }

	.                                               { yybegin(YYINITIAL); return TokenType.BAD_CHARACTER; }
}

<IN_BLOCK_COMMENT> {
	"*/"        {
		if (--comment_depth == 0) {
			yybegin(YYINITIAL);
            if (call_comment_type == CallCommentType.STRUCT_FIELD) {
                yybegin(STATE_STRUCT_FIELD);
            }
			zzStartRead = start_comment;
			return doc_comment ? CairoTokens.BLOCK_DOC_COMMENT : CairoTokens.BLOCK_COMMENT;
		} else {
			yybegin(IN_BLOCK_COMMENT);
		}
	}
	"/*"        { yybegin(IN_BLOCK_COMMENT); ++comment_depth; }
	[^*/]+      { yybegin(IN_BLOCK_COMMENT); }
	<<EOF>>     { yybegin(YYINITIAL); zzStartRead = start_comment; return CairoTokens.BLOCK_COMMENT; }
	.           { yybegin(IN_BLOCK_COMMENT); }
}

<IN_RAW_STRING> {
	{DOUBLE_QUOTE} "#"*   {
		if (yytext().length() >= raw_string_hashes) {
			// Greedily ate too many #'s ... lets rewind a sec.
			if (yytext().length() > raw_string_hashes) {
				yypushback(yytext().length() - raw_string_hashes);
			}
			yybegin(YYINITIAL);
			zzStartRead = start_raw_string;
			return CairoTokens.RAW_STRING_LIT;
		} else {
			yybegin(IN_RAW_STRING);
		}
	}
	[^\"]   { yybegin(IN_RAW_STRING); }
	<<EOF>> { yybegin(YYINITIAL); zzStartRead = start_raw_string; return CairoTokens.RAW_STRING_LIT; }
	.       { yybegin(IN_RAW_STRING); }
}

<HASH_START> {
    {WHITE_SPACE}+                                  { yybegin(HASH_START); return TokenType.WHITE_SPACE; }
    {XID_START}{XID_CONTINUE}*                      { yybegin(HASH_START); return CairoTokens.KW_HASH;}
    "("                                             { yybegin(HASH_START); return CairoTokens.OPEN_PAREN;}
    ")"                                             { yybegin(HASH_START); return CairoTokens.CLOSE_PAREN;}
    ","                                             { yybegin(HASH_START); return CairoTokens.COMMA;}
    "]"                                             {yybegin(YYINITIAL); return CairoTokens.CLOSE_SQUARE_BRACKET;}
    '\n'                                            {yybegin(YYINITIAL);}
    .                                               {zzMarkedPos = zzMarkedPos - 1; zzStartRead -= 1; yybegin(YYINITIAL);}
}

<STRUCT_DECL_START> {
    {WHITE_SPACE}+                                  { yybegin(STRUCT_DECL_START); return TokenType.WHITE_SPACE; }
    {XID_START}{XID_CONTINUE}*                      { yybegin(STRUCT_DECL_START); return CairoTokens.TYPE;}
    "<"                                             {yybegin(GENERIC_PARAM_STATE); call_generic_type = CallGenericType.STRUCT_DECL; generic_para_depth = 0; return CairoTokens.LESS_THAN;}
    "{"                                             {yybegin(STATE_STRUCT_FIELD); return CairoTokens.OPEN_BRACE;}
    '\n'                                            {yybegin(YYINITIAL);}
    .                                               {zzMarkedPos = zzMarkedPos - 1; zzStartRead -= 1; yybegin(YYINITIAL);}
}

<STATE_STRUCT_FIELD> {
  "/*" ("!"|"*"[^*/])                             { yybegin(IN_BLOCK_COMMENT); call_comment_type = CallCommentType.STRUCT_FIELD;start_comment = zzStartRead; doc_comment = true; comment_depth = 1; }
  "/**" / "/"                                     { yybegin(IN_BLOCK_COMMENT); call_comment_type = CallCommentType.STRUCT_FIELD;start_comment = zzStartRead; doc_comment = true; comment_depth = 1; }
  "/*"                                            { yybegin(IN_BLOCK_COMMENT); call_comment_type = CallCommentType.STRUCT_FIELD;start_comment = zzStartRead; doc_comment = false; comment_depth = 1; }
  "///" $                                         { yybegin(STATE_STRUCT_FIELD); return CairoTokens.LINE_DOC_COMMENT; }
  "//" ("!"|"/"[^/\n\r])[^\n\r]*                  { yybegin(STATE_STRUCT_FIELD); return CairoTokens.LINE_DOC_COMMENT; }
  "//" [^\n\r]*                                   { yybegin(STATE_STRUCT_FIELD); return CairoTokens.LINE_COMMENT; }

    "pub"                                           { yybegin(STATE_STRUCT_FIELD); return CairoTokens.KW_PUB; }
    "crate"                                         { yybegin(STATE_STRUCT_FIELD); return CairoTokens.KW_CRATE; }
    {WHITE_SPACE}+                                  { yybegin(STATE_STRUCT_FIELD); return TokenType.WHITE_SPACE; }
    "("                                             { yybegin(STATE_STRUCT_FIELD); return CairoTokens.OPEN_PAREN; }
    ")"                                             { yybegin(STATE_STRUCT_FIELD); return CairoTokens.CLOSE_PAREN; }

     {XID_START}{XID_CONTINUE}*                     {yybegin(STATE_STRUCT_FIELD); return CairoTokens.IDENTIFIER;}
     ":"                                            {item_type_parenthesis_depth = 0;call_item_type = CallItemType.STRUCT_FIELD;yybegin(ITEM_TYPE);  return CairoTokens.COLON;}
    "}"                                             {yybegin(YYINITIAL);}
    '\n'                                            {yybegin(STATE_STRUCT_FIELD);}
     .                                               {zzMarkedPos = zzMarkedPos - 1; zzStartRead -= 1; yybegin(YYINITIAL);}
}

<CONST_START> {
    {WHITE_SPACE}+                                  { yybegin(CONST_START); return TokenType.WHITE_SPACE; }
    {XID_START}{XID_CONTINUE}*                      { yybegin(CONST_SINGLE_IDENTIFY); return CairoTokens.IDENTIFIER;}
    '\n'                                            {yybegin(YYINITIAL);}
    .                                               {zzMarkedPos = zzMarkedPos - 1; zzStartRead -= 1; yybegin(YYINITIAL);}
}

<CONST_SINGLE_IDENTIFY> {
    {WHITE_SPACE}+                                  { yybegin(CONST_SINGLE_IDENTIFY); return TokenType.WHITE_SPACE; }
    ":"                                             { item_type_parenthesis_depth = 0;yybegin(ITEM_TYPE); return CairoTokens.COLON;}
    '\n'                                            {yybegin(YYINITIAL);}
    .                                               {zzMarkedPos = zzMarkedPos - 1; zzStartRead -= 1; yybegin(YYINITIAL);}
}

<LET_START> {
    {WHITE_SPACE}+                                  { yybegin(LET_START); return TokenType.WHITE_SPACE; }
    "mut"                                           { yybegin(LET_START); return CairoTokens.KW_MUT; }
    {XID_START}{XID_CONTINUE}*                      { yybegin(LET_SINGLE_IDENTIFY); return CairoTokens.IDENTIFIER;}
    '\n'                                            {yybegin(YYINITIAL);}
    .                                               {zzMarkedPos = zzMarkedPos - 1; zzStartRead -= 1; yybegin(YYINITIAL);}
}

<LET_SINGLE_IDENTIFY> {
    {WHITE_SPACE}+                                  { yybegin(LET_SINGLE_IDENTIFY); return TokenType.WHITE_SPACE; }
    ":"                                             { item_type_parenthesis_depth = 0;yybegin(ITEM_TYPE); return CairoTokens.COLON;}
    '\n'                                            {yybegin(YYINITIAL);}
    .                                               {zzMarkedPos = zzMarkedPos - 1; zzStartRead -= 1; yybegin(YYINITIAL);}
}

<FN_DECL_START> {
    {WHITE_SPACE}+                                  { yybegin(FN_DECL_START); return TokenType.WHITE_SPACE; }
    {XID_START}{XID_CONTINUE}*                      {yybegin(FN_DECL_START); return CairoTokens.FN_DECLARATION;}
    "<"                                             {yybegin(GENERIC_PARAM_STATE); call_generic_type = CallGenericType.FN_DECL; generic_para_depth = 0; return CairoTokens.LESS_THAN;}
    "("                                             {yybegin(FN_DECL_PARA); return CairoTokens.OPEN_PAREN;}
      "{"                                             {yybegin(YYINITIAL);}
    '\n'                                            {yybegin(YYINITIAL);}
    .                                               {zzMarkedPos = zzMarkedPos - 1; zzStartRead -= 1; yybegin(YYINITIAL);}
}

<FN_DECL_PARA> {
    {WHITE_SPACE}+                                  { yybegin(FN_DECL_PARA); return TokenType.WHITE_SPACE; }
      ")"                                           { yybegin(FN_DECL_START); return CairoTokens.CLOSE_PAREN; }
     "ref"                                           { yybegin(FN_DECL_PARA); return CairoTokens.KW_REF; }
     "mut"                                           { yybegin(FN_DECL_PARA); return CairoTokens.KW_MUT; }
    {XID_START}{XID_CONTINUE}*                      {yybegin(FN_DECL_PARA); return CairoTokens.IDENTIFIER;}
    ":"                                              {item_type_parenthesis_depth = 0;yybegin(ITEM_TYPE);  call_item_type = CallItemType.FN_PARA;return CairoTokens.COLON; }
    '\n'                                            {yybegin(YYINITIAL);}
     .                                               {zzMarkedPos = zzMarkedPos - 1; zzStartRead -= 1; yybegin(YYINITIAL);}
}

<FN_RETURN_DECL_TYPE> {
    {WHITE_SPACE}+                                  { yybegin(FN_RETURN_DECL_TYPE); return TokenType.WHITE_SPACE; }
   ")"                                             { yybegin(FN_RETURN_DECL_TYPE); return CairoTokens.CLOSE_PAREN; }
   "ref"                                           { yybegin(FN_RETURN_DECL_TYPE); return CairoTokens.KW_REF; }
   "mut"                                           { yybegin(FN_RETURN_DECL_TYPE); return CairoTokens.KW_MUT; }
   "nopanic"                                         { yybegin(FN_RETURN_DECL_TYPE); return CairoTokens.KW_NOPANIC; }
   "@"*{XID_START}{XID_CONTINUE}*                      {item_type_parenthesis_depth = 0;yybegin(ITEM_TYPE); return CairoTokens.TYPE;}
    "("                                              {item_type_parenthesis_depth = 0;yybegin(ITEM_TYPE); call_item_type = CallItemType.FN_RETURN;return CairoTokens.COLON; }
    "{"                                             {zzMarkedPos = zzMarkedPos - 1; zzStartRead -= 1; yybegin(FN_DECL_START); return CairoTokens.OPEN_BRACE;}
    '\n'                                            {yybegin(YYINITIAL);}
    .                                             {zzMarkedPos = zzMarkedPos - 1; zzStartRead -= 1; yybegin(YYINITIAL);}
}




<ITEM_TYPE> {
    {WHITE_SPACE}+                                  { yybegin(ITEM_TYPE); return TokenType.WHITE_SPACE; }
    "of"                                            { yybegin(ITEM_TYPE); return CairoTokens.KW_OF; }
    "nopanic"                                         { yybegin(FN_RETURN_DECL_TYPE); return CairoTokens.KW_NOPANIC; }
    "@"*{XID_START}{XID_CONTINUE}*                      {yybegin(ITEM_TYPE); return CairoTokens.TYPE;}
    "@"                                             { yybegin(ITEM_TYPE); return CairoTokens.AT; }
    ","
    {
          if (item_type_parenthesis_depth > 0) {
              yybegin(ITEM_TYPE);
          }
          else if (call_item_type == CallItemType.FN_PARA) {
            yybegin(FN_DECL_PARA);
        }
        else if (call_item_type == CallItemType.FN_RETURN) {
            yybegin(FN_RETURN_DECL_TYPE);
        }
        else if (call_item_type == CallItemType.STRUCT_FIELD) {
            yybegin(STATE_STRUCT_FIELD);
        }
        else if (call_item_type == CallItemType.IMPL_FIRST) {
            yybegin(IMPL_DECL);
        } else {
            yybegin(YYINITIAL);
        }

          return CairoTokens.COMMA;
      }
    "::"                                                {yybegin(ITEM_TYPE); return CairoTokens.DOUBLE_COLON;}
    "<"                          {yybegin(GENERIC_PARAM_STATE); call_generic_type = CallGenericType.ITEM_TYPE;generic_para_depth = 0; return CairoTokens.LESS_THAN;}
    '\n'                                            {yybegin(ITEM_TYPE);}
    ")"
    {
          if (item_type_parenthesis_depth > 0) {
            item_type_parenthesis_depth -= 1;
            yybegin(ITEM_TYPE);
          }
          else if (call_item_type == CallItemType.FN_PARA) {
              yybegin(FN_DECL_PARA);
              zzMarkedPos = zzMarkedPos - 1;
              zzStartRead -= 1;
          }
          else if (call_item_type == CallItemType.FN_RETURN) {
              yybegin(FN_RETURN_DECL_TYPE);
              zzMarkedPos = zzMarkedPos - 1;
                zzStartRead -= 1;
          } else {
            yybegin(YYINITIAL);
            zzMarkedPos = zzMarkedPos - 1;
            zzStartRead -= 1;
          }

          return CairoTokens.CLOSE_PAREN;
      }
    "{"
    {
          zzMarkedPos = zzMarkedPos - 1;
          zzStartRead -= 1;
          if (call_item_type == CallItemType.FN_PARA) {
              yybegin(FN_DECL_PARA);
          }
          else if (call_item_type == CallItemType.FN_RETURN) {
              yybegin(FN_RETURN_DECL_TYPE);
          }
          else if (call_item_type == CallItemType.STRUCT_FIELD) {
              yybegin(STATE_STRUCT_FIELD);
          }
          else if (call_item_type == CallItemType.IMPL_FIRST) {
                  yybegin(IMPL_DECL);
          } else {
                yybegin(YYINITIAL);
            }
          return CairoTokens.OPEN_BRACE;
      }
      "("
      {
        item_type_parenthesis_depth += 1;
        yybegin(ITEM_TYPE);
        return CairoTokens.OPEN_PAREN;
      }
    .                                               {zzMarkedPos = zzMarkedPos - 1; zzStartRead -= 1; yybegin(YYINITIAL);}
}

<GENERIC_PARAM_STATE> {
    {WHITE_SPACE}+                                  { yybegin(GENERIC_PARAM_STATE); return TokenType.WHITE_SPACE; }
      "impl"                                          { yybegin(GENERIC_PARAM_STATE); return CairoTokens.KW_IMPL; }
    [+-]?"@"*{XID_START}{XID_CONTINUE}*
        {
          yybegin(GENERIC_PARAM_STATE); return CairoTokens.TYPE;
        }
    ">"
      {
            if (call_generic_type == CallGenericType.FN_DECL) {
                yybegin(FN_DECL_START);
            }
            else if(call_generic_type == CallGenericType.STRUCT_DECL){
                yybegin(STRUCT_DECL_START);
            }
            else if (call_generic_type == CallGenericType.ITEM_TYPE) {
                yybegin(ITEM_TYPE);
            }
            return CairoTokens.GREATER_THAN;
        }
    ","                                             {yybegin(GENERIC_PARAM_STATE); return CairoTokens.COMMA;}
    "<"                                             {yybegin(NESTED_GENERIC_PARAM_STATE); generic_para_depth += 1; return CairoTokens.LESS_THAN;}
    "("                                             {yybegin(GENERIC_PARAM_STATE); return CairoTokens.OPEN_PAREN;}
    ")"                                             {yybegin(GENERIC_PARAM_STATE); return CairoTokens.CLOSE_PAREN;}
    ":"                                             {yybegin(GENERIC_PARAM_STATE); return CairoTokens.COLON;}
    '\n'                                            {yybegin(YYINITIAL);}
        .                                               {zzMarkedPos = zzMarkedPos - 1; zzStartRead -= 1; yybegin(YYINITIAL);}

}

<NESTED_GENERIC_PARAM_STATE> {
    {WHITE_SPACE}+                                  { yybegin(NESTED_GENERIC_PARAM_STATE); return TokenType.WHITE_SPACE; }
    [+-]?"@"*{XID_START}{XID_CONTINUE}*
        {
              yybegin(NESTED_GENERIC_PARAM_STATE); return CairoTokens.TYPE;
        }
    ">"
    {
          generic_para_depth -= 1;
          if (generic_para_depth == 0) {
            yybegin(GENERIC_PARAM_STATE);
           } else {
            yybegin(NESTED_GENERIC_PARAM_STATE);
          }
        return CairoTokens.GREATER_THAN;
      }
    ","                                             {yybegin(NESTED_GENERIC_PARAM_STATE); return CairoTokens.COMMA;}
    "<"                                             {yybegin(NESTED_GENERIC_PARAM_STATE); generic_para_depth += 1; return CairoTokens.LESS_THAN;}
    '\n'                                            {yybegin(YYINITIAL);}
    .                                               {zzMarkedPos = zzMarkedPos - 1; zzStartRead -= 1; yybegin(YYINITIAL);}
}



<IMPL_DECL> {
    {WHITE_SPACE}+                                  { yybegin(ITEM_TYPE); call_item_type = CallItemType.IMPL_FIRST;return TokenType.WHITE_SPACE; }
     "{"                                             {yybegin(YYINITIAL);}
     '\n'                                            {yybegin(YYINITIAL);}
     .                                               {zzMarkedPos = zzMarkedPos - 1; zzStartRead -= 1; yybegin(YYINITIAL);}
}