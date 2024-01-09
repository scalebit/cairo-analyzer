package cairoplugin.language

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import org.jetbrains.annotations.NotNull

class CairoFile(@NotNull viewProvider: FileViewProvider) : PsiFileBase(viewProvider, CairoLanguage.INSTANCE) {

    @NotNull
    override fun getFileType(): FileType {
        return CairoFileType.INSTANCE
    }

    override fun toString(): String {
        return "Cairo File"
    }
}
