package at.bachmann.gef.sample.command

import org.eclipse.gef.commands.Command
import at.bachmann.gef.sample.model.FB
import at.bachmann.gef.sample.model.FBDiagram
import java.util.concurrent.atomic.AtomicInteger

class CreateFBCommand extends Command {
	
	static AtomicInteger fbNumber = new AtomicInteger(0)
	protected var FB createdFB
	val int x
	val int y
	
	new(int x, int y) {
		this.x = x
		this.y = y
	}
	
	override execute() {
		createFB
		addToDiagram
	}
	
	override undo() {
		removeFromDiagram		
	}

	override redo() {
		addToDiagram
	}
	
	def createFB () {
		createdFB = new FB
		createdFB.name = ''' New FunctionBlock «fbNumber.incrementAndGet»'''
		createdFB.x = x
		createdFB.y = y		
	}
	
	def addToDiagram () {
		FBDiagram.activeInstance.addFB(createdFB)
	}
	
	def removeFromDiagram () {
		FBDiagram.activeInstance.removeFB(createdFB)
	}	
}