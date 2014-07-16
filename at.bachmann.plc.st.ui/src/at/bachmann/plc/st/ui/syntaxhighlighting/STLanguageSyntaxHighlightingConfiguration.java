package at.bachmann.plc.st.ui.syntaxhighlighting;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class STLanguageSyntaxHighlightingConfiguration extends
		DefaultHighlightingConfiguration {

	public static final String KEYWORD_ID = "keyword";

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
	}

	@Override
	public TextStyle stringTextStyle() {
		return super.defaultTextStyle().copy();
	}

	@Override
	public TextStyle keywordTextStyle() {
		return super.stringTextStyle().copy();
	}

	@Override
	public TextStyle commentTextStyle() {
		TextStyle style = super.commentTextStyle().copy();
		style.setColor(new RGB(0, 128, 0));
		return style;
	}
}
