package com.patterns.creational.singleton;

public class SingleObject {

	// create an object of SingleObject
	private static final SingleObject instance = new SingleObject();

	// make the constructor private so that this class cannot be
	// instantiated
	private SingleObject() {
	}

	// Get the only object available
	public static SingleObject getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}
	
	public Object clone(){
		return new CloneNotSupportedException();
	}

}
