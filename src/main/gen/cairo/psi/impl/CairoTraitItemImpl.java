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

public class CairoTraitItemImpl extends CairoItemImpl implements CairoTraitItem {

  public CairoTraitItemImpl(ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull CairoVisitor visitor) {
    visitor.visitTraitItem(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CairoVisitor) accept((CairoVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CairoGenericParams> getGenericParamsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CairoGenericParams.class);
  }

  @Override
  @Nullable
  public CairoItemName getItemName() {
    return findChildByClass(CairoItemName.class);
  }

  @Override
  @Nullable
  public CairoTraitBlock getTraitBlock() {
    return findChildByClass(CairoTraitBlock.class);
  }

  @Override
  @Nullable
  public CairoTraitImplements getTraitImplements() {
    return findChildByClass(CairoTraitImplements.class);
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
