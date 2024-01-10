// This is a generated file. Not intended for manual editing.
package cairo.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CairoTypeTuple extends CairoType {

  @NotNull
  List<CairoLifetime> getLifetimeList();

  @NotNull
  List<CairoRef> getRefList();

  @NotNull
  List<CairoType> getTypeList();

}
