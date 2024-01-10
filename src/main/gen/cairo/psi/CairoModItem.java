// This is a generated file. Not intended for manual editing.
package cairo.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CairoModItem extends CairoItem {

  @NotNull
  List<CairoAttribute> getAttributeList();

  @NotNull
  List<CairoExprMacro> getExprMacroList();

  @NotNull
  List<CairoItem> getItemList();

  @NotNull
  List<CairoMacroRules> getMacroRulesList();

  @NotNull
  List<CairoUse> getUseList();

  @Nullable
  CairoVisibility getVisibility();

}
