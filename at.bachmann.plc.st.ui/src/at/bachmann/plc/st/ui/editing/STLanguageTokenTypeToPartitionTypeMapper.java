package at.bachmann.plc.st.ui.editing;

import org.eclipse.jface.text.IDocument;
import org.eclipse.xtext.ui.editor.model.ITokenTypeToPartitionTypeMapper;
import org.eclipse.xtext.ui.editor.model.ITokenTypeToPartitionTypeMapperExtension;
import org.eclipse.xtext.ui.editor.model.TokenTypeToStringMapper;

public class STLanguageTokenTypeToPartitionTypeMapper extends
		TokenTypeToStringMapper implements ITokenTypeToPartitionTypeMapper,
		ITokenTypeToPartitionTypeMapperExtension {

	public final static String VARIABLES_PARTITION = "__variables";

	protected static final String[] SUPPORTED_PARTITIONS = new String[] {
			VARIABLES_PARTITION, IDocument.DEFAULT_CONTENT_TYPE };

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		// if ("RULE_ML_COMMENT".equals(tokenName)) {
		// return COMMENT_PARTITION;
		// } else if ("RULE_SL_COMMENT".equals(tokenName)) {
		// return SL_COMMENT_PARTITION;
		// } else if ("RULE_STRING".equals(tokenName)) {
		// return STRING_LITERAL_PARTITION;
		// }
		return IDocument.DEFAULT_CONTENT_TYPE;
	}

	public String[] getSupportedPartitionTypes() {
		return SUPPORTED_PARTITIONS;
	}

	@Override
	public boolean isMultiLineComment(String partitionType) {
		return false;
	}

	@Override
	public boolean isSingleLineComment(String partitionType) {
		return false;
	}

	@Override
	public String getPartitionType(int antlrTokenType) {
		return getMappedValue(antlrTokenType);
	}
}
