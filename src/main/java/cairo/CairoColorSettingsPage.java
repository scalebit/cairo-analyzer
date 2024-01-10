package cairo;

import com.intellij.application.options.colors.InspectionColorSettingsPage;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.intellij.psi.codeStyle.DisplayPriority;
import com.intellij.psi.codeStyle.DisplayPrioritySortable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Collections;
import java.util.Map;

public class CairoColorSettingsPage implements ColorSettingsPage, InspectionColorSettingsPage, DisplayPrioritySortable {
	private static final AttributesDescriptor[] descriptors = new AttributesDescriptor[] {
			new AttributesDescriptor("Keyword", CairoSyntaxHighlighter.KEYWORD),
			new AttributesDescriptor("Identifier", CairoSyntaxHighlighter.IDENTIFIER),
			new AttributesDescriptor("Block_comment", CairoSyntaxHighlighter.BLOCK_COMMENT),
			new AttributesDescriptor("Line_comment", CairoSyntaxHighlighter.LINE_COMMENT),
			new AttributesDescriptor("Doc_comment", CairoSyntaxHighlighter.DOC_COMMENT),
			new AttributesDescriptor("String", CairoSyntaxHighlighter.STRING),
			new AttributesDescriptor("Number", CairoSyntaxHighlighter.NUMBER),
			new AttributesDescriptor("Brackets", CairoSyntaxHighlighter.BRACKETS),
			new AttributesDescriptor("Braces", CairoSyntaxHighlighter.BRACES),
			new AttributesDescriptor("Parentheses", CairoSyntaxHighlighter.PARENTHESES),
			new AttributesDescriptor("Comma", CairoSyntaxHighlighter.COMMA),
			new AttributesDescriptor("Symbol", CairoSyntaxHighlighter.SYMBOL),
			new AttributesDescriptor("Semicolon", CairoSyntaxHighlighter.SEMICOLON),
			new AttributesDescriptor("Operator", CairoSyntaxHighlighter.OPERATOR),
			new AttributesDescriptor("Path_separator", CairoSyntaxHighlighter.PATH_SEPARATOR),
			new AttributesDescriptor("Attribute", CairoSyntaxHighlighter.ATTRIBUTE),
			new AttributesDescriptor("Delimiter", CairoSyntaxHighlighter.DELIMITER),
			new AttributesDescriptor("ExprCall", CairoSyntaxHighlighter.EXPR_CALL),
			new AttributesDescriptor("Bad_char", CairoSyntaxHighlighter.BAD_CHAR),
	};

	@Nullable
	@Override
	public Icon getIcon() {
		return CairoIcons.ICON_CAIRO_16;
	}

	@NotNull
	@Override
	public SyntaxHighlighter getHighlighter() {
		return new CairoSyntaxHighlighter();
	}

	@NotNull
	@Override
	public String getDemoText() {
		return "use std::rand;\n" +
				"\n" +
				"/**\n" +
				" * Our main function\n" +
				" */\n" +
				"fn main() {\n" +
				"    println!(\"Hello world!\"); // Typical first line\n" +
				"    /* This is a very long comment\n" +
				"    in two lines */\n" +
				"    let rng : f32 = rand::random();\n" +
				"    println(\"My random number {}, a tuple {} and a char {}\", rng + 42, (1, 2), 'i');\n" +
				"}\n";
	}

	@Nullable
	@Override
	public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
		return Collections.emptyMap();
	}

	@NotNull
	@Override
	public AttributesDescriptor[] getAttributeDescriptors() {
		return descriptors;
	}

	@NotNull
	@Override
	public ColorDescriptor[] getColorDescriptors() {
		return ColorDescriptor.EMPTY_ARRAY;
	}

	@NotNull
	@Override
	public String getDisplayName() {
		return "Cairo";
	}

	@Override
	public DisplayPriority getPriority() {
		return DisplayPriority.KEY_LANGUAGE_SETTINGS;
	}


}
