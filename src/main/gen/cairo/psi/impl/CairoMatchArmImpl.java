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

public class CairoMatchArmImpl extends ASTWrapperPsiElement implements CairoMatchArm {

  public CairoMatchArmImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CairoVisitor visitor) {
    visitor.visitMatchArm(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CairoVisitor) accept((CairoVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CairoAttribute getAttribute() {
    return findChildByClass(CairoAttribute.class);
  }

  @Override
  @Nullable
  public CairoEmptyStatement getEmptyStatement() {
    return findChildByClass(CairoEmptyStatement.class);
  }

  @Override
  @Nullable
  public CairoExpr getExpr() {
    return findChildByClass(CairoExpr.class);
  }

  @Override
  @Nullable
  public CairoItem getItem() {
    return findChildByClass(CairoItem.class);
  }

  @Override
  @Nullable
  public CairoLet getLet() {
    return findChildByClass(CairoLet.class);
  }

  @Override
  @Nullable
  public CairoMacroRules getMacroRules() {
    return findChildByClass(CairoMacroRules.class);
  }

  @Override
  @NotNull
  public List<CairoMatchFilter> getMatchFilterList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CairoMatchFilter.class);
  }

  @Override
  @Nullable
  public CairoReturnStatement getReturnStatement() {
    return findChildByClass(CairoReturnStatement.class);
  }

  @Override
  @Nullable
  public CairoStatementBlock getStatementBlock() {
    return findChildByClass(CairoStatementBlock.class);
  }

  @Override
  @Nullable
  public CairoUse getUse() {
    return findChildByClass(CairoUse.class);
  }

}
