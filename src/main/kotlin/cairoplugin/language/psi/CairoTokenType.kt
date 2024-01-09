package cairoplugin.language.psi

import cairoplugin.language.CairoLanguage
import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls
import org.jetbrains.annotations.NotNull

class CairoTokenType(@NotNull @NonNls debugName: String) : IElementType(debugName, CairoLanguage.INSTANCE) {

    override fun toString(): String {
        return "CairoTokenType." + super.toString()
    }
}