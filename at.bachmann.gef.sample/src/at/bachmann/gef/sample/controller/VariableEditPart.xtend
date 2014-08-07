package at.bachmann.gef.sample.controller

import org.eclipse.gef.editparts.AbstractGraphicalEditPart
import at.bachmann.gef.sample.view.VariableFigure
import at.bachmann.gef.sample.model.Variable

class VariableEditPart extends AbstractGraphicalEditPart {
	
	override protected createFigure() {
		new VariableFigure
	}
	
	override protected createEditPolicies() {
		
	}
	
	override protected refreshVisuals() {
		val fig = figure as VariableFigure
		val mod = model as Variable
		
		fig.text = mod.name
	}		
}