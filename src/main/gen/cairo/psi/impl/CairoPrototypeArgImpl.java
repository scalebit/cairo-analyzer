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

public class CairoPrototypeArgImpl extends ASTWrapperPsiElement implements CairoPrototypeArg {

  public CairoPrototypeArgImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CairoVisitor visitor) {
    visitor.visitPrototypeArg(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CairoVisitor) accept((CairoVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CairoPrototypeSelfArg getPrototypeSelfArg() {
    return findChildByClass(CairoPrototypeSelfArg.class);
  }

  @Override
  @Nullable
  public CairoPrototypeStructArg getPrototypeStructArg() {
    return findChildByClass(CairoPrototypeStructArg.class);
  }

  @Override
  @Nullable
  public CairoPrototypeTupleArg getPrototypeTupleArg() {
    return findChildByClass(CairoPrototypeTupleArg.class);
  }

  @Override
  @Nullable
  public CairoPrototypeVariableArg getPrototypeVariableArg() {
    return findChildByClass(CairoPrototypeVariableArg.class);
  }

}
