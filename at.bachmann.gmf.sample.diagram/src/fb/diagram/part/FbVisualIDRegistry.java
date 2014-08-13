package fb.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import fb.FBDiagram;
import fb.FbPackage;
import fb.diagram.edit.parts.ConnectionEditPart;
import fb.diagram.edit.parts.FBDiagramEditPart;
import fb.diagram.edit.parts.FBEditPart;
import fb.diagram.edit.parts.FBNameEditPart;
import fb.diagram.edit.parts.FBVariablesCompartmentEditPart;
import fb.diagram.edit.parts.INVariableEditPart;
import fb.diagram.edit.parts.INVariableNameEditPart;
import fb.diagram.edit.parts.OUTVariableEditPart;
import fb.diagram.edit.parts.OUTVariableNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented by
 * a domain model object.
 * 
 * @generated
 */
public class FbVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "at.bachmann.gmf.sample.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (FBDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return FBDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return fb.diagram.part.FbVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				FbDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (FbPackage.eINSTANCE.getFBDiagram().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((FBDiagram) domainElement)) {
			return FBDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = fb.diagram.part.FbVisualIDRegistry
				.getModelID(containerView);
		if (!FBDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (FBDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = fb.diagram.part.FbVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = FBDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case FBDiagramEditPart.VISUAL_ID:
			if (FbPackage.eINSTANCE.getFB().isSuperTypeOf(
					domainElement.eClass())) {
				return FBEditPart.VISUAL_ID;
			}
			break;
		case FBVariablesCompartmentEditPart.VISUAL_ID:
			if (FbPackage.eINSTANCE.getOUTVariable().isSuperTypeOf(
					domainElement.eClass())) {
				return OUTVariableEditPart.VISUAL_ID;
			}
			if (FbPackage.eINSTANCE.getINVariable().isSuperTypeOf(
					domainElement.eClass())) {
				return INVariableEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = fb.diagram.part.FbVisualIDRegistry
				.getModelID(containerView);
		if (!FBDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (FBDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = fb.diagram.part.FbVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = FBDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case FBDiagramEditPart.VISUAL_ID:
			if (FBEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FBEditPart.VISUAL_ID:
			if (FBNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FBVariablesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OUTVariableEditPart.VISUAL_ID:
			if (OUTVariableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case INVariableEditPart.VISUAL_ID:
			if (INVariableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FBVariablesCompartmentEditPart.VISUAL_ID:
			if (OUTVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (INVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (FbPackage.eINSTANCE.getConnection().isSuperTypeOf(
				domainElement.eClass())) {
			return ConnectionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(FBDiagram element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case FBVariablesCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case FBDiagramEditPart.VISUAL_ID:
			return false;
		case INVariableEditPart.VISUAL_ID:
		case OUTVariableEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return fb.diagram.part.FbVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return fb.diagram.part.FbVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return fb.diagram.part.FbVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return fb.diagram.part.FbVisualIDRegistry.checkNodeVisualID(
					containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return fb.diagram.part.FbVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return fb.diagram.part.FbVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
