package cairoplugin.language

import cairoplugin.language.psi.CairoTypes
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import com.intellij.psi.TokenType
import org.jetbrains.annotations.NotNull

class CairoSyntaxHighlighter : SyntaxHighlighterBase() {

    companion object {
        val SEPARATOR: TextAttributesKey =
            createTextAttributesKey("CAIRO_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN)
        val KEY: TextAttributesKey =
            createTextAttributesKey("CAIRO_KEY", DefaultLanguageHighlighterColors.KEYWORD)
        val VALUE: TextAttributesKey =
            createTextAttributesKey("CAIRO_VALUE", DefaultLanguageHighlighterColors.STRING)
        val COMMENT: TextAttributesKey =
            createTextAttributesKey("CAIRO_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        val BAD_CHARACTER: TextAttributesKey =
            createTextAttributesKey("CAIRO_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)

        private val BAD_CHAR_KEYS = arrayOf(BAD_CHARACTER)
        private val SEPARATOR_KEYS = arrayOf(SEPARATOR)
        private val KEY_KEYS = arrayOf(KEY)
        private val VALUE_KEYS = arrayOf(VALUE)
        private val COMMENT_KEYS = arrayOf(COMMENT)
        private val EMPTY_KEYS = emptyArray<TextAttributesKey>()
    }

    @NotNull
    override fun getHighlightingLexer(): CairoLexerAdapter {
        return CairoLexerAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return when (tokenType) {
            CairoTypes.SEPARATOR -> SEPARATOR_KEYS
            CairoTypes.KEY -> KEY_KEYS
            CairoTypes.VALUE -> VALUE_KEYS
            CairoTypes.COMMENT -> COMMENT_KEYS
            TokenType.BAD_CHARACTER -> BAD_CHAR_KEYS
            else -> EMPTY_KEYS
        }
    }
}
