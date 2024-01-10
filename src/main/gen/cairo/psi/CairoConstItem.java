// This is a generated file. Not intended for manual editing.
package cairo.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CairoConstItem extends CairoItem {

  @NotNull
  List<CairoAttribute> getAttributeList();

  @Nullable
  CairoExpr getExpr();

  @Nullable
  CairoItemName getItemName();

  @Nullable
  CairoType getType();

  @Nullable
  CairoVisibility getVisibility();

}
