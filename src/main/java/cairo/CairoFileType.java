package cairo;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class CairoFileType extends LanguageFileType {
	public static final CairoFileType INSTANCE = new CairoFileType();

	private CairoFileType() {
		super(CairoLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public String getName() {
		return "Cairo File";
	}

	@NotNull
	@Override
	public String getDescription() {
		return "Cairo language source code";
	}

	@NotNull
	@Override
	public String getDefaultExtension() {
		return "cairo";
	}

	@Nullable
	@Override
	public Icon getIcon() {
		return CairoIcons.ICON_CAIRO_16;
	}
}
