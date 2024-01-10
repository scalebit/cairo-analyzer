// This is a generated file. Not intended for manual editing.
package cairo.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CairoIfTail extends PsiElement {

  @NotNull
  List<CairoExpr> getExprList();

  @NotNull
  List<CairoLetBind> getLetBindList();

  @NotNull
  List<CairoStatementBlock> getStatementBlockList();

}
