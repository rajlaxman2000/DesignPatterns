package com.patterns.creational.abstractfactory;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String choice){
		
		AbstractFactory factory=null;
		
		FactoryTypeEnum factoryTypeEnum = FactoryTypeEnum.valueOf(choice);
				
		switch (factoryTypeEnum) {
		case Shape:
			factory =  new ShapeFactory();
			break;
		case Color:
			factory =  new ColorFactory();
			break;
		default:
			break;
		}
		
		return factory;
	}
}
