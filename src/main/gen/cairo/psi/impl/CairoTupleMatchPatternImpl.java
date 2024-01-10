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

public class CairoTupleMatchPatternImpl extends CairoMatchPatternImpl implements CairoTupleMatchPattern {

  public CairoTupleMatchPatternImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull CairoVisitor visitor) {
    visitor.visitTupleMatchPattern(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CairoVisitor) accept((CairoVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CairoMatchLabel getMatchLabel() {
    return findChildByClass(CairoMatchLabel.class);
  }

  @Override
  @NotNull
  public List<CairoMatchPattern> getMatchPatternList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CairoMatchPattern.class);
  }

}
