package at.bachmann.gef.sample.controller

import org.eclipse.gef.EditPartFactory
import org.eclipse.gef.EditPart
import at.bachmann.gef.sample.model.Variable
import at.bachmann.gef.sample.model.FB
import at.bachmann.gef.sample.model.FBDiagram
import at.bachmann.gef.sample.model.FBConnection

class FBEditPartFactory implements EditPartFactory {
	
	override createEditPart(EditPart context, Object model) {
		var EditPart editPart
		  
		switch model {
			
			FBConnection:
				editPart = new FBConnectionEditPart
				
			Variable: 
				editPart = new VariableEditPart
				
			FB: 
				editPart = new FBEditPart
				
			FBDiagram:
			
				editPart = new FBDiagramEditPart 
		}
		
		editPart?.setModel(model)
		
		editPart
	}
	
}