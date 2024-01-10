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

public class CairoExprStructInitializerImpl extends CairoExprImpl implements CairoExprStructInitializer {

  public CairoExprStructInitializerImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull CairoVisitor visitor) {
    visitor.visitExprStructInitializer(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CairoVisitor) accept((CairoVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CairoExpr getExpr() {
    return findNotNullChildByClass(CairoExpr.class);
  }

  @Override
  @Nullable
  public CairoStructDefault getStructDefault() {
    return findChildByClass(CairoStructDefault.class);
  }

  @Override
  @NotNull
  public CairoStructInitializerList getStructInitializerList() {
    return findNotNullChildByClass(CairoStructInitializerList.class);
  }

}
