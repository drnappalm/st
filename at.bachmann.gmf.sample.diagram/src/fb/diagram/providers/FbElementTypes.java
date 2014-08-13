package fb.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import fb.FbPackage;
import fb.diagram.edit.parts.ConnectionEditPart;
import fb.diagram.edit.parts.FBDiagramEditPart;
import fb.diagram.edit.parts.FBEditPart;
import fb.diagram.edit.parts.INVariableEditPart;
import fb.diagram.edit.parts.OUTVariableEditPart;
import fb.diagram.part.FbDiagramEditorPlugin;

/**
 * @generated
 */
public class FbElementTypes {

	/**
	 * @generated
	 */
	private FbElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			FbDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType FBDiagram_1000 = getElementType("at.bachmann.gmf.sample.diagram.FBDiagram_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FB_2001 = getElementType("at.bachmann.gmf.sample.diagram.FB_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OUTVariable_3003 = getElementType("at.bachmann.gmf.sample.diagram.OUTVariable_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType INVariable_3002 = getElementType("at.bachmann.gmf.sample.diagram.INVariable_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Connection_4001 = getElementType("at.bachmann.gmf.sample.diagram.Connection_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(FBDiagram_1000, FbPackage.eINSTANCE.getFBDiagram());

			elements.put(FB_2001, FbPackage.eINSTANCE.getFB());

			elements.put(OUTVariable_3003, FbPackage.eINSTANCE.getOUTVariable());

			elements.put(INVariable_3002, FbPackage.eINSTANCE.getINVariable());

			elements.put(Connection_4001, FbPackage.eINSTANCE.getConnection());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(FBDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(FB_2001);
			KNOWN_ELEMENT_TYPES.add(OUTVariable_3003);
			KNOWN_ELEMENT_TYPES.add(INVariable_3002);
			KNOWN_ELEMENT_TYPES.add(Connection_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case FBDiagramEditPart.VISUAL_ID:
			return FBDiagram_1000;
		case FBEditPart.VISUAL_ID:
			return FB_2001;
		case OUTVariableEditPart.VISUAL_ID:
			return OUTVariable_3003;
		case INVariableEditPart.VISUAL_ID:
			return INVariable_3002;
		case ConnectionEditPart.VISUAL_ID:
			return Connection_4001;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return fb.diagram.providers.FbElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return fb.diagram.providers.FbElementTypes.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return fb.diagram.providers.FbElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
