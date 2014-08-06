package at.bachmann.gef.sample.model

import java.util.List
import java.util.ArrayList
import java.util.Collections

class FB extends ModelBase {
	
	public static val CONNECTIONSFROM_PROPERTY = 'CONNECTIONSFROM_PROPERTY'
	public static val CONNECTIONSTO_PROPERTY = 'CONNECTIONSTO_PROPERTY'
	
	@Property String name = 'FunctionBlock'
	@Property int x = 50
	@Property int y = 50
	@Property final List<Variable> variables = new ArrayList<Variable>
	
	final List<FBConnection> connectionsTo = new ArrayList<FBConnection>
	final List<FBConnection> connectionsFrom = new ArrayList<FBConnection>
	
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