package at.bachmann.plc.st.ui.editing;

import org.eclipse.core.filebuffers.IDocumentSetupParticipant;
import org.eclipse.jface.text.IDocument;
import org.eclipse.xtext.ui.editor.model.PartitionTokenScanner;

public class STLanguageDocumentSetupParticipant implements
		IDocumentSetupParticipant {

	@Override
	public void setup(IDocument document) {
		STLanguageTokenTypeToPartitionTypeMapper mapper = new STLanguageTokenTypeToPartitionTypeMapper();
		PartitionTokenScanner scanner = new PartitionTokenScanner();
		scanner.setMapper(mapper);
		STLanguageDocumentPartitioner partitioner = new STLanguageDocumentPartitioner(
				scanner, mapper);
		partitioner.connect(document);
	}
}
