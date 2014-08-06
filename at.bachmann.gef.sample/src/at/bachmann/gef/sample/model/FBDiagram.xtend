package at.bachmann.gef.sample.model

import java.util.List
import java.util.ArrayList
import java.util.Collections

class FBDiagram extends ModelBase {
	final List<FB> functionBlocks = new ArrayList<FB> 
	
	public static val activeInstance = new FBDiagram	
	public static val FUNCTIONBLOCKS_PROPERTY = 'FUNCTIONBLOCKS_PROPERTY' 
	 
	private new() {
		val fb1 = new FB
		val fb2 = new FB
		val conn = new FBConnection
				
		fb1.name = 'FunctionBlock1'
		fb1.x = 10
		fb1.y = 10
		fb1.variables.addAll(#[new Variable('IN1', DataType.INT, Direction.IN), new Variable('OUT1', DataType.INT, Direction.OUT)])
		fb1.addConnectionTo(conn)
		
		fb2.name = 'FunctionBlock2'
		fb2.x = 250
		fb2.y = 150
		fb2.variables.addAll(#[new Variable('INOUT1', DataType.INT, Direction.INOUT), new Variable('INOUT2', DataType.BOOL, Direction.INOUT)])
		fb2.addConnectionFrom(conn)
				
		functionBlocks.addAll(#[fb1, fb2])
	}
	
	def addFB(FB fb) {
		functionBlocks.add(fb)
		listeners.firePropertyChange(FUNCTIONBLOCKS_PROPERTY, null, null)
	}
	
	def removeFB(FB fb) {
		functionBlocks.remove(fb)
		listeners.firePropertyChange(FUNCTIONBLOCKS_PROPERTY, null, null)
	}	
	
	def getFBs () {
		Collections.unmodifiableList(functionBlocks)
	}
}