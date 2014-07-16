package at.bachmann.plc.st.ui.editing;

import org.eclipse.jface.text.rules.IPartitionTokenScanner;
import org.eclipse.xtext.ui.editor.model.DocumentPartitioner;
import org.eclipse.xtext.ui.editor.model.ITokenTypeToPartitionTypeMapper;

public class STLanguageDocumentPartitioner extends DocumentPartitioner {

	public STLanguageDocumentPartitioner(IPartitionTokenScanner scanner,
			ITokenTypeToPartitionTypeMapper mapper) {
		super(scanner, mapper);
	}

	public STLanguageDocumentPartitioner(IPartitionTokenScanner scanner,
			String[] legalContentTypes) {
		super(scanner, legalContentTypes);
	}
}
