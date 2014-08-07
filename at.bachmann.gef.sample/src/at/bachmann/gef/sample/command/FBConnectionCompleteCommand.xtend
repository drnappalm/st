package at.bachmann.gef.sample.command

import org.eclipse.gef.commands.Command
import at.bachmann.gef.sample.model.FB
import at.bachmann.gef.sample.model.FBConnection

class FBConnectionCompleteCommand extends Command {
	
	@Property FB source
	@Property FB target
	@Property FBConnection connection = null

	override execute() {		
		createConnection
	}
		
	override undo() {
		deleteConnection
	}

	override redo() {
		createConnection
	}	
	
	def deleteConnection() {
		source.removeConnectionTo(connection)
		target.removeConnectionFrom(connection)
	}
	
	def createConnection() {
		connection = new FBConnection
		source.addConnectionTo(connection)
		target.addConnectionFrom(connection)
	}
}