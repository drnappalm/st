package at.bachmann.gef.sample.command

import org.eclipse.gef.commands.Command
import at.bachmann.gef.sample.model.FB
import at.bachmann.gef.sample.model.FBDiagram
import java.util.List

class DeleteFBCommand extends Command {
	
	protected var List<FB> deletedFBs
	
	new (List<FB> fbs) {
		deletedFBs = fbs
	}
	
	override execute() {
		removeFromDiagram
	}
	
	override undo() {
		addToDiagram		
	}

	override redo() {
		removeFromDiagram
	}
	
	def addToDiagram () {
		deletedFBs.forEach[
			FBDiagram.activeInstance.addFB(it)			
		]
	}
	
	def removeFromDiagram () {
		deletedFBs.forEach[
			FBDiagram.activeInstance.removeFB(it)			
		]		
	}	
}