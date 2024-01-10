// This is a generated file. Not intended for manual editing.
package cairo.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CairoTraitFunctionDeclaration extends PsiElement {

  @NotNull
  List<CairoAttribute> getAttributeList();

  @Nullable
  CairoGenericParams getGenericParams();

  @Nullable
  CairoPrototypeArgs getPrototypeArgs();

  @Nullable
  CairoType getType();

  @Nullable
  CairoVisibility getVisibility();

}
