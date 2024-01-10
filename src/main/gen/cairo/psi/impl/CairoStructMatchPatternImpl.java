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

public class CairoStructMatchPatternImpl extends CairoMatchPatternImpl implements CairoStructMatchPattern {

  public CairoStructMatchPatternImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull CairoVisitor visitor) {
    visitor.visitStructMatchPattern(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CairoVisitor) accept((CairoVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CairoMatchIdentifier> getMatchIdentifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CairoMatchIdentifier.class);
  }

  @Override
  @NotNull
  public List<CairoMatchPattern> getMatchPatternList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CairoMatchPattern.class);
  }

}
