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

public class CairoTraitBlockImpl extends ASTWrapperPsiElement implements CairoTraitBlock {

  public CairoTraitBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CairoVisitor visitor) {
    visitor.visitTraitBlock(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CairoVisitor) accept((CairoVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CairoAttribute> getAttributeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CairoAttribute.class);
  }

  @Override
  @NotNull
  public List<CairoStatementBlock> getStatementBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CairoStatementBlock.class);
  }

  @Override
  @NotNull
  public List<CairoTraitAssocType> getTraitAssocTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CairoTraitAssocType.class);
  }

  @Override
  @NotNull
  public List<CairoTraitFunctionDeclaration> getTraitFunctionDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CairoTraitFunctionDeclaration.class);
  }

}
