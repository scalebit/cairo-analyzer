package cairoplugin.language

import com.intellij.lang.Language

class CairoLanguage: Language("Cairo") {
    companion object {
        val INSTANCE = CairoLanguage()
    }
}