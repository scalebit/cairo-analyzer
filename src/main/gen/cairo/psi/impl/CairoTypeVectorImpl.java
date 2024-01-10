// This is a generated file. Not intended for manual editing.
package cairo.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static cairo.psi.CairoTokens.*;
import cairo.psi.*;

public class CairoTypeVectorImpl extends CairoTypeImpl implements CairoTypeVector {

  public CairoTypeVectorImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull CairoVisitor visitor) {
    visitor.visitTypeVector(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CairoVisitor) accept((CairoVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CairoExpr getExpr() {
    return findChildByClass(CairoExpr.class);
  }

  @Override
  @NotNull
  public List<CairoLifetime> getLifetimeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CairoLifetime.class);
  }

  @Override
  @NotNull
  public List<CairoRef> getRefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CairoRef.class);
  }

  @Override
  @NotNull
  public CairoType getType() {
    return findNotNullChildByClass(CairoType.class);
  }

}
