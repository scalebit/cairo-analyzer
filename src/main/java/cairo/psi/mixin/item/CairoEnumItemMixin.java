package cairo.psi.mixin.item;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNameIdentifierOwner;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import cairo.psi.CairoEnumItem;
import cairo.psi.impl.CairoItemImpl;

public abstract class CairoEnumItemMixin extends CairoItemImpl implements CairoEnumItem, PsiNameIdentifierOwner {
    public CairoEnumItemMixin(ASTNode node) {
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

    @Override
    public PsiElement setName(@NonNls @NotNull String s) throws IncorrectOperationException {
        return null;
    }
}
