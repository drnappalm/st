package at.bachmann.gef.sample.command

import org.eclipse.gef.commands.Command
import at.bachmann.gef.sample.model.FB
import at.bachmann.gef.sample.model.FBConnection

class FBReconnectCommand extends Command {
	
	@Property boolean endPointSource = false
	@Property FB oldEndPoint
	@Property FB newEndPoint
	@Property FBConnection connection = null
	
	new(FBConnection connection, boolean isEndPointSource, FB oldEndPoint, FB newEndPoint) {
		endPointSource = isEndPointSource
		this.oldEndPoint = oldEndPoint
		this.newEndPoint = newEndPoint
		this.connection = connection
	}

	override execute() {		
		reConnect(endPointSource, oldEndPoint, newEndPoint)
	}
		
	override undo() {
		reConnect(endPointSource, newEndPoint, oldEndPoint)
	}

	override redo() {
		reConnect(endPointSource, oldEndPoint, newEndPoint)
	}
	
	def reConnect(boolean isEndPointSource, FB oldEndPoint, FB newEndPoint) {
		if(isEndPointSource) {
			oldEndPoint.removeConnectionTo(connection)
			newEndPoint.addConnectionTo(connection)
		} else {
			oldEndPoint.removeConnectionFrom(connection)
			newEndPoint.addConnectionFrom(connection)
		}		
	}	
}