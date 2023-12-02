package com.code;
//Base Class:Object
public abstract   class Shape {
	
	private int no1;
	public Shape() {
		System.out.println("---shape---");
	}
	//non-abstract  method
	public void display() {
		System.out.println("---display shape-----");
	}
	//area
	public abstract void area();//non implemented method:abstract method
	//only abst class can contain abst method
//implementation of abst methods is left over to respective child class
	
}
 