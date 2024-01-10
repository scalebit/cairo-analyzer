// This is a generated file. Not intended for manual editing.
package cairo.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CairoBlockIf extends CairoExprBlock {

  @NotNull
  CairoExpr getExpr();

  @NotNull
  CairoIfTail getIfTail();

  @Nullable
  CairoLetBind getLetBind();

  @NotNull
  CairoStatementBlock getStatementBlock();

}
