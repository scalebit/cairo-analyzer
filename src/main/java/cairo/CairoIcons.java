package cairo;

import com.intellij.openapi.util.IconLoader;
import com.intellij.psi.PsiElement;
import com.intellij.util.PlatformIcons;
import org.jetbrains.annotations.Nullable;
import cairo.psi.*;

import javax.swing.*;

public class CairoIcons {
	public static final Icon ICON_CAIRO_16 = IconLoader.getIcon("/META-INF/cairo-file-logo.png");
	public static final Icon ICON_CAIRO_24 = IconLoader.getIcon("/vektah/cairo/icons/logo24.png");
	public static final Icon ICON_CAIRO_32 = IconLoader.getIcon("/vektah/cairo/icons/logo32.png");
	public static final Icon ICON_CAIRO_48 = IconLoader.getIcon("/vektah/cairo/icons/logo48.png");
	public static final Icon ICON_CARGO_16 = IconLoader.getIcon("/vektah/cairo/icons/cargo16.png");

    // TODO: Replace the following items with proper icons
    public static final Icon ICON_MODULE = PlatformIcons.PACKAGE_ICON;
    public static final Icon ICON_STRUCT = PlatformIcons.CLASS_ICON;
    private static final Icon ICON_METHOD = PlatformIcons.METHOD_ICON;
    private static final Icon ICON_FUNCTION = PlatformIcons.FUNCTION_ICON;
    private static final Icon ICON_IMPL = PlatformIcons.CLASS_ICON;
    private static final Icon ICON_TRAIT = PlatformIcons.INTERFACE_ICON;
    private static final Icon ICON_STATIC = PlatformIcons.VARIABLE_ICON;
    private static final Icon ICON_ENUM = PlatformIcons.ENUM_ICON;
    private static final Icon ICON_PROPERTY = PlatformIcons.PROPERTY_ICON;

    @Nullable
    public static Icon forNode(PsiElement psiElement) {
        if (psiElement instanceof CairoModItem) {
            return ICON_MODULE;
        } else if (psiElement instanceof CairoStructItem) {
            return ICON_STRUCT;
        } else if (psiElement instanceof CairoFnItem
                && psiElement.getParent() instanceof CairoImplBody) {
            return ICON_METHOD;
        } else if (psiElement instanceof CairoFnItem) {
            return ICON_FUNCTION;
        } else if (psiElement instanceof CairoImplItem) {
            return ICON_IMPL;
        } else if (psiElement instanceof CairoTraitItem) {
            return ICON_TRAIT;
        } else if (psiElement instanceof CairoStaticItem) {
            return ICON_STATIC;
        } else if (psiElement instanceof CairoEnumItem) {
            return ICON_ENUM;
        } else if (psiElement instanceof CairoStructProperty) {
            return ICON_PROPERTY;
        } else if (psiElement instanceof CairoFile) {
            return ICON_CAIRO_16;
        }

        return null;
    }
}
