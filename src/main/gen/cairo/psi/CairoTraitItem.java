// This is a generated file. Not intended for manual editing.
package cairo.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CairoTraitItem extends CairoItem {

  @NotNull
  List<CairoGenericParams> getGenericParamsList();

  @Nullable
  CairoItemName getItemName();

  @Nullable
  CairoTraitBlock getTraitBlock();

  @Nullable
  CairoTraitImplements getTraitImplements();

  @Nullable
  CairoVisibility getVisibility();

  @Nullable
  CairoWhereClause getWhereClause();

}
