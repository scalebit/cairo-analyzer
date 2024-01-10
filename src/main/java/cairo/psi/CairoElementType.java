package cairo.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import cairo.CairoLanguage;

public class CairoElementType extends IElementType {
	public CairoElementType(@NotNull @NonNls String debugName) {
		super(debugName, CairoLanguage.INSTANCE);
	}
}
