package at.bachmann.gef.sample.action

import org.eclipse.draw2d.ConnectionLayer
import org.eclipse.gef.ui.actions.EditorPartAction
import org.eclipse.ui.IEditorPart
import at.bachmann.gef.sample.FBGraphicalEditor
import org.eclipse.draw2d.ConnectionRouter

class FBDiagramChangeRoutingAction extends EditorPartAction {
	
	val Class<? extends ConnectionRouter> routerClass
	
	new(IEditorPart editor, String text, Class<? extends ConnectionRouter> routerClass) {
		super(editor)
		setText(text)
		this.routerClass = routerClass 
	}
	
	override getId() {
		text
	}
	
	override run() {
		connectionLayer.connectionRouter = routerClass.newInstance
	}
	
	override protected calculateEnabled() {
		connectionLayer != null
	}	
	
	def ConnectionLayer getConnectionLayer () {
		var ConnectionLayer connectionLayer = null
		
		val innerEditor = editorPart
		
		switch innerEditor {
			FBGraphicalEditor:
				connectionLayer = innerEditor.connectionLayer
		}
		
		connectionLayer
	}
}