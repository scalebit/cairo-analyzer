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

public class CairoTypeBoundedImpl extends CairoTypeImpl implements CairoTypeBounded {

  public CairoTypeBoundedImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull CairoVisitor visitor) {
    visitor.visitTypeBounded(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CairoVisitor) accept((CairoVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CairoClosureSugar getClosureSugar() {
    return findChildByClass(CairoClosureSugar.class);
  }

  @Override
  @Nullable
  public CairoGeneric getGeneric() {
    return findChildByClass(CairoGeneric.class);
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
  public List<CairoType> getTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CairoType.class);
  }

}
