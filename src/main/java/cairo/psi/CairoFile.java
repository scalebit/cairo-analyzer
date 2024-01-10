package cairo.psi;

import com.google.common.collect.ImmutableList;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiNamedElement;
import org.jetbrains.annotations.NotNull;
import cairo.CairoFileType;
import cairo.CairoLanguage;
import cairo.ide.structure.HasStructureViewChildren;

import javax.swing.*;
import java.util.List;

public class CairoFile extends PsiFileBase implements HasStructureViewChildren {
	public CairoFile(@NotNull FileViewProvider fileViewProvider) {
		super(fileViewProvider, CairoLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public FileType getFileType() {
		return CairoFileType.INSTANCE;
	}

	@Override
	public String toString() {
//		return CairoBundle.message("file.name.cairo");
		return "Cairo File";
	}


	@Override
	public Icon getIcon(int flags) {
		return super.getIcon(flags);
	}

    @Override
    public List<? extends PsiNamedElement> getChildrenItems() {
        return ImmutableList.copyOf(findChildrenByClass(PsiNamedElement.class));
    }
}
