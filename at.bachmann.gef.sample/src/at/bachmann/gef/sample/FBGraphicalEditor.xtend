package at.bachmann.gef.sample

import org.eclipse.gef.ui.parts.GraphicalEditorWithPalette
import org.eclipse.core.runtime.IProgressMonitor
import at.bachmann.gef.sample.controller.FBEditPartFactory
import org.eclipse.gef.DefaultEditDomain
import at.bachmann.gef.sample.controller.FBDiagramEditPart
import at.bachmann.gef.sample.model.FBDiagram
import org.eclipse.gef.ui.parts.GraphicalViewerKeyHandler

class FBGraphicalEditor extends GraphicalEditorWithPalette {
	
	new() {
		editDomain = new DefaultEditDomain(this)
	}
	
	override protected getPaletteRoot() {
		new FBPaletteRoot
	}
	
	override protected configureGraphicalViewer() {
		super.configureGraphicalViewer
		graphicalViewer.editPartFactory = new FBEditPartFactory
	}
	
	override protected initializeGraphicalViewer() {
		val diagramEditPart = new FBDiagramEditPart
		diagramEditPart.model = FBDiagram.activeInstance
		
		graphicalViewer.contents = diagramEditPart 
		graphicalViewer.keyHandler = new GraphicalViewerKeyHandler(graphicalViewer)
	}
	
	override doSave(IProgressMonitor monitor) {
	}	
}