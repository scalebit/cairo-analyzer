// This is a generated file. Not intended for manual editing.
package cairo;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static cairo.psi.CairoTokens.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CairoParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return file(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ENUM_VARIANT, ENUM_VARIANT_NULLARY, ENUM_VARIANT_STRUCT, ENUM_VARIANT_STRUCT_MEMBER,
      ENUM_VARIANT_TUPLE),
    create_token_set_(LET_BIND, LET_STRUCT_BIND, LET_TUPLE_BIND, LET_UNIT_BIND,
      LET_VARIABLE_BIND),
    create_token_set_(BASIC_MATCH_PATTERN, MATCH_PATTERN, RANGE_MATCH_PATTERN, STRUCT_MATCH_PATTERN,
      TUPLE_MATCH_PATTERN, VECTOR_MATCH_PATTERN),
    create_token_set_(TYPE, TYPE_BASIC, TYPE_BOUNDED, TYPE_FUNCTION,
      TYPE_TUPLE, TYPE_UNIT, TYPE_VECTOR),
    create_token_set_(CONST_ITEM, ENUM_ITEM, EXTERN_ITEM, FN_ITEM,
      IMPL_ITEM, ITEM, MOD_ITEM, STATIC_ITEM,
      STRUCT_ITEM, TRAIT_ITEM, TYPE_ITEM),
    create_token_set_(BLOCK_FOR, BLOCK_IF, BLOCK_LOOP, BLOCK_MATCH,
      BLOCK_UNSAFE, BLOCK_WHILE, EXPR, EXPR_AS,
      EXPR_ASSIGN, EXPR_ASSIGN_AND, EXPR_ASSIGN_DECREMENT, EXPR_ASSIGN_DIVIDE,
      EXPR_ASSIGN_INCREMENT, EXPR_ASSIGN_LEFT_SHIFT, EXPR_ASSIGN_MODULO, EXPR_ASSIGN_MULTIPLY,
      EXPR_ASSIGN_NOT, EXPR_ASSIGN_OR, EXPR_ASSIGN_RIGHT_SHIFT, EXPR_BITWISE_AND,
      EXPR_BITWISE_OR, EXPR_BITWISE_XOR, EXPR_BLOCK, EXPR_BORROW,
      EXPR_BOX, EXPR_BREAK, EXPR_CALL, EXPR_CLOSURE,
      EXPR_CONTINUE, EXPR_DEREF, EXPR_DIVIDE, EXPR_EQUAL_TO,
      EXPR_FIELD, EXPR_GREATER_OR_EQUAL, EXPR_GREATER_THAN, EXPR_IDENTIFIER,
      EXPR_INDEX, EXPR_LEFT_SHIFT, EXPR_LESS_OR_EQUAL, EXPR_LESS_THAN,
      EXPR_LOGICAL_AND, EXPR_LOGICAL_OR, EXPR_MACRO, EXPR_MINUS,
      EXPR_MODULO, EXPR_MULTIPLY, EXPR_NOT_EQUAL_TO, EXPR_PAREN,
      EXPR_PATH, EXPR_PLUS, EXPR_RIGHT_SHIFT, EXPR_STRUCT_INITIALIZER,
      EXPR_TUPLE_BODY, EXPR_UNARY_MINUS, EXPR_UNARY_NOT, EXPR_UNARY_PLUS,
      EXPR_VALUE, EXPR_VECTOR),
  };

  /* ********************************************************** */
  // type | lifetime
  static boolean a_bound(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "a_bound")) return false;
    boolean r;
    r = type(b, l + 1);
    if (!r) r = lifetime(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // !(']' | ';')
  static boolean attrib_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attrib_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !attrib_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ']' | ';'
  private static boolean attrib_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attrib_recover_0")) return false;
    boolean r;
    r = consumeToken(b, CLOSE_SQUARE_BRACKET);
    if (!r) r = consumeToken(b, SEMICOLON);
    return r;
  }

  /* ********************************************************** */
  // attribute_internal ']'
  public static boolean attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute")) return false;
    if (!nextTokenIs(b, HASH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = attribute_internal(b, l + 1);
    r = r && consumeToken(b, CLOSE_SQUARE_BRACKET);
    exit_section_(b, m, ATTRIBUTE, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER [ '=' literal | '(' attribute_list ')' ]
  public static boolean attribute_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_arg")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && attribute_arg_1(b, l + 1);
    exit_section_(b, m, ATTRIBUTE_ARG, r);
    return r;
  }

  // [ '=' literal | '(' attribute_list ')' ]
  private static boolean attribute_arg_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_arg_1")) return false;
    attribute_arg_1_0(b, l + 1);
    return true;
  }

  // '=' literal | '(' attribute_list ')'
  private static boolean attribute_arg_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_arg_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = attribute_arg_1_0_0(b, l + 1);
    if (!r) r = attribute_arg_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '=' literal
  private static boolean attribute_arg_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_arg_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && literal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' attribute_list ')'
  private static boolean attribute_arg_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_arg_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PAREN);
    r = r && attribute_list(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '#' '!'? '[' attribute_list
  static boolean attribute_internal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_internal")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, HASH);
    p = r; // pin = 1
    r = r && report_error_(b, attribute_internal_1(b, l + 1));
    r = p && report_error_(b, consumeToken(b, OPEN_SQUARE_BRACKET)) && r;
    r = p && attribute_list(b, l + 1) && r;
    exit_section_(b, l, m, r, p, CairoParser::attrib_recover);
    return r || p;
  }

  // '!'?
  private static boolean attribute_internal_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_internal_1")) return false;
    consumeToken(b, NOT);
    return true;
  }

  /* ********************************************************** */
  // attribute_arg ( ',' attribute_arg )*
  static boolean attribute_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = attribute_arg(b, l + 1);
    r = r && attribute_list_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' attribute_arg )*
  private static boolean attribute_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!attribute_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "attribute_list_1", c)) break;
    }
    return true;
  }

  // ',' attribute_arg
  private static boolean attribute_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && attribute_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // match_label? ('&'? 'box'? literal | type | match_identifier )
  public static boolean basic_match_pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basic_match_pattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BASIC_MATCH_PATTERN, "<basic match pattern>");
    r = basic_match_pattern_0(b, l + 1);
    r = r && basic_match_pattern_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // match_label?
  private static boolean basic_match_pattern_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basic_match_pattern_0")) return false;
    match_label(b, l + 1);
    return true;
  }

  // '&'? 'box'? literal | type | match_identifier
  private static boolean basic_match_pattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basic_match_pattern_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = basic_match_pattern_1_0(b, l + 1);
    if (!r) r = type(b, l + 1);
    if (!r) r = match_identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '&'? 'box'? literal
  private static boolean basic_match_pattern_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basic_match_pattern_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = basic_match_pattern_1_0_0(b, l + 1);
    r = r && basic_match_pattern_1_0_1(b, l + 1);
    r = r && literal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '&'?
  private static boolean basic_match_pattern_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basic_match_pattern_1_0_0")) return false;
    consumeToken(b, BITWISE_AND);
    return true;
  }

  // 'box'?
  private static boolean basic_match_pattern_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basic_match_pattern_1_0_1")) return false;
    consumeToken(b, KW_BOX);
    return true;
  }

  /* ********************************************************** */
  // 'for' let_bind 'in' expr statement_block
  public static boolean block_for(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_for")) return false;
    if (!nextTokenIs(b, KW_FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_FOR);
    r = r && let_bind(b, l + 1);
    r = r && consumeToken(b, KW_IN);
    r = r && expr(b, l + 1, -1);
    r = r && statement_block(b, l + 1);
    exit_section_(b, m, BLOCK_FOR, r);
    return r;
  }

  /* ********************************************************** */
  // 'if' if_let? expr statement_block if_tail
  public static boolean block_if(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_if")) return false;
    if (!nextTokenIs(b, KW_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_IF);
    r = r && block_if_1(b, l + 1);
    r = r && expr(b, l + 1, -1);
    r = r && statement_block(b, l + 1);
    r = r && if_tail(b, l + 1);
    exit_section_(b, m, BLOCK_IF, r);
    return r;
  }

  // if_let?
  private static boolean block_if_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_if_1")) return false;
    if_let(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // [lifetime ':'] 'loop' statement_block
  public static boolean block_loop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_loop")) return false;
    if (!nextTokenIs(b, "<block loop>", KW_LOOP, SINGLE_QUOTE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_LOOP, "<block loop>");
    r = block_loop_0(b, l + 1);
    r = r && consumeToken(b, KW_LOOP);
    r = r && statement_block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [lifetime ':']
  private static boolean block_loop_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_loop_0")) return false;
    block_loop_0_0(b, l + 1);
    return true;
  }

  // lifetime ':'
  private static boolean block_loop_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_loop_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = lifetime(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'match' expr match_block
  public static boolean block_match(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_match")) return false;
    if (!nextTokenIs(b, KW_MATCH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_MATCH, null);
    r = consumeToken(b, KW_MATCH);
    p = r; // pin = 1
    r = r && report_error_(b, expr(b, l + 1, -1));
    r = p && match_block(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'unsafe' statement_block
  public static boolean block_unsafe(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_unsafe")) return false;
    if (!nextTokenIs(b, KW_UNSAFE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_UNSAFE);
    r = r && statement_block(b, l + 1);
    exit_section_(b, m, BLOCK_UNSAFE, r);
    return r;
  }

  /* ********************************************************** */
  // 'while' if_let? expr statement_block
  public static boolean block_while(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_while")) return false;
    if (!nextTokenIs(b, KW_WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_WHILE);
    r = r && block_while_1(b, l + 1);
    r = r && expr(b, l + 1, -1);
    r = r && statement_block(b, l + 1);
    exit_section_(b, m, BLOCK_WHILE, r);
    return r;
  }

  // if_let?
  private static boolean block_while_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_while_1")) return false;
    if_let(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // a_bound ('+' a_bound)*
  static boolean bounds(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bounds")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = a_bound(b, l + 1);
    r = r && bounds_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('+' a_bound)*
  private static boolean bounds_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bounds_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!bounds_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "bounds_1", c)) break;
    }
    return true;
  }

  // '+' a_bound
  private static boolean bounds_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bounds_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS);
    r = r && a_bound(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expr? (',' expr)* ','?
  public static boolean call_params(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_params")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALL_PARAMS, "<call params>");
    r = call_params_0(b, l + 1);
    r = r && call_params_1(b, l + 1);
    r = r && call_params_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expr?
  private static boolean call_params_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_params_0")) return false;
    expr(b, l + 1, -1);
    return true;
  }

  // (',' expr)*
  private static boolean call_params_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_params_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!call_params_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "call_params_1", c)) break;
    }
    return true;
  }

  // ',' expr
  private static boolean call_params_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_params_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean call_params_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_params_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // ['->' type] (statement | expr | statement_block)
  public static boolean closure_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLOSURE_BODY, "<closure body>");
    r = closure_body_0(b, l + 1);
    r = r && closure_body_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['->' type]
  private static boolean closure_body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_body_0")) return false;
    closure_body_0_0(b, l + 1);
    return true;
  }

  // '->' type
  private static boolean closure_body_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_body_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, THIN_ARROW);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // statement | expr | statement_block
  private static boolean closure_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_body_1")) return false;
    boolean r;
    r = statement(b, l + 1);
    if (!r) r = expr(b, l + 1, -1);
    if (!r) r = statement_block(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '|' let_args '|'
  public static boolean closure_expr_args(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_expr_args")) return false;
    if (!nextTokenIs(b, BITWISE_OR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BITWISE_OR);
    r = r && let_args(b, l + 1);
    r = r && consumeToken(b, BITWISE_OR);
    exit_section_(b, m, CLOSURE_EXPR_ARGS, r);
    return r;
  }

  /* ********************************************************** */
  // '(' [type (',' type)*] ')' ['->' return_type]
  public static boolean closure_sugar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_sugar")) return false;
    if (!nextTokenIs(b, OPEN_PAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CLOSURE_SUGAR, null);
    r = consumeToken(b, OPEN_PAREN);
    p = r; // pin = 1
    r = r && report_error_(b, closure_sugar_1(b, l + 1));
    r = p && report_error_(b, consumeToken(b, CLOSE_PAREN)) && r;
    r = p && closure_sugar_3(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [type (',' type)*]
  private static boolean closure_sugar_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_sugar_1")) return false;
    closure_sugar_1_0(b, l + 1);
    return true;
  }

  // type (',' type)*
  private static boolean closure_sugar_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_sugar_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && closure_sugar_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' type)*
  private static boolean closure_sugar_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_sugar_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!closure_sugar_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "closure_sugar_1_0_1", c)) break;
    }
    return true;
  }

  // ',' type
  private static boolean closure_sugar_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_sugar_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['->' return_type]
  private static boolean closure_sugar_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_sugar_3")) return false;
    closure_sugar_3_0(b, l + 1);
    return true;
  }

  // '->' return_type
  private static boolean closure_sugar_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_sugar_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, THIN_ARROW);
    r = r && return_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BLOCK_COMMENT|BLOCK_DOC_COMMENT|LINE_COMMENT|LINE_DOC_COMMENT
  static boolean comment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comment")) return false;
    boolean r;
    r = consumeToken(b, BLOCK_COMMENT);
    if (!r) r = consumeToken(b, BLOCK_DOC_COMMENT);
    if (!r) r = consumeToken(b, LINE_COMMENT);
    if (!r) r = consumeToken(b, LINE_DOC_COMMENT);
    return r;
  }

  /* ********************************************************** */
  // (comment | attribute)* visibility? 'const' itemName ':' type '=' expr ';'
  public static boolean const_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_item")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CONST_ITEM, "<const item>");
    r = const_item_0(b, l + 1);
    r = r && const_item_1(b, l + 1);
    r = r && consumeToken(b, KW_CONST);
    p = r; // pin = 3
    r = r && report_error_(b, itemName(b, l + 1));
    r = p && report_error_(b, consumeToken(b, COLON)) && r;
    r = p && report_error_(b, type(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, ASSIGN)) && r;
    r = p && report_error_(b, expr(b, l + 1, -1)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (comment | attribute)*
  private static boolean const_item_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_item_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!const_item_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "const_item_0", c)) break;
    }
    return true;
  }

  // comment | attribute
  private static boolean const_item_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_item_0_0")) return false;
    boolean r;
    r = comment(b, l + 1);
    if (!r) r = attribute(b, l + 1);
    return r;
  }

  // visibility?
  private static boolean const_item_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_item_1")) return false;
    visibility(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ';'
  public static boolean empty_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "empty_statement")) return false;
    if (!nextTokenIs(b, SEMICOLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMICOLON);
    exit_section_(b, m, EMPTY_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // [ enum_variant (',' enum_variant)* ','? (comment | attribute)* ]
  public static boolean enum_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_body")) return false;
    Marker m = enter_section_(b, l, _NONE_, ENUM_BODY, "<enum body>");
    enum_body_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // enum_variant (',' enum_variant)* ','? (comment | attribute)*
  private static boolean enum_body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_body_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enum_variant(b, l + 1);
    r = r && enum_body_0_1(b, l + 1);
    r = r && enum_body_0_2(b, l + 1);
    r = r && enum_body_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' enum_variant)*
  private static boolean enum_body_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_body_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!enum_body_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_body_0_1", c)) break;
    }
    return true;
  }

  // ',' enum_variant
  private static boolean enum_body_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_body_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && enum_variant(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean enum_body_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_body_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // (comment | attribute)*
  private static boolean enum_body_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_body_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!enum_body_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_body_0_3", c)) break;
    }
    return true;
  }

  // comment | attribute
  private static boolean enum_body_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_body_0_3_0")) return false;
    boolean r;
    r = comment(b, l + 1);
    if (!r) r = attribute(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // visibility? 'enum' itemName generic_params? '{' enum_body '}'
  public static boolean enum_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_item")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ENUM_ITEM, "<enum item>");
    r = enum_item_0(b, l + 1);
    r = r && consumeToken(b, KW_ENUM);
    p = r; // pin = 2
    r = r && report_error_(b, itemName(b, l + 1));
    r = p && report_error_(b, enum_item_3(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, OPEN_BRACE)) && r;
    r = p && report_error_(b, enum_body(b, l + 1)) && r;
    r = p && consumeToken(b, CLOSE_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // visibility?
  private static boolean enum_item_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_item_0")) return false;
    visibility(b, l + 1);
    return true;
  }

  // generic_params?
  private static boolean enum_item_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_item_3")) return false;
    generic_params(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // enum_variant_nullary | enum_variant_tuple | enum_variant_struct
  public static boolean enum_variant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_variant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, ENUM_VARIANT, "<enum variant>");
    r = enum_variant_nullary(b, l + 1);
    if (!r) r = enum_variant_tuple(b, l + 1);
    if (!r) r = enum_variant_struct(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (comment | attribute)* IDENTIFIER !('(' | '{') ['=' expr]
  public static boolean enum_variant_nullary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_variant_nullary")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_VARIANT_NULLARY, "<enum variant nullary>");
    r = enum_variant_nullary_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && enum_variant_nullary_2(b, l + 1);
    r = r && enum_variant_nullary_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (comment | attribute)*
  private static boolean enum_variant_nullary_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_variant_nullary_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!enum_variant_nullary_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_variant_nullary_0", c)) break;
    }
    return true;
  }

  // comment | attribute
  private static boolean enum_variant_nullary_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_variant_nullary_0_0")) return false;
    boolean r;
    r = comment(b, l + 1);
    if (!r) r = attribute(b, l + 1);
    return r;
  }

  // !('(' | '{')
  private static boolean enum_variant_nullary_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_variant_nullary_2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !enum_variant_nullary_2_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' | '{'
  private static boolean enum_variant_nullary_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_variant_nullary_2_0")) return false;
    boolean r;
    r = consumeToken(b, OPEN_PAREN);
    if (!r) r = consumeToken(b, OPEN_BRACE);
    return r;
  }

  // ['=' expr]
  private static boolean enum_variant_nullary_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_variant_nullary_3")) return false;
    enum_variant_nullary_3_0(b, l + 1);
    return true;
  }

  // '=' expr
  private static boolean enum_variant_nullary_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_variant_nullary_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (comment | attribute)* IDENTIFIER '{' enum_variant_struct_member (',' enum_variant_struct_member)* ','? '}'
  public static boolean enum_variant_struct(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_variant_struct")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_VARIANT_STRUCT, "<enum variant struct>");
    r = enum_variant_struct_0(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFIER, OPEN_BRACE);
    r = r && enum_variant_struct_member(b, l + 1);
    r = r && enum_variant_struct_4(b, l + 1);
    r = r && enum_variant_struct_5(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (comment | attribute)*
  private static boolean enum_variant_struct_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_variant_struct_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!enum_variant_struct_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_variant_struct_0", c)) break;
    }
    return true;
  }

  // comment | attribute
  private static boolean enum_variant_struct_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_variant_struct_0_0")) return false;
    boolean r;
    r = comment(b, l + 1);
    if (!r) r = attribute(b, l + 1);
    return r;
  }

  // (',' enum_variant_struct_member)*
  private static boolean enum_variant_struct_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_variant_struct_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!enum_variant_struct_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_variant_struct_4", c)) break;
    }
    return true;
  }

  // ',' enum_variant_struct_member
  private static boolean enum_variant_struct_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_variant_struct_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && enum_variant_struct_member(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean enum_variant_struct_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_variant_struct_5")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // visibility? IDENTIFIER ':' type
  public static boolean enum_variant_struct_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_variant_struct_member")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_VARIANT_STRUCT_MEMBER, "<enum variant struct member>");
    r = enum_variant_struct_member_0(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFIER, COLON);
    r = r && type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // visibility?
  private static boolean enum_variant_struct_member_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_variant_struct_member_0")) return false;
    visibility(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (comment | attribute)* IDENTIFIER '(' type (',' type)* ')'
  public static boolean enum_variant_tuple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_variant_tuple")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_VARIANT_TUPLE, "<enum variant tuple>");
    r = enum_variant_tuple_0(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFIER, OPEN_PAREN);
    r = r && type(b, l + 1);
    r = r && enum_variant_tuple_4(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (comment | attribute)*
  private static boolean enum_variant_tuple_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_variant_tuple_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!enum_variant_tuple_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_variant_tuple_0", c)) break;
    }
    return true;
  }

  // comment | attribute
  private static boolean enum_variant_tuple_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_variant_tuple_0_0")) return false;
    boolean r;
    r = comment(b, l + 1);
    if (!r) r = attribute(b, l + 1);
    return r;
  }

  // (',' type)*
  private static boolean enum_variant_tuple_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_variant_tuple_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!enum_variant_tuple_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_variant_tuple_4", c)) break;
    }
    return true;
  }

  // ',' type
  private static boolean enum_variant_tuple_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_variant_tuple_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ',' [expr (',' expr)*]
  public static boolean expr_tuple_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_tuple_body")) return false;
    if (!nextTokenIsFast(b, COMMA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenFast(b, COMMA);
    r = r && expr_tuple_body_1(b, l + 1);
    exit_section_(b, m, EXPR_TUPLE_BODY, r);
    return r;
  }

  // [expr (',' expr)*]
  private static boolean expr_tuple_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_tuple_body_1")) return false;
    expr_tuple_body_1_0(b, l + 1);
    return true;
  }

  // expr (',' expr)*
  private static boolean expr_tuple_body_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_tuple_body_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1, -1);
    r = r && expr_tuple_body_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' expr)*
  private static boolean expr_tuple_body_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_tuple_body_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expr_tuple_body_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expr_tuple_body_1_0_1", c)) break;
    }
    return true;
  }

  // ',' expr
  private static boolean expr_tuple_body_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_tuple_body_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenFast(b, COMMA);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STRING_LIT? '{' (attribute | extern_variable ';' | trait_function_declaration ';')*
  public static boolean extern_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extern_block")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EXTERN_BLOCK, "<extern block>");
    r = extern_block_0(b, l + 1);
    r = r && consumeToken(b, OPEN_BRACE);
    p = r; // pin = 2
    r = r && extern_block_2(b, l + 1);
    exit_section_(b, l, m, r, p, CairoParser::not_close_brace);
    return r || p;
  }

  // STRING_LIT?
  private static boolean extern_block_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extern_block_0")) return false;
    consumeToken(b, STRING_LIT);
    return true;
  }

  // (attribute | extern_variable ';' | trait_function_declaration ';')*
  private static boolean extern_block_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extern_block_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!extern_block_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "extern_block_2", c)) break;
    }
    return true;
  }

  // attribute | extern_variable ';' | trait_function_declaration ';'
  private static boolean extern_block_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extern_block_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = attribute(b, l + 1);
    if (!r) r = extern_block_2_0_1(b, l + 1);
    if (!r) r = extern_block_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // extern_variable ';'
  private static boolean extern_block_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extern_block_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = extern_variable(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // trait_function_declaration ';'
  private static boolean extern_block_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extern_block_2_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = trait_function_declaration(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'crate' [STRING_LIT 'as'] IDENTIFIER
  public static boolean extern_crate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extern_crate")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EXTERN_CRATE, "<extern crate>");
    r = consumeToken(b, KW_CRATE);
    p = r; // pin = 1
    r = r && report_error_(b, extern_crate_1(b, l + 1));
    r = p && consumeToken(b, IDENTIFIER) && r;
    exit_section_(b, l, m, r, p, CairoParser::not_semicolon);
    return r || p;
  }

  // [STRING_LIT 'as']
  private static boolean extern_crate_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extern_crate_1")) return false;
    parseTokens(b, 0, STRING_LIT, KW_AS);
    return true;
  }

  /* ********************************************************** */
  // STRING_LIT? fn_item
  public static boolean extern_function(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extern_function")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXTERN_FUNCTION, "<extern function>");
    r = extern_function_0(b, l + 1);
    r = r && fn_item(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // STRING_LIT?
  private static boolean extern_function_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extern_function_0")) return false;
    consumeToken(b, STRING_LIT);
    return true;
  }

  /* ********************************************************** */
  // visibility? 'unsafe'? 'extern' (extern_crate ';' | extern_block '}' | extern_function)
  public static boolean extern_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extern_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXTERN_ITEM, "<extern item>");
    r = extern_item_0(b, l + 1);
    r = r && extern_item_1(b, l + 1);
    r = r && consumeToken(b, KW_EXTERN);
    r = r && extern_item_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // visibility?
  private static boolean extern_item_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extern_item_0")) return false;
    visibility(b, l + 1);
    return true;
  }

  // 'unsafe'?
  private static boolean extern_item_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extern_item_1")) return false;
    consumeToken(b, KW_UNSAFE);
    return true;
  }

  // extern_crate ';' | extern_block '}' | extern_function
  private static boolean extern_item_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extern_item_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = extern_item_3_0(b, l + 1);
    if (!r) r = extern_item_3_1(b, l + 1);
    if (!r) r = extern_function(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // extern_crate ';'
  private static boolean extern_item_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extern_item_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = extern_crate(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // extern_block '}'
  private static boolean extern_item_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extern_item_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = extern_block(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // visibility? 'static'? 'ref'? ref? 'mut'? IDENTIFIER [':' type]
  public static boolean extern_variable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extern_variable")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXTERN_VARIABLE, "<extern variable>");
    r = extern_variable_0(b, l + 1);
    r = r && extern_variable_1(b, l + 1);
    r = r && extern_variable_2(b, l + 1);
    r = r && extern_variable_3(b, l + 1);
    r = r && extern_variable_4(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && extern_variable_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // visibility?
  private static boolean extern_variable_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extern_variable_0")) return false;
    visibility(b, l + 1);
    return true;
  }

  // 'static'?
  private static boolean extern_variable_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extern_variable_1")) return false;
    consumeToken(b, KW_STATIC);
    return true;
  }

  // 'ref'?
  private static boolean extern_variable_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extern_variable_2")) return false;
    consumeToken(b, KW_REF);
    return true;
  }

  // ref?
  private static boolean extern_variable_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extern_variable_3")) return false;
    ref(b, l + 1);
    return true;
  }

  // 'mut'?
  private static boolean extern_variable_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extern_variable_4")) return false;
    consumeToken(b, KW_MUT);
    return true;
  }

  // [':' type]
  private static boolean extern_variable_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extern_variable_6")) return false;
    extern_variable_6_0(b, l + 1);
    return true;
  }

  // ':' type
  private static boolean extern_variable_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extern_variable_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // mod_contents
  static boolean file(PsiBuilder b, int l) {
    return mod_contents(b, l + 1);
  }

  /* ********************************************************** */
  // '(' let_args ')'
  public static boolean fn_args(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_args")) return false;
    if (!nextTokenIs(b, OPEN_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PAREN);
    r = r && let_args(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, FN_ARGS, r);
    return r;
  }

  /* ********************************************************** */
  // visibility? 'unsafe'? 'fn' itemName generic_params? fn_args ['->' return_type] where_clause?
  public static boolean fn_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_declaration")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FN_DECLARATION, "<fn declaration>");
    r = fn_declaration_0(b, l + 1);
    r = r && fn_declaration_1(b, l + 1);
    r = r && consumeToken(b, KW_FN);
    p = r; // pin = 3
    r = r && report_error_(b, itemName(b, l + 1));
    r = p && report_error_(b, fn_declaration_4(b, l + 1)) && r;
    r = p && report_error_(b, fn_args(b, l + 1)) && r;
    r = p && report_error_(b, fn_declaration_6(b, l + 1)) && r;
    r = p && fn_declaration_7(b, l + 1) && r;
    exit_section_(b, l, m, r, p, CairoParser::function_recover);
    return r || p;
  }

  // visibility?
  private static boolean fn_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_declaration_0")) return false;
    visibility(b, l + 1);
    return true;
  }

  // 'unsafe'?
  private static boolean fn_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_declaration_1")) return false;
    consumeToken(b, KW_UNSAFE);
    return true;
  }

  // generic_params?
  private static boolean fn_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_declaration_4")) return false;
    generic_params(b, l + 1);
    return true;
  }

  // ['->' return_type]
  private static boolean fn_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_declaration_6")) return false;
    fn_declaration_6_0(b, l + 1);
    return true;
  }

  // '->' return_type
  private static boolean fn_declaration_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_declaration_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, THIN_ARROW);
    r = r && return_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // where_clause?
  private static boolean fn_declaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_declaration_7")) return false;
    where_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (comment | attribute)* fn_declaration statement_block
  public static boolean fn_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FN_ITEM, "<fn item>");
    r = fn_item_0(b, l + 1);
    r = r && fn_declaration(b, l + 1);
    r = r && statement_block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (comment | attribute)*
  private static boolean fn_item_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_item_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!fn_item_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "fn_item_0", c)) break;
    }
    return true;
  }

  // comment | attribute
  private static boolean fn_item_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_item_0_0")) return false;
    boolean r;
    r = comment(b, l + 1);
    if (!r) r = attribute(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '(' prototype_args ')'
  public static boolean fn_prototype_args(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_prototype_args")) return false;
    if (!nextTokenIs(b, OPEN_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PAREN);
    r = r && prototype_args(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, FN_PROTOTYPE_ARGS, r);
    return r;
  }

  /* ********************************************************** */
  // !('{'|';')
  static boolean function_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !function_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '{'|';'
  private static boolean function_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_recover_0")) return false;
    boolean r;
    r = consumeToken(b, OPEN_BRACE);
    if (!r) r = consumeToken(b, SEMICOLON);
    return r;
  }

  /* ********************************************************** */
  // '<' (generic_without_lifetime | generic_with_lifetime) '>'
  public static boolean generic(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic")) return false;
    if (!nextTokenIs(b, LESS_THAN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, GENERIC, null);
    r = consumeToken(b, LESS_THAN);
    p = r; // pin = 1
    r = r && report_error_(b, generic_1(b, l + 1));
    r = p && consumeToken(b, GREATER_THAN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // generic_without_lifetime | generic_with_lifetime
  private static boolean generic_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_1")) return false;
    boolean r;
    r = generic_without_lifetime(b, l + 1);
    if (!r) r = generic_with_lifetime(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // (lifetime [':' lifetime]) | IDENTIFIER  [(':' | '=') bounds]
  static boolean generic_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_param")) return false;
    if (!nextTokenIs(b, "", IDENTIFIER, SINGLE_QUOTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generic_param_0(b, l + 1);
    if (!r) r = generic_param_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // lifetime [':' lifetime]
  private static boolean generic_param_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_param_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = lifetime(b, l + 1);
    r = r && generic_param_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [':' lifetime]
  private static boolean generic_param_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_param_0_1")) return false;
    generic_param_0_1_0(b, l + 1);
    return true;
  }

  // ':' lifetime
  private static boolean generic_param_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_param_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && lifetime(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER  [(':' | '=') bounds]
  private static boolean generic_param_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_param_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && generic_param_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [(':' | '=') bounds]
  private static boolean generic_param_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_param_1_1")) return false;
    generic_param_1_1_0(b, l + 1);
    return true;
  }

  // (':' | '=') bounds
  private static boolean generic_param_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_param_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generic_param_1_1_0_0(b, l + 1);
    r = r && bounds(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ':' | '='
  private static boolean generic_param_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_param_1_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, COLON);
    if (!r) r = consumeToken(b, ASSIGN);
    return r;
  }

  /* ********************************************************** */
  // '<' generic_param (',' generic_param)* '>'
  public static boolean generic_params(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_params")) return false;
    if (!nextTokenIs(b, LESS_THAN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, GENERIC_PARAMS, null);
    r = consumeToken(b, LESS_THAN);
    p = r; // pin = 1
    r = r && report_error_(b, generic_param(b, l + 1));
    r = p && report_error_(b, generic_params_2(b, l + 1)) && r;
    r = p && consumeToken(b, GREATER_THAN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (',' generic_param)*
  private static boolean generic_params_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_params_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!generic_params_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "generic_params_2", c)) break;
    }
    return true;
  }

  // ',' generic_param
  private static boolean generic_params_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_params_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && generic_param(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // lifetime (',' lifetime)* (',' type_param)*
  static boolean generic_with_lifetime(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_with_lifetime")) return false;
    if (!nextTokenIs(b, SINGLE_QUOTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = lifetime(b, l + 1);
    r = r && generic_with_lifetime_1(b, l + 1);
    r = r && generic_with_lifetime_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' lifetime)*
  private static boolean generic_with_lifetime_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_with_lifetime_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!generic_with_lifetime_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "generic_with_lifetime_1", c)) break;
    }
    return true;
  }

  // ',' lifetime
  private static boolean generic_with_lifetime_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_with_lifetime_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && lifetime(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' type_param)*
  private static boolean generic_with_lifetime_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_with_lifetime_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!generic_with_lifetime_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "generic_with_lifetime_2", c)) break;
    }
    return true;
  }

  // ',' type_param
  private static boolean generic_with_lifetime_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_with_lifetime_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && type_param(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // type_param (',' type_param)*
  static boolean generic_without_lifetime(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_without_lifetime")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_param(b, l + 1);
    r = r && generic_without_lifetime_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' type_param)*
  private static boolean generic_without_lifetime_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_without_lifetime_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!generic_without_lifetime_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "generic_without_lifetime_1", c)) break;
    }
    return true;
  }

  // ',' type_param
  private static boolean generic_without_lifetime_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_without_lifetime_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && type_param(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'let' let_bind '='
  static boolean if_let(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_let")) return false;
    if (!nextTokenIs(b, KW_LET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, KW_LET);
    p = r; // pin = 1
    r = r && report_error_(b, let_bind(b, l + 1));
    r = p && consumeToken(b, ASSIGN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // ('else' 'if' if_let? expr statement_block)* ['else' statement_block]
  public static boolean if_tail(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_tail")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IF_TAIL, "<if tail>");
    r = if_tail_0(b, l + 1);
    r = r && if_tail_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('else' 'if' if_let? expr statement_block)*
  private static boolean if_tail_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_tail_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!if_tail_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_tail_0", c)) break;
    }
    return true;
  }

  // 'else' 'if' if_let? expr statement_block
  private static boolean if_tail_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_tail_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_ELSE, KW_IF);
    r = r && if_tail_0_0_2(b, l + 1);
    r = r && expr(b, l + 1, -1);
    r = r && statement_block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // if_let?
  private static boolean if_tail_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_tail_0_0_2")) return false;
    if_let(b, l + 1);
    return true;
  }

  // ['else' statement_block]
  private static boolean if_tail_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_tail_1")) return false;
    if_tail_1_0(b, l + 1);
    return true;
  }

  // 'else' statement_block
  private static boolean if_tail_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_tail_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ELSE);
    r = r && statement_block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'type' itemName '=' type ';'
  public static boolean impl_assoc_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impl_assoc_type")) return false;
    if (!nextTokenIs(b, KW_TYPE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IMPL_ASSOC_TYPE, null);
    r = consumeToken(b, KW_TYPE);
    p = r; // pin = 1
    r = r && report_error_(b, itemName(b, l + 1));
    r = p && report_error_(b, consumeToken(b, ASSIGN)) && r;
    r = p && report_error_(b, type(b, l + 1)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '{' impl_body '}'
  public static boolean impl_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impl_block")) return false;
    if (!nextTokenIs(b, OPEN_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACE);
    r = r && impl_body(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, IMPL_BLOCK, r);
    return r;
  }

  /* ********************************************************** */
  // impl_subitem*
  public static boolean impl_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impl_body")) return false;
    Marker m = enter_section_(b, l, _NONE_, IMPL_BODY, "<impl body>");
    while (true) {
      int c = current_position_(b);
      if (!impl_subitem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "impl_body", c)) break;
    }
    exit_section_(b, l, m, true, false, CairoParser::not_close_brace);
    return true;
  }

  /* ********************************************************** */
  // 'for' type
  public static boolean impl_for(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impl_for")) return false;
    if (!nextTokenIs(b, KW_FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_FOR);
    r = r && type(b, l + 1);
    exit_section_(b, m, IMPL_FOR, r);
    return r;
  }

  /* ********************************************************** */
  // 'impl' generic_params? type impl_for? where_clause? impl_block
  public static boolean impl_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impl_item")) return false;
    if (!nextTokenIs(b, KW_IMPL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IMPL_ITEM, null);
    r = consumeToken(b, KW_IMPL);
    p = r; // pin = 1
    r = r && report_error_(b, impl_item_1(b, l + 1));
    r = p && report_error_(b, type(b, l + 1)) && r;
    r = p && report_error_(b, impl_item_3(b, l + 1)) && r;
    r = p && report_error_(b, impl_item_4(b, l + 1)) && r;
    r = p && impl_block(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // generic_params?
  private static boolean impl_item_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impl_item_1")) return false;
    generic_params(b, l + 1);
    return true;
  }

  // impl_for?
  private static boolean impl_item_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impl_item_3")) return false;
    impl_for(b, l + 1);
    return true;
  }

  // where_clause?
  private static boolean impl_item_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impl_item_4")) return false;
    where_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // fn_item | impl_assoc_type
  static boolean impl_subitem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impl_subitem")) return false;
    boolean r;
    r = fn_item(b, l + 1);
    if (!r) r = impl_assoc_type(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // expr '..'?
  public static boolean index_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "index_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INDEX_EXPR, "<index expr>");
    r = expr(b, l + 1, -1);
    r = r && index_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '..'?
  private static boolean index_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "index_expr_1")) return false;
    consumeToken(b, DOUBLE_DOT);
    return true;
  }

  /* ********************************************************** */
  // mod_item
  // 	| fn_item
  // 	| type_item
  // 	| struct_item
  // 	| enum_item
  // 	| static_item
  // 	| const_item
  // 	| trait_item
  // 	| impl_item
  // 	| extern_item
  public static boolean item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, ITEM, "<item>");
    r = mod_item(b, l + 1);
    if (!r) r = fn_item(b, l + 1);
    if (!r) r = type_item(b, l + 1);
    if (!r) r = struct_item(b, l + 1);
    if (!r) r = enum_item(b, l + 1);
    if (!r) r = static_item(b, l + 1);
    if (!r) r = const_item(b, l + 1);
    if (!r) r = trait_item(b, l + 1);
    if (!r) r = impl_item(b, l + 1);
    if (!r) r = extern_item(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean itemName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "itemName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, ITEM_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // type_modifiers type_path '::'? [generic | closure_sugar]
  static boolean just_type_basic(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "just_type_basic")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_modifiers(b, l + 1);
    r = r && type_path(b, l + 1);
    r = r && just_type_basic_2(b, l + 1);
    r = r && just_type_basic_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '::'?
  private static boolean just_type_basic_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "just_type_basic_2")) return false;
    consumeToken(b, DOUBLE_COLON);
    return true;
  }

  // [generic | closure_sugar]
  private static boolean just_type_basic_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "just_type_basic_3")) return false;
    just_type_basic_3_0(b, l + 1);
    return true;
  }

  // generic | closure_sugar
  private static boolean just_type_basic_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "just_type_basic_3_0")) return false;
    boolean r;
    r = generic(b, l + 1);
    if (!r) r = closure_sugar(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'let' let_bind ['=' (expr | statement_block)] ';'?
  public static boolean let(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let")) return false;
    if (!nextTokenIs(b, KW_LET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_LET);
    r = r && let_bind(b, l + 1);
    r = r && let_2(b, l + 1);
    r = r && let_3(b, l + 1);
    exit_section_(b, m, LET, r);
    return r;
  }

  // ['=' (expr | statement_block)]
  private static boolean let_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_2")) return false;
    let_2_0(b, l + 1);
    return true;
  }

  // '=' (expr | statement_block)
  private static boolean let_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && let_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expr | statement_block
  private static boolean let_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_2_0_1")) return false;
    boolean r;
    r = expr(b, l + 1, -1);
    if (!r) r = statement_block(b, l + 1);
    return r;
  }

  // ';'?
  private static boolean let_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_3")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // [ let_bind ( ',' let_bind)* ','? ]
  public static boolean let_args(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_args")) return false;
    Marker m = enter_section_(b, l, _NONE_, LET_ARGS, "<let args>");
    let_args_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // let_bind ( ',' let_bind)* ','?
  private static boolean let_args_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_args_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = let_bind(b, l + 1);
    r = r && let_args_0_1(b, l + 1);
    r = r && let_args_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' let_bind)*
  private static boolean let_args_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_args_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!let_args_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "let_args_0_1", c)) break;
    }
    return true;
  }

  // ',' let_bind
  private static boolean let_args_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_args_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && let_bind(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean let_args_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_args_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // let_tuple_bind | let_struct_bind | let_variable_bind | let_unit_bind | let_self_arg
  public static boolean let_bind(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_bind")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, LET_BIND, "<let bind>");
    r = let_tuple_bind(b, l + 1);
    if (!r) r = let_struct_bind(b, l + 1);
    if (!r) r = let_variable_bind(b, l + 1);
    if (!r) r = let_unit_bind(b, l + 1);
    if (!r) r = let_self_arg(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ref? 'mut'? 'self'
  public static boolean let_self_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_self_arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LET_SELF_ARG, "<let self arg>");
    r = let_self_arg_0(b, l + 1);
    r = r && let_self_arg_1(b, l + 1);
    r = r && consumeToken(b, KW_SELF);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ref?
  private static boolean let_self_arg_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_self_arg_0")) return false;
    ref(b, l + 1);
    return true;
  }

  // 'mut'?
  private static boolean let_self_arg_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_self_arg_1")) return false;
    consumeToken(b, KW_MUT);
    return true;
  }

  /* ********************************************************** */
  // type_path '{' struct_bind_member (',' struct_bind_member )* ','? '..'? ','? '}' [':' type]
  public static boolean let_struct_bind(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_struct_bind")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LET_STRUCT_BIND, "<let struct bind>");
    r = type_path(b, l + 1);
    r = r && consumeToken(b, OPEN_BRACE);
    r = r && struct_bind_member(b, l + 1);
    r = r && let_struct_bind_3(b, l + 1);
    r = r && let_struct_bind_4(b, l + 1);
    r = r && let_struct_bind_5(b, l + 1);
    r = r && let_struct_bind_6(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    r = r && let_struct_bind_8(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' struct_bind_member )*
  private static boolean let_struct_bind_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_struct_bind_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!let_struct_bind_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "let_struct_bind_3", c)) break;
    }
    return true;
  }

  // ',' struct_bind_member
  private static boolean let_struct_bind_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_struct_bind_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && struct_bind_member(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean let_struct_bind_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_struct_bind_4")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // '..'?
  private static boolean let_struct_bind_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_struct_bind_5")) return false;
    consumeToken(b, DOUBLE_DOT);
    return true;
  }

  // ','?
  private static boolean let_struct_bind_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_struct_bind_6")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // [':' type]
  private static boolean let_struct_bind_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_struct_bind_8")) return false;
    let_struct_bind_8_0(b, l + 1);
    return true;
  }

  // ':' type
  private static boolean let_struct_bind_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_struct_bind_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ref* type_path? '(' let_bind (',' let_bind)* ','? ')' [':' type_sum]
  public static boolean let_tuple_bind(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_tuple_bind")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LET_TUPLE_BIND, "<let tuple bind>");
    r = let_tuple_bind_0(b, l + 1);
    r = r && let_tuple_bind_1(b, l + 1);
    r = r && consumeToken(b, OPEN_PAREN);
    r = r && let_bind(b, l + 1);
    r = r && let_tuple_bind_4(b, l + 1);
    r = r && let_tuple_bind_5(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    r = r && let_tuple_bind_7(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ref*
  private static boolean let_tuple_bind_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_tuple_bind_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ref(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "let_tuple_bind_0", c)) break;
    }
    return true;
  }

  // type_path?
  private static boolean let_tuple_bind_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_tuple_bind_1")) return false;
    type_path(b, l + 1);
    return true;
  }

  // (',' let_bind)*
  private static boolean let_tuple_bind_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_tuple_bind_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!let_tuple_bind_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "let_tuple_bind_4", c)) break;
    }
    return true;
  }

  // ',' let_bind
  private static boolean let_tuple_bind_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_tuple_bind_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && let_bind(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean let_tuple_bind_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_tuple_bind_5")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // [':' type_sum]
  private static boolean let_tuple_bind_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_tuple_bind_7")) return false;
    let_tuple_bind_7_0(b, l + 1);
    return true;
  }

  // ':' type_sum
  private static boolean let_tuple_bind_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_tuple_bind_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && type_sum(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' ')'
  public static boolean let_unit_bind(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_unit_bind")) return false;
    if (!nextTokenIs(b, OPEN_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_PAREN, CLOSE_PAREN);
    exit_section_(b, m, LET_UNIT_BIND, r);
    return r;
  }

  /* ********************************************************** */
  // variable_signature [':' type_sum]
  public static boolean let_variable_bind(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_variable_bind")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LET_VARIABLE_BIND, "<let variable bind>");
    r = variable_signature(b, l + 1);
    r = r && let_variable_bind_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [':' type_sum]
  private static boolean let_variable_bind_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_variable_bind_1")) return false;
    let_variable_bind_1_0(b, l + 1);
    return true;
  }

  // ':' type_sum
  private static boolean let_variable_bind_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_variable_bind_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && type_sum(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "'" (IDENTIFIER | 'static')
  public static boolean lifetime(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lifetime")) return false;
    if (!nextTokenIs(b, SINGLE_QUOTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SINGLE_QUOTE);
    r = r && lifetime_1(b, l + 1);
    exit_section_(b, m, LIFETIME, r);
    return r;
  }

  // IDENTIFIER | 'static'
  private static boolean lifetime_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lifetime_1")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, KW_STATIC);
    return r;
  }

  /* ********************************************************** */
  // string_literal | numeric_literal | 'true' | 'false' | 'self' | unit
  static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    r = string_literal(b, l + 1);
    if (!r) r = numeric_literal(b, l + 1);
    if (!r) r = consumeToken(b, KW_TRUE);
    if (!r) r = consumeToken(b, KW_FALSE);
    if (!r) r = consumeToken(b, KW_SELF);
    if (!r) r = unit(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // macro_body_internal
  public static boolean macro_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MACRO_BODY, "<macro body>");
    r = macro_body_internal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (macro_paren | macro_brace | macro_bracket | macro_wildcard)*
  static boolean macro_body_internal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_body_internal")) return false;
    while (true) {
      int c = current_position_(b);
      if (!macro_body_internal_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "macro_body_internal", c)) break;
    }
    return true;
  }

  // macro_paren | macro_brace | macro_bracket | macro_wildcard
  private static boolean macro_body_internal_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_body_internal_0")) return false;
    boolean r;
    r = macro_paren(b, l + 1);
    if (!r) r = macro_brace(b, l + 1);
    if (!r) r = macro_bracket(b, l + 1);
    if (!r) r = macro_wildcard(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '{' macro_body '}'
  public static boolean macro_brace(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_brace")) return false;
    if (!nextTokenIs(b, OPEN_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACE);
    r = r && macro_body(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, MACRO_BRACE, r);
    return r;
  }

  /* ********************************************************** */
  // '[' macro_body ']'
  public static boolean macro_bracket(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_bracket")) return false;
    if (!nextTokenIs(b, OPEN_SQUARE_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_SQUARE_BRACKET);
    r = r && macro_body(b, l + 1);
    r = r && consumeToken(b, CLOSE_SQUARE_BRACKET);
    exit_section_(b, m, MACRO_BRACKET, r);
    return r;
  }

  /* ********************************************************** */
  // '(' macro_body ')'
  public static boolean macro_paren(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_paren")) return false;
    if (!nextTokenIs(b, OPEN_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PAREN);
    r = r && macro_body(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, MACRO_PAREN, r);
    return r;
  }

  /* ********************************************************** */
  // 'macro_rules!' IDENTIFIER (macro_paren ';' | macro_bracket ';' | macro_brace)
  public static boolean macro_rules(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_rules")) return false;
    if (!nextTokenIs(b, KW_MACRO_RULES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_MACRO_RULES, IDENTIFIER);
    r = r && macro_rules_2(b, l + 1);
    exit_section_(b, m, MACRO_RULES, r);
    return r;
  }

  // macro_paren ';' | macro_bracket ';' | macro_brace
  private static boolean macro_rules_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_rules_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = macro_rules_2_0(b, l + 1);
    if (!r) r = macro_rules_2_1(b, l + 1);
    if (!r) r = macro_brace(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // macro_paren ';'
  private static boolean macro_rules_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_rules_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = macro_paren(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // macro_bracket ';'
  private static boolean macro_rules_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_rules_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = macro_bracket(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_AS | KW_BREAK | KW_CRATE | KW_ELSE | KW_ENUM | KW_EXTERN | KW_FALSE | KW_FN | KW_FOR
  // 	| KW_IF | KW_IMPL | KW_IN | KW_LET | KW_LOOP | KW_MATCH | KW_MOD | KW_MUT | KW_PRIV | KW_PROC | KW_PUB | KW_REF
  // 	| KW_RETURN | KW_SELF | KW_STATIC | KW_STRUCT | KW_SUPER | KW_TRUE | KW_TRAIT | KW_TYPE | KW_UNSAFE | KW_USE
  // 	| KW_WHILE | KW_CONTINUE | KW_BOX | LINE_DOC_COMMENT | LINE_COMMENT | CHAR_LIT | STRING_LIT | SEMICOLON
  // 	| BIN_LIT | OCT_LIT | HEX_LIT | DEC_LIT | IDENTIFIER | FAT_ARROW | THIN_ARROW | DOT | BITWISE_AND | BITWISE_OR
  // 	| BITWISE_XOR | DOUBLE_COLON | COLON | PLUS | MINUS | MULTIPLY | DIVIDE | REMAINDER | EQUAL | ASSIGN | NOT_EQUAL
  // 	| LESS_THAN_OR_EQUAL | LESS_THAN | GREATER_THAN_OR_EQUAL | GREATER_THAN | NOT | BOX | AT | SINGLE_QUOTE | DOLLAR
  // 	| HASH | COMMA | BAD_CHARACTER | RAW_STRING_LIT | ASSIGN_RIGHT_SHIFT | ASSIGN_LEFT_SHIFT | DOUBLE_DOT | TRIPLE_DOT
  // 	| BLOCK_COMMENT | BLOCK_DOC_COMMENT
  static boolean macro_wildcard(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_wildcard")) return false;
    boolean r;
    r = consumeToken(b, KW_AS);
    if (!r) r = consumeToken(b, KW_BREAK);
    if (!r) r = consumeToken(b, KW_CRATE);
    if (!r) r = consumeToken(b, KW_ELSE);
    if (!r) r = consumeToken(b, KW_ENUM);
    if (!r) r = consumeToken(b, KW_EXTERN);
    if (!r) r = consumeToken(b, KW_FALSE);
    if (!r) r = consumeToken(b, KW_FN);
    if (!r) r = consumeToken(b, KW_FOR);
    if (!r) r = consumeToken(b, KW_IF);
    if (!r) r = consumeToken(b, KW_IMPL);
    if (!r) r = consumeToken(b, KW_IN);
    if (!r) r = consumeToken(b, KW_LET);
    if (!r) r = consumeToken(b, KW_LOOP);
    if (!r) r = consumeToken(b, KW_MATCH);
    if (!r) r = consumeToken(b, KW_MOD);
    if (!r) r = consumeToken(b, KW_MUT);
    if (!r) r = consumeToken(b, KW_PRIV);
    if (!r) r = consumeToken(b, KW_PROC);
    if (!r) r = consumeToken(b, KW_PUB);
    if (!r) r = consumeToken(b, KW_REF);
    if (!r) r = consumeToken(b, KW_RETURN);
    if (!r) r = consumeToken(b, KW_SELF);
    if (!r) r = consumeToken(b, KW_STATIC);
    if (!r) r = consumeToken(b, KW_STRUCT);
    if (!r) r = consumeToken(b, KW_SUPER);
    if (!r) r = consumeToken(b, KW_TRUE);
    if (!r) r = consumeToken(b, KW_TRAIT);
    if (!r) r = consumeToken(b, KW_TYPE);
    if (!r) r = consumeToken(b, KW_UNSAFE);
    if (!r) r = consumeToken(b, KW_USE);
    if (!r) r = consumeToken(b, KW_WHILE);
    if (!r) r = consumeToken(b, KW_CONTINUE);
    if (!r) r = consumeToken(b, KW_BOX);
    if (!r) r = consumeToken(b, LINE_DOC_COMMENT);
    if (!r) r = consumeToken(b, LINE_COMMENT);
    if (!r) r = consumeToken(b, CHAR_LIT);
    if (!r) r = consumeToken(b, STRING_LIT);
    if (!r) r = consumeToken(b, SEMICOLON);
    if (!r) r = consumeToken(b, BIN_LIT);
    if (!r) r = consumeToken(b, OCT_LIT);
    if (!r) r = consumeToken(b, HEX_LIT);
    if (!r) r = consumeToken(b, DEC_LIT);
    if (!r) r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, FAT_ARROW);
    if (!r) r = consumeToken(b, THIN_ARROW);
    if (!r) r = consumeToken(b, DOT);
    if (!r) r = consumeToken(b, BITWISE_AND);
    if (!r) r = consumeToken(b, BITWISE_OR);
    if (!r) r = consumeToken(b, BITWISE_XOR);
    if (!r) r = consumeToken(b, DOUBLE_COLON);
    if (!r) r = consumeToken(b, COLON);
    if (!r) r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, MULTIPLY);
    if (!r) r = consumeToken(b, DIVIDE);
    if (!r) r = consumeToken(b, REMAINDER);
    if (!r) r = consumeToken(b, EQUAL);
    if (!r) r = consumeToken(b, ASSIGN);
    if (!r) r = consumeToken(b, NOT_EQUAL);
    if (!r) r = consumeToken(b, LESS_THAN_OR_EQUAL);
    if (!r) r = consumeToken(b, LESS_THAN);
    if (!r) r = consumeToken(b, GREATER_THAN_OR_EQUAL);
    if (!r) r = consumeToken(b, GREATER_THAN);
    if (!r) r = consumeToken(b, NOT);
    if (!r) r = consumeToken(b, BOX);
    if (!r) r = consumeToken(b, AT);
    if (!r) r = consumeToken(b, SINGLE_QUOTE);
    if (!r) r = consumeToken(b, DOLLAR);
    if (!r) r = consumeToken(b, HASH);
    if (!r) r = consumeToken(b, COMMA);
    if (!r) r = consumeToken(b, BAD_CHARACTER);
    if (!r) r = consumeToken(b, RAW_STRING_LIT);
    if (!r) r = consumeToken(b, ASSIGN_RIGHT_SHIFT);
    if (!r) r = consumeToken(b, ASSIGN_LEFT_SHIFT);
    if (!r) r = consumeToken(b, DOUBLE_DOT);
    if (!r) r = consumeToken(b, TRIPLE_DOT);
    if (!r) r = consumeToken(b, BLOCK_COMMENT);
    if (!r) r = consumeToken(b, BLOCK_DOC_COMMENT);
    return r;
  }

  /* ********************************************************** */
  // match_filter ('|' match_filter)* '=>' (statement_block | statement | expr) ','?
  public static boolean match_arm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_arm")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MATCH_ARM, "<match arm>");
    r = match_filter(b, l + 1);
    r = r && match_arm_1(b, l + 1);
    r = r && consumeToken(b, FAT_ARROW);
    r = r && match_arm_3(b, l + 1);
    r = r && match_arm_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('|' match_filter)*
  private static boolean match_arm_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_arm_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!match_arm_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "match_arm_1", c)) break;
    }
    return true;
  }

  // '|' match_filter
  private static boolean match_arm_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_arm_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BITWISE_OR);
    r = r && match_filter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // statement_block | statement | expr
  private static boolean match_arm_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_arm_3")) return false;
    boolean r;
    r = statement_block(b, l + 1);
    if (!r) r = statement(b, l + 1);
    if (!r) r = expr(b, l + 1, -1);
    return r;
  }

  // ','?
  private static boolean match_arm_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_arm_4")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // '{' match_body '}'
  public static boolean match_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_block")) return false;
    if (!nextTokenIs(b, OPEN_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACE);
    r = r && match_body(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, MATCH_BLOCK, r);
    return r;
  }

  /* ********************************************************** */
  // match_arm*
  public static boolean match_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_body")) return false;
    Marker m = enter_section_(b, l, _NONE_, MATCH_BODY, "<match body>");
    while (true) {
      int c = current_position_(b);
      if (!match_arm(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "match_body", c)) break;
    }
    exit_section_(b, l, m, true, false, CairoParser::not_close_brace);
    return true;
  }

  /* ********************************************************** */
  // match_pattern match_if?
  public static boolean match_filter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_filter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MATCH_FILTER, "<match filter>");
    r = match_pattern(b, l + 1);
    r = r && match_filter_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // match_if?
  private static boolean match_filter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_filter_1")) return false;
    match_if(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'box'? ref? 'ref'? 'mut'? IDENTIFIER
  public static boolean match_identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_identifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MATCH_IDENTIFIER, "<match identifier>");
    r = match_identifier_0(b, l + 1);
    r = r && match_identifier_1(b, l + 1);
    r = r && match_identifier_2(b, l + 1);
    r = r && match_identifier_3(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'box'?
  private static boolean match_identifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_identifier_0")) return false;
    consumeToken(b, KW_BOX);
    return true;
  }

  // ref?
  private static boolean match_identifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_identifier_1")) return false;
    ref(b, l + 1);
    return true;
  }

  // 'ref'?
  private static boolean match_identifier_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_identifier_2")) return false;
    consumeToken(b, KW_REF);
    return true;
  }

  // 'mut'?
  private static boolean match_identifier_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_identifier_3")) return false;
    consumeToken(b, KW_MUT);
    return true;
  }

  /* ********************************************************** */
  // 'if' expr
  public static boolean match_if(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_if")) return false;
    if (!nextTokenIs(b, KW_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_IF);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, MATCH_IF, r);
    return r;
  }

  /* ********************************************************** */
  // match_identifier '@'
  public static boolean match_label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_label")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MATCH_LABEL, "<match label>");
    r = match_identifier(b, l + 1);
    r = r && consumeToken(b, AT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // tuple_match_pattern | struct_match_pattern | vector_match_pattern | range_match_pattern | basic_match_pattern
  public static boolean match_pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_pattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, MATCH_PATTERN, "<match pattern>");
    r = tuple_match_pattern(b, l + 1);
    if (!r) r = struct_match_pattern(b, l + 1);
    if (!r) r = vector_match_pattern(b, l + 1);
    if (!r) r = range_match_pattern(b, l + 1);
    if (!r) r = basic_match_pattern(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( use
  //     | item
  //     | attribute
  //     | comment
  //     | expr_macro
  //     | macro_rules
  // )*
  static boolean mod_contents(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mod_contents")) return false;
    Marker m = enter_section_(b, l, _NONE_);
    while (true) {
      int c = current_position_(b);
      if (!mod_contents_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "mod_contents", c)) break;
    }
    exit_section_(b, l, m, true, false, CairoParser::not_close_brace);
    return true;
  }

  // use
  //     | item
  //     | attribute
  //     | comment
  //     | expr_macro
  //     | macro_rules
  private static boolean mod_contents_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mod_contents_0")) return false;
    boolean r;
    r = use(b, l + 1);
    if (!r) r = item(b, l + 1);
    if (!r) r = attribute(b, l + 1);
    if (!r) r = comment(b, l + 1);
    if (!r) r = expr_macro(b, l + 1);
    if (!r) r = macro_rules(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // (comment | attribute)* visibility? 'mod' type_path (';' | '{' mod_contents '}')
  public static boolean mod_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mod_item")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MOD_ITEM, "<mod item>");
    r = mod_item_0(b, l + 1);
    r = r && mod_item_1(b, l + 1);
    r = r && consumeToken(b, KW_MOD);
    p = r; // pin = 3
    r = r && report_error_(b, type_path(b, l + 1));
    r = p && mod_item_4(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (comment | attribute)*
  private static boolean mod_item_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mod_item_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!mod_item_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "mod_item_0", c)) break;
    }
    return true;
  }

  // comment | attribute
  private static boolean mod_item_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mod_item_0_0")) return false;
    boolean r;
    r = comment(b, l + 1);
    if (!r) r = attribute(b, l + 1);
    return r;
  }

  // visibility?
  private static boolean mod_item_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mod_item_1")) return false;
    visibility(b, l + 1);
    return true;
  }

  // ';' | '{' mod_contents '}'
  private static boolean mod_item_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mod_item_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMICOLON);
    if (!r) r = mod_item_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' mod_contents '}'
  private static boolean mod_item_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mod_item_4_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACE);
    r = r && mod_contents(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !'}'
  static boolean not_close_brace(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "not_close_brace")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, CLOSE_BRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !'{'
  static boolean not_open_brace(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "not_open_brace")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, OPEN_BRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !('{' | 'where')
  static boolean not_open_brace_or_where(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "not_open_brace_or_where")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !not_open_brace_or_where_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '{' | 'where'
  private static boolean not_open_brace_or_where_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "not_open_brace_or_where_0")) return false;
    boolean r;
    r = consumeToken(b, OPEN_BRACE);
    if (!r) r = consumeToken(b, KW_WHERE);
    return r;
  }

  /* ********************************************************** */
  // !';'
  static boolean not_semicolon(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "not_semicolon")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !('{' | ';')
  static boolean not_semicolon_or_open_brace(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "not_semicolon_or_open_brace")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !not_semicolon_or_open_brace_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '{' | ';'
  private static boolean not_semicolon_or_open_brace_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "not_semicolon_or_open_brace_0")) return false;
    boolean r;
    r = consumeToken(b, OPEN_BRACE);
    if (!r) r = consumeToken(b, SEMICOLON);
    return r;
  }

  /* ********************************************************** */
  // '-'? (BIN_LIT | OCT_LIT | HEX_LIT | DEC_LIT)
  static boolean numeric_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numeric_literal")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = numeric_literal_0(b, l + 1);
    r = r && numeric_literal_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '-'?
  private static boolean numeric_literal_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numeric_literal_0")) return false;
    consumeToken(b, MINUS);
    return true;
  }

  // BIN_LIT | OCT_LIT | HEX_LIT | DEC_LIT
  private static boolean numeric_literal_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numeric_literal_1")) return false;
    boolean r;
    r = consumeToken(b, BIN_LIT);
    if (!r) r = consumeToken(b, OCT_LIT);
    if (!r) r = consumeToken(b, HEX_LIT);
    if (!r) r = consumeToken(b, DEC_LIT);
    return r;
  }

  /* ********************************************************** */
  // prototype_tuple_arg | prototype_struct_arg | prototype_variable_arg | prototype_self_arg
  public static boolean prototype_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prototype_arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROTOTYPE_ARG, "<prototype arg>");
    r = prototype_tuple_arg(b, l + 1);
    if (!r) r = prototype_struct_arg(b, l + 1);
    if (!r) r = prototype_variable_arg(b, l + 1);
    if (!r) r = prototype_self_arg(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [ prototype_arg ( ',' prototype_arg)* ]
  public static boolean prototype_args(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prototype_args")) return false;
    Marker m = enter_section_(b, l, _NONE_, PROTOTYPE_ARGS, "<prototype args>");
    prototype_args_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // prototype_arg ( ',' prototype_arg)*
  private static boolean prototype_args_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prototype_args_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = prototype_arg(b, l + 1);
    r = r && prototype_args_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' prototype_arg)*
  private static boolean prototype_args_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prototype_args_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!prototype_args_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "prototype_args_0_1", c)) break;
    }
    return true;
  }

  // ',' prototype_arg
  private static boolean prototype_args_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prototype_args_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && prototype_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ref? 'mut'? 'self'
  public static boolean prototype_self_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prototype_self_arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROTOTYPE_SELF_ARG, "<prototype self arg>");
    r = prototype_self_arg_0(b, l + 1);
    r = r && prototype_self_arg_1(b, l + 1);
    r = r && consumeToken(b, KW_SELF);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ref?
  private static boolean prototype_self_arg_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prototype_self_arg_0")) return false;
    ref(b, l + 1);
    return true;
  }

  // 'mut'?
  private static boolean prototype_self_arg_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prototype_self_arg_1")) return false;
    consumeToken(b, KW_MUT);
    return true;
  }

  /* ********************************************************** */
  // type '{' struct_bind_member (',' struct_bind_member )* ','? '..'? ','? '}' [':' type]
  public static boolean prototype_struct_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prototype_struct_arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROTOTYPE_STRUCT_ARG, "<prototype struct arg>");
    r = type(b, l + 1);
    r = r && consumeToken(b, OPEN_BRACE);
    r = r && struct_bind_member(b, l + 1);
    r = r && prototype_struct_arg_3(b, l + 1);
    r = r && prototype_struct_arg_4(b, l + 1);
    r = r && prototype_struct_arg_5(b, l + 1);
    r = r && prototype_struct_arg_6(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    r = r && prototype_struct_arg_8(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' struct_bind_member )*
  private static boolean prototype_struct_arg_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prototype_struct_arg_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!prototype_struct_arg_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "prototype_struct_arg_3", c)) break;
    }
    return true;
  }

  // ',' struct_bind_member
  private static boolean prototype_struct_arg_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prototype_struct_arg_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && struct_bind_member(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean prototype_struct_arg_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prototype_struct_arg_4")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // '..'?
  private static boolean prototype_struct_arg_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prototype_struct_arg_5")) return false;
    consumeToken(b, DOUBLE_DOT);
    return true;
  }

  // ','?
  private static boolean prototype_struct_arg_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prototype_struct_arg_6")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // [':' type]
  private static boolean prototype_struct_arg_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prototype_struct_arg_8")) return false;
    prototype_struct_arg_8_0(b, l + 1);
    return true;
  }

  // ':' type
  private static boolean prototype_struct_arg_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prototype_struct_arg_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ref* type_basic? '(' prototype_arg (',' prototype_arg)* ','? ')' [':' type]
  public static boolean prototype_tuple_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prototype_tuple_arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROTOTYPE_TUPLE_ARG, "<prototype tuple arg>");
    r = prototype_tuple_arg_0(b, l + 1);
    r = r && prototype_tuple_arg_1(b, l + 1);
    r = r && consumeToken(b, OPEN_PAREN);
    r = r && prototype_arg(b, l + 1);
    r = r && prototype_tuple_arg_4(b, l + 1);
    r = r && prototype_tuple_arg_5(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    r = r && prototype_tuple_arg_7(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ref*
  private static boolean prototype_tuple_arg_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prototype_tuple_arg_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ref(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "prototype_tuple_arg_0", c)) break;
    }
    return true;
  }

  // type_basic?
  private static boolean prototype_tuple_arg_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prototype_tuple_arg_1")) return false;
    type_basic(b, l + 1);
    return true;
  }

  // (',' prototype_arg)*
  private static boolean prototype_tuple_arg_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prototype_tuple_arg_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!prototype_tuple_arg_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "prototype_tuple_arg_4", c)) break;
    }
    return true;
  }

  // ',' prototype_arg
  private static boolean prototype_tuple_arg_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prototype_tuple_arg_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && prototype_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean prototype_tuple_arg_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prototype_tuple_arg_5")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // [':' type]
  private static boolean prototype_tuple_arg_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prototype_tuple_arg_7")) return false;
    prototype_tuple_arg_7_0(b, l + 1);
    return true;
  }

  // ':' type
  private static boolean prototype_tuple_arg_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prototype_tuple_arg_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // variable_signature ':' type | type
  public static boolean prototype_variable_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prototype_variable_arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROTOTYPE_VARIABLE_ARG, "<prototype variable arg>");
    r = prototype_variable_arg_0(b, l + 1);
    if (!r) r = type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // variable_signature ':' type
  private static boolean prototype_variable_arg_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prototype_variable_arg_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable_signature(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // match_label? (literal | match_identifier) '...' (literal | match_identifier)
  public static boolean range_match_pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_match_pattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RANGE_MATCH_PATTERN, "<range match pattern>");
    r = range_match_pattern_0(b, l + 1);
    r = r && range_match_pattern_1(b, l + 1);
    r = r && consumeToken(b, TRIPLE_DOT);
    r = r && range_match_pattern_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // match_label?
  private static boolean range_match_pattern_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_match_pattern_0")) return false;
    match_label(b, l + 1);
    return true;
  }

  // literal | match_identifier
  private static boolean range_match_pattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_match_pattern_1")) return false;
    boolean r;
    r = literal(b, l + 1);
    if (!r) r = match_identifier(b, l + 1);
    return r;
  }

  // literal | match_identifier
  private static boolean range_match_pattern_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_match_pattern_3")) return false;
    boolean r;
    r = literal(b, l + 1);
    if (!r) r = match_identifier(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '&'+ lifetime?
  public static boolean ref(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ref")) return false;
    if (!nextTokenIs(b, BITWISE_AND)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ref_0(b, l + 1);
    r = r && ref_1(b, l + 1);
    exit_section_(b, m, REF, r);
    return r;
  }

  // '&'+
  private static boolean ref_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ref_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BITWISE_AND);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, BITWISE_AND)) break;
      if (!empty_element_parsed_guard_(b, "ref_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // lifetime?
  private static boolean ref_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ref_1")) return false;
    lifetime(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "'" 'static'
  public static boolean region_bound(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "region_bound")) return false;
    if (!nextTokenIs(b, SINGLE_QUOTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SINGLE_QUOTE, KW_STATIC);
    exit_section_(b, m, REGION_BOUND, r);
    return r;
  }

  /* ********************************************************** */
  // 'return' expr? ';'?
  public static boolean return_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement")) return false;
    if (!nextTokenIs(b, KW_RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_RETURN);
    r = r && return_statement_1(b, l + 1);
    r = r && return_statement_2(b, l + 1);
    exit_section_(b, m, RETURN_STATEMENT, r);
    return r;
  }

  // expr?
  private static boolean return_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement_1")) return false;
    expr(b, l + 1, -1);
    return true;
  }

  // ';'?
  private static boolean return_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement_2")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // type | '!'
  static boolean return_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_type")) return false;
    boolean r;
    r = type(b, l + 1);
    if (!r) r = consumeToken(b, NOT);
    return r;
  }

  /* ********************************************************** */
  // expr ';'?
  // 	| use
  // 	| let
  // 	| item
  // 	| macro_rules
  // 	| return_statement
  // 	| empty_statement
  // 	| comment
  // 	| attribute
  static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement_0(b, l + 1);
    if (!r) r = use(b, l + 1);
    if (!r) r = let(b, l + 1);
    if (!r) r = item(b, l + 1);
    if (!r) r = macro_rules(b, l + 1);
    if (!r) r = return_statement(b, l + 1);
    if (!r) r = empty_statement(b, l + 1);
    if (!r) r = comment(b, l + 1);
    if (!r) r = attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expr ';'?
  private static boolean statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1, -1);
    r = r && statement_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';'?
  private static boolean statement_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_0_1")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // '{' statement_block_internal '}'
  public static boolean statement_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_block")) return false;
    if (!nextTokenIs(b, OPEN_BRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT_BLOCK, null);
    r = consumeToken(b, OPEN_BRACE);
    p = r; // pin = 1
    r = r && report_error_(b, statement_block_internal(b, l + 1));
    r = p && consumeToken(b, CLOSE_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // (statement)*
  static boolean statement_block_internal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_block_internal")) return false;
    Marker m = enter_section_(b, l, _NONE_);
    while (true) {
      int c = current_position_(b);
      if (!statement_block_internal_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "statement_block_internal", c)) break;
    }
    exit_section_(b, l, m, true, false, CairoParser::not_close_brace);
    return true;
  }

  // (statement)
  private static boolean statement_block_internal_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_block_internal_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (comment | attribute)* visibility? 'static' 'mut'? itemName ':' type '=' expr ';'
  public static boolean static_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_item")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STATIC_ITEM, "<static item>");
    r = static_item_0(b, l + 1);
    r = r && static_item_1(b, l + 1);
    r = r && consumeToken(b, KW_STATIC);
    p = r; // pin = 3
    r = r && report_error_(b, static_item_3(b, l + 1));
    r = p && report_error_(b, itemName(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, COLON)) && r;
    r = p && report_error_(b, type(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, ASSIGN)) && r;
    r = p && report_error_(b, expr(b, l + 1, -1)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (comment | attribute)*
  private static boolean static_item_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_item_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!static_item_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "static_item_0", c)) break;
    }
    return true;
  }

  // comment | attribute
  private static boolean static_item_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_item_0_0")) return false;
    boolean r;
    r = comment(b, l + 1);
    if (!r) r = attribute(b, l + 1);
    return r;
  }

  // visibility?
  private static boolean static_item_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_item_1")) return false;
    visibility(b, l + 1);
    return true;
  }

  // 'mut'?
  private static boolean static_item_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_item_3")) return false;
    consumeToken(b, KW_MUT);
    return true;
  }

  /* ********************************************************** */
  // STRING_LIT | RAW_STRING_LIT | CHAR_LIT
  static boolean string_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_literal")) return false;
    boolean r;
    r = consumeToken(b, STRING_LIT);
    if (!r) r = consumeToken(b, RAW_STRING_LIT);
    if (!r) r = consumeToken(b, CHAR_LIT);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER ':' variable_signature | variable_signature
  static boolean struct_bind_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_bind_member")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = struct_bind_member_0(b, l + 1);
    if (!r) r = variable_signature(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER ':' variable_signature
  private static boolean struct_bind_member_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_bind_member_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COLON);
    r = r && variable_signature(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' [struct_property (',' struct_property)* ','? (comment | attribute)*] '}'
  public static boolean struct_body_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_body_block")) return false;
    if (!nextTokenIs(b, OPEN_BRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_BODY_BLOCK, null);
    r = consumeToken(b, OPEN_BRACE);
    p = r; // pin = 1
    r = r && report_error_(b, struct_body_block_1(b, l + 1));
    r = p && consumeToken(b, CLOSE_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [struct_property (',' struct_property)* ','? (comment | attribute)*]
  private static boolean struct_body_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_body_block_1")) return false;
    struct_body_block_1_0(b, l + 1);
    return true;
  }

  // struct_property (',' struct_property)* ','? (comment | attribute)*
  private static boolean struct_body_block_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_body_block_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = struct_property(b, l + 1);
    r = r && struct_body_block_1_0_1(b, l + 1);
    r = r && struct_body_block_1_0_2(b, l + 1);
    r = r && struct_body_block_1_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' struct_property)*
  private static boolean struct_body_block_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_body_block_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!struct_body_block_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "struct_body_block_1_0_1", c)) break;
    }
    return true;
  }

  // ',' struct_property
  private static boolean struct_body_block_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_body_block_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && struct_property(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean struct_body_block_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_body_block_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // (comment | attribute)*
  private static boolean struct_body_block_1_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_body_block_1_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!struct_body_block_1_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "struct_body_block_1_0_3", c)) break;
    }
    return true;
  }

  // comment | attribute
  private static boolean struct_body_block_1_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_body_block_1_0_3_0")) return false;
    boolean r;
    r = comment(b, l + 1);
    if (!r) r = attribute(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '(' struct_tuple_property (',' struct_tuple_property)* ')'
  public static boolean struct_body_tuple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_body_tuple")) return false;
    if (!nextTokenIs(b, OPEN_PAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_BODY_TUPLE, null);
    r = consumeToken(b, OPEN_PAREN);
    p = r; // pin = 1
    r = r && report_error_(b, struct_tuple_property(b, l + 1));
    r = p && report_error_(b, struct_body_tuple_2(b, l + 1)) && r;
    r = p && consumeToken(b, CLOSE_PAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (',' struct_tuple_property)*
  private static boolean struct_body_tuple_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_body_tuple_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!struct_body_tuple_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "struct_body_tuple_2", c)) break;
    }
    return true;
  }

  // ',' struct_tuple_property
  private static boolean struct_body_tuple_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_body_tuple_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && struct_tuple_property(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // struct_body_tuple where_clause? ';' |
  // 	where_clause? (';' | struct_body_block)
  static boolean struct_body_with_where(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_body_with_where")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = struct_body_with_where_0(b, l + 1);
    if (!r) r = struct_body_with_where_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // struct_body_tuple where_clause? ';'
  private static boolean struct_body_with_where_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_body_with_where_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = struct_body_tuple(b, l + 1);
    r = r && struct_body_with_where_0_1(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // where_clause?
  private static boolean struct_body_with_where_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_body_with_where_0_1")) return false;
    where_clause(b, l + 1);
    return true;
  }

  // where_clause? (';' | struct_body_block)
  private static boolean struct_body_with_where_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_body_with_where_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = struct_body_with_where_1_0(b, l + 1);
    r = r && struct_body_with_where_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // where_clause?
  private static boolean struct_body_with_where_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_body_with_where_1_0")) return false;
    where_clause(b, l + 1);
    return true;
  }

  // ';' | struct_body_block
  private static boolean struct_body_with_where_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_body_with_where_1_1")) return false;
    boolean r;
    r = consumeToken(b, SEMICOLON);
    if (!r) r = struct_body_block(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '..' expr
  public static boolean struct_default(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_default")) return false;
    if (!nextTokenIs(b, DOUBLE_DOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOUBLE_DOT);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, STRUCT_DEFAULT, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER ':' expr (',' IDENTIFIER ':' expr)*
  public static boolean struct_initializer_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_initializer_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COLON);
    r = r && expr(b, l + 1, -1);
    r = r && struct_initializer_list_3(b, l + 1);
    exit_section_(b, m, STRUCT_INITIALIZER_LIST, r);
    return r;
  }

  // (',' IDENTIFIER ':' expr)*
  private static boolean struct_initializer_list_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_initializer_list_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!struct_initializer_list_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "struct_initializer_list_3", c)) break;
    }
    return true;
  }

  // ',' IDENTIFIER ':' expr
  private static boolean struct_initializer_list_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_initializer_list_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, IDENTIFIER, COLON);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // visibility? 'struct' itemName generic_params? struct_body_with_where
  public static boolean struct_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_ITEM, "<struct item>");
    r = struct_item_0(b, l + 1);
    r = r && consumeToken(b, KW_STRUCT);
    r = r && itemName(b, l + 1);
    r = r && struct_item_3(b, l + 1);
    r = r && struct_body_with_where(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // visibility?
  private static boolean struct_item_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_item_0")) return false;
    visibility(b, l + 1);
    return true;
  }

  // generic_params?
  private static boolean struct_item_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_item_3")) return false;
    generic_params(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'box'? 'ref'? type_path '{' (struct_match_pattern_argument (',' struct_match_pattern_argument)* [',' '..'] | '..') '}'
  public static boolean struct_match_pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_match_pattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_MATCH_PATTERN, "<struct match pattern>");
    r = struct_match_pattern_0(b, l + 1);
    r = r && struct_match_pattern_1(b, l + 1);
    r = r && type_path(b, l + 1);
    r = r && consumeToken(b, OPEN_BRACE);
    r = r && struct_match_pattern_4(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'box'?
  private static boolean struct_match_pattern_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_match_pattern_0")) return false;
    consumeToken(b, KW_BOX);
    return true;
  }

  // 'ref'?
  private static boolean struct_match_pattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_match_pattern_1")) return false;
    consumeToken(b, KW_REF);
    return true;
  }

  // struct_match_pattern_argument (',' struct_match_pattern_argument)* [',' '..'] | '..'
  private static boolean struct_match_pattern_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_match_pattern_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = struct_match_pattern_4_0(b, l + 1);
    if (!r) r = consumeToken(b, DOUBLE_DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // struct_match_pattern_argument (',' struct_match_pattern_argument)* [',' '..']
  private static boolean struct_match_pattern_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_match_pattern_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = struct_match_pattern_argument(b, l + 1);
    r = r && struct_match_pattern_4_0_1(b, l + 1);
    r = r && struct_match_pattern_4_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' struct_match_pattern_argument)*
  private static boolean struct_match_pattern_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_match_pattern_4_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!struct_match_pattern_4_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "struct_match_pattern_4_0_1", c)) break;
    }
    return true;
  }

  // ',' struct_match_pattern_argument
  private static boolean struct_match_pattern_4_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_match_pattern_4_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && struct_match_pattern_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [',' '..']
  private static boolean struct_match_pattern_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_match_pattern_4_0_2")) return false;
    parseTokens(b, 0, COMMA, DOUBLE_DOT);
    return true;
  }

  /* ********************************************************** */
  // match_identifier [':' match_pattern]
  static boolean struct_match_pattern_argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_match_pattern_argument")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = match_identifier(b, l + 1);
    r = r && struct_match_pattern_argument_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [':' match_pattern]
  private static boolean struct_match_pattern_argument_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_match_pattern_argument_1")) return false;
    struct_match_pattern_argument_1_0(b, l + 1);
    return true;
  }

  // ':' match_pattern
  private static boolean struct_match_pattern_argument_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_match_pattern_argument_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && match_pattern(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (comment | attribute)* visibility? let_variable_bind
  public static boolean struct_property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_property")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_PROPERTY, "<struct property>");
    r = struct_property_0(b, l + 1);
    r = r && struct_property_1(b, l + 1);
    r = r && let_variable_bind(b, l + 1);
    exit_section_(b, l, m, r, false, CairoParser::struct_recover);
    return r;
  }

  // (comment | attribute)*
  private static boolean struct_property_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_property_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!struct_property_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "struct_property_0", c)) break;
    }
    return true;
  }

  // comment | attribute
  private static boolean struct_property_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_property_0_0")) return false;
    boolean r;
    r = comment(b, l + 1);
    if (!r) r = attribute(b, l + 1);
    return r;
  }

  // visibility?
  private static boolean struct_property_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_property_1")) return false;
    visibility(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // !('}' | ',')
  public static boolean struct_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, STRUCT_RECOVER, "<struct recover>");
    r = !struct_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '}' | ','
  private static boolean struct_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_recover_0")) return false;
    boolean r;
    r = consumeToken(b, CLOSE_BRACE);
    if (!r) r = consumeToken(b, COMMA);
    return r;
  }

  /* ********************************************************** */
  // visibility? type_sum
  public static boolean struct_tuple_property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_tuple_property")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_TUPLE_PROPERTY, "<struct tuple property>");
    r = struct_tuple_property_0(b, l + 1);
    r = r && type_sum(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // visibility?
  private static boolean struct_tuple_property_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_tuple_property_0")) return false;
    visibility(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'type' itemName [':' bounds] where_clause? ['=' type] ';'
  public static boolean trait_assoc_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_assoc_type")) return false;
    if (!nextTokenIs(b, KW_TYPE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TRAIT_ASSOC_TYPE, null);
    r = consumeToken(b, KW_TYPE);
    p = r; // pin = 1
    r = r && report_error_(b, itemName(b, l + 1));
    r = p && report_error_(b, trait_assoc_type_2(b, l + 1)) && r;
    r = p && report_error_(b, trait_assoc_type_3(b, l + 1)) && r;
    r = p && report_error_(b, trait_assoc_type_4(b, l + 1)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [':' bounds]
  private static boolean trait_assoc_type_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_assoc_type_2")) return false;
    trait_assoc_type_2_0(b, l + 1);
    return true;
  }

  // ':' bounds
  private static boolean trait_assoc_type_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_assoc_type_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && bounds(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // where_clause?
  private static boolean trait_assoc_type_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_assoc_type_3")) return false;
    where_clause(b, l + 1);
    return true;
  }

  // ['=' type]
  private static boolean trait_assoc_type_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_assoc_type_4")) return false;
    trait_assoc_type_4_0(b, l + 1);
    return true;
  }

  // '=' type
  private static boolean trait_assoc_type_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_assoc_type_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' trait_subitem* '}'
  public static boolean trait_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_block")) return false;
    if (!nextTokenIs(b, OPEN_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACE);
    r = r && trait_block_1(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, TRAIT_BLOCK, r);
    return r;
  }

  // trait_subitem*
  private static boolean trait_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!trait_subitem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "trait_block_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ':' (IDENTIFIER | region_bound)?
  public static boolean trait_bounds(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_bounds")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && trait_bounds_1(b, l + 1);
    exit_section_(b, m, TRAIT_BOUNDS, r);
    return r;
  }

  // (IDENTIFIER | region_bound)?
  private static boolean trait_bounds_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_bounds_1")) return false;
    trait_bounds_1_0(b, l + 1);
    return true;
  }

  // IDENTIFIER | region_bound
  private static boolean trait_bounds_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_bounds_1_0")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = region_bound(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // (comment | attribute)* visibility? 'unsafe'? 'fn' IDENTIFIER generic_params? '(' prototype_args ','? '...'? ')' ['->' return_type]
  public static boolean trait_function_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_function_declaration")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TRAIT_FUNCTION_DECLARATION, "<trait function declaration>");
    r = trait_function_declaration_0(b, l + 1);
    r = r && trait_function_declaration_1(b, l + 1);
    r = r && trait_function_declaration_2(b, l + 1);
    r = r && consumeTokens(b, 1, KW_FN, IDENTIFIER);
    p = r; // pin = 4
    r = r && report_error_(b, trait_function_declaration_5(b, l + 1));
    r = p && report_error_(b, consumeToken(b, OPEN_PAREN)) && r;
    r = p && report_error_(b, prototype_args(b, l + 1)) && r;
    r = p && report_error_(b, trait_function_declaration_8(b, l + 1)) && r;
    r = p && report_error_(b, trait_function_declaration_9(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, CLOSE_PAREN)) && r;
    r = p && trait_function_declaration_11(b, l + 1) && r;
    exit_section_(b, l, m, r, p, CairoParser::not_semicolon_or_open_brace);
    return r || p;
  }

  // (comment | attribute)*
  private static boolean trait_function_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_function_declaration_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!trait_function_declaration_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "trait_function_declaration_0", c)) break;
    }
    return true;
  }

  // comment | attribute
  private static boolean trait_function_declaration_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_function_declaration_0_0")) return false;
    boolean r;
    r = comment(b, l + 1);
    if (!r) r = attribute(b, l + 1);
    return r;
  }

  // visibility?
  private static boolean trait_function_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_function_declaration_1")) return false;
    visibility(b, l + 1);
    return true;
  }

  // 'unsafe'?
  private static boolean trait_function_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_function_declaration_2")) return false;
    consumeToken(b, KW_UNSAFE);
    return true;
  }

  // generic_params?
  private static boolean trait_function_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_function_declaration_5")) return false;
    generic_params(b, l + 1);
    return true;
  }

  // ','?
  private static boolean trait_function_declaration_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_function_declaration_8")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // '...'?
  private static boolean trait_function_declaration_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_function_declaration_9")) return false;
    consumeToken(b, TRIPLE_DOT);
    return true;
  }

  // ['->' return_type]
  private static boolean trait_function_declaration_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_function_declaration_11")) return false;
    trait_function_declaration_11_0(b, l + 1);
    return true;
  }

  // '->' return_type
  private static boolean trait_function_declaration_11_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_function_declaration_11_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, THIN_ARROW);
    r = r && return_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ':' type ('+' type)*
  public static boolean trait_implements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_implements")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TRAIT_IMPLEMENTS, "<trait implements>");
    r = consumeToken(b, COLON);
    r = r && type(b, l + 1);
    r = r && trait_implements_2(b, l + 1);
    exit_section_(b, l, m, r, false, CairoParser::not_open_brace_or_where);
    return r;
  }

  // ('+' type)*
  private static boolean trait_implements_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_implements_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!trait_implements_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "trait_implements_2", c)) break;
    }
    return true;
  }

  // '+' type
  private static boolean trait_implements_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_implements_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // visibility? 'trait' generic_params? itemName generic_params? trait_implements? where_clause? trait_block
  public static boolean trait_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_item")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TRAIT_ITEM, "<trait item>");
    r = trait_item_0(b, l + 1);
    r = r && consumeToken(b, KW_TRAIT);
    p = r; // pin = 2
    r = r && report_error_(b, trait_item_2(b, l + 1));
    r = p && report_error_(b, itemName(b, l + 1)) && r;
    r = p && report_error_(b, trait_item_4(b, l + 1)) && r;
    r = p && report_error_(b, trait_item_5(b, l + 1)) && r;
    r = p && report_error_(b, trait_item_6(b, l + 1)) && r;
    r = p && trait_block(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // visibility?
  private static boolean trait_item_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_item_0")) return false;
    visibility(b, l + 1);
    return true;
  }

  // generic_params?
  private static boolean trait_item_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_item_2")) return false;
    generic_params(b, l + 1);
    return true;
  }

  // generic_params?
  private static boolean trait_item_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_item_4")) return false;
    generic_params(b, l + 1);
    return true;
  }

  // trait_implements?
  private static boolean trait_item_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_item_5")) return false;
    trait_implements(b, l + 1);
    return true;
  }

  // where_clause?
  private static boolean trait_item_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_item_6")) return false;
    where_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (trait_function_declaration (';' | statement_block)) | trait_assoc_type | comment | attribute
  static boolean trait_subitem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_subitem")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = trait_subitem_0(b, l + 1);
    if (!r) r = trait_assoc_type(b, l + 1);
    if (!r) r = comment(b, l + 1);
    if (!r) r = attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // trait_function_declaration (';' | statement_block)
  private static boolean trait_subitem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_subitem_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = trait_function_declaration(b, l + 1);
    r = r && trait_subitem_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';' | statement_block
  private static boolean trait_subitem_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_subitem_0_1")) return false;
    boolean r;
    r = consumeToken(b, SEMICOLON);
    if (!r) r = statement_block(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // match_label? 'box'? '&'? type_path? '(' tuple_match_pattern_argument (',' tuple_match_pattern_argument)* ')'
  public static boolean tuple_match_pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_match_pattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TUPLE_MATCH_PATTERN, "<tuple match pattern>");
    r = tuple_match_pattern_0(b, l + 1);
    r = r && tuple_match_pattern_1(b, l + 1);
    r = r && tuple_match_pattern_2(b, l + 1);
    r = r && tuple_match_pattern_3(b, l + 1);
    r = r && consumeToken(b, OPEN_PAREN);
    r = r && tuple_match_pattern_argument(b, l + 1);
    r = r && tuple_match_pattern_6(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // match_label?
  private static boolean tuple_match_pattern_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_match_pattern_0")) return false;
    match_label(b, l + 1);
    return true;
  }

  // 'box'?
  private static boolean tuple_match_pattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_match_pattern_1")) return false;
    consumeToken(b, KW_BOX);
    return true;
  }

  // '&'?
  private static boolean tuple_match_pattern_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_match_pattern_2")) return false;
    consumeToken(b, BITWISE_AND);
    return true;
  }

  // type_path?
  private static boolean tuple_match_pattern_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_match_pattern_3")) return false;
    type_path(b, l + 1);
    return true;
  }

  // (',' tuple_match_pattern_argument)*
  private static boolean tuple_match_pattern_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_match_pattern_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tuple_match_pattern_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tuple_match_pattern_6", c)) break;
    }
    return true;
  }

  // ',' tuple_match_pattern_argument
  private static boolean tuple_match_pattern_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_match_pattern_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && tuple_match_pattern_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // match_pattern | '..'
  static boolean tuple_match_pattern_argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_match_pattern_argument")) return false;
    boolean r;
    r = match_pattern(b, l + 1);
    if (!r) r = consumeToken(b, DOUBLE_DOT);
    return r;
  }

  /* ********************************************************** */
  // 'ref'? type_sum
  static boolean tupled_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupled_type")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tupled_type_0(b, l + 1);
    r = r && type_sum(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'ref'?
  private static boolean tupled_type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupled_type_0")) return false;
    consumeToken(b, KW_REF);
    return true;
  }

  /* ********************************************************** */
  // type_basic | type_vector | type_tuple | type_function | type_unit
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, TYPE, "<type>");
    r = type_basic(b, l + 1);
    if (!r) r = type_vector(b, l + 1);
    if (!r) r = type_tuple(b, l + 1);
    if (!r) r = type_function(b, l + 1);
    if (!r) r = type_unit(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // just_type_basic
  public static boolean type_basic(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_basic")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_BASIC, "<type basic>");
    r = just_type_basic(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // just_type_basic '+' bounds
  public static boolean type_bounded(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_bounded")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_BOUNDED, "<type bounded>");
    r = just_type_basic(b, l + 1);
    r = r && consumeToken(b, PLUS);
    r = r && bounds(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ref? 'unsafe'? ['extern' STRING_LIT?] 'fn' trait_bounds? fn_prototype_args ['->' return_type]
  public static boolean type_function(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_function")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_FUNCTION, "<type function>");
    r = type_function_0(b, l + 1);
    r = r && type_function_1(b, l + 1);
    r = r && type_function_2(b, l + 1);
    r = r && consumeToken(b, KW_FN);
    r = r && type_function_4(b, l + 1);
    r = r && fn_prototype_args(b, l + 1);
    r = r && type_function_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ref?
  private static boolean type_function_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_function_0")) return false;
    ref(b, l + 1);
    return true;
  }

  // 'unsafe'?
  private static boolean type_function_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_function_1")) return false;
    consumeToken(b, KW_UNSAFE);
    return true;
  }

  // ['extern' STRING_LIT?]
  private static boolean type_function_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_function_2")) return false;
    type_function_2_0(b, l + 1);
    return true;
  }

  // 'extern' STRING_LIT?
  private static boolean type_function_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_function_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_EXTERN);
    r = r && type_function_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // STRING_LIT?
  private static boolean type_function_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_function_2_0_1")) return false;
    consumeToken(b, STRING_LIT);
    return true;
  }

  // trait_bounds?
  private static boolean type_function_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_function_4")) return false;
    trait_bounds(b, l + 1);
    return true;
  }

  // ['->' return_type]
  private static boolean type_function_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_function_6")) return false;
    type_function_6_0(b, l + 1);
    return true;
  }

  // '->' return_type
  private static boolean type_function_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_function_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, THIN_ARROW);
    r = r && return_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (comment | attribute)* visibility? 'type' itemName generic_params? '=' type_sum ';'
  public static boolean type_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_item")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TYPE_ITEM, "<type item>");
    r = type_item_0(b, l + 1);
    r = r && type_item_1(b, l + 1);
    r = r && consumeToken(b, KW_TYPE);
    p = r; // pin = 3
    r = r && report_error_(b, itemName(b, l + 1));
    r = p && report_error_(b, type_item_4(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, ASSIGN)) && r;
    r = p && report_error_(b, type_sum(b, l + 1)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (comment | attribute)*
  private static boolean type_item_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_item_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_item_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_item_0", c)) break;
    }
    return true;
  }

  // comment | attribute
  private static boolean type_item_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_item_0_0")) return false;
    boolean r;
    r = comment(b, l + 1);
    if (!r) r = attribute(b, l + 1);
    return r;
  }

  // visibility?
  private static boolean type_item_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_item_1")) return false;
    visibility(b, l + 1);
    return true;
  }

  // generic_params?
  private static boolean type_item_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_item_4")) return false;
    generic_params(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ( ref | lifetime | '*' 'const' | 'mut' | '*' 'mut' | 'box')*
  static boolean type_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_modifiers")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_modifiers_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_modifiers", c)) break;
    }
    return true;
  }

  // ref | lifetime | '*' 'const' | 'mut' | '*' 'mut' | 'box'
  private static boolean type_modifiers_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_modifiers_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ref(b, l + 1);
    if (!r) r = lifetime(b, l + 1);
    if (!r) r = parseTokens(b, 0, MULTIPLY, KW_CONST);
    if (!r) r = consumeToken(b, KW_MUT);
    if (!r) r = parseTokens(b, 0, MULTIPLY, KW_MUT);
    if (!r) r = consumeToken(b, KW_BOX);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [IDENTIFIER '='] type_sum
  static boolean type_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_param")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_param_0(b, l + 1);
    r = r && type_sum(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [IDENTIFIER '=']
  private static boolean type_param_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_param_0")) return false;
    parseTokens(b, 0, IDENTIFIER, ASSIGN);
    return true;
  }

  /* ********************************************************** */
  // '::'? ('self' '::' | 'super' '::')* IDENTIFIER ('::' IDENTIFIER)*
  static boolean type_path(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_path")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_path_0(b, l + 1);
    r = r && type_path_1(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && type_path_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '::'?
  private static boolean type_path_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_path_0")) return false;
    consumeToken(b, DOUBLE_COLON);
    return true;
  }

  // ('self' '::' | 'super' '::')*
  private static boolean type_path_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_path_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_path_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_path_1", c)) break;
    }
    return true;
  }

  // 'self' '::' | 'super' '::'
  private static boolean type_path_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_path_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, KW_SELF, DOUBLE_COLON);
    if (!r) r = parseTokens(b, 0, KW_SUPER, DOUBLE_COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('::' IDENTIFIER)*
  private static boolean type_path_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_path_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_path_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_path_3", c)) break;
    }
    return true;
  }

  // '::' IDENTIFIER
  private static boolean type_path_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_path_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOUBLE_COLON, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // type_bounded | type
  static boolean type_sum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_sum")) return false;
    boolean r;
    r = type_bounded(b, l + 1);
    if (!r) r = type(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // type_modifiers '(' tupled_type (',' tupled_type)* ','? ')'
  public static boolean type_tuple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_tuple")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_TUPLE, "<type tuple>");
    r = type_modifiers(b, l + 1);
    r = r && consumeToken(b, OPEN_PAREN);
    r = r && tupled_type(b, l + 1);
    r = r && type_tuple_3(b, l + 1);
    r = r && type_tuple_4(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' tupled_type)*
  private static boolean type_tuple_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_tuple_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_tuple_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_tuple_3", c)) break;
    }
    return true;
  }

  // ',' tupled_type
  private static boolean type_tuple_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_tuple_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && tupled_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean type_tuple_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_tuple_4")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // ref? '*'? 'mut'? '(' ')'
  public static boolean type_unit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_unit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_UNIT, "<type unit>");
    r = type_unit_0(b, l + 1);
    r = r && type_unit_1(b, l + 1);
    r = r && type_unit_2(b, l + 1);
    r = r && consumeTokens(b, 0, OPEN_PAREN, CLOSE_PAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ref?
  private static boolean type_unit_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_unit_0")) return false;
    ref(b, l + 1);
    return true;
  }

  // '*'?
  private static boolean type_unit_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_unit_1")) return false;
    consumeToken(b, MULTIPLY);
    return true;
  }

  // 'mut'?
  private static boolean type_unit_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_unit_2")) return false;
    consumeToken(b, KW_MUT);
    return true;
  }

  /* ********************************************************** */
  // type_modifiers '[' type_sum [';' expr] ']'
  public static boolean type_vector(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_vector")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_VECTOR, "<type vector>");
    r = type_modifiers(b, l + 1);
    r = r && consumeToken(b, OPEN_SQUARE_BRACKET);
    r = r && type_sum(b, l + 1);
    r = r && type_vector_3(b, l + 1);
    r = r && consumeToken(b, CLOSE_SQUARE_BRACKET);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [';' expr]
  private static boolean type_vector_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_vector_3")) return false;
    type_vector_3_0(b, l + 1);
    return true;
  }

  // ';' expr
  private static boolean type_vector_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_vector_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMICOLON);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ref? '(' ')'
  static boolean unit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unit")) return false;
    if (!nextTokenIs(b, "", BITWISE_AND, OPEN_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unit_0(b, l + 1);
    r = r && consumeTokens(b, 0, OPEN_PAREN, CLOSE_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // ref?
  private static boolean unit_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unit_0")) return false;
    ref(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // use_internal ';'
  public static boolean use(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, USE, "<use>");
    r = use_internal(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '*' | use_group
  static boolean use_glob(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_glob")) return false;
    if (!nextTokenIs(b, "", MULTIPLY, OPEN_BRACE)) return false;
    boolean r;
    r = consumeToken(b, MULTIPLY);
    if (!r) r = use_group(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '{' (IDENTIFIER | 'self') ( ',' (IDENTIFIER | 'self') )* ','? '}'
  public static boolean use_group(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_group")) return false;
    if (!nextTokenIs(b, OPEN_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACE);
    r = r && use_group_1(b, l + 1);
    r = r && use_group_2(b, l + 1);
    r = r && use_group_3(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, USE_GROUP, r);
    return r;
  }

  // IDENTIFIER | 'self'
  private static boolean use_group_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_group_1")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, KW_SELF);
    return r;
  }

  // ( ',' (IDENTIFIER | 'self') )*
  private static boolean use_group_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_group_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!use_group_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "use_group_2", c)) break;
    }
    return true;
  }

  // ',' (IDENTIFIER | 'self')
  private static boolean use_group_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_group_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && use_group_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER | 'self'
  private static boolean use_group_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_group_2_0_1")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, KW_SELF);
    return r;
  }

  // ','?
  private static boolean use_group_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_group_3")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // visibility? 'use' (use_glob | use_part ('::' use_part)* ('::' use_glob | '=' expr_path)? ('as' IDENTIFIER)?)
  static boolean use_internal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_internal")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = use_internal_0(b, l + 1);
    r = r && consumeToken(b, KW_USE);
    p = r; // pin = 2
    r = r && use_internal_2(b, l + 1);
    exit_section_(b, l, m, r, p, CairoParser::not_semicolon);
    return r || p;
  }

  // visibility?
  private static boolean use_internal_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_internal_0")) return false;
    visibility(b, l + 1);
    return true;
  }

  // use_glob | use_part ('::' use_part)* ('::' use_glob | '=' expr_path)? ('as' IDENTIFIER)?
  private static boolean use_internal_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_internal_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = use_glob(b, l + 1);
    if (!r) r = use_internal_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // use_part ('::' use_part)* ('::' use_glob | '=' expr_path)? ('as' IDENTIFIER)?
  private static boolean use_internal_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_internal_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = use_part(b, l + 1);
    r = r && use_internal_2_1_1(b, l + 1);
    r = r && use_internal_2_1_2(b, l + 1);
    r = r && use_internal_2_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('::' use_part)*
  private static boolean use_internal_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_internal_2_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!use_internal_2_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "use_internal_2_1_1", c)) break;
    }
    return true;
  }

  // '::' use_part
  private static boolean use_internal_2_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_internal_2_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOUBLE_COLON);
    r = r && use_part(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('::' use_glob | '=' expr_path)?
  private static boolean use_internal_2_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_internal_2_1_2")) return false;
    use_internal_2_1_2_0(b, l + 1);
    return true;
  }

  // '::' use_glob | '=' expr_path
  private static boolean use_internal_2_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_internal_2_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = use_internal_2_1_2_0_0(b, l + 1);
    if (!r) r = use_internal_2_1_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '::' use_glob
  private static boolean use_internal_2_1_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_internal_2_1_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOUBLE_COLON);
    r = r && use_glob(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '=' expr_path
  private static boolean use_internal_2_1_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_internal_2_1_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && expr_path(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('as' IDENTIFIER)?
  private static boolean use_internal_2_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_internal_2_1_3")) return false;
    use_internal_2_1_3_0(b, l + 1);
    return true;
  }

  // 'as' IDENTIFIER
  private static boolean use_internal_2_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_internal_2_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_AS, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER | 'super' | 'self'
  static boolean use_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_part")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, KW_SUPER);
    if (!r) r = consumeToken(b, KW_SELF);
    return r;
  }

  /* ********************************************************** */
  // 'ref'? ref? 'mut'? itemName
  static boolean variable_signature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_signature")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable_signature_0(b, l + 1);
    r = r && variable_signature_1(b, l + 1);
    r = r && variable_signature_2(b, l + 1);
    r = r && itemName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'ref'?
  private static boolean variable_signature_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_signature_0")) return false;
    consumeToken(b, KW_REF);
    return true;
  }

  // ref?
  private static boolean variable_signature_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_signature_1")) return false;
    ref(b, l + 1);
    return true;
  }

  // 'mut'?
  private static boolean variable_signature_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_signature_2")) return false;
    consumeToken(b, KW_MUT);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER? '..' | match_pattern
  static boolean vector_match_identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vector_match_identifier")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = vector_match_identifier_0(b, l + 1);
    if (!r) r = match_pattern(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER? '..'
  private static boolean vector_match_identifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vector_match_identifier_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = vector_match_identifier_0_0(b, l + 1);
    r = r && consumeToken(b, DOUBLE_DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER?
  private static boolean vector_match_identifier_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vector_match_identifier_0_0")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  /* ********************************************************** */
  // 'box'? 'ref'? '&'? '[' [vector_match_identifier (',' vector_match_identifier)* ] ']'
  public static boolean vector_match_pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vector_match_pattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VECTOR_MATCH_PATTERN, "<vector match pattern>");
    r = vector_match_pattern_0(b, l + 1);
    r = r && vector_match_pattern_1(b, l + 1);
    r = r && vector_match_pattern_2(b, l + 1);
    r = r && consumeToken(b, OPEN_SQUARE_BRACKET);
    r = r && vector_match_pattern_4(b, l + 1);
    r = r && consumeToken(b, CLOSE_SQUARE_BRACKET);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'box'?
  private static boolean vector_match_pattern_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vector_match_pattern_0")) return false;
    consumeToken(b, KW_BOX);
    return true;
  }

  // 'ref'?
  private static boolean vector_match_pattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vector_match_pattern_1")) return false;
    consumeToken(b, KW_REF);
    return true;
  }

  // '&'?
  private static boolean vector_match_pattern_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vector_match_pattern_2")) return false;
    consumeToken(b, BITWISE_AND);
    return true;
  }

  // [vector_match_identifier (',' vector_match_identifier)* ]
  private static boolean vector_match_pattern_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vector_match_pattern_4")) return false;
    vector_match_pattern_4_0(b, l + 1);
    return true;
  }

  // vector_match_identifier (',' vector_match_identifier)*
  private static boolean vector_match_pattern_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vector_match_pattern_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = vector_match_identifier(b, l + 1);
    r = r && vector_match_pattern_4_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' vector_match_identifier)*
  private static boolean vector_match_pattern_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vector_match_pattern_4_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!vector_match_pattern_4_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "vector_match_pattern_4_0_1", c)) break;
    }
    return true;
  }

  // ',' vector_match_identifier
  private static boolean vector_match_pattern_4_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vector_match_pattern_4_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && vector_match_identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'priv' | 'pub'
  public static boolean visibility(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "visibility")) return false;
    if (!nextTokenIs(b, "<visibility>", KW_PRIV, KW_PUB)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VISIBILITY, "<visibility>");
    r = consumeToken(b, KW_PRIV);
    if (!r) r = consumeToken(b, KW_PUB);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // type ':' bounds '+'?
  public static boolean where_bound(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "where_bound")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHERE_BOUND, "<where bound>");
    r = type(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && bounds(b, l + 1);
    r = r && where_bound_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '+'?
  private static boolean where_bound_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "where_bound_3")) return false;
    consumeToken(b, PLUS);
    return true;
  }

  /* ********************************************************** */
  // 'where' where_bound (',' where_bound)* ','?
  public static boolean where_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "where_clause")) return false;
    if (!nextTokenIs(b, KW_WHERE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, WHERE_CLAUSE, null);
    r = consumeToken(b, KW_WHERE);
    p = r; // pin = 1
    r = r && report_error_(b, where_bound(b, l + 1));
    r = p && report_error_(b, where_clause_2(b, l + 1)) && r;
    r = p && where_clause_3(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (',' where_bound)*
  private static boolean where_clause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "where_clause_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!where_clause_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "where_clause_2", c)) break;
    }
    return true;
  }

  // ',' where_bound
  private static boolean where_clause_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "where_clause_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && where_bound(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean where_clause_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "where_clause_3")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // Expression root: expr
  // Operator priority table:
  // 0: ATOM(expr_macro)
  // 1: ATOM(expr_continue) ATOM(expr_break)
  // 2: BINARY(expr_assign) BINARY(expr_assign_increment) BINARY(expr_assign_decrement) BINARY(expr_assign_multiply)
  //    BINARY(expr_assign_divide) BINARY(expr_assign_modulo) BINARY(expr_assign_and) BINARY(expr_assign_or)
  //    BINARY(expr_assign_not) BINARY(expr_assign_left_shift) BINARY(expr_assign_right_shift)
  // 3: BINARY(expr_logical_or)
  // 4: BINARY(expr_logical_and)
  // 5: BINARY(expr_equal_to) BINARY(expr_not_equal_to)
  // 6: BINARY(expr_greater_than) BINARY(expr_less_than) BINARY(expr_greater_or_equal) BINARY(expr_less_or_equal)
  // 7: BINARY(expr_bitwise_or)
  // 8: BINARY(expr_bitwise_xor)
  // 9: BINARY(expr_bitwise_and)
  // 10: BINARY(expr_left_shift) BINARY(expr_right_shift)
  // 11: BINARY(expr_plus) BINARY(expr_minus)
  // 12: POSTFIX(expr_as)
  // 13: BINARY(expr_multiply) BINARY(expr_divide) BINARY(expr_modulo)
  // 14: PREFIX(expr_unary_plus) PREFIX(expr_unary_minus) PREFIX(expr_unary_not) PREFIX(expr_deref)
  //    PREFIX(expr_box) PREFIX(expr_borrow)
  // 15: POSTFIX(expr_call)
  // 16: ATOM(expr_closure)
  // 17: POSTFIX(expr_index)
  // 18: BINARY(expr_field)
  // 19: ATOM(expr_block) ATOM(expr_paren) ATOM(expr_vector) POSTFIX(expr_struct_initializer)
  //    ATOM(expr_path) ATOM(expr_identifier) ATOM(expr_value)
  public static boolean expr(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expr")) return false;
    addVariant(b, "<expr>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expr>");
    r = expr_macro(b, l + 1);
    if (!r) r = expr_continue(b, l + 1);
    if (!r) r = expr_break(b, l + 1);
    if (!r) r = expr_unary_plus(b, l + 1);
    if (!r) r = expr_unary_minus(b, l + 1);
    if (!r) r = expr_deref(b, l + 1);
    if (!r) r = expr_unary_not(b, l + 1);
    if (!r) r = expr_box(b, l + 1);
    if (!r) r = expr_borrow(b, l + 1);
    if (!r) r = expr_closure(b, l + 1);
    if (!r) r = expr_block(b, l + 1);
    if (!r) r = expr_paren(b, l + 1);
    if (!r) r = expr_vector(b, l + 1);
    if (!r) r = expr_path(b, l + 1);
    if (!r) r = expr_identifier(b, l + 1);
    if (!r) r = expr_value(b, l + 1);
    p = r;
    r = r && expr_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean expr_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expr_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 2 && consumeTokenSmart(b, ASSIGN)) {
        r = expr(b, l, 1);
        exit_section_(b, l, m, EXPR_ASSIGN, r, true, null);
      }
      else if (g < 2 && expr_assign_increment_0(b, l + 1)) {
        r = expr(b, l, 1);
        exit_section_(b, l, m, EXPR_ASSIGN_INCREMENT, r, true, null);
      }
      else if (g < 2 && expr_assign_decrement_0(b, l + 1)) {
        r = expr(b, l, 1);
        exit_section_(b, l, m, EXPR_ASSIGN_DECREMENT, r, true, null);
      }
      else if (g < 2 && expr_assign_multiply_0(b, l + 1)) {
        r = expr(b, l, 1);
        exit_section_(b, l, m, EXPR_ASSIGN_MULTIPLY, r, true, null);
      }
      else if (g < 2 && expr_assign_divide_0(b, l + 1)) {
        r = expr(b, l, 1);
        exit_section_(b, l, m, EXPR_ASSIGN_DIVIDE, r, true, null);
      }
      else if (g < 2 && expr_assign_modulo_0(b, l + 1)) {
        r = expr(b, l, 1);
        exit_section_(b, l, m, EXPR_ASSIGN_MODULO, r, true, null);
      }
      else if (g < 2 && expr_assign_and_0(b, l + 1)) {
        r = expr(b, l, 1);
        exit_section_(b, l, m, EXPR_ASSIGN_AND, r, true, null);
      }
      else if (g < 2 && expr_assign_or_0(b, l + 1)) {
        r = expr(b, l, 1);
        exit_section_(b, l, m, EXPR_ASSIGN_OR, r, true, null);
      }
      else if (g < 2 && expr_assign_not_0(b, l + 1)) {
        r = expr(b, l, 1);
        exit_section_(b, l, m, EXPR_ASSIGN_NOT, r, true, null);
      }
      else if (g < 2 && consumeTokenSmart(b, ASSIGN_LEFT_SHIFT)) {
        r = expr(b, l, 1);
        exit_section_(b, l, m, EXPR_ASSIGN_LEFT_SHIFT, r, true, null);
      }
      else if (g < 2 && consumeTokenSmart(b, ASSIGN_RIGHT_SHIFT)) {
        r = expr(b, l, 1);
        exit_section_(b, l, m, EXPR_ASSIGN_RIGHT_SHIFT, r, true, null);
      }
      else if (g < 3 && expr_logical_or_0(b, l + 1)) {
        r = expr(b, l, 3);
        exit_section_(b, l, m, EXPR_LOGICAL_OR, r, true, null);
      }
      else if (g < 4 && expr_logical_and_0(b, l + 1)) {
        r = expr(b, l, 4);
        exit_section_(b, l, m, EXPR_LOGICAL_AND, r, true, null);
      }
      else if (g < 5 && consumeTokenSmart(b, EQUAL)) {
        r = expr(b, l, 5);
        exit_section_(b, l, m, EXPR_EQUAL_TO, r, true, null);
      }
      else if (g < 5 && consumeTokenSmart(b, NOT_EQUAL)) {
        r = expr(b, l, 5);
        exit_section_(b, l, m, EXPR_NOT_EQUAL_TO, r, true, null);
      }
      else if (g < 6 && expr_greater_than_0(b, l + 1)) {
        r = expr(b, l, 6);
        exit_section_(b, l, m, EXPR_GREATER_THAN, r, true, null);
      }
      else if (g < 6 && expr_less_than_0(b, l + 1)) {
        r = expr(b, l, 6);
        exit_section_(b, l, m, EXPR_LESS_THAN, r, true, null);
      }
      else if (g < 6 && consumeTokenSmart(b, GREATER_THAN_OR_EQUAL)) {
        r = expr(b, l, 6);
        exit_section_(b, l, m, EXPR_GREATER_OR_EQUAL, r, true, null);
      }
      else if (g < 6 && consumeTokenSmart(b, LESS_THAN_OR_EQUAL)) {
        r = expr(b, l, 6);
        exit_section_(b, l, m, EXPR_LESS_OR_EQUAL, r, true, null);
      }
      else if (g < 7 && expr_bitwise_or_0(b, l + 1)) {
        r = expr(b, l, 7);
        exit_section_(b, l, m, EXPR_BITWISE_OR, r, true, null);
      }
      else if (g < 8 && consumeTokenSmart(b, BITWISE_XOR)) {
        r = expr(b, l, 8);
        exit_section_(b, l, m, EXPR_BITWISE_XOR, r, true, null);
      }
      else if (g < 9 && consumeTokenSmart(b, BITWISE_AND)) {
        r = expr(b, l, 9);
        exit_section_(b, l, m, EXPR_BITWISE_AND, r, true, null);
      }
      else if (g < 10 && expr_left_shift_0(b, l + 1)) {
        r = expr(b, l, 10);
        exit_section_(b, l, m, EXPR_LEFT_SHIFT, r, true, null);
      }
      else if (g < 10 && expr_right_shift_0(b, l + 1)) {
        r = expr(b, l, 10);
        exit_section_(b, l, m, EXPR_RIGHT_SHIFT, r, true, null);
      }
      else if (g < 11 && consumeTokenSmart(b, PLUS)) {
        r = expr(b, l, 11);
        exit_section_(b, l, m, EXPR_PLUS, r, true, null);
      }
      else if (g < 11 && consumeTokenSmart(b, MINUS)) {
        r = expr(b, l, 11);
        exit_section_(b, l, m, EXPR_MINUS, r, true, null);
      }
      else if (g < 12 && expr_as_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, EXPR_AS, r, true, null);
      }
      else if (g < 13 && consumeTokenSmart(b, MULTIPLY)) {
        r = expr(b, l, 13);
        exit_section_(b, l, m, EXPR_MULTIPLY, r, true, null);
      }
      else if (g < 13 && consumeTokenSmart(b, DIVIDE)) {
        r = expr(b, l, 13);
        exit_section_(b, l, m, EXPR_DIVIDE, r, true, null);
      }
      else if (g < 13 && consumeTokenSmart(b, REMAINDER)) {
        r = expr(b, l, 13);
        exit_section_(b, l, m, EXPR_MODULO, r, true, null);
      }
      else if (g < 15 && expr_call_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, EXPR_CALL, r, true, null);
      }
      else if (g < 17 && expr_index_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, EXPR_INDEX, r, true, null);
      }
      else if (g < 18 && consumeTokenSmart(b, DOT)) {
        r = expr(b, l, 18);
        exit_section_(b, l, m, EXPR_FIELD, r, true, null);
      }
      else if (g < 19 && expr_struct_initializer_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, EXPR_STRUCT_INITIALIZER, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // IDENTIFIER '!' (macro_paren | macro_brace | macro_bracket)
  public static boolean expr_macro(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_macro")) return false;
    if (!nextTokenIsSmart(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, IDENTIFIER, NOT);
    r = r && expr_macro_2(b, l + 1);
    exit_section_(b, m, EXPR_MACRO, r);
    return r;
  }

  // macro_paren | macro_brace | macro_bracket
  private static boolean expr_macro_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_macro_2")) return false;
    boolean r;
    r = macro_paren(b, l + 1);
    if (!r) r = macro_brace(b, l + 1);
    if (!r) r = macro_bracket(b, l + 1);
    return r;
  }

  // 'continue' lifetime?
  public static boolean expr_continue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_continue")) return false;
    if (!nextTokenIsSmart(b, KW_CONTINUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, KW_CONTINUE);
    r = r && expr_continue_1(b, l + 1);
    exit_section_(b, m, EXPR_CONTINUE, r);
    return r;
  }

  // lifetime?
  private static boolean expr_continue_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_continue_1")) return false;
    lifetime(b, l + 1);
    return true;
  }

  // 'break' lifetime?
  public static boolean expr_break(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_break")) return false;
    if (!nextTokenIsSmart(b, KW_BREAK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, KW_BREAK);
    r = r && expr_break_1(b, l + 1);
    exit_section_(b, m, EXPR_BREAK, r);
    return r;
  }

  // lifetime?
  private static boolean expr_break_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_break_1")) return false;
    lifetime(b, l + 1);
    return true;
  }

  // '+' '='
  private static boolean expr_assign_increment_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_assign_increment_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, PLUS, ASSIGN);
    exit_section_(b, m, null, r);
    return r;
  }

  // '-' '='
  private static boolean expr_assign_decrement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_assign_decrement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, MINUS, ASSIGN);
    exit_section_(b, m, null, r);
    return r;
  }

  // '*' '='
  private static boolean expr_assign_multiply_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_assign_multiply_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, MULTIPLY, ASSIGN);
    exit_section_(b, m, null, r);
    return r;
  }

  // '/' '='
  private static boolean expr_assign_divide_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_assign_divide_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, DIVIDE, ASSIGN);
    exit_section_(b, m, null, r);
    return r;
  }

  // '%' '='
  private static boolean expr_assign_modulo_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_assign_modulo_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, REMAINDER, ASSIGN);
    exit_section_(b, m, null, r);
    return r;
  }

  // '&' '='
  private static boolean expr_assign_and_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_assign_and_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, BITWISE_AND, ASSIGN);
    exit_section_(b, m, null, r);
    return r;
  }

  // '|' '='
  private static boolean expr_assign_or_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_assign_or_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, BITWISE_OR, ASSIGN);
    exit_section_(b, m, null, r);
    return r;
  }

  // '^' '='
  private static boolean expr_assign_not_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_assign_not_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, BITWISE_XOR, ASSIGN);
    exit_section_(b, m, null, r);
    return r;
  }

  // '|' '|'
  private static boolean expr_logical_or_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_logical_or_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, BITWISE_OR, BITWISE_OR);
    exit_section_(b, m, null, r);
    return r;
  }

  // '&' '&'
  private static boolean expr_logical_and_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_logical_and_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, BITWISE_AND, BITWISE_AND);
    exit_section_(b, m, null, r);
    return r;
  }

  // '>' !'>'
  private static boolean expr_greater_than_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_greater_than_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, GREATER_THAN);
    r = r && expr_greater_than_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !'>'
  private static boolean expr_greater_than_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_greater_than_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeTokenSmart(b, GREATER_THAN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '<' !'<'
  private static boolean expr_less_than_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_less_than_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LESS_THAN);
    r = r && expr_less_than_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !'<'
  private static boolean expr_less_than_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_less_than_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeTokenSmart(b, LESS_THAN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '|' !'|'
  private static boolean expr_bitwise_or_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_bitwise_or_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, BITWISE_OR);
    r = r && expr_bitwise_or_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !'|'
  private static boolean expr_bitwise_or_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_bitwise_or_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeTokenSmart(b, BITWISE_OR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '<' '<'
  private static boolean expr_left_shift_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_left_shift_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, LESS_THAN, LESS_THAN);
    exit_section_(b, m, null, r);
    return r;
  }

  // '>' '>'
  private static boolean expr_right_shift_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_right_shift_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, GREATER_THAN, GREATER_THAN);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean expr_unary_plus(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_unary_plus")) return false;
    if (!nextTokenIsSmart(b, PLUS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, PLUS);
    p = r;
    r = p && expr(b, l, 14);
    exit_section_(b, l, m, EXPR_UNARY_PLUS, r, p, null);
    return r || p;
  }

  public static boolean expr_unary_minus(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_unary_minus")) return false;
    if (!nextTokenIsSmart(b, MINUS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, MINUS);
    p = r;
    r = p && expr(b, l, 14);
    exit_section_(b, l, m, EXPR_UNARY_MINUS, r, p, null);
    return r || p;
  }

  // 'as' type
  private static boolean expr_as_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_as_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, KW_AS);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean expr_deref(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_deref")) return false;
    if (!nextTokenIsSmart(b, MULTIPLY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, MULTIPLY);
    p = r;
    r = p && expr(b, l, 14);
    exit_section_(b, l, m, EXPR_DEREF, r, p, null);
    return r || p;
  }

  public static boolean expr_unary_not(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_unary_not")) return false;
    if (!nextTokenIsSmart(b, NOT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, NOT);
    p = r;
    r = p && expr(b, l, 14);
    exit_section_(b, l, m, EXPR_UNARY_NOT, r, p, null);
    return r || p;
  }

  public static boolean expr_box(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_box")) return false;
    if (!nextTokenIsSmart(b, KW_BOX)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, KW_BOX);
    p = r;
    r = p && expr(b, l, 14);
    exit_section_(b, l, m, EXPR_BOX, r, p, null);
    return r || p;
  }

  public static boolean expr_borrow(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_borrow")) return false;
    if (!nextTokenIsSmart(b, BITWISE_AND)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = expr_borrow_0(b, l + 1);
    p = r;
    r = p && expr(b, l, 14);
    exit_section_(b, l, m, EXPR_BORROW, r, p, null);
    return r || p;
  }

  // '&' lifetime? 'mut'?
  private static boolean expr_borrow_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_borrow_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, BITWISE_AND);
    r = r && expr_borrow_0_1(b, l + 1);
    r = r && expr_borrow_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // lifetime?
  private static boolean expr_borrow_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_borrow_0_1")) return false;
    lifetime(b, l + 1);
    return true;
  }

  // 'mut'?
  private static boolean expr_borrow_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_borrow_0_2")) return false;
    consumeTokenSmart(b, KW_MUT);
    return true;
  }

  // '(' call_params ')'
  private static boolean expr_call_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_call_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, OPEN_PAREN);
    r = r && call_params(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'move'? closure_expr_args closure_body
  public static boolean expr_closure(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_closure")) return false;
    if (!nextTokenIsSmart(b, BITWISE_OR, KW_MOVE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_CLOSURE, "<expr closure>");
    r = expr_closure_0(b, l + 1);
    r = r && closure_expr_args(b, l + 1);
    r = r && closure_body(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'move'?
  private static boolean expr_closure_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_closure_0")) return false;
    consumeTokenSmart(b, KW_MOVE);
    return true;
  }

  // '[' index_expr ']'
  private static boolean expr_index_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_index_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, OPEN_SQUARE_BRACKET);
    r = r && index_expr(b, l + 1);
    r = r && consumeToken(b, CLOSE_SQUARE_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // statement_block | block_for | block_if | block_while | block_loop | block_unsafe | block_match
  public static boolean expr_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_block")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPR_BLOCK, "<expr block>");
    r = statement_block(b, l + 1);
    if (!r) r = block_for(b, l + 1);
    if (!r) r = block_if(b, l + 1);
    if (!r) r = block_while(b, l + 1);
    if (!r) r = block_loop(b, l + 1);
    if (!r) r = block_unsafe(b, l + 1);
    if (!r) r = block_match(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' expr expr_tuple_body? ')'
  public static boolean expr_paren(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_paren")) return false;
    if (!nextTokenIsSmart(b, OPEN_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, OPEN_PAREN);
    r = r && expr(b, l + 1, -1);
    r = r && expr_paren_2(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, EXPR_PAREN, r);
    return r;
  }

  // expr_tuple_body?
  private static boolean expr_paren_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_paren_2")) return false;
    expr_tuple_body(b, l + 1);
    return true;
  }

  // '[' [(comment | attribute)* expr (',' (comment | attribute)* expr)*] (comment | attribute)* [';' expr] ','?(comment | attribute)*']'
  public static boolean expr_vector(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_vector")) return false;
    if (!nextTokenIsSmart(b, OPEN_SQUARE_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, OPEN_SQUARE_BRACKET);
    r = r && expr_vector_1(b, l + 1);
    r = r && expr_vector_2(b, l + 1);
    r = r && expr_vector_3(b, l + 1);
    r = r && expr_vector_4(b, l + 1);
    r = r && expr_vector_5(b, l + 1);
    r = r && consumeToken(b, CLOSE_SQUARE_BRACKET);
    exit_section_(b, m, EXPR_VECTOR, r);
    return r;
  }

  // [(comment | attribute)* expr (',' (comment | attribute)* expr)*]
  private static boolean expr_vector_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_vector_1")) return false;
    expr_vector_1_0(b, l + 1);
    return true;
  }

  // (comment | attribute)* expr (',' (comment | attribute)* expr)*
  private static boolean expr_vector_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_vector_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr_vector_1_0_0(b, l + 1);
    r = r && expr(b, l + 1, -1);
    r = r && expr_vector_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comment | attribute)*
  private static boolean expr_vector_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_vector_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expr_vector_1_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expr_vector_1_0_0", c)) break;
    }
    return true;
  }

  // comment | attribute
  private static boolean expr_vector_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_vector_1_0_0_0")) return false;
    boolean r;
    r = comment(b, l + 1);
    if (!r) r = attribute(b, l + 1);
    return r;
  }

  // (',' (comment | attribute)* expr)*
  private static boolean expr_vector_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_vector_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expr_vector_1_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expr_vector_1_0_2", c)) break;
    }
    return true;
  }

  // ',' (comment | attribute)* expr
  private static boolean expr_vector_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_vector_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COMMA);
    r = r && expr_vector_1_0_2_0_1(b, l + 1);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comment | attribute)*
  private static boolean expr_vector_1_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_vector_1_0_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expr_vector_1_0_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expr_vector_1_0_2_0_1", c)) break;
    }
    return true;
  }

  // comment | attribute
  private static boolean expr_vector_1_0_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_vector_1_0_2_0_1_0")) return false;
    boolean r;
    r = comment(b, l + 1);
    if (!r) r = attribute(b, l + 1);
    return r;
  }

  // (comment | attribute)*
  private static boolean expr_vector_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_vector_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expr_vector_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expr_vector_2", c)) break;
    }
    return true;
  }

  // comment | attribute
  private static boolean expr_vector_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_vector_2_0")) return false;
    boolean r;
    r = comment(b, l + 1);
    if (!r) r = attribute(b, l + 1);
    return r;
  }

  // [';' expr]
  private static boolean expr_vector_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_vector_3")) return false;
    expr_vector_3_0(b, l + 1);
    return true;
  }

  // ';' expr
  private static boolean expr_vector_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_vector_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, SEMICOLON);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean expr_vector_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_vector_4")) return false;
    consumeTokenSmart(b, COMMA);
    return true;
  }

  // (comment | attribute)*
  private static boolean expr_vector_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_vector_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expr_vector_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expr_vector_5", c)) break;
    }
    return true;
  }

  // comment | attribute
  private static boolean expr_vector_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_vector_5_0")) return false;
    boolean r;
    r = comment(b, l + 1);
    if (!r) r = attribute(b, l + 1);
    return r;
  }

  // '{' struct_initializer_list [',' struct_default?] "}"
  private static boolean expr_struct_initializer_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_struct_initializer_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, OPEN_BRACE);
    r = r && struct_initializer_list(b, l + 1);
    r = r && expr_struct_initializer_0_2(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // [',' struct_default?]
  private static boolean expr_struct_initializer_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_struct_initializer_0_2")) return false;
    expr_struct_initializer_0_2_0(b, l + 1);
    return true;
  }

  // ',' struct_default?
  private static boolean expr_struct_initializer_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_struct_initializer_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COMMA);
    r = r && expr_struct_initializer_0_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // struct_default?
  private static boolean expr_struct_initializer_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_struct_initializer_0_2_0_1")) return false;
    struct_default(b, l + 1);
    return true;
  }

  // '::'? ('self' '::' | 'super' '::')* IDENTIFIER ('::' (IDENTIFIER | generic))*
  public static boolean expr_path(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_path")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_PATH, "<expr path>");
    r = expr_path_0(b, l + 1);
    r = r && expr_path_1(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && expr_path_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '::'?
  private static boolean expr_path_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_path_0")) return false;
    consumeTokenSmart(b, DOUBLE_COLON);
    return true;
  }

  // ('self' '::' | 'super' '::')*
  private static boolean expr_path_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_path_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expr_path_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expr_path_1", c)) break;
    }
    return true;
  }

  // 'self' '::' | 'super' '::'
  private static boolean expr_path_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_path_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr_path_1_0_0(b, l + 1);
    if (!r) r = expr_path_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'self' '::'
  private static boolean expr_path_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_path_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, KW_SELF, DOUBLE_COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'super' '::'
  private static boolean expr_path_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_path_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, KW_SUPER, DOUBLE_COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('::' (IDENTIFIER | generic))*
  private static boolean expr_path_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_path_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expr_path_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expr_path_3", c)) break;
    }
    return true;
  }

  // '::' (IDENTIFIER | generic)
  private static boolean expr_path_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_path_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, DOUBLE_COLON);
    r = r && expr_path_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER | generic
  private static boolean expr_path_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_path_3_0_1")) return false;
    boolean r;
    r = consumeTokenSmart(b, IDENTIFIER);
    if (!r) r = generic(b, l + 1);
    return r;
  }

  // IDENTIFIER
  public static boolean expr_identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_identifier")) return false;
    if (!nextTokenIsSmart(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, IDENTIFIER);
    exit_section_(b, m, EXPR_IDENTIFIER, r);
    return r;
  }

  // literal
  public static boolean expr_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_VALUE, "<expr value>");
    r = literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
