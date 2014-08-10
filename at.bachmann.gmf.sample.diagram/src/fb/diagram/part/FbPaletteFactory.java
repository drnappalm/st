package fb.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

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
		paletteContainer.add(createFBVariables2CreationTool());
		paletteContainer.add(createVariable3CreationTool());
		paletteContainer.add(createFBFbsTo4CreationTool());
		paletteContainer.add(createFBFbsFrom5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFB1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.FB1CreationTool_title, Messages.FB1CreationTool_desc,
				Collections.singletonList(FbElementTypes.Variable_2001));
		entry.setId("createFB1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FbElementTypes
				.getImageDescriptor(FbElementTypes.Variable_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFBVariables2CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.FBVariables2CreationTool_title,
				Messages.FBVariables2CreationTool_desc, null, null) {
		};
		entry.setId("createFBVariables2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVariable3CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Variable3CreationTool_title,
				Messages.Variable3CreationTool_desc, null, null) {
		};
		entry.setId("createVariable3CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFBFbsTo4CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.FBFbsTo4CreationTool_title,
				Messages.FBFbsTo4CreationTool_desc, null, null) {
		};
		entry.setId("createFBFbsTo4CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFBFbsFrom5CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.FBFbsFrom5CreationTool_title,
				Messages.FBFbsFrom5CreationTool_desc, null, null) {
		};
		entry.setId("createFBFbsFrom5CreationTool"); //$NON-NLS-1$
		return entry;
	}

}
