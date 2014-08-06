package at.bachmann.gef.sample.editpolicy

import at.bachmann.gef.sample.command.CreateFBCommand
import org.eclipse.gef.editpolicies.ContainerEditPolicy
import org.eclipse.gef.requests.CreateRequest

class FBDiagramComponentEditPolicy extends ContainerEditPolicy {

	override protected getCreateCommand(CreateRequest request) {
		new CreateFBCommand
	}
}