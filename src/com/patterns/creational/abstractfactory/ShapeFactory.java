package com.patterns.creational.abstractfactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(String shapeType) {
		
		Shape shape=null;		
		ShapeTypeEnum typeEnum = ShapeTypeEnum.valueOf(shapeType);
		
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
