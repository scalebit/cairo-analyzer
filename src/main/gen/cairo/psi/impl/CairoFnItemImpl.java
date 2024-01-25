// This is a generated file. Not intended for manual editing.
package cairo.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static cairo.psi.CairoTokens.*;
import cairo.psi.mixin.item.CairoFnItemMixin;
import cairo.psi.*;

public class CairoFnItemImpl extends CairoFnItemMixin implements CairoFnItem {

  public CairoFnItemImpl(ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull CairoVisitor visitor) {
    visitor.visitFnItem(this);
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
  public CairoFnDeclaration getFnDeclaration() {
    return findNotNullChildByClass(CairoFnDeclaration.class);
  }

  @Override
  @NotNull
  public CairoStatementBlock getStatementBlock() {
    return findNotNullChildByClass(CairoStatementBlock.class);
  }

}
