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

public class CairoExternItemImpl extends CairoItemImpl implements CairoExternItem {

  public CairoExternItemImpl(ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull CairoVisitor visitor) {
    visitor.visitExternItem(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CairoVisitor) accept((CairoVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CairoExternBlock getExternBlock() {
    return findChildByClass(CairoExternBlock.class);
  }

  @Override
  @Nullable
  public CairoExternCrate getExternCrate() {
    return findChildByClass(CairoExternCrate.class);
  }

  @Override
  @Nullable
  public CairoExternFunction getExternFunction() {
    return findChildByClass(CairoExternFunction.class);
  }

  @Override
  @Nullable
  public CairoVisibility getVisibility() {
    return findChildByClass(CairoVisibility.class);
  }

}
