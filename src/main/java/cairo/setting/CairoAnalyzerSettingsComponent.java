package cairo.setting;

import com.intellij.ui.components.JBCheckBox;
import com.intellij.ui.components.JBLabel;
import com.intellij.ui.components.JBTextField;
import com.intellij.util.ui.FormBuilder;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Supports creating and managing a {@link JPanel} for the Settings Dialog.
 */
public class CairoAnalyzerSettingsComponent {

    private final JPanel myMainPanel;
    private final JBTextField cairoCorelibPath = new JBTextField();
    private final JBTextField cairoLanguageServerPath = new JBTextField();

    public CairoAnalyzerSettingsComponent() {
        myMainPanel = FormBuilder.createFormBuilder()
                .addLabeledComponent(new JBLabel("cairo1.corelibPath"), cairoCorelibPath, 1, false)
                .addLabeledComponent(new JBLabel("languageServerPath"), cairoLanguageServerPath, 1, false)
//                .addComponent(myIdeaUserStatus, 1)
                .addComponentFillVertically(new JPanel(), 0)
                .getPanel();
    }

    public JPanel getPanel() {
        return myMainPanel;
    }

    public JComponent getPreferredFocusedComponent() {
        return cairoLanguageServerPath;
    }

    @NotNull
    public String getCoreLibPathText() {
        return cairoCorelibPath.getText();
    }

    public void setCoreLibPathText(@NotNull String newText) {
        cairoCorelibPath.setText(newText);
    }

    @NotNull
    public String getLanguageServerPathText() {
        return cairoLanguageServerPath.getText();
    }

    public void setLanguageServerPathText(@NotNull String newText) {
        cairoLanguageServerPath.setText(newText);
    }



}