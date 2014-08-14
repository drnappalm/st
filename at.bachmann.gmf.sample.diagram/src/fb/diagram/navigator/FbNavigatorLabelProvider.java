package fb.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import fb.diagram.edit.parts.ConnectionEditPart;
import fb.diagram.edit.parts.FBDiagramEditPart;
import fb.diagram.edit.parts.FBEditPart;
import fb.diagram.edit.parts.FBNameEditPart;
import fb.diagram.edit.parts.INVariableEditPart;
import fb.diagram.edit.parts.INVariableNameEditPart;
import fb.diagram.edit.parts.OUTVariableEditPart;
import fb.diagram.edit.parts.OUTVariableNameEditPart;
import fb.diagram.edit.parts.VariableEditPart;
import fb.diagram.edit.parts.WrappingLabelEditPart;
import fb.diagram.part.FbDiagramEditorPlugin;
import fb.diagram.part.FbVisualIDRegistry;
import fb.diagram.providers.FbElementTypes;
import fb.diagram.providers.FbParserProvider;

/**
 * @generated
 */
public class FbNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		FbDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		FbDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof FbNavigatorItem
				&& !isOwnView(((FbNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof FbNavigatorGroup) {
			FbNavigatorGroup group = (FbNavigatorGroup) element;
			return FbDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof FbNavigatorItem) {
			FbNavigatorItem navigatorItem = (FbNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (FbVisualIDRegistry.getVisualID(view)) {
		case FBDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.bachmann.at/gmf/sample/fb?FBDiagram", FbElementTypes.FBDiagram_1000); //$NON-NLS-1$
		case FBEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.bachmann.at/gmf/sample/fb?FB", FbElementTypes.FB_2001); //$NON-NLS-1$
		case VariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.bachmann.at/gmf/sample/fb?Variable", FbElementTypes.Variable_2002); //$NON-NLS-1$
		case INVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.bachmann.at/gmf/sample/fb?INVariable", FbElementTypes.INVariable_3002); //$NON-NLS-1$
		case OUTVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.bachmann.at/gmf/sample/fb?OUTVariable", FbElementTypes.OUTVariable_3003); //$NON-NLS-1$
		case ConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.bachmann.at/gmf/sample/fb?Connection", FbElementTypes.Connection_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = FbDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& FbElementTypes.isKnownElementType(elementType)) {
			image = FbElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof FbNavigatorGroup) {
			FbNavigatorGroup group = (FbNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof FbNavigatorItem) {
			FbNavigatorItem navigatorItem = (FbNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (FbVisualIDRegistry.getVisualID(view)) {
		case FBDiagramEditPart.VISUAL_ID:
			return getFBDiagram_1000Text(view);
		case FBEditPart.VISUAL_ID:
			return getFB_2001Text(view);
		case VariableEditPart.VISUAL_ID:
			return getVariable_2002Text(view);
		case INVariableEditPart.VISUAL_ID:
			return getINVariable_3002Text(view);
		case OUTVariableEditPart.VISUAL_ID:
			return getOUTVariable_3003Text(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getFBDiagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFB_2001Text(View view) {
		IParser parser = FbParserProvider.getParser(FbElementTypes.FB_2001,
				view.getElement() != null ? view.getElement() : view,
				FbVisualIDRegistry.getType(FBNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getVariable_2002Text(View view) {
		IParser parser = FbParserProvider.getParser(
				FbElementTypes.Variable_2002,
				view.getElement() != null ? view.getElement() : view,
				FbVisualIDRegistry.getType(WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getINVariable_3002Text(View view) {
		IParser parser = FbParserProvider.getParser(
				FbElementTypes.INVariable_3002,
				view.getElement() != null ? view.getElement() : view,
				FbVisualIDRegistry.getType(INVariableNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOUTVariable_3003Text(View view) {
		IParser parser = FbParserProvider.getParser(
				FbElementTypes.OUTVariable_3003,
				view.getElement() != null ? view.getElement() : view,
				FbVisualIDRegistry.getType(OUTVariableNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnection_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return FBDiagramEditPart.MODEL_ID.equals(FbVisualIDRegistry
				.getModelID(view));
	}

}
