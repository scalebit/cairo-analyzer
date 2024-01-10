// This is a generated file. Not intended for manual editing.
package cairo.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CairoTypeBasic extends CairoType {

  @Nullable
  CairoClosureSugar getClosureSugar();

  @Nullable
  CairoGeneric getGeneric();

  @NotNull
  List<CairoLifetime> getLifetimeList();

  @NotNull
  List<CairoRef> getRefList();

}
