package cairo.psi.mixin.item;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNameIdentifierOwner;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import cairo.ide.structure.HasStructureViewChildren;
import cairo.psi.CairoModItem;
import cairo.psi.CairoTokens;
import cairo.psi.impl.CairoItemImpl;

import java.util.List;

public abstract class CairoModItemMixin extends CairoItemImpl implements CairoModItem, PsiNameIdentifierOwner, HasStructureViewChildren{
    public CairoModItemMixin(ASTNode node) {
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
        List<PsiElement> children = findChildrenByType(CairoTokens.IDENTIFIER);

        if (children.size() == 0) return null;

        return children.get(children.size()-1);
    }

    @Override
    public List<? extends com.intellij.psi.PsiNamedElement> getChildrenItems() {
        return getItemList();
    }
}
