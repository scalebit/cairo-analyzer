package cairo.setting;

import cairo.setting.CairoAnalyzerSettingsConfigurable;
import com.intellij.openapi.fileEditor.FileEditor;
import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.fileEditor.FileEditorManagerEvent;
import com.intellij.openapi.fileEditor.FileEditorManagerListener;
import com.intellij.openapi.options.ShowSettingsUtil;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Key;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.ui.EditorNotificationPanel;
import com.intellij.ui.EditorNotifications;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


import org.jetbrains.annotations.NotNull;

public class Banner4Setting extends EditorNotifications.Provider<EditorNotificationPanel> {

    @Override
    public @NotNull Key<EditorNotificationPanel> getKey() {
        return Key.create("Banner4Setting");
    }

    @Override
    public EditorNotificationPanel createNotificationPanel(@NotNull VirtualFile file, @NotNull FileEditor fileEditor, @NotNull Project project) {
        String libPath = CairoAnalyzerSettingsState.getInstance().corelibPath;
        String lspPath = CairoAnalyzerSettingsState.getInstance().languageServerPath;

        if (libPath.isEmpty() || lspPath.isEmpty()) {
            EditorNotificationPanel banner = new EditorNotificationPanel();
            banner.setText("Corelib path or language server path is null.");
            banner.setToolTipText("Goto setting page");
            banner.createActionLabel("Goto setting page", () -> {
                ShowSettingsUtil.getInstance().showSettingsDialog(project, CairoAnalyzerSettingsConfigurable.class);
            });
            return banner;
        }


        File folder = new File(libPath);
        if (!folder.exists()) {
            EditorNotificationPanel banner = new EditorNotificationPanel();
            banner.setText(libPath + " does not exist.");
            banner.setToolTipText("Goto setting page");
            banner.createActionLabel("Goto setting page", () -> {
                ShowSettingsUtil.getInstance().showSettingsDialog(project, CairoAnalyzerSettingsConfigurable.class);
            });
            return banner;
        }

        if (!folder.isDirectory()) {
            EditorNotificationPanel banner = new EditorNotificationPanel();
            banner.setText(libPath + " is not a directory.");
            banner.setToolTipText("Goto setting page");
            banner.createActionLabel("Goto setting page", () -> {
                ShowSettingsUtil.getInstance().showSettingsDialog(project, CairoAnalyzerSettingsConfigurable.class);
            });
            return banner;
        }

        Path path = Paths.get(lspPath);
        if (!Files.exists(path)) {
            EditorNotificationPanel banner = new EditorNotificationPanel();
            banner.setText(lspPath + " does not exist.");
            banner.setToolTipText("Goto setting page");
            banner.createActionLabel("Goto setting page", () -> {
                ShowSettingsUtil.getInstance().showSettingsDialog(project, CairoAnalyzerSettingsConfigurable.class);
            });
            return banner;
        }
        return null;
    }

    public static class FileEditorListener implements FileEditorManagerListener {
        @Override
        public void fileOpened(@NotNull FileEditorManager source, @NotNull VirtualFile file) {
            EditorNotifications.getInstance(source.getProject()).updateNotifications(file);
        }

        @Override
        public void fileClosed(@NotNull FileEditorManager source, @NotNull VirtualFile file) {
            EditorNotifications.getInstance(source.getProject()).updateNotifications(file);
        }

        @Override
        public void selectionChanged(@NotNull FileEditorManagerEvent event) {
            EditorNotifications.getInstance(event.getManager().getProject()).updateAllNotifications();
        }
    }
}

