package cairoplugin.language

import cairoplugin.language.psi.CairoTypes
import com.intellij.psi.tree.TokenSet
import com.intellij.psi.tree.TokenSet.create

interface CairoTokenSets {

    companion object {
        val IDENTIFIERS: TokenSet = create(CairoTypes.KEY)
        val COMMENTS: TokenSet = create(CairoTypes.COMMENT)
    }
}
