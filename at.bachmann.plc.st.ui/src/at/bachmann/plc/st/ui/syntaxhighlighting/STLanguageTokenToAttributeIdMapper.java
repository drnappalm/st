package at.bachmann.plc.st.ui.syntaxhighlighting;

import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;

public class STLanguageTokenToAttributeIdMapper extends
		AbstractAntlrTokenToAttributeIdMapper {

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if ("RULE_STRING".equals(tokenName)) {
			return STLanguageSyntaxHighlightingConfiguration.STRING_ID;
		}
		if ("RULE_INT".equals(tokenName)) {
			return STLanguageSyntaxHighlightingConfiguration.NUMBER_ID;
		}
		if ("RULE_ID".equals(tokenName)) {
			return STLanguageSyntaxHighlightingConfiguration.DEFAULT_ID;
		}
		if ("RULE_INT".equals(tokenName)) {
			return STLanguageSyntaxHighlightingConfiguration.NUMBER_ID;
		}
		if ("RULE_COMMENT_T".equals(tokenName)
				|| "RULE_SL_COMMENT".equals(tokenName)
				|| "RULE_ML_COMMENT".equals(tokenName)) {
			return STLanguageSyntaxHighlightingConfiguration.COMMENT_ID;
		}
		if (isKeyword(tokenName)) {
			return STLanguageSyntaxHighlightingConfiguration.KEYWORD_ID;
		}
		return STLanguageSyntaxHighlightingConfiguration.DEFAULT_ID;
	}

	private boolean isKeyword(String tokenName) {
		switch (tokenName) {
		case "'PROGRAM'":
		case "'VAR'":
		case "'END_VAR'":
		case "'VAR_INPUT'":
		case "'DATATYPE":
		case "'CONSTANT'":
		case "'RETAIN'":
		case "'PERSISTENT'":
		case "'REDUEX'":
			return true;
		default:
			return false;
		}
	}
}
