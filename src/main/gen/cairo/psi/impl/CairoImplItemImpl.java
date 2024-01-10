// This is a generated file. Not intended for manual editing.
package cairo.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static cairo.psi.CairoTokens.*;
import cairo.psi.mixin.item.CairoImplItemMixin;
import cairo.psi.*;

public class CairoImplItemImpl extends CairoImplItemMixin implements CairoImplItem {

  public CairoImplItemImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CairoVisitor visitor) {
    visitor.visitImplItem(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CairoVisitor) accept((CairoVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CairoGenericParams getGenericParams() {
    return findChildByClass(CairoGenericParams.class);
  }

  @Override
  @Nullable
  public CairoImplBlock getImplBlock() {
    return findChildByClass(CairoImplBlock.class);
  }

  @Override
  @Nullable
  public CairoImplFor getImplFor() {
    return findChildByClass(CairoImplFor.class);
  }

  @Override
  @Nullable
  public CairoType getType() {
    return findChildByClass(CairoType.class);
  }

  @Override
  @Nullable
  public CairoWhereClause getWhereClause() {
    return findChildByClass(CairoWhereClause.class);
  }

}
