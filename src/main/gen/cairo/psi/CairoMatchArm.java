// This is a generated file. Not intended for manual editing.
package cairo.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CairoMatchArm extends PsiElement {

  @Nullable
  CairoAttribute getAttribute();

  @Nullable
  CairoEmptyStatement getEmptyStatement();

  @Nullable
  CairoExpr getExpr();

  @Nullable
  CairoItem getItem();

  @Nullable
  CairoLet getLet();

  @Nullable
  CairoMacroRules getMacroRules();

  @NotNull
  List<CairoMatchFilter> getMatchFilterList();

  @Nullable
  CairoReturnStatement getReturnStatement();

  @Nullable
  CairoStatementBlock getStatementBlock();

  @Nullable
  CairoUse getUse();

}
