package at.bachmann.gef.sample.editpolicy

import org.eclipse.gef.editpolicies.ComponentEditPolicy
import org.eclipse.gef.requests.GroupRequest
import at.bachmann.gef.sample.command.DeleteFBCommand
import org.eclipse.gef.EditPart
import at.bachmann.gef.sample.model.FB

class FBComponentEditPolicy extends ComponentEditPolicy {
	
	override protected createDeleteCommand(GroupRequest deleteRequest) {
		val itemsToDelete = deleteRequest.editParts.map[
			((it as EditPart).model as FB)
		]
		new DeleteFBCommand(itemsToDelete)
	}	
}