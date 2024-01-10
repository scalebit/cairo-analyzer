// This is a generated file. Not intended for manual editing.
package cairo.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static cairo.psi.CairoTokens.*;
import cairo.psi.mixin.struct.CairoStructPropertyMixin;
import cairo.psi.*;

public class CairoStructPropertyImpl extends CairoStructPropertyMixin implements CairoStructProperty {

  public CairoStructPropertyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CairoVisitor visitor) {
    visitor.visitStructProperty(this);
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
  public CairoLetVariableBind getLetVariableBind() {
    return findNotNullChildByClass(CairoLetVariableBind.class);
  }

  @Override
  @Nullable
  public CairoVisibility getVisibility() {
    return findChildByClass(CairoVisibility.class);
  }

}
