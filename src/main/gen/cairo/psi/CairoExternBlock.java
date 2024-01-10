// This is a generated file. Not intended for manual editing.
package cairo.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CairoExternBlock extends PsiElement {

  @NotNull
  List<CairoAttribute> getAttributeList();

  @NotNull
  List<CairoExternVariable> getExternVariableList();

  @NotNull
  List<CairoTraitFunctionDeclaration> getTraitFunctionDeclarationList();

}
