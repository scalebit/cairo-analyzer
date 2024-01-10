// This is a generated file. Not intended for manual editing.
package cairo.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;

public class CairoVisitor extends PsiElementVisitor {

  public void visitAttribute(@NotNull CairoAttribute o) {
    visitPsiElement(o);
  }

  public void visitAttributeArg(@NotNull CairoAttributeArg o) {
    visitPsiElement(o);
  }

  public void visitBasicMatchPattern(@NotNull CairoBasicMatchPattern o) {
    visitMatchPattern(o);
  }

  public void visitBlockFor(@NotNull CairoBlockFor o) {
    visitExprBlock(o);
  }

  public void visitBlockIf(@NotNull CairoBlockIf o) {
    visitExprBlock(o);
  }

  public void visitBlockLoop(@NotNull CairoBlockLoop o) {
    visitExprBlock(o);
  }

  public void visitBlockMatch(@NotNull CairoBlockMatch o) {
    visitExprBlock(o);
  }

  public void visitBlockUnsafe(@NotNull CairoBlockUnsafe o) {
    visitExprBlock(o);
  }

  public void visitBlockWhile(@NotNull CairoBlockWhile o) {
    visitExprBlock(o);
  }

  public void visitCallParams(@NotNull CairoCallParams o) {
    visitPsiElement(o);
  }

  public void visitClosureBody(@NotNull CairoClosureBody o) {
    visitPsiElement(o);
  }

  public void visitClosureExprArgs(@NotNull CairoClosureExprArgs o) {
    visitPsiElement(o);
  }

  public void visitClosureSugar(@NotNull CairoClosureSugar o) {
    visitPsiElement(o);
  }

  public void visitConstItem(@NotNull CairoConstItem o) {
    visitItem(o);
  }

  public void visitEmptyStatement(@NotNull CairoEmptyStatement o) {
    visitPsiElement(o);
  }

  public void visitEnumBody(@NotNull CairoEnumBody o) {
    visitPsiElement(o);
  }

  public void visitEnumItem(@NotNull CairoEnumItem o) {
    visitItem(o);
  }

  public void visitEnumVariant(@NotNull CairoEnumVariant o) {
    visitPsiElement(o);
  }

  public void visitEnumVariantNullary(@NotNull CairoEnumVariantNullary o) {
    visitEnumVariant(o);
  }

  public void visitEnumVariantStruct(@NotNull CairoEnumVariantStruct o) {
    visitEnumVariant(o);
  }

  public void visitEnumVariantStructMember(@NotNull CairoEnumVariantStructMember o) {
    visitEnumVariant(o);
  }

  public void visitEnumVariantTuple(@NotNull CairoEnumVariantTuple o) {
    visitEnumVariant(o);
  }

  public void visitExpr(@NotNull CairoExpr o) {
    visitPsiElement(o);
  }

  public void visitExprAs(@NotNull CairoExprAs o) {
    visitExpr(o);
  }

  public void visitExprAssign(@NotNull CairoExprAssign o) {
    visitExpr(o);
  }

  public void visitExprAssignAnd(@NotNull CairoExprAssignAnd o) {
    visitExpr(o);
  }

  public void visitExprAssignDecrement(@NotNull CairoExprAssignDecrement o) {
    visitExpr(o);
  }

  public void visitExprAssignDivide(@NotNull CairoExprAssignDivide o) {
    visitExpr(o);
  }

  public void visitExprAssignIncrement(@NotNull CairoExprAssignIncrement o) {
    visitExpr(o);
  }

  public void visitExprAssignLeftShift(@NotNull CairoExprAssignLeftShift o) {
    visitExpr(o);
  }

  public void visitExprAssignModulo(@NotNull CairoExprAssignModulo o) {
    visitExpr(o);
  }

  public void visitExprAssignMultiply(@NotNull CairoExprAssignMultiply o) {
    visitExpr(o);
  }

  public void visitExprAssignNot(@NotNull CairoExprAssignNot o) {
    visitExpr(o);
  }

  public void visitExprAssignOr(@NotNull CairoExprAssignOr o) {
    visitExpr(o);
  }

  public void visitExprAssignRightShift(@NotNull CairoExprAssignRightShift o) {
    visitExpr(o);
  }

  public void visitExprBitwiseAnd(@NotNull CairoExprBitwiseAnd o) {
    visitExpr(o);
  }

  public void visitExprBitwiseOr(@NotNull CairoExprBitwiseOr o) {
    visitExpr(o);
  }

  public void visitExprBitwiseXor(@NotNull CairoExprBitwiseXor o) {
    visitExpr(o);
  }

  public void visitExprBlock(@NotNull CairoExprBlock o) {
    visitExpr(o);
  }

  public void visitExprBorrow(@NotNull CairoExprBorrow o) {
    visitExpr(o);
  }

  public void visitExprBox(@NotNull CairoExprBox o) {
    visitExpr(o);
  }

  public void visitExprBreak(@NotNull CairoExprBreak o) {
    visitExpr(o);
  }

  public void visitExprCall(@NotNull CairoExprCall o) {
    visitExpr(o);
  }

  public void visitExprClosure(@NotNull CairoExprClosure o) {
    visitExpr(o);
  }

  public void visitExprContinue(@NotNull CairoExprContinue o) {
    visitExpr(o);
  }

  public void visitExprDeref(@NotNull CairoExprDeref o) {
    visitExpr(o);
  }

  public void visitExprDivide(@NotNull CairoExprDivide o) {
    visitExpr(o);
  }

  public void visitExprEqualTo(@NotNull CairoExprEqualTo o) {
    visitExpr(o);
  }

  public void visitExprField(@NotNull CairoExprField o) {
    visitExpr(o);
  }

  public void visitExprGreaterOrEqual(@NotNull CairoExprGreaterOrEqual o) {
    visitExpr(o);
  }

  public void visitExprGreaterThan(@NotNull CairoExprGreaterThan o) {
    visitExpr(o);
  }

  public void visitExprIdentifier(@NotNull CairoExprIdentifier o) {
    visitExpr(o);
  }

  public void visitExprIndex(@NotNull CairoExprIndex o) {
    visitExpr(o);
  }

  public void visitExprLeftShift(@NotNull CairoExprLeftShift o) {
    visitExpr(o);
  }

  public void visitExprLessOrEqual(@NotNull CairoExprLessOrEqual o) {
    visitExpr(o);
  }

  public void visitExprLessThan(@NotNull CairoExprLessThan o) {
    visitExpr(o);
  }

  public void visitExprLogicalAnd(@NotNull CairoExprLogicalAnd o) {
    visitExpr(o);
  }

  public void visitExprLogicalOr(@NotNull CairoExprLogicalOr o) {
    visitExpr(o);
  }

  public void visitExprMacro(@NotNull CairoExprMacro o) {
    visitExpr(o);
  }

  public void visitExprMinus(@NotNull CairoExprMinus o) {
    visitExpr(o);
  }

  public void visitExprModulo(@NotNull CairoExprModulo o) {
    visitExpr(o);
  }

  public void visitExprMultiply(@NotNull CairoExprMultiply o) {
    visitExpr(o);
  }

  public void visitExprNotEqualTo(@NotNull CairoExprNotEqualTo o) {
    visitExpr(o);
  }

  public void visitExprParen(@NotNull CairoExprParen o) {
    visitExpr(o);
  }

  public void visitExprPath(@NotNull CairoExprPath o) {
    visitExpr(o);
  }

  public void visitExprPlus(@NotNull CairoExprPlus o) {
    visitExpr(o);
  }

  public void visitExprRightShift(@NotNull CairoExprRightShift o) {
    visitExpr(o);
  }

  public void visitExprStructInitializer(@NotNull CairoExprStructInitializer o) {
    visitExpr(o);
  }

  public void visitExprTupleBody(@NotNull CairoExprTupleBody o) {
    visitExpr(o);
  }

  public void visitExprUnaryMinus(@NotNull CairoExprUnaryMinus o) {
    visitExpr(o);
  }

  public void visitExprUnaryNot(@NotNull CairoExprUnaryNot o) {
    visitExpr(o);
  }

  public void visitExprUnaryPlus(@NotNull CairoExprUnaryPlus o) {
    visitExpr(o);
  }

  public void visitExprValue(@NotNull CairoExprValue o) {
    visitExpr(o);
  }

  public void visitExprVector(@NotNull CairoExprVector o) {
    visitExpr(o);
  }

  public void visitExternBlock(@NotNull CairoExternBlock o) {
    visitPsiElement(o);
  }

  public void visitExternCrate(@NotNull CairoExternCrate o) {
    visitPsiElement(o);
  }

  public void visitExternFunction(@NotNull CairoExternFunction o) {
    visitPsiElement(o);
  }

  public void visitExternItem(@NotNull CairoExternItem o) {
    visitItem(o);
  }

  public void visitExternVariable(@NotNull CairoExternVariable o) {
    visitPsiElement(o);
  }

  public void visitFnArgs(@NotNull CairoFnArgs o) {
    visitPsiElement(o);
  }

  public void visitFnDeclaration(@NotNull CairoFnDeclaration o) {
    visitPsiElement(o);
  }

  public void visitFnItem(@NotNull CairoFnItem o) {
    visitItem(o);
  }

  public void visitFnPrototypeArgs(@NotNull CairoFnPrototypeArgs o) {
    visitPsiElement(o);
  }

  public void visitGeneric(@NotNull CairoGeneric o) {
    visitPsiElement(o);
  }

  public void visitGenericParams(@NotNull CairoGenericParams o) {
    visitPsiElement(o);
  }

  public void visitIfTail(@NotNull CairoIfTail o) {
    visitPsiElement(o);
  }

  public void visitImplAssocType(@NotNull CairoImplAssocType o) {
    visitPsiElement(o);
  }

  public void visitImplBlock(@NotNull CairoImplBlock o) {
    visitPsiElement(o);
  }

  public void visitImplBody(@NotNull CairoImplBody o) {
    visitPsiElement(o);
  }

  public void visitImplFor(@NotNull CairoImplFor o) {
    visitPsiElement(o);
  }

  public void visitImplItem(@NotNull CairoImplItem o) {
    visitItem(o);
  }

  public void visitIndexExpr(@NotNull CairoIndexExpr o) {
    visitPsiElement(o);
  }

  public void visitItem(@NotNull CairoItem o) {
    visitPsiNamedElement(o);
  }

  public void visitItemName(@NotNull CairoItemName o) {
    visitPsiElement(o);
  }

  public void visitLet(@NotNull CairoLet o) {
    visitPsiElement(o);
  }

  public void visitLetArgs(@NotNull CairoLetArgs o) {
    visitPsiElement(o);
  }

  public void visitLetBind(@NotNull CairoLetBind o) {
    visitPsiElement(o);
  }

  public void visitLetSelfArg(@NotNull CairoLetSelfArg o) {
    visitPsiElement(o);
  }

  public void visitLetStructBind(@NotNull CairoLetStructBind o) {
    visitLetBind(o);
  }

  public void visitLetTupleBind(@NotNull CairoLetTupleBind o) {
    visitLetBind(o);
  }

  public void visitLetUnitBind(@NotNull CairoLetUnitBind o) {
    visitLetBind(o);
  }

  public void visitLetVariableBind(@NotNull CairoLetVariableBind o) {
    visitLetBind(o);
  }

  public void visitLifetime(@NotNull CairoLifetime o) {
    visitPsiElement(o);
  }

  public void visitMacroBody(@NotNull CairoMacroBody o) {
    visitPsiElement(o);
  }

  public void visitMacroBrace(@NotNull CairoMacroBrace o) {
    visitPsiElement(o);
  }

  public void visitMacroBracket(@NotNull CairoMacroBracket o) {
    visitPsiElement(o);
  }

  public void visitMacroParen(@NotNull CairoMacroParen o) {
    visitPsiElement(o);
  }

  public void visitMacroRules(@NotNull CairoMacroRules o) {
    visitPsiElement(o);
  }

  public void visitMatchArm(@NotNull CairoMatchArm o) {
    visitPsiElement(o);
  }

  public void visitMatchBlock(@NotNull CairoMatchBlock o) {
    visitPsiElement(o);
  }

  public void visitMatchBody(@NotNull CairoMatchBody o) {
    visitPsiElement(o);
  }

  public void visitMatchFilter(@NotNull CairoMatchFilter o) {
    visitPsiElement(o);
  }

  public void visitMatchIdentifier(@NotNull CairoMatchIdentifier o) {
    visitPsiElement(o);
  }

  public void visitMatchIf(@NotNull CairoMatchIf o) {
    visitPsiElement(o);
  }

  public void visitMatchLabel(@NotNull CairoMatchLabel o) {
    visitPsiElement(o);
  }

  public void visitMatchPattern(@NotNull CairoMatchPattern o) {
    visitPsiElement(o);
  }

  public void visitModItem(@NotNull CairoModItem o) {
    visitItem(o);
  }

  public void visitPrototypeArg(@NotNull CairoPrototypeArg o) {
    visitPsiElement(o);
  }

  public void visitPrototypeArgs(@NotNull CairoPrototypeArgs o) {
    visitPsiElement(o);
  }

  public void visitPrototypeSelfArg(@NotNull CairoPrototypeSelfArg o) {
    visitPsiElement(o);
  }

  public void visitPrototypeStructArg(@NotNull CairoPrototypeStructArg o) {
    visitPsiElement(o);
  }

  public void visitPrototypeTupleArg(@NotNull CairoPrototypeTupleArg o) {
    visitPsiElement(o);
  }

  public void visitPrototypeVariableArg(@NotNull CairoPrototypeVariableArg o) {
    visitPsiElement(o);
  }

  public void visitRangeMatchPattern(@NotNull CairoRangeMatchPattern o) {
    visitMatchPattern(o);
  }

  public void visitRef(@NotNull CairoRef o) {
    visitPsiElement(o);
  }

  public void visitRegionBound(@NotNull CairoRegionBound o) {
    visitPsiElement(o);
  }

  public void visitReturnStatement(@NotNull CairoReturnStatement o) {
    visitPsiElement(o);
  }

  public void visitStatementBlock(@NotNull CairoStatementBlock o) {
    visitPsiElement(o);
  }

  public void visitStaticItem(@NotNull CairoStaticItem o) {
    visitItem(o);
  }

  public void visitStructBodyBlock(@NotNull CairoStructBodyBlock o) {
    visitPsiElement(o);
  }

  public void visitStructBodyTuple(@NotNull CairoStructBodyTuple o) {
    visitPsiElement(o);
  }

  public void visitStructDefault(@NotNull CairoStructDefault o) {
    visitPsiElement(o);
  }

  public void visitStructInitializerList(@NotNull CairoStructInitializerList o) {
    visitPsiElement(o);
  }

  public void visitStructItem(@NotNull CairoStructItem o) {
    visitItem(o);
  }

  public void visitStructMatchPattern(@NotNull CairoStructMatchPattern o) {
    visitMatchPattern(o);
  }

  public void visitStructProperty(@NotNull CairoStructProperty o) {
    visitPsiNamedElement(o);
  }

  public void visitStructRecover(@NotNull CairoStructRecover o) {
    visitPsiElement(o);
  }

  public void visitStructTupleProperty(@NotNull CairoStructTupleProperty o) {
    visitPsiElement(o);
  }

  public void visitTraitAssocType(@NotNull CairoTraitAssocType o) {
    visitPsiElement(o);
  }

  public void visitTraitBlock(@NotNull CairoTraitBlock o) {
    visitPsiElement(o);
  }

  public void visitTraitBounds(@NotNull CairoTraitBounds o) {
    visitPsiElement(o);
  }

  public void visitTraitFunctionDeclaration(@NotNull CairoTraitFunctionDeclaration o) {
    visitPsiElement(o);
  }

  public void visitTraitImplements(@NotNull CairoTraitImplements o) {
    visitPsiElement(o);
  }

  public void visitTraitItem(@NotNull CairoTraitItem o) {
    visitItem(o);
  }

  public void visitTupleMatchPattern(@NotNull CairoTupleMatchPattern o) {
    visitMatchPattern(o);
  }

  public void visitType(@NotNull CairoType o) {
    visitPsiElement(o);
  }

  public void visitTypeBasic(@NotNull CairoTypeBasic o) {
    visitType(o);
  }

  public void visitTypeBounded(@NotNull CairoTypeBounded o) {
    visitType(o);
  }

  public void visitTypeFunction(@NotNull CairoTypeFunction o) {
    visitType(o);
  }

  public void visitTypeItem(@NotNull CairoTypeItem o) {
    visitItem(o);
  }

  public void visitTypeTuple(@NotNull CairoTypeTuple o) {
    visitType(o);
  }

  public void visitTypeUnit(@NotNull CairoTypeUnit o) {
    visitType(o);
  }

  public void visitTypeVector(@NotNull CairoTypeVector o) {
    visitType(o);
  }

  public void visitUse(@NotNull CairoUse o) {
    visitPsiElement(o);
  }

  public void visitUseGroup(@NotNull CairoUseGroup o) {
    visitPsiElement(o);
  }

  public void visitVectorMatchPattern(@NotNull CairoVectorMatchPattern o) {
    visitMatchPattern(o);
  }

  public void visitVisibility(@NotNull CairoVisibility o) {
    visitPsiElement(o);
  }

  public void visitWhereBound(@NotNull CairoWhereBound o) {
    visitPsiElement(o);
  }

  public void visitWhereClause(@NotNull CairoWhereClause o) {
    visitPsiElement(o);
  }

  public void visitPsiNamedElement(@NotNull PsiNamedElement o) {
    visitElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
