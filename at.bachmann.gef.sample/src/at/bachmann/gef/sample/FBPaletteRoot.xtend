package at.bachmann.gef.sample

import at.bachmann.gef.sample.model.FB
import org.eclipse.gef.palette.CombinedTemplateCreationEntry
import org.eclipse.gef.palette.MarqueeToolEntry
import org.eclipse.gef.palette.PaletteRoot
import org.eclipse.gef.palette.SelectionToolEntry
import org.eclipse.gef.requests.SimpleFactory
import org.eclipse.gef.ui.palette.editparts.PaletteEditPart.SingleSelectionTracker
import org.eclipse.gef.palette.PaletteEntry
import org.eclipse.gef.palette.PaletteDrawer

class FBPaletteRoot extends PaletteRoot {
	
	new() {	
		var drawer = new PaletteDrawer('General', null)	
		drawer.add(new SelectionToolEntry)
		drawer.add(new MarqueeToolEntry)
		add(drawer)
		
		drawer = new PaletteDrawer('Creation', null)
		drawer.add(new CombinedTemplateCreationEntry('Create FB', 'Create a new function block', new SimpleFactory(FB), null, null))
		add(drawer)		
	}
}
	