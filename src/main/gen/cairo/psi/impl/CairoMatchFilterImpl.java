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

public class CairoMatchFilterImpl extends ASTWrapperPsiElement implements CairoMatchFilter {

  public CairoMatchFilterImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CairoVisitor visitor) {
    visitor.visitMatchFilter(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CairoVisitor) accept((CairoVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CairoMatchIf getMatchIf() {
    return findChildByClass(CairoMatchIf.class);
  }

  @Override
  @NotNull
  public CairoMatchPattern getMatchPattern() {
    return findNotNullChildByClass(CairoMatchPattern.class);
  }

}
