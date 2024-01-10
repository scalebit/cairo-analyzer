// This is a generated file. Not intended for manual editing.
package cairo.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CairoStatementBlock extends PsiElement {

  @NotNull
  List<CairoAttribute> getAttributeList();

  @NotNull
  List<CairoEmptyStatement> getEmptyStatementList();

  @NotNull
  List<CairoExpr> getExprList();

  @NotNull
  List<CairoItem> getItemList();

  @NotNull
  List<CairoLet> getLetList();

  @NotNull
  List<CairoMacroRules> getMacroRulesList();

  @NotNull
  List<CairoReturnStatement> getReturnStatementList();

  @NotNull
  List<CairoUse> getUseList();

}
