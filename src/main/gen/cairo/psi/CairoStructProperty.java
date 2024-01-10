// This is a generated file. Not intended for manual editing.
package cairo.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;

public interface CairoStructProperty extends PsiNamedElement {

  @NotNull
  List<CairoAttribute> getAttributeList();

  @NotNull
  CairoLetVariableBind getLetVariableBind();

  @Nullable
  CairoVisibility getVisibility();

}
