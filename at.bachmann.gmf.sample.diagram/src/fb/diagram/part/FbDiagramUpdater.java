package fb.diagram.part;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import fb.Variable;
import fb.diagram.edit.parts.FBEditPart;
import fb.diagram.edit.parts.VariableEditPart;

/**
 * @generated
 */
public class FbDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<FbNodeDescriptor> getSemanticChildren(View view) {
		switch (FbVisualIDRegistry.getVisualID(view)) {
		case FBEditPart.VISUAL_ID:
			return getFB_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FbNodeDescriptor> getFB_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		fb.FB modelElement = (fb.FB) view.getElement();
		LinkedList<FbNodeDescriptor> result = new LinkedList<FbNodeDescriptor>();
		{
			Variable childElement = modelElement.getVariables();
			int visualID = FbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == VariableEditPart.VISUAL_ID) {
				result.add(new FbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FbLinkDescriptor> getContainedLinks(View view) {
		switch (FbVisualIDRegistry.getVisualID(view)) {
		case FBEditPart.VISUAL_ID:
			return getFB_1000ContainedLinks(view);
		case VariableEditPart.VISUAL_ID:
			return getVariable_2001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FbLinkDescriptor> getIncomingLinks(View view) {
		switch (FbVisualIDRegistry.getVisualID(view)) {
		case VariableEditPart.VISUAL_ID:
			return getVariable_2001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FbLinkDescriptor> getOutgoingLinks(View view) {
		switch (FbVisualIDRegistry.getVisualID(view)) {
		case VariableEditPart.VISUAL_ID:
			return getVariable_2001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FbLinkDescriptor> getFB_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FbLinkDescriptor> getVariable_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FbLinkDescriptor> getVariable_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FbLinkDescriptor> getVariable_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<FbNodeDescriptor> getSemanticChildren(View view) {
			return FbDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<FbLinkDescriptor> getContainedLinks(View view) {
			return FbDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<FbLinkDescriptor> getIncomingLinks(View view) {
			return FbDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<FbLinkDescriptor> getOutgoingLinks(View view) {
			return FbDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
