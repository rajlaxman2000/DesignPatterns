package com.patterns.creational.factory;

/**
 * @author RajeshDuvvi
 *	Create a Factory to generate object of concrete class 
 *	based on given information.
 */
public class ShapeFactory {
	
	public Shape getShape(String shapeType){
		if(shapeType ==null)
			return null;
		if(ShapeTypeEnum.Circle.getShape().equalsIgnoreCase(shapeType)){
			
		}else if (ShapeTypeEnum.Rectangle.getShape().equalsIgnoreCase(shapeType)) {
			
		}
		ShapeTypeEnum typeEnum = ShapeTypeEnum.valueOf(shapeType);
		Shape shape=null;
		switch (typeEnum ) {
		case Circle:
			shape = new Circle();
			break;
		case Square:
			shape = new Square();
			break;
		case Rectangle:
			shape = new Rectangle();
			break;
		default:			
			break;
		}
		
		return shape;
		
	}
}
