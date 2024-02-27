package cairo.setting;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Supports storing the application settings in a persistent way.
 * The {@link State} and {@link Storage} annotations define the name of the data and the file name where
 * these persistent application settings are stored.
 */
//该注解定义了持久化文件的存储地址，详情查询持久化数据相关文档：[持久化组件数据](/idea-docs/Part%20II%20—%20Base%20Platform/Persistence/Persisting%20State%20of%20Components.md)
@State(
        name = "org.intellij.sdk.settings.CairoAnalyzerSettingsState",
        storages = @Storage("SdkSettingsPlugin.xml")
)
public class CairoAnalyzerSettingsState implements PersistentStateComponent<CairoAnalyzerSettingsState> {

    public String corelibPath = "";
    public String languageServerPath = "";

    public static CairoAnalyzerSettingsState getInstance() {
        return ApplicationManager.getApplication().getService(CairoAnalyzerSettingsState.class);
    }

    @Nullable
    @Override
    //定义自己为持久化数据类
    public CairoAnalyzerSettingsState getState() {
        return this;
    }

    @Override
    public void loadState(@NotNull CairoAnalyzerSettingsState state) {
        XmlSerializerUtil.copyBean(state, this);
    }

}