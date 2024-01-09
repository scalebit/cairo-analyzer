package cairoplugin.language

import cairoplugin.language.parser.CairoParser
import cairoplugin.language.psi.CairoTypes
import com.intellij.lang.ASTNode
import com.intellij.lang.FileASTNode
import com.intellij.lang.Language
import com.intellij.lang.ParserDefinition
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import org.jetbrains.annotations.NotNull

class CairoParserDefinition : ParserDefinition {

    companion object {
        val FILE: IFileElementType = IFileElementType(CairoLanguage.INSTANCE)
    }

    @NotNull
    override fun createLexer(project: Project): CairoLexerAdapter {
        return CairoLexerAdapter()
    }

    @NotNull
    override fun getCommentTokens(): TokenSet {
        return CairoTokenSets.COMMENTS
    }

    @NotNull
    override fun getStringLiteralElements(): TokenSet {
        return TokenSet.EMPTY
    }

    @NotNull
    override fun createParser(project: Project): CairoParser {
        return CairoParser()
    }

    @NotNull
    override fun getFileNodeType(): IFileElementType {
        return FILE
    }

    @NotNull
    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return CairoFile(viewProvider)
    }

    @NotNull
    override fun createElement(node: ASTNode): PsiElement {
        return CairoTypes.Factory.createElement(node)
    }

}
