package cairoplugin.language

import com.intellij.openapi.fileTypes.LanguageFileType
import org.jetbrains.annotations.NotNull
import org.jetbrains.annotations.Nullable
import javax.swing.Icon




class CairoFileType: LanguageFileType(CairoLanguage.INSTANCE)  {
    companion object {
        val INSTANCE: CairoFileType = CairoFileType()
    }

    @NotNull
    override fun getName(): String {
        return "Cairo File"
    }

    @NotNull
    override fun getDescription(): String {
        return "Cairo language file"
    }

    @NotNull
    override fun getDefaultExtension(): String {
        return "cairo"
    }

    @Nullable
    override fun getIcon(): Icon {
        return CairoIcons.FILE
    }
}