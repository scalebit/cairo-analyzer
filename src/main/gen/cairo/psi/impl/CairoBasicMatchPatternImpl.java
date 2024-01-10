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

public class CairoBasicMatchPatternImpl extends CairoMatchPatternImpl implements CairoBasicMatchPattern {

  public CairoBasicMatchPatternImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull CairoVisitor visitor) {
    visitor.visitBasicMatchPattern(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CairoVisitor) accept((CairoVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CairoMatchIdentifier getMatchIdentifier() {
    return findChildByClass(CairoMatchIdentifier.class);
  }

  @Override
  @Nullable
  public CairoMatchLabel getMatchLabel() {
    return findChildByClass(CairoMatchLabel.class);
  }

  @Override
  @Nullable
  public CairoRef getRef() {
    return findChildByClass(CairoRef.class);
  }

  @Override
  @Nullable
  public CairoType getType() {
    return findChildByClass(CairoType.class);
  }

}
