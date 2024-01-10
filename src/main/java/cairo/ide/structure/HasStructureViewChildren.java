package cairo.ide.structure;

import com.intellij.psi.PsiNamedElement;

import java.util.List;

public interface HasStructureViewChildren {
    public List<? extends PsiNamedElement> getChildrenItems();
}
