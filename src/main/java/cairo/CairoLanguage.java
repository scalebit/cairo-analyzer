package cairo;

import com.intellij.lang.Language;
public class CairoLanguage extends Language {
	public static final CairoLanguage INSTANCE = new CairoLanguage();

	private CairoLanguage() {
		super("Cairo", "text/cairo", "text/x-cairo", "application/x-cairo");
	}

	@Override
	public boolean isCaseSensitive() {
		return true;
	}

	@Override
	public String getDisplayName() {
		return "Cairo";
	}
}
