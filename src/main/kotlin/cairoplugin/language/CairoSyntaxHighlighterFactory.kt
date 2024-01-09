package cairoplugin.language

import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import org.jetbrains.annotations.NotNull

class CairoSyntaxHighlighterFactory : SyntaxHighlighterFactory() {

    @NotNull
    override fun getSyntaxHighlighter(project: Project?, file: VirtualFile?): SyntaxHighlighter {
        return CairoSyntaxHighlighter()
    }
}
