import com.intellij.execution.configurations.GeneralCommandLine

import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile

import com.intellij.platform.lsp.api.ProjectWideLspServerDescriptor
import com.intellij.platform.lsp.api.customization.LspCompletionSupport
import com.intellij.platform.lsp.api.customization.LspFormattingSupport
import kotlin.system.exitProcess


public class CairoLspServerDescriptor(project: Project) : ProjectWideLspServerDescriptor(project, "Cairo") {

    override val lspGoToDefinitionSupport = true;
    override val lspHoverSupport = true;

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
        LOG.info("is support file ");
        return file.extension == "cairo";
    }

    override fun createCommandLine(): GeneralCommandLine {
        val osName = System.getProperty("os.name").lowercase()
        val osArch = System.getProperty("os.arch").lowercase()
        val lspExe: String = when {
            osName.contains("win") -> "Cairo-for-Intellij\\ScaleBit\\win_x86_64\\cairo-language-server.exe"
            osName.contains("nix") || osName.contains("nux") -> {
                when {
                    osArch.contains("x86") -> "Cairo-for-Intellij/ScaleBit/linux_x86_64/cairo-language-server.exe"
                    osArch.contains("aarch") -> "Cairo-for-Intellij/ScaleBit/linux_aarch64/cairo-language-server.exe"
                    else -> {
                        LOG.error("unsupport os");
                        exitProcess(-1);
                    }
                }
            }
            osName.contains("mac") -> {
                when {
                    osArch.contains("x86") -> "Cairo-for-Intellij/ScaleBit/mac_x86_64/cairo-language-server.exe"
                    osArch.contains("aarch") -> "Cairo-for-Intellij/ScaleBit/mac_aarch64/cairo-language-server.exe"
                    else -> {
                        LOG.error("unsupport os");
                        exitProcess(-1);
                    }
                }
            }
            else -> {
                LOG.error("unsupport os");
                exitProcess(-1);
            }
        }

        var commandLine = GeneralCommandLine(lspExe)
        return commandLine
    }
}