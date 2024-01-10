package cairo.psi.mixin.item;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import cairo.psi.CairoItem;

public abstract class CairoItemMixin extends ASTWrapperPsiElement implements CairoItem, PsiNamedElement {
    public CairoItemMixin(ASTNode node) {
        super(node);
    }

    @Override
    public PsiElement setName(@NonNls @NotNull String s) throws IncorrectOperationException {
        return null;
    }

    @Nullable
    @Override
    public String getName() {
        return null;
    }
}
