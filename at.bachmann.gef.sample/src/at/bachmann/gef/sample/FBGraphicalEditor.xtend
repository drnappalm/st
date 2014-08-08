package at.bachmann.gef.sample

import at.bachmann.gef.sample.controller.FBDiagramEditPart
import at.bachmann.gef.sample.controller.FBEditPartFactory
import at.bachmann.gef.sample.model.FBDiagram
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.draw2d.ConnectionLayer
import org.eclipse.draw2d.ManhattanConnectionRouter
import org.eclipse.gef.DefaultEditDomain
import org.eclipse.gef.LayerConstants
import org.eclipse.gef.dnd.TemplateTransferDragSourceListener
import org.eclipse.gef.dnd.TemplateTransferDropTargetListener
import org.eclipse.gef.editparts.LayerManager
import org.eclipse.gef.ui.parts.GraphicalEditorWithPalette
import org.eclipse.gef.ui.parts.GraphicalViewerKeyHandler

class FBGraphicalEditor extends GraphicalEditorWithPalette {
	
	new() {
		editDomain = new DefaultEditDomain(this)
	}
	
	override protected getPaletteRoot() {
		new FBPaletteRoot
	}
	
	def getConnectionLayer() {
		val layerManager = graphicalViewer.rootEditPart as LayerManager
		layerManager.getLayer(LayerConstants.CONNECTION_LAYER) as ConnectionLayer
	}
	
	override protected initializeGraphicalViewer() {
		val diagramEditPart = new FBDiagramEditPart
		diagramEditPart.model = FBDiagram.activeInstance

		graphicalViewer.editPartFactory = FBEditPartFactory.activeInstance
		graphicalViewer.contents = diagramEditPart;
		connectionLayer.connectionRouter = new ManhattanConnectionRouter
		graphicalViewer.keyHandler = new GraphicalViewerKeyHandler(graphicalViewer)
		graphicalViewer.addDropTargetListener(new TemplateTransferDropTargetListener(graphicalViewer))
	}
	
	override protected initializePaletteViewer() {
		paletteViewer.addDragSourceListener(new TemplateTransferDragSourceListener(paletteViewer))
		
	}
	
	override doSave(IProgressMonitor monitor) {
	}
	
	override getEditorInput() {
		super.getEditorInput()
	}	
}