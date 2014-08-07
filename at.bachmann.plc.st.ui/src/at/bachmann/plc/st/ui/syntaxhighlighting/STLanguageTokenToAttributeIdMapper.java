package at.bachmann.plc.st.ui.syntaxhighlighting;

import java.util.Arrays;
import java.util.List;

import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;

public class STLanguageTokenToAttributeIdMapper extends
		AbstractAntlrTokenToAttributeIdMapper {

	private static final List<String> keywords = Arrays.asList("'THIS'",
			"':='", "'USINT'", "'UINT'", "'UDINT'", "'ULINT'", "'SINT'",
			"'INT'", "'DINT'", "'LINT'", "'LREAL'", "'REAL'", "'BYTE'",
			"'WORD'", "'DWORD'", "'LWORD'", "'BOOL'", "'STRING'", "'WSTRING'",
			"'CHAR'", "'WCHAR'", "'TIME'", "'LTIME'", "'TIME_OF_DAY'", "'TOD'",
			"'LTOD'", "'DATE'", "'LDATE'", "'DATE_AND_TIME'", "'DT'", "'LDT'",
			"'T'", "'LT'", "'LTIME_OF_DAY'", "'D'", "'LD'", "'LDATE_AND_TIME'",
			"'TYPE'", "'END_TYPE'", "'STRUCT'", "'OVERLAP'", "'END_STRUCT'",
			"'ARRAY'", "'OF'", "'REF_TO'", "'NULL'", "'REF'", "'VAR_INPUT'",
			"'RETAIN'", "'NON_RETAIN'", "'END_VAR'", "'R_EDGE'", "'F_EDGE'",
			"'VAR_OUTPUT'", "'VAR_IN_OUT'", "'VAR'", "'CONSTANT'",
			"'VAR_TEMP'", "'VAR_EXTERNAL'", "'VAR_GLOBAL'", "'AT'", "'TRUNC'",
			"'ABS'", "'SQRT'", "'LN'", "'LOG'", "'EXP'", "'SIN'", "'COS'",
			"'TAN'", "'ASIN'", "'ACOS'", "'ATAN'", "'ATAN2'", "'ADD'", "'SUB'",
			"'MUL'", "'DIV'", "'MOD'", "'EXPT'", "'MOVE'", "'SHL'", "'SHR'",
			"'ROL'", "'ROR'", "'AND'", "'OR'", "'XOR'", "'NOT'", "'SEL'",
			"'MAX'", "'MIN'", "'LIMIT'", "'MUX'", "'GT'", "'GE'", "'EQ'",
			"'LE'", "'LT'", "'NE'", "'LEN'", "'LEFT'", "'RIGHT'", "'MID'",
			"'CONCAT'", "'INSERT'", "'DELETE'", "'REPLACE'", "'FIND'",
			"'FUNCTION'", "'END_FUNCTION'", "'SR'", "'RS'", "'R_TRIG'",
			"'F_TRIG'", "'CTU'", "'CTD'", "'CTUD'", "'TP'", "'TON'", "'TOF'",
			"'FUNCTION_BLOCK'", "'FINAL'", "'ABSTRACT'", "'EXTENDS'",
			"'IMPLEMENTS'", "'END_FUNCTION_BLOCK'", "'METHOD'", "'OVERRIDE'",
			"'END_METHOD'", "'CLASS'", "'END_CLASS'", "'INTERFACE'",
			"'END_INTERFACE'", "'PUBLIC'", "'PROTECTED'", "'PRIVATE'",
			"'INTERNAL'", "'PROGRAM'", "'END_PROGRAM'", "'VAR_ACCESS'",
			"'CONFIGURATION'", "'END_CONFIGURATION'", "'RESOURCE'", "'ON'",
			"'END_RESOURCE'", "'READ_WRITE'", "'READ_ONLY'", "'TASK'",
			"'SINGLE'", "'INTERVAL'", "'PRIORITY'", "'WITH'", "'=>'",
			"'VAR_CONFIG'", "'NAMESPACE'", "'END_NAMESPACE'", "'USING'",
			"'OR'", "'XOR'", "'&'", "'AND'", "'='", "'<>'", "'<'", "'>'",
			"'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'MOD'", "'**'", "'-'",
			"'+'", "'NOT'", "'SUPER'", "'RETURN'", "'IF'", "'THEN'",
			"'END_IF'", "'ELSIF'", "'ELSE'", "'CASE'", "'END_CASE'", "'EXIT'",
			"'CONTINUE'", "'FOR'", "'DO'", "'END_FOR'", "'TO'", "'BY'",
			"'WHILE'", "'END_WHILE'", "'REPEAT'", "'UNTIL'", "'END_REPEAT'");

	private static final List<String> values = Arrays.asList("RULE_BIN_VALUE",
			"RULE_OCT_VALUE", "RULE_DEC_VALUE", "RULE_HEX_VALUE",
			"RULE_FLOAT_VALUE", "RULE_S_BYTE_CHAR_VALUE",
			"RULE_D_BYTE_CHAR_VALUE", "RULE_INTERVAL", "RULE_DAYTIME_VALUE",
			"RULE_DATE_VALUE", "RULE_DATE_LITERAL", "RULE_LETTER",
			"RULE_OCTAL_DIGIT", "RULE_BIT", "RULE_HEX_DIGIT", "RULE_DIGIT",
			"RULE_FIX_POINT", "RULE_DAYS", "RULE_COMMON_CHAR_VALUE",
			"RULE_SECONDS", "RULE_MILLISECONDS", "RULE_HOURS", "RULE_MINUTES",
			"RULE_MICROSECONDS", "RULE_NANOSECONDS", "'TRUE'", "'FALSE'",
			"'0'", "'1'", "'NULL'");

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if ("RULE_ID".equals(tokenName)) {
			return STLanguageSyntaxHighlightingConfiguration.DEFAULT_ID;
		}
		if ("RULE_SL_COMMENT".equals(tokenName)
				|| "RULE_ML_COMMENT".equals(tokenName)
				|| "RULE_ML_COMMENT_1".equals(tokenName)) {
			return STLanguageSyntaxHighlightingConfiguration.COMMENT_ID;
		}
		if (isValue(tokenName)) {
			return STLanguageSyntaxHighlightingConfiguration.VALUES_ID;
		}
		if (isKeyword(tokenName)) {
			return STLanguageSyntaxHighlightingConfiguration.KEYWORD_ID;
		}
		return STLanguageSyntaxHighlightingConfiguration.DEFAULT_ID;
	}

	private boolean isValue(String tokenName) {
		return values.contains(tokenName);
	}

	private boolean isKeyword(String tokenName) {
		return keywords.contains(tokenName);
	}
}
