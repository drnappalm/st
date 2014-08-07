package at.bachmann.gef.sample.editpolicy

import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy
import org.eclipse.gef.requests.CreateConnectionRequest
import org.eclipse.gef.requests.ReconnectRequest
import at.bachmann.gef.sample.command.FBConnectionCompleteCommand
import at.bachmann.gef.sample.controller.FBEditPart
import at.bachmann.gef.sample.model.FB
import at.bachmann.gef.sample.controller.FBConnectionEditPart
import at.bachmann.gef.sample.model.FBConnection
import at.bachmann.gef.sample.command.FBReconnectCommand

class FBGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy {

	override protected getConnectionCompleteCommand(CreateConnectionRequest request) {
		createCommand(null, request.sourceEditPart as FBEditPart, request.targetEditPart as FBEditPart)
	}

	override protected getConnectionCreateCommand(CreateConnectionRequest request) {
		createCommand(null, request.sourceEditPart as FBEditPart, request.targetEditPart as FBEditPart)
	}

	override protected getReconnectSourceCommand(ReconnectRequest request) {
		createReconnectCommand(request)
	}

	override protected getReconnectTargetCommand(ReconnectRequest request) {
		createReconnectCommand(request)
	}

	def createCommand(FBConnectionEditPart connection, FBEditPart source, FBEditPart target) {
		val command = new FBConnectionCompleteCommand
		if (connection != null) {
			command.connection = connection.model as FBConnection
		}
		if (source != null) {
			command.source = source.model as FB
		}
		if (target != null) {
			command.target = target.model as FB
		}
		command
	}

	def createReconnectCommand(ReconnectRequest request) {
		val connection = request.connectionEditPart
		new FBReconnectCommand(connection.model as FBConnection, request.type.equals(REQ_RECONNECT_SOURCE),
			connection.source.model as FB, request.target.model as FB)
	}
}
