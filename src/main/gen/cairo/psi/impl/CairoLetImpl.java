// This is a generated file. Not intended for manual editing.
package cairo.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static cairo.psi.CairoTokens.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import cairo.psi.*;

public class CairoLetImpl extends ASTWrapperPsiElement implements CairoLet {

  public CairoLetImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CairoVisitor visitor) {
    visitor.visitLet(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CairoVisitor) accept((CairoVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CairoExpr getExpr() {
    return findChildByClass(CairoExpr.class);
  }

  @Override
  @NotNull
  public CairoLetBind getLetBind() {
    return findNotNullChildByClass(CairoLetBind.class);
  }

  @Override
  @Nullable
  public CairoStatementBlock getStatementBlock() {
    return findChildByClass(CairoStatementBlock.class);
  }

}
