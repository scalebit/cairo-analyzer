package cairo;

import com.intellij.codeInspection.ProblemHighlightType;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import cairo.psi.CairoAttribute;
import cairo.psi.CairoTraitBounds;

public class CairoAnnotator implements Annotator {
	@Override
	public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
		
		if (element instanceof CairoAttribute) {
			holder.createInfoAnnotation(element, null).setTextAttributes(CairoSyntaxHighlighter.ATTRIBUTE);
		}

		if (element instanceof CairoTraitBounds && element.getTextLength() == 1) {
			holder.createWarningAnnotation(element, "By default it is assumed that the value ascribes to no trait bounds").setHighlightType(ProblemHighlightType.WEAK_WARNING);
		}
	}
}
