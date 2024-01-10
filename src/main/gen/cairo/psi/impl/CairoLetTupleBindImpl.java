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

public class CairoLetTupleBindImpl extends CairoLetBindImpl implements CairoLetTupleBind {

  public CairoLetTupleBindImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull CairoVisitor visitor) {
    visitor.visitLetTupleBind(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CairoVisitor) accept((CairoVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CairoLetBind> getLetBindList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CairoLetBind.class);
  }

  @Override
  @NotNull
  public List<CairoRef> getRefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CairoRef.class);
  }

  @Override
  @Nullable
  public CairoType getType() {
    return findChildByClass(CairoType.class);
  }

}
