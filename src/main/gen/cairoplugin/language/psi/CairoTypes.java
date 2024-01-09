// This is a generated file. Not intended for manual editing.
package cairoplugin.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import cairoplugin.language.psi.impl.*;

public interface CairoTypes {

  IElementType PROPERTY = new CairoElementType("PROPERTY");

  IElementType COMMENT = new CairoTokenType("COMMENT");
  IElementType CRLF = new CairoTokenType("CRLF");
  IElementType KEY = new CairoTokenType("KEY");
  IElementType SEPARATOR = new CairoTokenType("SEPARATOR");
  IElementType VALUE = new CairoTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new CairoPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
