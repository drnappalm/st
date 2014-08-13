package fb.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import fb.diagram.providers.FbElementTypes;
import fb.diagram.providers.FbModelingAssistantProvider;

/**
 * @generated
 */
public class FbModelingAssistantProviderOfFBDiagramEditPart extends
		FbModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(FbElementTypes.FB_2001);
		return types;
	}

}
