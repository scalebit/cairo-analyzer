// This is a generated file. Not intended for manual editing.
package cairoplugin.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static cairoplugin.language.psi.CairoTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import cairoplugin.language.psi.*;

public class CairoPropertyImpl extends ASTWrapperPsiElement implements CairoProperty {

  public CairoPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CairoVisitor visitor) {
    visitor.visitProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CairoVisitor) accept((CairoVisitor)visitor);
    else super.accept(visitor);
  }

}
