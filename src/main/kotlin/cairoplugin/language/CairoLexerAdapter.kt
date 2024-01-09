package cairoplugin.language

import com.intellij.lexer.FlexAdapter

class CairoLexerAdapter : FlexAdapter(CairoLexer(null)) {

}
