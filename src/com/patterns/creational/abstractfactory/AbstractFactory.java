package com.patterns.creational.abstractfactory;

public abstract class AbstractFactory {
	
	/**
	 * @param color
	 * @return
	 */
	public abstract Color getColor(String color);

	/**
	 * @param shape
	 * @return
	 */
	public abstract Shape getShape(String shape);
}
