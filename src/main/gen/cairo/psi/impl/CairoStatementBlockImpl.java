// This is a generated file. Not intended for manual editing.
package cairo.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static cairo.psi.CairoTokens.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import cairo.psi.*;

public class CairoStatementBlockImpl extends ASTWrapperPsiElement implements CairoStatementBlock {

  public CairoStatementBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CairoVisitor visitor) {
    visitor.visitStatementBlock(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CairoVisitor) accept((CairoVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CairoAttribute> getAttributeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CairoAttribute.class);
  }

  @Override
  @NotNull
  public List<CairoEmptyStatement> getEmptyStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CairoEmptyStatement.class);
  }

  @Override
  @NotNull
  public List<CairoExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CairoExpr.class);
  }

  @Override
  @NotNull
  public List<CairoItem> getItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CairoItem.class);
  }

  @Override
  @NotNull
  public List<CairoLet> getLetList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CairoLet.class);
  }

  @Override
  @NotNull
  public List<CairoMacroRules> getMacroRulesList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CairoMacroRules.class);
  }

  @Override
  @NotNull
  public List<CairoReturnStatement> getReturnStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CairoReturnStatement.class);
  }

  @Override
  @NotNull
  public List<CairoUse> getUseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CairoUse.class);
  }

}
