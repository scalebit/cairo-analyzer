// This is a generated file. Not intended for manual editing.
package cairo.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static cairo.psi.CairoTokens.*;
import cairo.psi.mixin.item.CairoEnumItemMixin;
import cairo.psi.*;

public class CairoEnumItemImpl extends CairoEnumItemMixin implements CairoEnumItem {

  public CairoEnumItemImpl(ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull CairoVisitor visitor) {
    visitor.visitEnumItem(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CairoVisitor) accept((CairoVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CairoEnumBody getEnumBody() {
    return findChildByClass(CairoEnumBody.class);
  }

  @Override
  @Nullable
  public CairoGenericParams getGenericParams() {
    return findChildByClass(CairoGenericParams.class);
  }

  @Override
  @Nullable
  public CairoItemName getItemName() {
    return findChildByClass(CairoItemName.class);
  }

  @Override
  @Nullable
  public CairoVisibility getVisibility() {
    return findChildByClass(CairoVisibility.class);
  }

}
