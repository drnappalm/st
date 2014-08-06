package at.bachmann.gef.sample.controller

import org.eclipse.gef.editparts.AbstractGraphicalEditPart
import org.eclipse.draw2d.Figure
import org.eclipse.draw2d.XYLayout
import at.bachmann.gef.sample.model.FBDiagram
import org.eclipse.gef.EditPolicy
import java.beans.PropertyChangeListener
import java.beans.PropertyChangeEvent
import at.bachmann.gef.sample.editpolicy.FBDiagramComponentEditPolicy

class FBDiagramEditPart extends AbstractGraphicalEditPart implements PropertyChangeListener {
	
	override protected createFigure() {
		val figure = new Figure
		figure.opaque = true
		figure.layoutManager = new XYLayout
		figure
	}
	
	override activate() {
		super.activate()
		(model as FBDiagram).addListener(this) 
	}
	
	override deactivate() {
		super.deactivate()
		(model as FBDiagram).removeListener(this) 
	}
	
	override protected createEditPolicies() {
		installEditPolicy(EditPolicy.CONTAINER_ROLE, new FBDiagramComponentEditPolicy)		
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new editpoli)
	}
	
	override getModelChildren() {
		val model = model as FBDiagram 
		
		model.FBs
	}
	
	override propertyChange(PropertyChangeEvent evt) {
		refreshChildren
	}	
}