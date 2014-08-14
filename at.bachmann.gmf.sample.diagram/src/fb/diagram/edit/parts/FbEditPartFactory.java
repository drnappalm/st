package fb.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import fb.diagram.part.FbVisualIDRegistry;

/**
 * @generated
 */
public class FbEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (FbVisualIDRegistry.getVisualID(view)) {

			case FBDiagramEditPart.VISUAL_ID:
				return new FBDiagramEditPart(view);

			case FBEditPart.VISUAL_ID:
				return new FBEditPart(view);

			case FBNameEditPart.VISUAL_ID:
				return new FBNameEditPart(view);

			case VariableEditPart.VISUAL_ID:
				return new VariableEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case OUTVariableEditPart.VISUAL_ID:
				return new OUTVariableEditPart(view);

			case OUTVariableNameEditPart.VISUAL_ID:
				return new OUTVariableNameEditPart(view);

			case INVariableEditPart.VISUAL_ID:
				return new INVariableEditPart(view);

			case INVariableNameEditPart.VISUAL_ID:
				return new INVariableNameEditPart(view);

			case FBVariablesCompartmentEditPart.VISUAL_ID:
				return new FBVariablesCompartmentEditPart(view);

			case ConnectionEditPart.VISUAL_ID:
				return new ConnectionEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
