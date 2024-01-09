package cairoplugin.language.psi

import cairoplugin.language.CairoLanguage
import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls
import org.jetbrains.annotations.NotNull

class CairoElementType(@NotNull @NonNls debugName: String) : IElementType(debugName, CairoLanguage.INSTANCE) {

}