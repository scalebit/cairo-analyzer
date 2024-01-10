// This is a generated file. Not intended for manual editing.
package cairo.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CairoFnItem extends CairoItem {

  @NotNull
  List<CairoAttribute> getAttributeList();

  @NotNull
  CairoFnDeclaration getFnDeclaration();

  @NotNull
  CairoStatementBlock getStatementBlock();

}
