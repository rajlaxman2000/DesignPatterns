package com.patterns.creational.abstractfactory;

/**
 * @author RajeshDuvvi
 *
 */
public enum ColorTypeEnum {
	Red("RED"),
	Green("GREEN"),
	Blue("BLUE");
			
	private String color;	
	
	ColorTypeEnum(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	
}
