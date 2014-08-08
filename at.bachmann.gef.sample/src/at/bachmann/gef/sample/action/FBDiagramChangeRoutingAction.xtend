package at.bachmann.gef.sample.action

import org.eclipse.draw2d.ConnectionLayer
import at.bachmann.gef.sample.FBGraphicalEditor
import org.eclipse.draw2d.ConnectionRouter
import org.eclipse.ui.actions.RetargetAction
import org.eclipse.ui.IWorkbenchPart
import org.eclipse.swt.widgets.Event

class FBDiagramChangeRoutingAction extends RetargetAction {
	
	val Class<? extends ConnectionRouter> routerClass
	var ConnectionLayer connectionLayer = null	
	
	new(String text, Class<? extends ConnectionRouter> routerClass) {
		super(text, text)
		this.routerClass = routerClass 
	}
	
	override getId() {
		text
	}
	
	override run() {
		exec
	}
	
	override runWithEvent(Event event) {
		exec
	}
	
	def exec() {
		connectionLayer.connectionRouter = RouterFactory.createRouter(connectionLayer.parent, routerClass.name)
	}
	
	
	override isEnabled() {
		calculateEnabled
	}	
	
	override partActivated(IWorkbenchPart part) {
		if(part instanceof FBGraphicalEditor) {
			connectionLayer = (part as FBGraphicalEditor).connectionLayer
		} else {
			connectionLayer = null
		}
		
		enabled = calculateEnabled 		
	}
	
	override partDeactivated(IWorkbenchPart part) {
		enabled = calculateEnabled
	}
	
	def calculateEnabled () {
		connectionLayer != null
	}
}