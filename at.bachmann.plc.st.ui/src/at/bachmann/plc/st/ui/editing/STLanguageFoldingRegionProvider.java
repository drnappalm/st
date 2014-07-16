package at.bachmann.plc.st.ui.editing;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.folding.DefaultFoldingRegionProvider;
import org.eclipse.xtext.ui.editor.folding.IFoldingRegionAcceptor;
import org.eclipse.xtext.util.ITextRegion;

public class STLanguageFoldingRegionProvider extends
		DefaultFoldingRegionProvider {

	@Override
	protected void computeObjectFolding(EObject eObject,
			IFoldingRegionAcceptor<ITextRegion> foldingRegionAcceptor) {

		super.computeObjectFolding(eObject, foldingRegionAcceptor);
	}
}
