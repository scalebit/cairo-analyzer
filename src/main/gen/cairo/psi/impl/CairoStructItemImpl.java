// This is a generated file. Not intended for manual editing.
package cairo.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static cairo.psi.CairoTokens.*;
import cairo.psi.mixin.item.CairoStructItemMixin;
import cairo.psi.*;

public class CairoStructItemImpl extends CairoStructItemMixin implements CairoStructItem {

  public CairoStructItemImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CairoVisitor visitor) {
    visitor.visitStructItem(this);
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
  @NotNull
  public CairoItemName getItemName() {
    return findNotNullChildByClass(CairoItemName.class);
  }

  @Override
  @Nullable
  public CairoStructBodyBlock getStructBodyBlock() {
    return findChildByClass(CairoStructBodyBlock.class);
  }

  @Override
  @Nullable
  public CairoStructBodyTuple getStructBodyTuple() {
    return findChildByClass(CairoStructBodyTuple.class);
  }

  @Override
  @Nullable
  public CairoVisibility getVisibility() {
    return findChildByClass(CairoVisibility.class);
  }

  @Override
  @Nullable
  public CairoWhereClause getWhereClause() {
    return findChildByClass(CairoWhereClause.class);
  }

}
