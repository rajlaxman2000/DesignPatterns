package com.patterns.creational.singleton;


/**
 * @author RajeshDuvvi
 * Static block initialization
 * Static block initialization implementation is similar to eager initialization, except that instance of class 
 *	is created in the static block that provides option for exception handling.
 */
public class SingleObjectPt2 {

	// create an object of SingleObject
	private static SingleObjectPt2 instance;

	// make the constructor private so that this class cannot be
	// instantiated
	private SingleObjectPt2() {}
	
	static{
        try{
        	instance = new SingleObjectPt2();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
	}
	// Get the only object available
	public static SingleObjectPt2 getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}
	
	public Object clone(){
		return new CloneNotSupportedException();
	}

}
