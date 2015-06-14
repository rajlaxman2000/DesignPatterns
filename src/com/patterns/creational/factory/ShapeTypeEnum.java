package com.patterns.creational.factory;

/**
 * @author RajeshDuvvi
 *
 */
public enum ShapeTypeEnum {
	Circle("CIRCLE"),
	Square("SQUARE"),
	Rectangle("RECTANGLE");
			
	private String shape;	
	
	ShapeTypeEnum(String shape) {
		this.shape = shape;
	}

	public String getShape() {
		return shape;
	}
	
}
