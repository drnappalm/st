package fb.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import fb.Connection;
import fb.FBDiagram;
import fb.FbPackage;
import fb.INVariable;
import fb.OUTVariable;
import fb.Variable;
import fb.diagram.edit.parts.ConnectionEditPart;
import fb.diagram.edit.parts.FBDiagramEditPart;
import fb.diagram.edit.parts.FBEditPart;
import fb.diagram.edit.parts.FBVariablesCompartmentEditPart;
import fb.diagram.edit.parts.INVariableEditPart;
import fb.diagram.edit.parts.OUTVariableEditPart;
import fb.diagram.providers.FbElementTypes;

/**
 * @generated
 */
public class FbDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<FbNodeDescriptor> getSemanticChildren(View view) {
		switch (FbVisualIDRegistry.getVisualID(view)) {
		case FBDiagramEditPart.VISUAL_ID:
			return getFBDiagram_1000SemanticChildren(view);
		case FBVariablesCompartmentEditPart.VISUAL_ID:
			return getFBVariablesCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FbNodeDescriptor> getFBDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		FBDiagram modelElement = (FBDiagram) view.getElement();
		LinkedList<FbNodeDescriptor> result = new LinkedList<FbNodeDescriptor>();
		for (Iterator<?> it = modelElement.getFbs().iterator(); it.hasNext();) {
			fb.FB childElement = (fb.FB) it.next();
			int visualID = FbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FBEditPart.VISUAL_ID) {
				result.add(new FbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FbNodeDescriptor> getFBVariablesCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		fb.FB modelElement = (fb.FB) containerView.getElement();
		LinkedList<FbNodeDescriptor> result = new LinkedList<FbNodeDescriptor>();
		for (Iterator<?> it = modelElement.getVariables().iterator(); it
				.hasNext();) {
			Variable childElement = (Variable) it.next();
			int visualID = FbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OUTVariableEditPart.VISUAL_ID) {
				result.add(new FbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == INVariableEditPart.VISUAL_ID) {
				result.add(new FbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FbLinkDescriptor> getContainedLinks(View view) {
		switch (FbVisualIDRegistry.getVisualID(view)) {
		case FBDiagramEditPart.VISUAL_ID:
			return getFBDiagram_1000ContainedLinks(view);
		case FBEditPart.VISUAL_ID:
			return getFB_2001ContainedLinks(view);
		case OUTVariableEditPart.VISUAL_ID:
			return getOUTVariable_3003ContainedLinks(view);
		case INVariableEditPart.VISUAL_ID:
			return getINVariable_3002ContainedLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FbLinkDescriptor> getIncomingLinks(View view) {
		switch (FbVisualIDRegistry.getVisualID(view)) {
		case FBEditPart.VISUAL_ID:
			return getFB_2001IncomingLinks(view);
		case OUTVariableEditPart.VISUAL_ID:
			return getOUTVariable_3003IncomingLinks(view);
		case INVariableEditPart.VISUAL_ID:
			return getINVariable_3002IncomingLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FbLinkDescriptor> getOutgoingLinks(View view) {
		switch (FbVisualIDRegistry.getVisualID(view)) {
		case FBEditPart.VISUAL_ID:
			return getFB_2001OutgoingLinks(view);
		case OUTVariableEditPart.VISUAL_ID:
			return getOUTVariable_3003OutgoingLinks(view);
		case INVariableEditPart.VISUAL_ID:
			return getINVariable_3002OutgoingLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FbLinkDescriptor> getFBDiagram_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FbLinkDescriptor> getFB_2001ContainedLinks(View view) {
		fb.FB modelElement = (fb.FB) view.getElement();
		LinkedList<FbLinkDescriptor> result = new LinkedList<FbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Connection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FbLinkDescriptor> getOUTVariable_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FbLinkDescriptor> getINVariable_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FbLinkDescriptor> getConnection_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FbLinkDescriptor> getFB_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FbLinkDescriptor> getOUTVariable_3003IncomingLinks(
			View view) {
		OUTVariable modelElement = (OUTVariable) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FbLinkDescriptor> result = new LinkedList<FbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FbLinkDescriptor> getINVariable_3002IncomingLinks(
			View view) {
		INVariable modelElement = (INVariable) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FbLinkDescriptor> result = new LinkedList<FbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FbLinkDescriptor> getConnection_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FbLinkDescriptor> getFB_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FbLinkDescriptor> getOUTVariable_3003OutgoingLinks(
			View view) {
		OUTVariable modelElement = (OUTVariable) view.getElement();
		LinkedList<FbLinkDescriptor> result = new LinkedList<FbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FbLinkDescriptor> getINVariable_3002OutgoingLinks(
			View view) {
		INVariable modelElement = (INVariable) view.getElement();
		LinkedList<FbLinkDescriptor> result = new LinkedList<FbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FbLinkDescriptor> getConnection_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<FbLinkDescriptor> getContainedTypeModelFacetLinks_Connection_4001(
			fb.FB container) {
		LinkedList<FbLinkDescriptor> result = new LinkedList<FbLinkDescriptor>();
		for (Iterator<?> links = container.getConnections().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Connection) {
				continue;
			}
			Connection link = (Connection) linkObject;
			if (ConnectionEditPart.VISUAL_ID != FbVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Variable dst = link.getTarget();
			Variable src = link.getSource();
			result.add(new FbLinkDescriptor(src, dst, link,
					FbElementTypes.Connection_4001,
					ConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FbLinkDescriptor> getIncomingTypeModelFacetLinks_Connection_4001(
			Variable target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FbLinkDescriptor> result = new LinkedList<FbLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != FbPackage.eINSTANCE
					.getConnection_Target()
					|| false == setting.getEObject() instanceof Connection) {
				continue;
			}
			Connection link = (Connection) setting.getEObject();
			if (ConnectionEditPart.VISUAL_ID != FbVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Variable src = link.getSource();
			result.add(new FbLinkDescriptor(src, target, link,
					FbElementTypes.Connection_4001,
					ConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FbLinkDescriptor> getOutgoingTypeModelFacetLinks_Connection_4001(
			Variable source) {
		fb.FB container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof fb.FB) {
				container = (fb.FB) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<FbLinkDescriptor> result = new LinkedList<FbLinkDescriptor>();
		for (Iterator<?> links = container.getConnections().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Connection) {
				continue;
			}
			Connection link = (Connection) linkObject;
			if (ConnectionEditPart.VISUAL_ID != FbVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Variable dst = link.getTarget();
			Variable src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new FbLinkDescriptor(src, dst, link,
					FbElementTypes.Connection_4001,
					ConnectionEditPart.VISUAL_ID));
		}
		return result;
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
