package at.bachmann.gef.sample.command

import org.eclipse.gef.commands.Command
import java.util.ArrayList
import java.util.List
import at.bachmann.gef.sample.model.FB

class MoveFBCommand extends Command {
	val int xDelta
	val int yDelta
	val List<FB> fbs = new ArrayList<FB>
	
	new(List<FB> fbs, int xDelta, int yDelta) {
		this.fbs.addAll(fbs)
		this.xDelta = xDelta
		this.yDelta = yDelta
	}
	
	override execute() {
		moveFBs(false)
	}
	
	override undo() {
		moveFBs(true)		
	}
	
	override redo() {
		moveFBs(false)		
	}
	
	def moveFBs(boolean undo) {
		fbs.forEach[
			if(undo) {
				it.x = it.x - xDelta
				it.y = it.y - yDelta
			} else {
				it.x = it.x + xDelta
				it.y = it.y + yDelta
			}
		]	
	}
}