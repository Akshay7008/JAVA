package com.code;

public class TestInterface {
//loose coupling
	public static void show(Printable  obj) {
		obj.print();
	}
	public static void main(String[] args) {
		 
		Employee emp=new Employee();
		Circle cir=new Circle();
		Square sq=new Square();
				
		emp.print();
		cir.print();
		sq.print();
		
		show(emp);
		show(sq);
		show(cir);
		
		//Lab Task:Try to extend one i/f from another i/f
		//interface extends interface
		//class implements interface

	}

}
