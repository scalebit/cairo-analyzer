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

public class CairoFnDeclarationImpl extends ASTWrapperPsiElement implements CairoFnDeclaration {

  public CairoFnDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CairoVisitor visitor) {
    visitor.visitFnDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CairoVisitor) accept((CairoVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CairoFnArgs getFnArgs() {
    return findChildByClass(CairoFnArgs.class);
  }

  @Override
  @Nullable
  public CairoGenericParams getGenericParams() {
    return findChildByClass(CairoGenericParams.class);
  }

  @Override
  @Nullable
  public CairoItemName getItemName() {
    return findChildByClass(CairoItemName.class);
  }

  @Override
  @Nullable
  public CairoType getType() {
    return findChildByClass(CairoType.class);
  }

  @Override
  @Nullable
  public CairoVisibility getVisibility() {
    return findChildByClass(CairoVisibility.class);
  }

  @Override
  @Nullable
  public CairoWhereClause getWhereClause() {
    return findChildByClass(CairoWhereClause.class);
  }

}
