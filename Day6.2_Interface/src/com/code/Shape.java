package com.code;

public abstract class Shape implements Printable{

}
class Square extends Shape
{

	@Override
	public void print() {
		 System.out.println("----Print Square---Shape-----");
		
	}
	
}
class Circle extends Shape  {

	@Override
	public void print() {
		 System.out.println("----Print Circle---Shape-----");
		
	}
	
}