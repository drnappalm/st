package at.bachmann.gef.sample.model

import java.util.List
import java.util.ArrayList
import java.util.Collections

class FB extends ModelBase {
	
	public static val CONNECTIONSFROM_PROPERTY = 'CONNECTIONSFROM_PROPERTY'
	public static val CONNECTIONSTO_PROPERTY = 'CONNECTIONSTO_PROPERTY'
	public static val X_PROPERTY = 'X_PROPERTY'
	public static val Y_PROPERTY = 'Y_PROPERTY'
	
	@Property String name = 'FunctionBlock'
	@Property final List<Variable> variables = new ArrayList<Variable>
	
	var x = 50
	var y = 50
	final List<FBConnection> connectionsTo = new ArrayList<FBConnection>
	final List<FBConnection> connectionsFrom = new ArrayList<FBConnection>
	
	def getX() {
		x
	}
	
	def setX(int x) {
		this.x = x
		listeners.firePropertyChange(X_PROPERTY, null, null)
	}
	
	def getY() {
		y
	}
	
	def setY(int y) {
		this.y = y
		listeners.firePropertyChange(Y_PROPERTY, null, null)
	}
	
	def getConnectionsTo () {
		Collections.unmodifiableList(connectionsTo)	
	}
	
	def getConnectionsFrom () {
		Collections.unmodifiableList(connectionsFrom)
	}
	
	def addConnectionTo (FBConnection connection) {
		connectionsTo.add(connection)
		listeners.firePropertyChange(CONNECTIONSTO_PROPERTY, null, null)		
	}
	
	def addConnectionFrom (FBConnection connection) {
		connectionsFrom.add(connection)
		listeners.firePropertyChange(CONNECTIONSFROM_PROPERTY, null, null)		
	}
	
	def removeConnectionTo (FBConnection connection) {
		connectionsTo.remove(connection)
		listeners.firePropertyChange(CONNECTIONSTO_PROPERTY, null, null)		
	}
	
	def removeConnectionFrom (FBConnection connection) {
		connectionsFrom.remove(connection)
		listeners.firePropertyChange(CONNECTIONSFROM_PROPERTY, null, null)		
	}
}