package cairo.setting;


import com.esotericsoftware.kryo.kryo5.minlog.Log;
import com.intellij.openapi.options.Configurable;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.application.Application;
import javax.swing.*;
import java.util.Objects;

/**
 * Provides controller functionality for application settings.
 */
public class CairoAnalyzerSettingsConfigurable implements Configurable {

    private CairoAnalyzerSettingsComponent mySettingsComponent;

    // A default constructor with no arguments is required because this implementation
    // is registered as an applicationConfigurable EP

    @Nls(capitalization = Nls.Capitalization.Title)
    @Override
    public String getDisplayName() {
        return "SDK: Application Settings Example";
    }

    @Override
    public JComponent getPreferredFocusedComponent() {
        return mySettingsComponent.getPreferredFocusedComponent();
    }

    @Nullable
    @Override
    public JComponent createComponent() {
        mySettingsComponent = new CairoAnalyzerSettingsComponent();
        return mySettingsComponent.getPanel();
    }

    @Override
    public boolean isModified() {
        CairoAnalyzerSettingsState settings = CairoAnalyzerSettingsState.getInstance();
        boolean modified = !mySettingsComponent.getLanguageServerPathText().equals(settings.languageServerPath);
        modified |= mySettingsComponent.getCoreLibPathText() != settings.corelibPath;
        return modified;
    }

    @Override
    public void apply() {
        CairoAnalyzerSettingsState settings = CairoAnalyzerSettingsState.getInstance();
        Log.info(settings.corelibPath + "   " + mySettingsComponent.getCoreLibPathText());
        Log.info(settings.languageServerPath + "   " + mySettingsComponent.getLanguageServerPathText());

        if (Objects.equals(settings.corelibPath, mySettingsComponent.getCoreLibPathText())
         && Objects.equals(settings.languageServerPath, mySettingsComponent.getLanguageServerPathText())) {
            return ;
        }

        settings.corelibPath = mySettingsComponent.getCoreLibPathText();
        settings.languageServerPath = mySettingsComponent.getLanguageServerPathText();
        String message = "You have modified the configuration of Cairo Analyzer. You may need to restart IntelliJ IDEA to allow 'Cairo Analyzer' to work again.";
        Messages.showYesNoDialog(message, "Cairo Analyzer", "Ok", "Cancel", Messages.getQuestionIcon());
    }

    @Override
    public void reset() {
        CairoAnalyzerSettingsState settings = CairoAnalyzerSettingsState.getInstance();
        mySettingsComponent.setCoreLibPathText(settings.corelibPath);
        mySettingsComponent.setLanguageServerPathText(settings.languageServerPath);
    }

    @Override
    public void disposeUIResources() {
        mySettingsComponent = null;
    }

    public String getCorellibPathText() {
        return mySettingsComponent.getCoreLibPathText();
    }
    public String getLanguageServerPath() {
        return mySettingsComponent.getLanguageServerPathText();
    }


}