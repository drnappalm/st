package at.bachmann.gef.sample

import at.bachmann.gef.sample.model.FB
import org.eclipse.gef.palette.CombinedTemplateCreationEntry
import org.eclipse.gef.palette.MarqueeToolEntry
import org.eclipse.gef.palette.PaletteDrawer
import org.eclipse.gef.palette.PaletteRoot
import org.eclipse.gef.palette.SelectionToolEntry
import org.eclipse.gef.requests.SimpleFactory
import org.eclipse.gef.palette.ConnectionCreationToolEntry
import at.bachmann.gef.sample.model.FBConnection
import org.eclipse.gef.tools.ConnectionDragCreationTool

class FBPaletteRoot extends PaletteRoot {
	
	new() {	
		var drawer = new PaletteDrawer('General', null)	
		
		drawer.add(new SelectionToolEntry)
		drawer.add(new MarqueeToolEntry)		
		add(drawer)
		
		drawer = new PaletteDrawer('Creation', null)
		drawer.add(new ConnectionCreationToolEntry('New Connection', 'Create a new connection between two selected nodes or from source to target nodes.', new SimpleFactory(FBConnection) , null, null))
		drawer.add(new CombinedTemplateCreationEntry('New FB', 'Create a new function block', new SimpleFactory(FB), null, null))		
		add(drawer)		
	}
}
	