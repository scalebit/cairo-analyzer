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

public class CairoClosureBodyImpl extends ASTWrapperPsiElement implements CairoClosureBody {

  public CairoClosureBodyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CairoVisitor visitor) {
    visitor.visitClosureBody(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CairoVisitor) accept((CairoVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CairoAttribute getAttribute() {
    return findChildByClass(CairoAttribute.class);
  }

  @Override
  @Nullable
  public CairoEmptyStatement getEmptyStatement() {
    return findChildByClass(CairoEmptyStatement.class);
  }

  @Override
  @Nullable
  public CairoExpr getExpr() {
    return findChildByClass(CairoExpr.class);
  }

  @Override
  @Nullable
  public CairoItem getItem() {
    return findChildByClass(CairoItem.class);
  }

  @Override
  @Nullable
  public CairoLet getLet() {
    return findChildByClass(CairoLet.class);
  }

  @Override
  @Nullable
  public CairoMacroRules getMacroRules() {
    return findChildByClass(CairoMacroRules.class);
  }

  @Override
  @Nullable
  public CairoReturnStatement getReturnStatement() {
    return findChildByClass(CairoReturnStatement.class);
  }

  @Override
  @Nullable
  public CairoStatementBlock getStatementBlock() {
    return findChildByClass(CairoStatementBlock.class);
  }

  @Override
  @Nullable
  public CairoType getType() {
    return findChildByClass(CairoType.class);
  }

  @Override
  @Nullable
  public CairoUse getUse() {
    return findChildByClass(CairoUse.class);
  }

}
