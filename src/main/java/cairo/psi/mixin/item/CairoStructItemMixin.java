package cairo.psi.mixin.item;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNameIdentifierOwner;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import cairo.ide.structure.HasStructureViewChildren;
import cairo.psi.CairoStructBodyBlock;
import cairo.psi.CairoStructItem;
import cairo.psi.impl.CairoItemImpl;

import java.util.Collections;
import java.util.List;

public abstract class CairoStructItemMixin extends CairoItemImpl implements CairoStructItem, PsiNameIdentifierOwner, HasStructureViewChildren {
    public CairoStructItemMixin(ASTNode node) {
        super(node);
    }

    @Override
    public PsiElement setName(@NonNls @NotNull String s) throws IncorrectOperationException {
        return null;
    }

    @Nullable
    @Override
    public String getName() {
        PsiElement nameIdentifier = getNameIdentifier();

        if (nameIdentifier != null) {
            return nameIdentifier.getText();
        }

        return null;
    }

    @Nullable
    @Override
    public PsiElement getNameIdentifier() {
        return getItemName();
    }

    public List<? extends com.intellij.psi.PsiNamedElement> getChildrenItems() {
        CairoStructBodyBlock structBodyBlock = getStructBodyBlock();
        if (structBodyBlock != null) {
            return structBodyBlock.getStructPropertyList();
        }

        return Collections.emptyList();
    }
}