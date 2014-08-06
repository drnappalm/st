package at.bachmann.gef.sample.controller

import org.eclipse.gef.editparts.AbstractConnectionEditPart
import org.eclipse.gef.EditPolicy
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy
import at.bachmann.gef.sample.editpolicy.FBConnectionComponentEditPolicy

class FBConnectionEditPart extends AbstractConnectionEditPart {
	
	override protected createEditPolicies() {
		installEditPolicy(EditPolicy.CONNECTION_ROLE, new ConnectionEndpointEditPolicy)
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new FBConnectionComponentEditPolicy)
	}		
}