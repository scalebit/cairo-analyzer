// This is a generated file. Not intended for manual editing.
package cairo.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static cairo.psi.CairoTokens.*;
import cairo.psi.mixin.item.CairoModItemMixin;
import cairo.psi.*;

public class CairoModItemImpl extends CairoModItemMixin implements CairoModItem {

  public CairoModItemImpl(ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull CairoVisitor visitor) {
    visitor.visitModItem(this);
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
  public List<CairoExprMacro> getExprMacroList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CairoExprMacro.class);
  }

  @Override
  @NotNull
  public List<CairoItem> getItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CairoItem.class);
  }

  @Override
  @NotNull
  public List<CairoMacroRules> getMacroRulesList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CairoMacroRules.class);
  }

  @Override
  @NotNull
  public List<CairoUse> getUseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CairoUse.class);
  }

  @Override
  @Nullable
  public CairoVisibility getVisibility() {
    return findChildByClass(CairoVisibility.class);
  }

}
