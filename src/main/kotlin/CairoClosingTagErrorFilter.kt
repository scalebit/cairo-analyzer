package cairo;

import com.intellij.codeInsight.highlighting.HighlightErrorFilter
import com.intellij.psi.PsiErrorElement


internal class CairoClosingTagErrorFilter : HighlightErrorFilter() {
    override fun shouldHighlightErrorElement(element: PsiErrorElement): Boolean {
        return false;
    }
}