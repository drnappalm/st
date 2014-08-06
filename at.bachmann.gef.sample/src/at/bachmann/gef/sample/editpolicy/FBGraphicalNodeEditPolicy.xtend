package at.bachmann.gef.sample.editpolicy

import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy
import org.eclipse.gef.requests.CreateConnectionRequest
import org.eclipse.gef.requests.ReconnectRequest
import at.bachmann.gef.sample.command.DummyCommand
import at.bachmann.gef.sample.command.FBConnectionCompleteCommand
import at.bachmann.gef.sample.controller.FBEditPart
import at.bachmann.gef.sample.model.FB

class FBGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy {
	
	override protected getConnectionCompleteCommand(CreateConnectionRequest request) {
		val source = (request.sourceEditPart as FBEditPart).model as FB
		val target = (request.targetEditPart as FBEditPart).model as FB
		new FBConnectionCompleteCommand(source, target) 
	}
	
	override protected getConnectionCreateCommand(CreateConnectionRequest request) {
		new DummyCommand
	}
	
	override protected getReconnectSourceCommand(ReconnectRequest request) {
		new DummyCommand
	}
	
	override protected getReconnectTargetCommand(ReconnectRequest request) {
		new DummyCommand
	}
}