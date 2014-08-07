package at.bachmann.gef.sample.model

import java.beans.PropertyChangeSupport
import java.beans.PropertyChangeListener

class ModelBase {
	protected final PropertyChangeSupport listeners = new PropertyChangeSupport(this)
	
	def addListener(PropertyChangeListener listener) {
		listeners.addPropertyChangeListener(listener)
	}
	
	def removeListener(PropertyChangeListener listener) {
		listeners.removePropertyChangeListener(listener)		
	}	
}