package cairo.psi.mixin.item;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNameIdentifierOwner;
import org.jetbrains.annotations.Nullable;
import cairo.psi.CairoTraitItem;
import cairo.psi.impl.CairoItemImpl;

public abstract class CairoTraitItemMixin extends CairoItemImpl implements CairoTraitItem, PsiNameIdentifierOwner{
    public CairoTraitItemMixin(ASTNode node) {
        super(node);
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
}
