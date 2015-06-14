package com.patterns.creational.abstractfactory;

/**
 * @author RajeshDuvvi
 *
 */
public enum FactoryTypeEnum {
	
	Shape("SHAPE"),
	Color("COLOR");
			
	private String factory;	
	
	FactoryTypeEnum(String factory) {
		this.factory = factory;
	}

	public String getFactory() {
		return factory;
	}
	
}
