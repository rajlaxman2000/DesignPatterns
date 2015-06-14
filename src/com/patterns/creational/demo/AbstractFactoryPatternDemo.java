package com.patterns.creational.demo;

import com.patterns.creational.abstractfactory.AbstractFactory;
import com.patterns.creational.abstractfactory.Color;
import com.patterns.creational.abstractfactory.FactoryProducer;
import com.patterns.creational.abstractfactory.Shape;


public class AbstractFactoryPatternDemo {
	
	public static void main(String[] args) {
			//get shape factory
			AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
			//get an object of Shape Circle
			Shape shape1 = shapeFactory.getShape("Circle");
			//call draw method of Shape Circle
			shape1.draw();
			//get an object of Shape Rectangle
			Shape shape2 = shapeFactory.getShape("Rectangle");
			//call draw method of Shape Rectangle
			shape2.draw();
			//get an object of Shape Square
			Shape shape3 = shapeFactory.getShape("Square");
			//call draw method of Shape Square
			shape3.draw();
			//get color factory
			AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
			//get an object of Color Red
			Color color1 = colorFactory.getColor("Red");
			//call fill method of Red
			color1.fill();
			//get an object of Color Green
			Color color2 = colorFactory.getColor("Green");
			//call fill method of Green
			color2.fill();
			//get an object of Color Blue
			Color color3 = colorFactory.getColor("Blue");
			//call fill method of Color Blue
			color3.fill();
		}
}
