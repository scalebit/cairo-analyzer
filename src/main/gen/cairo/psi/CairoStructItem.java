// This is a generated file. Not intended for manual editing.
package cairo.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CairoStructItem extends CairoItem {

  @Nullable
  CairoGenericParams getGenericParams();

  @NotNull
  CairoItemName getItemName();

  @Nullable
  CairoStructBodyBlock getStructBodyBlock();

  @Nullable
  CairoStructBodyTuple getStructBodyTuple();

  @Nullable
  CairoVisibility getVisibility();

  @Nullable
  CairoWhereClause getWhereClause();

}
