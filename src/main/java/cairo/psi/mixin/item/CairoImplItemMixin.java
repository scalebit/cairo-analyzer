package cairo.psi.mixin.item;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import cairo.ide.structure.HasStructureViewChildren;
import cairo.psi.CairoImplItem;
import cairo.psi.CairoType;
import cairo.psi.impl.CairoItemImpl;

import java.util.Collections;
import java.util.List;

public abstract class CairoImplItemMixin extends CairoItemImpl implements CairoImplItem, PsiNamedElement, HasStructureViewChildren {
    public CairoImplItemMixin(ASTNode node) {
        super(node);
    }

    @Override
    public PsiElement setName(@NonNls @NotNull String s) throws IncorrectOperationException {
        return null;
    }

    @Override
    public String getName() {
        CairoType type = getType();

        if (type != null) {
            return type.getText();
        }

        return null;
    }

    @Override
    public List<? extends PsiNamedElement> getChildrenItems() {
        if (getImplBlock() == null) {
            return Collections.emptyList();
        }

        return getImplBlock().getImplBody().getFnItemList();
    }
}
