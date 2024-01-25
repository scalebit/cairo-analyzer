// This is a generated file. Not intended for manual editing.
package cairo.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import cairo.psi.impl.*;

public interface CairoTokens {

  IElementType ATTRIBUTE = new CairoTokenType("ATTRIBUTE");
  IElementType ATTRIBUTE_ARG = new CairoTokenType("ATTRIBUTE_ARG");
  IElementType BASIC_MATCH_PATTERN = new CairoTokenType("BASIC_MATCH_PATTERN");
  IElementType BLOCK_FOR = new CairoTokenType("BLOCK_FOR");
  IElementType BLOCK_IF = new CairoTokenType("BLOCK_IF");
  IElementType BLOCK_LOOP = new CairoTokenType("BLOCK_LOOP");
  IElementType BLOCK_MATCH = new CairoTokenType("BLOCK_MATCH");
  IElementType BLOCK_UNSAFE = new CairoTokenType("BLOCK_UNSAFE");
  IElementType BLOCK_WHILE = new CairoTokenType("BLOCK_WHILE");
  IElementType CALL_PARAMS = new CairoTokenType("CALL_PARAMS");
  IElementType CLOSURE_BODY = new CairoTokenType("CLOSURE_BODY");
  IElementType CLOSURE_EXPR_ARGS = new CairoTokenType("CLOSURE_EXPR_ARGS");
  IElementType CLOSURE_SUGAR = new CairoTokenType("CLOSURE_SUGAR");
  IElementType CONST_ITEM = new CairoTokenType("CONST_ITEM");
  IElementType EMPTY_STATEMENT = new CairoTokenType("EMPTY_STATEMENT");
  IElementType ENUM_BODY = new CairoTokenType("ENUM_BODY");
  IElementType ENUM_ITEM = new CairoTokenType("ENUM_ITEM");
  IElementType ENUM_VARIANT = new CairoTokenType("ENUM_VARIANT");
  IElementType ENUM_VARIANT_NULLARY = new CairoTokenType("ENUM_VARIANT_NULLARY");
  IElementType ENUM_VARIANT_STRUCT = new CairoTokenType("ENUM_VARIANT_STRUCT");
  IElementType ENUM_VARIANT_STRUCT_MEMBER = new CairoTokenType("ENUM_VARIANT_STRUCT_MEMBER");
  IElementType ENUM_VARIANT_TUPLE = new CairoTokenType("ENUM_VARIANT_TUPLE");
  IElementType EXPR = new CairoTokenType("EXPR");
  IElementType EXPR_AS = new CairoTokenType("EXPR_AS");
  IElementType EXPR_ASSIGN = new CairoTokenType("EXPR_ASSIGN");
  IElementType EXPR_ASSIGN_AND = new CairoTokenType("EXPR_ASSIGN_AND");
  IElementType EXPR_ASSIGN_DECREMENT = new CairoTokenType("EXPR_ASSIGN_DECREMENT");
  IElementType EXPR_ASSIGN_DIVIDE = new CairoTokenType("EXPR_ASSIGN_DIVIDE");
  IElementType EXPR_ASSIGN_INCREMENT = new CairoTokenType("EXPR_ASSIGN_INCREMENT");
  IElementType EXPR_ASSIGN_LEFT_SHIFT = new CairoTokenType("EXPR_ASSIGN_LEFT_SHIFT");
  IElementType EXPR_ASSIGN_MODULO = new CairoTokenType("EXPR_ASSIGN_MODULO");
  IElementType EXPR_ASSIGN_MULTIPLY = new CairoTokenType("EXPR_ASSIGN_MULTIPLY");
  IElementType EXPR_ASSIGN_NOT = new CairoTokenType("EXPR_ASSIGN_NOT");
  IElementType EXPR_ASSIGN_OR = new CairoTokenType("EXPR_ASSIGN_OR");
  IElementType EXPR_ASSIGN_RIGHT_SHIFT = new CairoTokenType("EXPR_ASSIGN_RIGHT_SHIFT");
  IElementType EXPR_BITWISE_AND = new CairoTokenType("EXPR_BITWISE_AND");
  IElementType EXPR_BITWISE_OR = new CairoTokenType("EXPR_BITWISE_OR");
  IElementType EXPR_BITWISE_XOR = new CairoTokenType("EXPR_BITWISE_XOR");
  IElementType EXPR_BLOCK = new CairoTokenType("EXPR_BLOCK");
  IElementType EXPR_BORROW = new CairoTokenType("EXPR_BORROW");
  IElementType EXPR_BOX = new CairoTokenType("EXPR_BOX");
  IElementType EXPR_BREAK = new CairoTokenType("EXPR_BREAK");
  IElementType EXPR_CALL = new CairoTokenType("EXPR_CALL");
  IElementType EXPR_CLOSURE = new CairoTokenType("EXPR_CLOSURE");
  IElementType EXPR_CONTINUE = new CairoTokenType("EXPR_CONTINUE");
  IElementType EXPR_DEREF = new CairoTokenType("EXPR_DEREF");
  IElementType EXPR_DIVIDE = new CairoTokenType("EXPR_DIVIDE");
  IElementType EXPR_EQUAL_TO = new CairoTokenType("EXPR_EQUAL_TO");
  IElementType EXPR_FIELD = new CairoTokenType("EXPR_FIELD");
  IElementType EXPR_GREATER_OR_EQUAL = new CairoTokenType("EXPR_GREATER_OR_EQUAL");
  IElementType EXPR_GREATER_THAN = new CairoTokenType("EXPR_GREATER_THAN");
  IElementType EXPR_IDENTIFIER = new CairoTokenType("EXPR_IDENTIFIER");
  IElementType EXPR_INDEX = new CairoTokenType("EXPR_INDEX");
  IElementType EXPR_LEFT_SHIFT = new CairoTokenType("EXPR_LEFT_SHIFT");
  IElementType EXPR_LESS_OR_EQUAL = new CairoTokenType("EXPR_LESS_OR_EQUAL");
  IElementType EXPR_LESS_THAN = new CairoTokenType("EXPR_LESS_THAN");
  IElementType EXPR_LOGICAL_AND = new CairoTokenType("EXPR_LOGICAL_AND");
  IElementType EXPR_LOGICAL_OR = new CairoTokenType("EXPR_LOGICAL_OR");
  IElementType EXPR_MACRO = new CairoTokenType("EXPR_MACRO");
  IElementType EXPR_MINUS = new CairoTokenType("EXPR_MINUS");
  IElementType EXPR_MODULO = new CairoTokenType("EXPR_MODULO");
  IElementType EXPR_MULTIPLY = new CairoTokenType("EXPR_MULTIPLY");
  IElementType EXPR_NOT_EQUAL_TO = new CairoTokenType("EXPR_NOT_EQUAL_TO");
  IElementType EXPR_PAREN = new CairoTokenType("EXPR_PAREN");
  IElementType EXPR_PATH = new CairoTokenType("EXPR_PATH");
  IElementType EXPR_PLUS = new CairoTokenType("EXPR_PLUS");
  IElementType EXPR_RIGHT_SHIFT = new CairoTokenType("EXPR_RIGHT_SHIFT");
  IElementType EXPR_STRUCT_INITIALIZER = new CairoTokenType("EXPR_STRUCT_INITIALIZER");
  IElementType EXPR_TUPLE_BODY = new CairoTokenType("EXPR_TUPLE_BODY");
  IElementType EXPR_UNARY_MINUS = new CairoTokenType("EXPR_UNARY_MINUS");
  IElementType EXPR_UNARY_NOT = new CairoTokenType("EXPR_UNARY_NOT");
  IElementType EXPR_UNARY_PLUS = new CairoTokenType("EXPR_UNARY_PLUS");
  IElementType EXPR_VALUE = new CairoTokenType("EXPR_VALUE");
  IElementType EXPR_VECTOR = new CairoTokenType("EXPR_VECTOR");
  IElementType EXTERN_BLOCK = new CairoTokenType("EXTERN_BLOCK");
  IElementType EXTERN_CRATE = new CairoTokenType("EXTERN_CRATE");
  IElementType EXTERN_FUNCTION = new CairoTokenType("EXTERN_FUNCTION");
  IElementType EXTERN_ITEM = new CairoTokenType("EXTERN_ITEM");
  IElementType EXTERN_VARIABLE = new CairoTokenType("EXTERN_VARIABLE");
  IElementType FN_ARGS = new CairoTokenType("FN_ARGS");
  IElementType FN_DECLARATION = new CairoTokenType("FN_DECLARATION");
  IElementType FN_ITEM = new CairoTokenType("FN_ITEM");
  IElementType FN_PROTOTYPE_ARGS = new CairoTokenType("FN_PROTOTYPE_ARGS");
  IElementType GENERIC = new CairoTokenType("GENERIC");
  IElementType GENERIC_PARAMS = new CairoTokenType("GENERIC_PARAMS");
  IElementType IF_TAIL = new CairoTokenType("IF_TAIL");
  IElementType IMPL_ASSOC_TYPE = new CairoTokenType("IMPL_ASSOC_TYPE");
  IElementType IMPL_BLOCK = new CairoTokenType("IMPL_BLOCK");
  IElementType IMPL_BODY = new CairoTokenType("IMPL_BODY");
  IElementType IMPL_FOR = new CairoTokenType("IMPL_FOR");
  IElementType IMPL_ITEM = new CairoTokenType("IMPL_ITEM");
  IElementType INDEX_EXPR = new CairoTokenType("INDEX_EXPR");
  IElementType ITEM = new CairoTokenType("ITEM");
  IElementType ITEM_NAME = new CairoTokenType("ITEM_NAME");
  IElementType LET = new CairoTokenType("LET");
  IElementType LET_ARGS = new CairoTokenType("LET_ARGS");
  IElementType LET_BIND = new CairoTokenType("LET_BIND");
  IElementType LET_SELF_ARG = new CairoTokenType("LET_SELF_ARG");
  IElementType LET_STRUCT_BIND = new CairoTokenType("LET_STRUCT_BIND");
  IElementType LET_TUPLE_BIND = new CairoTokenType("LET_TUPLE_BIND");
  IElementType LET_UNIT_BIND = new CairoTokenType("LET_UNIT_BIND");
  IElementType LET_VARIABLE_BIND = new CairoTokenType("LET_VARIABLE_BIND");
  IElementType LIFETIME = new CairoTokenType("LIFETIME");
  IElementType MACRO_BODY = new CairoTokenType("MACRO_BODY");
  IElementType MACRO_BRACE = new CairoTokenType("MACRO_BRACE");
  IElementType MACRO_BRACKET = new CairoTokenType("MACRO_BRACKET");
  IElementType MACRO_PAREN = new CairoTokenType("MACRO_PAREN");
  IElementType MACRO_RULES = new CairoTokenType("MACRO_RULES");
  IElementType MATCH_ARM = new CairoTokenType("MATCH_ARM");
  IElementType MATCH_BLOCK = new CairoTokenType("MATCH_BLOCK");
  IElementType MATCH_BODY = new CairoTokenType("MATCH_BODY");
  IElementType MATCH_FILTER = new CairoTokenType("MATCH_FILTER");
  IElementType MATCH_IDENTIFIER = new CairoTokenType("MATCH_IDENTIFIER");
  IElementType MATCH_IF = new CairoTokenType("MATCH_IF");
  IElementType MATCH_LABEL = new CairoTokenType("MATCH_LABEL");
  IElementType MATCH_PATTERN = new CairoTokenType("MATCH_PATTERN");
  IElementType MOD_ITEM = new CairoTokenType("MOD_ITEM");
  IElementType PROTOTYPE_ARG = new CairoTokenType("PROTOTYPE_ARG");
  IElementType PROTOTYPE_ARGS = new CairoTokenType("PROTOTYPE_ARGS");
  IElementType PROTOTYPE_SELF_ARG = new CairoTokenType("PROTOTYPE_SELF_ARG");
  IElementType PROTOTYPE_STRUCT_ARG = new CairoTokenType("PROTOTYPE_STRUCT_ARG");
  IElementType PROTOTYPE_TUPLE_ARG = new CairoTokenType("PROTOTYPE_TUPLE_ARG");
  IElementType PROTOTYPE_VARIABLE_ARG = new CairoTokenType("PROTOTYPE_VARIABLE_ARG");
  IElementType RANGE_MATCH_PATTERN = new CairoTokenType("RANGE_MATCH_PATTERN");
  IElementType REF = new CairoTokenType("REF");
  IElementType REGION_BOUND = new CairoTokenType("REGION_BOUND");
  IElementType RETURN_STATEMENT = new CairoTokenType("RETURN_STATEMENT");
  IElementType STATEMENT_BLOCK = new CairoTokenType("STATEMENT_BLOCK");
  IElementType STATIC_ITEM = new CairoTokenType("STATIC_ITEM");
  IElementType STRUCT_BODY_BLOCK = new CairoTokenType("STRUCT_BODY_BLOCK");
  IElementType STRUCT_BODY_TUPLE = new CairoTokenType("STRUCT_BODY_TUPLE");
  IElementType STRUCT_DEFAULT = new CairoTokenType("STRUCT_DEFAULT");
  IElementType STRUCT_INITIALIZER_LIST = new CairoTokenType("STRUCT_INITIALIZER_LIST");
  IElementType STRUCT_ITEM = new CairoTokenType("STRUCT_ITEM");
  IElementType STRUCT_MATCH_PATTERN = new CairoTokenType("STRUCT_MATCH_PATTERN");
  IElementType STRUCT_PROPERTY = new CairoTokenType("STRUCT_PROPERTY");
  IElementType STRUCT_RECOVER = new CairoTokenType("STRUCT_RECOVER");
  IElementType STRUCT_TUPLE_PROPERTY = new CairoTokenType("STRUCT_TUPLE_PROPERTY");
  IElementType TRAIT_ASSOC_TYPE = new CairoTokenType("TRAIT_ASSOC_TYPE");
  IElementType TRAIT_BLOCK = new CairoTokenType("TRAIT_BLOCK");
  IElementType TRAIT_BOUNDS = new CairoTokenType("TRAIT_BOUNDS");
  IElementType TRAIT_FUNCTION_DECLARATION = new CairoTokenType("TRAIT_FUNCTION_DECLARATION");
  IElementType TRAIT_IMPLEMENTS = new CairoTokenType("TRAIT_IMPLEMENTS");
  IElementType TRAIT_ITEM = new CairoTokenType("TRAIT_ITEM");
  IElementType TUPLE_MATCH_PATTERN = new CairoTokenType("TUPLE_MATCH_PATTERN");
  IElementType TYPE = new CairoTokenType("TYPE");
  IElementType TYPE_BASIC = new CairoTokenType("TYPE_BASIC");
  IElementType TYPE_BOUNDED = new CairoTokenType("TYPE_BOUNDED");
  IElementType TYPE_FUNCTION = new CairoTokenType("TYPE_FUNCTION");
  IElementType TYPE_ITEM = new CairoTokenType("TYPE_ITEM");
  IElementType TYPE_TUPLE = new CairoTokenType("TYPE_TUPLE");
  IElementType TYPE_UNIT = new CairoTokenType("TYPE_UNIT");
  IElementType TYPE_VECTOR = new CairoTokenType("TYPE_VECTOR");
  IElementType USE = new CairoTokenType("USE");
  IElementType USE_GROUP = new CairoTokenType("USE_GROUP");
  IElementType VECTOR_MATCH_PATTERN = new CairoTokenType("VECTOR_MATCH_PATTERN");
  IElementType VISIBILITY = new CairoTokenType("VISIBILITY");
  IElementType WHERE_BOUND = new CairoTokenType("WHERE_BOUND");
  IElementType WHERE_CLAUSE = new CairoTokenType("WHERE_CLAUSE");

  IElementType ASSIGN = new CairoTokenType("=");
  IElementType ASSIGN_LEFT_SHIFT = new CairoTokenType("<<=");
  IElementType ASSIGN_RIGHT_SHIFT = new CairoTokenType(">>=");
  IElementType AT = new CairoTokenType("@");
  IElementType BAD_CHARACTER = new CairoTokenType("BAD_CHARACTER");
  IElementType BIN_LIT = new CairoTokenType("BIN_LIT");
  IElementType BITWISE_AND = new CairoTokenType("&");
  IElementType BITWISE_OR = new CairoTokenType("|");
  IElementType BITWISE_XOR = new CairoTokenType("^");
  IElementType BLOCK_COMMENT = new CairoTokenType("BLOCK_COMMENT");
  IElementType BLOCK_DOC_COMMENT = new CairoTokenType("BLOCK_DOC_COMMENT");
  IElementType BOX = new CairoTokenType("~");
  IElementType CHAR_LIT = new CairoTokenType("CHAR_LIT");
  IElementType CLOSE_BRACE = new CairoTokenType("}");
  IElementType CLOSE_PAREN = new CairoTokenType(")");
  IElementType CLOSE_SQUARE_BRACKET = new CairoTokenType("]");
  IElementType COLON = new CairoTokenType(":");
  IElementType COMMA = new CairoTokenType(",");
  IElementType DEC_LIT = new CairoTokenType("DEC_LIT");
  IElementType DIVIDE = new CairoTokenType("/");
  IElementType DOLLAR = new CairoTokenType("$");
  IElementType DOT = new CairoTokenType(".");
  IElementType DOUBLE_COLON = new CairoTokenType("::");
  IElementType DOUBLE_DOT = new CairoTokenType("..");
  IElementType EQUAL = new CairoTokenType("==");
  IElementType FAT_ARROW = new CairoTokenType("=>");
  IElementType GREATER_THAN = new CairoTokenType(">");
  IElementType GREATER_THAN_OR_EQUAL = new CairoTokenType(">=");
  IElementType HASH = new CairoTokenType("#");
  IElementType HEX_LIT = new CairoTokenType("HEX_LIT");
  IElementType IDENTIFIER = new CairoTokenType("IDENTIFIER");
  IElementType KW_AS = new CairoTokenType("as");
  IElementType KW_BOX = new CairoTokenType("box");
  IElementType KW_BREAK = new CairoTokenType("break");
  IElementType KW_CONST = new CairoTokenType("const");
  IElementType KW_CONTINUE = new CairoTokenType("continue");
  IElementType KW_CRATE = new CairoTokenType("crate");
  IElementType KW_ELSE = new CairoTokenType("else");
  IElementType KW_ENUM = new CairoTokenType("enum");
  IElementType KW_EXTERN = new CairoTokenType("extern");
  IElementType KW_FALSE = new CairoTokenType("false");
  IElementType KW_FN = new CairoTokenType("fn");
  IElementType KW_FOR = new CairoTokenType("for");
  IElementType KW_IF = new CairoTokenType("if");
  IElementType KW_IMPL = new CairoTokenType("impl");
  IElementType KW_IN = new CairoTokenType("in");
  IElementType KW_LET = new CairoTokenType("let");
  IElementType KW_LOOP = new CairoTokenType("loop");
  IElementType KW_MACRO_RULES = new CairoTokenType("macro_rules!");
  IElementType KW_MATCH = new CairoTokenType("match");
  IElementType KW_MOD = new CairoTokenType("mod");
  IElementType KW_MOVE = new CairoTokenType("move");
  IElementType KW_MUT = new CairoTokenType("mut");
  IElementType KW_NOPANIC = new CairoTokenType("nopanic");
  IElementType KW_OF = new CairoTokenType("of");
  IElementType KW_PRIV = new CairoTokenType("priv");
  IElementType KW_PROC = new CairoTokenType("proc");
  IElementType KW_PUB = new CairoTokenType("pub");
  IElementType KW_REF = new CairoTokenType("ref");
  IElementType KW_RETURN = new CairoTokenType("return");
  IElementType KW_SELF = new CairoTokenType("self");
  IElementType KW_STATIC = new CairoTokenType("static");
  IElementType KW_STRUCT = new CairoTokenType("struct");
  IElementType KW_SUPER = new CairoTokenType("super");
  IElementType KW_TRAIT = new CairoTokenType("trait");
  IElementType KW_TRUE = new CairoTokenType("true");
  IElementType KW_TYPE = new CairoTokenType("type");
  IElementType KW_UNSAFE = new CairoTokenType("unsafe");
  IElementType KW_USE = new CairoTokenType("use");
  IElementType KW_WHERE = new CairoTokenType("where");
  IElementType KW_WHILE = new CairoTokenType("while");
  IElementType LESS_THAN = new CairoTokenType("<");
  IElementType LESS_THAN_OR_EQUAL = new CairoTokenType("<=");
  IElementType LINE_COMMENT = new CairoTokenType("LINE_COMMENT");
  IElementType LINE_DOC_COMMENT = new CairoTokenType("LINE_DOC_COMMENT");
  IElementType MINUS = new CairoTokenType("-");
  IElementType MULTIPLY = new CairoTokenType("*");
  IElementType NOT = new CairoTokenType("!");
  IElementType NOT_EQUAL = new CairoTokenType("!=");
  IElementType OCT_LIT = new CairoTokenType("OCT_LIT");
  IElementType OPEN_BRACE = new CairoTokenType("{");
  IElementType OPEN_PAREN = new CairoTokenType("(");
  IElementType OPEN_SQUARE_BRACKET = new CairoTokenType("[");
  IElementType PLUS = new CairoTokenType("+");
  IElementType RAW_STRING_LIT = new CairoTokenType("RAW_STRING_LIT");
  IElementType REMAINDER = new CairoTokenType("%");
  IElementType SEMICOLON = new CairoTokenType(";");
  IElementType SINGLE_QUOTE = new CairoTokenType("'");
  IElementType STRING_LIT = new CairoTokenType("STRING_LIT");
  IElementType THIN_ARROW = new CairoTokenType("->");
  IElementType TRIPLE_DOT = new CairoTokenType("...");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ATTRIBUTE) {
        return new CairoAttributeImpl(node);
      }
      else if (type == ATTRIBUTE_ARG) {
        return new CairoAttributeArgImpl(node);
      }
      else if (type == BASIC_MATCH_PATTERN) {
        return new CairoBasicMatchPatternImpl(node);
      }
      else if (type == BLOCK_FOR) {
        return new CairoBlockForImpl(node);
      }
      else if (type == BLOCK_IF) {
        return new CairoBlockIfImpl(node);
      }
      else if (type == BLOCK_LOOP) {
        return new CairoBlockLoopImpl(node);
      }
      else if (type == BLOCK_MATCH) {
        return new CairoBlockMatchImpl(node);
      }
      else if (type == BLOCK_UNSAFE) {
        return new CairoBlockUnsafeImpl(node);
      }
      else if (type == BLOCK_WHILE) {
        return new CairoBlockWhileImpl(node);
      }
      else if (type == CALL_PARAMS) {
        return new CairoCallParamsImpl(node);
      }
      else if (type == CLOSURE_BODY) {
        return new CairoClosureBodyImpl(node);
      }
      else if (type == CLOSURE_EXPR_ARGS) {
        return new CairoClosureExprArgsImpl(node);
      }
      else if (type == CLOSURE_SUGAR) {
        return new CairoClosureSugarImpl(node);
      }
      else if (type == CONST_ITEM) {
        return new CairoConstItemImpl(node);
      }
      else if (type == EMPTY_STATEMENT) {
        return new CairoEmptyStatementImpl(node);
      }
      else if (type == ENUM_BODY) {
        return new CairoEnumBodyImpl(node);
      }
      else if (type == ENUM_ITEM) {
        return new CairoEnumItemImpl(node);
      }
      else if (type == ENUM_VARIANT_NULLARY) {
        return new CairoEnumVariantNullaryImpl(node);
      }
      else if (type == ENUM_VARIANT_STRUCT) {
        return new CairoEnumVariantStructImpl(node);
      }
      else if (type == ENUM_VARIANT_STRUCT_MEMBER) {
        return new CairoEnumVariantStructMemberImpl(node);
      }
      else if (type == ENUM_VARIANT_TUPLE) {
        return new CairoEnumVariantTupleImpl(node);
      }
      else if (type == EXPR_AS) {
        return new CairoExprAsImpl(node);
      }
      else if (type == EXPR_ASSIGN) {
        return new CairoExprAssignImpl(node);
      }
      else if (type == EXPR_ASSIGN_AND) {
        return new CairoExprAssignAndImpl(node);
      }
      else if (type == EXPR_ASSIGN_DECREMENT) {
        return new CairoExprAssignDecrementImpl(node);
      }
      else if (type == EXPR_ASSIGN_DIVIDE) {
        return new CairoExprAssignDivideImpl(node);
      }
      else if (type == EXPR_ASSIGN_INCREMENT) {
        return new CairoExprAssignIncrementImpl(node);
      }
      else if (type == EXPR_ASSIGN_LEFT_SHIFT) {
        return new CairoExprAssignLeftShiftImpl(node);
      }
      else if (type == EXPR_ASSIGN_MODULO) {
        return new CairoExprAssignModuloImpl(node);
      }
      else if (type == EXPR_ASSIGN_MULTIPLY) {
        return new CairoExprAssignMultiplyImpl(node);
      }
      else if (type == EXPR_ASSIGN_NOT) {
        return new CairoExprAssignNotImpl(node);
      }
      else if (type == EXPR_ASSIGN_OR) {
        return new CairoExprAssignOrImpl(node);
      }
      else if (type == EXPR_ASSIGN_RIGHT_SHIFT) {
        return new CairoExprAssignRightShiftImpl(node);
      }
      else if (type == EXPR_BITWISE_AND) {
        return new CairoExprBitwiseAndImpl(node);
      }
      else if (type == EXPR_BITWISE_OR) {
        return new CairoExprBitwiseOrImpl(node);
      }
      else if (type == EXPR_BITWISE_XOR) {
        return new CairoExprBitwiseXorImpl(node);
      }
      else if (type == EXPR_BLOCK) {
        return new CairoExprBlockImpl(node);
      }
      else if (type == EXPR_BORROW) {
        return new CairoExprBorrowImpl(node);
      }
      else if (type == EXPR_BOX) {
        return new CairoExprBoxImpl(node);
      }
      else if (type == EXPR_BREAK) {
        return new CairoExprBreakImpl(node);
      }
      else if (type == EXPR_CALL) {
        return new CairoExprCallImpl(node);
      }
      else if (type == EXPR_CLOSURE) {
        return new CairoExprClosureImpl(node);
      }
      else if (type == EXPR_CONTINUE) {
        return new CairoExprContinueImpl(node);
      }
      else if (type == EXPR_DEREF) {
        return new CairoExprDerefImpl(node);
      }
      else if (type == EXPR_DIVIDE) {
        return new CairoExprDivideImpl(node);
      }
      else if (type == EXPR_EQUAL_TO) {
        return new CairoExprEqualToImpl(node);
      }
      else if (type == EXPR_FIELD) {
        return new CairoExprFieldImpl(node);
      }
      else if (type == EXPR_GREATER_OR_EQUAL) {
        return new CairoExprGreaterOrEqualImpl(node);
      }
      else if (type == EXPR_GREATER_THAN) {
        return new CairoExprGreaterThanImpl(node);
      }
      else if (type == EXPR_IDENTIFIER) {
        return new CairoExprIdentifierImpl(node);
      }
      else if (type == EXPR_INDEX) {
        return new CairoExprIndexImpl(node);
      }
      else if (type == EXPR_LEFT_SHIFT) {
        return new CairoExprLeftShiftImpl(node);
      }
      else if (type == EXPR_LESS_OR_EQUAL) {
        return new CairoExprLessOrEqualImpl(node);
      }
      else if (type == EXPR_LESS_THAN) {
        return new CairoExprLessThanImpl(node);
      }
      else if (type == EXPR_LOGICAL_AND) {
        return new CairoExprLogicalAndImpl(node);
      }
      else if (type == EXPR_LOGICAL_OR) {
        return new CairoExprLogicalOrImpl(node);
      }
      else if (type == EXPR_MACRO) {
        return new CairoExprMacroImpl(node);
      }
      else if (type == EXPR_MINUS) {
        return new CairoExprMinusImpl(node);
      }
      else if (type == EXPR_MODULO) {
        return new CairoExprModuloImpl(node);
      }
      else if (type == EXPR_MULTIPLY) {
        return new CairoExprMultiplyImpl(node);
      }
      else if (type == EXPR_NOT_EQUAL_TO) {
        return new CairoExprNotEqualToImpl(node);
      }
      else if (type == EXPR_PAREN) {
        return new CairoExprParenImpl(node);
      }
      else if (type == EXPR_PATH) {
        return new CairoExprPathImpl(node);
      }
      else if (type == EXPR_PLUS) {
        return new CairoExprPlusImpl(node);
      }
      else if (type == EXPR_RIGHT_SHIFT) {
        return new CairoExprRightShiftImpl(node);
      }
      else if (type == EXPR_STRUCT_INITIALIZER) {
        return new CairoExprStructInitializerImpl(node);
      }
      else if (type == EXPR_TUPLE_BODY) {
        return new CairoExprTupleBodyImpl(node);
      }
      else if (type == EXPR_UNARY_MINUS) {
        return new CairoExprUnaryMinusImpl(node);
      }
      else if (type == EXPR_UNARY_NOT) {
        return new CairoExprUnaryNotImpl(node);
      }
      else if (type == EXPR_UNARY_PLUS) {
        return new CairoExprUnaryPlusImpl(node);
      }
      else if (type == EXPR_VALUE) {
        return new CairoExprValueImpl(node);
      }
      else if (type == EXPR_VECTOR) {
        return new CairoExprVectorImpl(node);
      }
      else if (type == EXTERN_BLOCK) {
        return new CairoExternBlockImpl(node);
      }
      else if (type == EXTERN_CRATE) {
        return new CairoExternCrateImpl(node);
      }
      else if (type == EXTERN_FUNCTION) {
        return new CairoExternFunctionImpl(node);
      }
      else if (type == EXTERN_ITEM) {
        return new CairoExternItemImpl(node);
      }
      else if (type == EXTERN_VARIABLE) {
        return new CairoExternVariableImpl(node);
      }
      else if (type == FN_ARGS) {
        return new CairoFnArgsImpl(node);
      }
      else if (type == FN_DECLARATION) {
        return new CairoFnDeclarationImpl(node);
      }
      else if (type == FN_ITEM) {
        return new CairoFnItemImpl(node);
      }
      else if (type == FN_PROTOTYPE_ARGS) {
        return new CairoFnPrototypeArgsImpl(node);
      }
      else if (type == GENERIC) {
        return new CairoGenericImpl(node);
      }
      else if (type == GENERIC_PARAMS) {
        return new CairoGenericParamsImpl(node);
      }
      else if (type == IF_TAIL) {
        return new CairoIfTailImpl(node);
      }
      else if (type == IMPL_ASSOC_TYPE) {
        return new CairoImplAssocTypeImpl(node);
      }
      else if (type == IMPL_BLOCK) {
        return new CairoImplBlockImpl(node);
      }
      else if (type == IMPL_BODY) {
        return new CairoImplBodyImpl(node);
      }
      else if (type == IMPL_FOR) {
        return new CairoImplForImpl(node);
      }
      else if (type == IMPL_ITEM) {
        return new CairoImplItemImpl(node);
      }
      else if (type == INDEX_EXPR) {
        return new CairoIndexExprImpl(node);
      }
      else if (type == ITEM_NAME) {
        return new CairoItemNameImpl(node);
      }
      else if (type == LET) {
        return new CairoLetImpl(node);
      }
      else if (type == LET_ARGS) {
        return new CairoLetArgsImpl(node);
      }
      else if (type == LET_BIND) {
        return new CairoLetBindImpl(node);
      }
      else if (type == LET_SELF_ARG) {
        return new CairoLetSelfArgImpl(node);
      }
      else if (type == LET_STRUCT_BIND) {
        return new CairoLetStructBindImpl(node);
      }
      else if (type == LET_TUPLE_BIND) {
        return new CairoLetTupleBindImpl(node);
      }
      else if (type == LET_UNIT_BIND) {
        return new CairoLetUnitBindImpl(node);
      }
      else if (type == LET_VARIABLE_BIND) {
        return new CairoLetVariableBindImpl(node);
      }
      else if (type == LIFETIME) {
        return new CairoLifetimeImpl(node);
      }
      else if (type == MACRO_BODY) {
        return new CairoMacroBodyImpl(node);
      }
      else if (type == MACRO_BRACE) {
        return new CairoMacroBraceImpl(node);
      }
      else if (type == MACRO_BRACKET) {
        return new CairoMacroBracketImpl(node);
      }
      else if (type == MACRO_PAREN) {
        return new CairoMacroParenImpl(node);
      }
      else if (type == MACRO_RULES) {
        return new CairoMacroRulesImpl(node);
      }
      else if (type == MATCH_ARM) {
        return new CairoMatchArmImpl(node);
      }
      else if (type == MATCH_BLOCK) {
        return new CairoMatchBlockImpl(node);
      }
      else if (type == MATCH_BODY) {
        return new CairoMatchBodyImpl(node);
      }
      else if (type == MATCH_FILTER) {
        return new CairoMatchFilterImpl(node);
      }
      else if (type == MATCH_IDENTIFIER) {
        return new CairoMatchIdentifierImpl(node);
      }
      else if (type == MATCH_IF) {
        return new CairoMatchIfImpl(node);
      }
      else if (type == MATCH_LABEL) {
        return new CairoMatchLabelImpl(node);
      }
      else if (type == MOD_ITEM) {
        return new CairoModItemImpl(node);
      }
      else if (type == PROTOTYPE_ARG) {
        return new CairoPrototypeArgImpl(node);
      }
      else if (type == PROTOTYPE_ARGS) {
        return new CairoPrototypeArgsImpl(node);
      }
      else if (type == PROTOTYPE_SELF_ARG) {
        return new CairoPrototypeSelfArgImpl(node);
      }
      else if (type == PROTOTYPE_STRUCT_ARG) {
        return new CairoPrototypeStructArgImpl(node);
      }
      else if (type == PROTOTYPE_TUPLE_ARG) {
        return new CairoPrototypeTupleArgImpl(node);
      }
      else if (type == PROTOTYPE_VARIABLE_ARG) {
        return new CairoPrototypeVariableArgImpl(node);
      }
      else if (type == RANGE_MATCH_PATTERN) {
        return new CairoRangeMatchPatternImpl(node);
      }
      else if (type == REF) {
        return new CairoRefImpl(node);
      }
      else if (type == REGION_BOUND) {
        return new CairoRegionBoundImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new CairoReturnStatementImpl(node);
      }
      else if (type == STATEMENT_BLOCK) {
        return new CairoStatementBlockImpl(node);
      }
      else if (type == STATIC_ITEM) {
        return new CairoStaticItemImpl(node);
      }
      else if (type == STRUCT_BODY_BLOCK) {
        return new CairoStructBodyBlockImpl(node);
      }
      else if (type == STRUCT_BODY_TUPLE) {
        return new CairoStructBodyTupleImpl(node);
      }
      else if (type == STRUCT_DEFAULT) {
        return new CairoStructDefaultImpl(node);
      }
      else if (type == STRUCT_INITIALIZER_LIST) {
        return new CairoStructInitializerListImpl(node);
      }
      else if (type == STRUCT_ITEM) {
        return new CairoStructItemImpl(node);
      }
      else if (type == STRUCT_MATCH_PATTERN) {
        return new CairoStructMatchPatternImpl(node);
      }
      else if (type == STRUCT_PROPERTY) {
        return new CairoStructPropertyImpl(node);
      }
      else if (type == STRUCT_RECOVER) {
        return new CairoStructRecoverImpl(node);
      }
      else if (type == STRUCT_TUPLE_PROPERTY) {
        return new CairoStructTuplePropertyImpl(node);
      }
      else if (type == TRAIT_ASSOC_TYPE) {
        return new CairoTraitAssocTypeImpl(node);
      }
      else if (type == TRAIT_BLOCK) {
        return new CairoTraitBlockImpl(node);
      }
      else if (type == TRAIT_BOUNDS) {
        return new CairoTraitBoundsImpl(node);
      }
      else if (type == TRAIT_FUNCTION_DECLARATION) {
        return new CairoTraitFunctionDeclarationImpl(node);
      }
      else if (type == TRAIT_IMPLEMENTS) {
        return new CairoTraitImplementsImpl(node);
      }
      else if (type == TRAIT_ITEM) {
        return new CairoTraitItemImpl(node);
      }
      else if (type == TUPLE_MATCH_PATTERN) {
        return new CairoTupleMatchPatternImpl(node);
      }
      else if (type == TYPE_BASIC) {
        return new CairoTypeBasicImpl(node);
      }
      else if (type == TYPE_BOUNDED) {
        return new CairoTypeBoundedImpl(node);
      }
      else if (type == TYPE_FUNCTION) {
        return new CairoTypeFunctionImpl(node);
      }
      else if (type == TYPE_ITEM) {
        return new CairoTypeItemImpl(node);
      }
      else if (type == TYPE_TUPLE) {
        return new CairoTypeTupleImpl(node);
      }
      else if (type == TYPE_UNIT) {
        return new CairoTypeUnitImpl(node);
      }
      else if (type == TYPE_VECTOR) {
        return new CairoTypeVectorImpl(node);
      }
      else if (type == USE) {
        return new CairoUseImpl(node);
      }
      else if (type == USE_GROUP) {
        return new CairoUseGroupImpl(node);
      }
      else if (type == VECTOR_MATCH_PATTERN) {
        return new CairoVectorMatchPatternImpl(node);
      }
      else if (type == VISIBILITY) {
        return new CairoVisibilityImpl(node);
      }
      else if (type == WHERE_BOUND) {
        return new CairoWhereBoundImpl(node);
      }
      else if (type == WHERE_CLAUSE) {
        return new CairoWhereClauseImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
