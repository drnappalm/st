package at.bachmann.gef.sample.editpolicy

import at.bachmann.gef.sample.command.CreateFBCommand
import org.eclipse.gef.EditPart
import org.eclipse.gef.Request
import org.eclipse.gef.editpolicies.LayoutEditPolicy
import org.eclipse.gef.requests.CreateRequest
import at.bachmann.gef.sample.command.MoveFBCommand
import org.eclipse.gef.requests.ChangeBoundsRequest
import at.bachmann.gef.sample.model.FB

class FBDiagramLayoutEditPolicy extends LayoutEditPolicy {

	override protected createChildEditPolicy(EditPart child) {
	}

	override protected getCreateCommand(CreateRequest request) {
		new CreateFBCommand(request.location.x, request.location.y)
	}

	override protected getMoveChildrenCommand(Request request) {
		val req = request as ChangeBoundsRequest
		new MoveFBCommand(req.editParts.map[(it as EditPart).model as FB], req.moveDelta.x, req.moveDelta.y)
	}
}
