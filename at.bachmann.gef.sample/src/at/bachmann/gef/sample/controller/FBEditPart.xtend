package at.bachmann.gef.sample.controller

import org.eclipse.gef.editparts.AbstractGraphicalEditPart
import at.bachmann.gef.sample.view.FBFigure
import at.bachmann.gef.sample.model.FB
import org.eclipse.draw2d.geometry.Rectangle
import org.eclipse.gef.GraphicalEditPart
import at.bachmann.gef.sample.model.Variable
import java.util.List
import org.eclipse.gef.NodeEditPart
import org.eclipse.gef.ConnectionEditPart
import org.eclipse.gef.Request
import org.eclipse.draw2d.ConnectionAnchor
import org.eclipse.draw2d.ChopboxAnchor
import org.eclipse.gef.editpolicies.NonResizableEditPolicy
import org.eclipse.gef.EditPolicy
import at.bachmann.gef.sample.editpolicy.FBGraphicalNodeEditPolicy
import at.bachmann.gef.sample.editpolicy.FBComponentEditPolicy
import java.beans.PropertyChangeListener
import java.beans.PropertyChangeEvent
import org.eclipse.gef.editpolicies.SelectionEditPolicy

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
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new FBGraphicalNodeEditPolicy)
		installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE, new NonResizableEditPolicy)
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
		
		mod.connectionsFrom
	}
	
	override getModelTargetConnections() {
		val mod = model as FB
		
		mod.connectionsTo
	}
	
	override propertyChange(PropertyChangeEvent evt) {
		refreshVisuals	
	}	
}