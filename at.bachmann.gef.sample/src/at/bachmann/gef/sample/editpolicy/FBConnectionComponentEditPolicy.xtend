package at.bachmann.gef.sample.editpolicy

import org.eclipse.gef.editpolicies.ConnectionEditPolicy
import org.eclipse.gef.requests.GroupRequest
import at.bachmann.gef.sample.command.DeleteConnectionCommand
import at.bachmann.gef.sample.controller.FBConnectionEditPart
import at.bachmann.gef.sample.model.FBConnection
import at.bachmann.gef.sample.model.FB
import org.eclipse.gef.Request

class FBConnectionComponentEditPolicy extends ConnectionEditPolicy {

	override protected getDeleteCommand(GroupRequest request) {
		val connection = request.editParts.head as FBConnectionEditPart

		new DeleteConnectionCommand(connection.source.model as FB, connection.target.model as FB,
			connection.model as FBConnection)
	}
	
	override getCommand(Request request) {
		super.getCommand(request)
	}
	
}
