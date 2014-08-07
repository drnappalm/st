package at.bachmann.gef.sample.controller

import at.bachmann.gef.sample.editpolicy.FBComponentEditPolicy
import at.bachmann.gef.sample.editpolicy.FBConnectionComponentEditPolicy
import at.bachmann.gef.sample.model.FB
import at.bachmann.gef.sample.view.FBFigure
import java.beans.PropertyChangeEvent
import java.beans.PropertyChangeListener
import org.eclipse.draw2d.ChopboxAnchor
import org.eclipse.draw2d.geometry.Rectangle
import org.eclipse.gef.ConnectionEditPart
import org.eclipse.gef.EditPolicy
import org.eclipse.gef.GraphicalEditPart
import org.eclipse.gef.NodeEditPart
import org.eclipse.gef.Request
import org.eclipse.gef.editparts.AbstractGraphicalEditPart
import org.eclipse.gef.editpolicies.NonResizableEditPolicy
import at.bachmann.gef.sample.editpolicy.FBGraphicalNodeEditPolicy

class FBEditPart extends AbstractGraphicalEditPart implements NodeEditPart, PropertyChangeListener {
	
	override protected createFigure() {
		new FBFigure		
	}
	
	override activate() {
		super.activate()
		(model as FB).addListener(this) 
	}
	
	override deactivate() {
		super.deactivate()
		(model as FB).removeListener(this) 
	}
	
	override protected createEditPolicies() {
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new FBComponentEditPolicy)
		installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE, new NonResizableEditPolicy)
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new FBGraphicalNodeEditPolicy)
		installEditPolicy(EditPolicy.NODE_ROLE, new FBConnectionComponentEditPolicy )
	}
	
	override protected refreshVisuals() {
		val fig = figure as FBFigure
		val mod = model as FB
		
		fig.label = mod.name
		val rectangle = new Rectangle(mod.x, mod.y, -1, -1)
		(parent as GraphicalEditPart).setLayoutConstraint(fig, rectangle)
	}	
	
	override getContentPane() {
		val fig = figure as FBFigure
		fig.contentPane
	}
	
	override protected getModelChildren() {
		val mod = model as FB
		mod.variables
	}
	
	override getSourceConnectionAnchor(ConnectionEditPart connection) {
		new ChopboxAnchor(figure)
	}
	
	override getSourceConnectionAnchor(Request request) {
		new ChopboxAnchor(figure)
	}
	
	override getTargetConnectionAnchor(ConnectionEditPart connection) {
		new ChopboxAnchor(figure)
	}
	
	override getTargetConnectionAnchor(Request request) {
		new ChopboxAnchor(figure)
	}
	
	override getModelSourceConnections() {
		val mod = model as FB
		
		mod.connectionsTo
	}
	
	override getModelTargetConnections() {
		val mod = model as FB
		
		mod.connectionsFrom
	}
	
	override propertyChange(PropertyChangeEvent evt) {
		switch evt.propertyName {
			case FB.CONNECTIONSTO_PROPERTY:
				refreshSourceConnections
			case FB.CONNECTIONSFROM_PROPERTY:
				refreshTargetConnections
			default:
				refreshVisuals
		}	
	}	
}