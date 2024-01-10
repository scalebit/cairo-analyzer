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

public class CairoBlockIfImpl extends CairoExprBlockImpl implements CairoBlockIf {

  public CairoBlockIfImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull CairoVisitor visitor) {
    visitor.visitBlockIf(this);
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
  @NotNull
  public CairoIfTail getIfTail() {
    return findNotNullChildByClass(CairoIfTail.class);
  }

  @Override
  @Nullable
  public CairoLetBind getLetBind() {
    return findChildByClass(CairoLetBind.class);
  }

  @Override
  @NotNull
  public CairoStatementBlock getStatementBlock() {
    return findNotNullChildByClass(CairoStatementBlock.class);
  }

}
