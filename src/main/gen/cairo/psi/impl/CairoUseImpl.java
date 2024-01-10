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

public class CairoUseImpl extends ASTWrapperPsiElement implements CairoUse {

  public CairoUseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CairoVisitor visitor) {
    visitor.visitUse(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CairoVisitor) accept((CairoVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CairoExprPath getExprPath() {
    return findChildByClass(CairoExprPath.class);
  }

  @Override
  @Nullable
  public CairoUseGroup getUseGroup() {
    return findChildByClass(CairoUseGroup.class);
  }

  @Override
  @Nullable
  public CairoVisibility getVisibility() {
    return findChildByClass(CairoVisibility.class);
  }

}
