package com.patterns.creational.demo;

import com.patterns.creational.factory.Shape;
import com.patterns.creational.factory.ShapeFactory;

public class FactoryPatternDemo {
	

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
			Shape shape = shapeFactory.getShape("Circle");
			System.out.println(shape.getClass().getSimpleName());
			shape.draw();
			
	}	
}
