import cairo.CairoIcons
import cairo.lsp.CairoLanguageServer
import cairo.setting.CairoAnalyzerSettingsState
import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.Lsp4jClient
import com.intellij.platform.lsp.api.LspServerNotificationsHandler
import com.intellij.platform.lsp.api.ProjectWideLspServerDescriptor
import com.intellij.platform.lsp.api.customization.LspCompletionSupport
import com.intellij.platform.lsp.api.customization.LspFormattingSupport
import org.eclipse.lsp4j.ConfigurationItem
import org.eclipse.lsp4j.services.LanguageServer



public class CairoLspServerDescriptor(project: Project) : ProjectWideLspServerDescriptor(project, "Cairo") {

    override val lspGoToDefinitionSupport = true;
    override val lspHoverSupport = true;
    override val lsp4jServerClass: Class<out LanguageServer> = CairoLanguageServer::class.java

    override val lspCompletionSupport = object : LspCompletionSupport() {
        override fun shouldRunCodeCompletion(parameters: com.intellij.codeInsight.completion.CompletionParameters): kotlin.Boolean {
            return true;
        }
    }

    override val lspFormattingSupport = object : LspFormattingSupport() {
        override fun shouldFormatThisFileExclusivelyByServer(
            file: VirtualFile,
            ideCanFormatThisFileItself: Boolean,
            serverExplicitlyWantsToFormatThisFile: Boolean
        ): Boolean {
            return file.extension == "cairo";
        }
    }
    override fun isSupportedFile(file: VirtualFile): Boolean {
        return file.extension == "cairo";
    }

//    override fun createLsp4jClient(handler: LspServerNotificationsHandler):Lsp4jClient   {
//        val client = CairoLsp4jClient(handler)
//        return client
//    }

    override fun createCommandLine(): GeneralCommandLine {
        val libPath = CairoAnalyzerSettingsState.getInstance().corelibPath
        val lspPath = CairoAnalyzerSettingsState.getInstance().languageServerPath

        LOG.info("cairo corelib path: " + libPath + "   " + libPath.isEmpty());
        LOG.info("cairo language server path: " + lspPath + "     " + lspPath.isEmpty());

        return GeneralCommandLine().apply {
            withCharset(Charsets.UTF_8)
            withExePath(CairoAnalyzerSettingsState.getInstance().languageServerPath)
        }
    }

    override fun getWorkspaceConfiguration(item: ConfigurationItem): Any? {
        LOG.info("getWorkspaceConfiguration: " + item.toString());
        if (item.getSection() == "cairo1.corelibPath") {
            return CairoAnalyzerSettingsState.getInstance().corelibPath
        }
        return super.getWorkspaceConfiguration(item)
    }
}

//class CairoLsp4jClient(handler: LspServerNotificationsHandler) : Lsp4jClient(
//    handler
//) {
////    companion object {
////        // 初始化 Logger，参数是类的类名
////        private val LOG: Logger = Logger.getInstance(CairoLsp4jClient::class.java)
////    }
////
////    @JsonNotification("scarb/resolving-start")
////    fun onResolvingStart() {
////
////        this.showMessage(MessageParams(MessageType.Info, "scarb.resolving.start"))
////    }
////
////    @JsonNotification("scarb/resolving-finish")
////    fun onResolvingFinish() {
////        this.showMessage(MessageParams(MessageType.Info, "scarb.resolving.finished"))
////    }
//}