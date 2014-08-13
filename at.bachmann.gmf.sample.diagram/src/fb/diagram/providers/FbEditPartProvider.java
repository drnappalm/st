package fb.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import fb.diagram.edit.parts.FBDiagramEditPart;
import fb.diagram.edit.parts.FbEditPartFactory;
import fb.diagram.part.FbVisualIDRegistry;

/**
 * @generated
 */
public class FbEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public FbEditPartProvider() {
		super(new FbEditPartFactory(), FbVisualIDRegistry.TYPED_INSTANCE,
				FBDiagramEditPart.MODEL_ID);
	}

}
