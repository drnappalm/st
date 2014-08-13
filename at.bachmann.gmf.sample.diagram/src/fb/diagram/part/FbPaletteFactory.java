package fb.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import fb.diagram.providers.FbElementTypes;

/**
 * @generated
 */
public class FbPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createFb1Group());
		paletteRoot.add(createConnection2Group());
	}

	/**
	 * Creates "fb" palette tool group
	 * @generated
	 */
	private PaletteContainer createFb1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Fb1Group_title);
		paletteContainer.setId("createFb1Group"); //$NON-NLS-1$
		paletteContainer.add(createFB1CreationTool());
		paletteContainer.add(createINVariable2CreationTool());
		paletteContainer.add(createOUTVariable3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connection" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnection2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Connection2Group_title);
		paletteContainer.setId("createConnection2Group"); //$NON-NLS-1$
		paletteContainer.add(createConnection1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFB1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.FB1CreationTool_title,
				Messages.FB1CreationTool_desc,
				Collections.singletonList(FbElementTypes.FB_2001));
		entry.setId("createFB1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FbElementTypes
				.getImageDescriptor(FbElementTypes.FB_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createINVariable2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.INVariable2CreationTool_title,
				Messages.INVariable2CreationTool_desc,
				Collections.singletonList(FbElementTypes.INVariable_3002));
		entry.setId("createINVariable2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FbElementTypes
				.getImageDescriptor(FbElementTypes.INVariable_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOUTVariable3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.OUTVariable3CreationTool_title,
				Messages.OUTVariable3CreationTool_desc,
				Collections.singletonList(FbElementTypes.OUTVariable_3003));
		entry.setId("createOUTVariable3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FbElementTypes
				.getImageDescriptor(FbElementTypes.OUTVariable_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnection1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Connection1CreationTool_title,
				Messages.Connection1CreationTool_desc,
				Collections.singletonList(FbElementTypes.Connection_4001));
		entry.setId("createConnection1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FbElementTypes
				.getImageDescriptor(FbElementTypes.Connection_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
