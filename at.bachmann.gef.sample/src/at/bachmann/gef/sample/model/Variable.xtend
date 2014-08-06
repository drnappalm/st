package at.bachmann.gef.sample.model

class Variable extends ModelBase {	
	@Property String name
	@Property DataType dataType
	@Property Direction direction
	
	new() {		
	}
	
	new(String name, DataType type, Direction direction) {
		this.name = name
		this.dataType = type
		this.direction = direction
	}	
}

enum DataType {
	INT,
	BYTE,
	BOOL
}

enum Direction {
	IN,
	OUT,
	INOUT
}