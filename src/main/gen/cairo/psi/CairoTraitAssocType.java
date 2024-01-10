// This is a generated file. Not intended for manual editing.
package cairo.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CairoTraitAssocType extends PsiElement {

  @Nullable
  CairoItemName getItemName();

  @NotNull
  List<CairoLifetime> getLifetimeList();

  @NotNull
  List<CairoType> getTypeList();

  @Nullable
  CairoWhereClause getWhereClause();

}
