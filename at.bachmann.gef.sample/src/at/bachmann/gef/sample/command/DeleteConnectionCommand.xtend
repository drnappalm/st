package at.bachmann.gef.sample.command

import org.eclipse.gef.commands.Command
import at.bachmann.gef.sample.model.FB
import at.bachmann.gef.sample.model.FBConnection

class DeleteConnectionCommand extends Command {
	
	val FB source
	val FB target
	val FBConnection connection
	
	new(FB source, FB target, FBConnection connection) {
		this.source = source
		this.target = target	
		this.connection = connection
	}
	
	override execute() {
		deleteConnection
	}	
	
	override undo() {
		addConnection		
	}
	
	override redo() {
		deleteConnection
	}
	
	def deleteConnection () {
		source.removeConnectionTo(connection)
		target.removeConnectionFrom(connection)
	}
	
	def addConnection () {
		source.addConnectionTo(connection)
		target.addConnectionFrom(connection)
	}
}