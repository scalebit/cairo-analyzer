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
	private int start_comment;
	private int start_raw_string;
	private int raw_string_hashes;
	private int comment_depth;
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
%state FN_DECL_START

%%

<YYINITIAL> {
	{WHITE_SPACE}+                                  { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

	// Keywords
	"as"                                            { yybegin(YYINITIAL); return CairoTokens.KW_AS; }
	"break"                                         { yybegin(YYINITIAL); return CairoTokens.KW_BREAK; }
	"const"                                         { yybegin(YYINITIAL); return CairoTokens.KW_CONST; }
	"crate"                                         { yybegin(YYINITIAL); return CairoTokens.KW_CRATE; }
	"else"                                          { yybegin(YYINITIAL); return CairoTokens.KW_ELSE; }
	"enum"                                          { yybegin(YYINITIAL); return CairoTokens.KW_ENUM; }
	"extern"                                        { yybegin(YYINITIAL); return CairoTokens.KW_EXTERN; }
	"false"                                         { yybegin(YYINITIAL); return CairoTokens.KW_FALSE; }
	"fn"                                            { yybegin(FN_DECL_START); return CairoTokens.KW_FN; }
	"for"                                           { yybegin(YYINITIAL); return CairoTokens.KW_FOR; }
	"if"                                            { yybegin(YYINITIAL); return CairoTokens.KW_IF; }
	"impl"                                          { yybegin(YYINITIAL); return CairoTokens.KW_IMPL; }
	"in"                                            { yybegin(YYINITIAL); return CairoTokens.KW_IN; }
	"let"                                           { yybegin(YYINITIAL); return CairoTokens.KW_LET; }
	"loop"                                          { yybegin(YYINITIAL); return CairoTokens.KW_LOOP; }
	"match"                                         { yybegin(YYINITIAL); return CairoTokens.KW_MATCH; }
	"mod"                                           { yybegin(YYINITIAL); return CairoTokens.KW_MOD; }
	"mut"                                           { yybegin(YYINITIAL); return CairoTokens.KW_MUT; }
	"priv"                                          { yybegin(YYINITIAL); return CairoTokens.KW_PRIV; }
	"proc"                                          { yybegin(YYINITIAL); return CairoTokens.KW_PROC; }
	"move"                                          { yybegin(YYINITIAL); return CairoTokens.KW_MOVE; }
	"pub"                                           { yybegin(YYINITIAL); return CairoTokens.KW_PUB; }
	"ref"                                           { yybegin(YYINITIAL); return CairoTokens.KW_REF; }
	"return"                                        { yybegin(YYINITIAL); return CairoTokens.KW_RETURN; }
	"self"                                          { yybegin(YYINITIAL); return CairoTokens.KW_SELF; }
	"static"                                        { yybegin(YYINITIAL); return CairoTokens.KW_STATIC; }
	"struct"                                        { yybegin(YYINITIAL); return CairoTokens.KW_STRUCT; }
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
	{XID_START}{XID_CONTINUE}*                      { yybegin(YYINITIAL); return CairoTokens.IDENTIFIER; }


	"..."                                           { yybegin(YYINITIAL); return CairoTokens.TRIPLE_DOT; }
	".."                                            { yybegin(YYINITIAL); return CairoTokens.DOUBLE_DOT; }
	">>="                                           { yybegin(YYINITIAL); return CairoTokens.ASSIGN_RIGHT_SHIFT; }
	"<<="                                           { yybegin(YYINITIAL); return CairoTokens.ASSIGN_LEFT_SHIFT; }
	"=>"                                            { yybegin(YYINITIAL); return CairoTokens.FAT_ARROW; }
	"->"                                            { yybegin(YYINITIAL); return CairoTokens.THIN_ARROW; }
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

<FN_DECL_START> {

    {WHITE_SPACE}+                                  { yybegin(FN_DECL_START); return TokenType.WHITE_SPACE; }
    {XID_START}{XID_CONTINUE}*
        {
              yybegin(YYINITIAL);
                    return CairoTokens.FN_DECLARATION;
        }

//    “ ”*{XID_START}{XID_CONTINUE}*
//            {
//                    System.out.println("start fn_decl_start <");
//                  yybegin(YYINITIAL);
//                        String funcation_decl = yytext().toString();
//                        int funcation_decl_end = funcation_decl.indexOf("<");
//                        zzStartRead += funcation_decl_end - 1;
//                        zzMarkedPos = zzStartRead + 1;
//                        return CairoTokens.FN_DECLARATION;
//            }
//    . { System.out.println("start fn_decl_start other"); yybegin(YYINITIAL); }
}