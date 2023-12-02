package com.tester;

import com.code.*;

public class TestShape {
//tight coupling
	public static void showArea(Shape obj) {
		obj.area();
	}

	public static void main(String[] args) {

		// Can we create refVariable of Shape
		Shape shpeObj;
		// can we create instance of Shape :NO
		// shapeObj=new Shape();
		// shapeObj.area();
		// as area is abstract define in Shape class,no implementation given

		// Circ

		Circle cirObj = new Circle();
		cirObj.area();
		cirObj.display();

		System.out.println();

		Square sqObj = new Square();
		sqObj.area();

		System.out.println();
		Rectangle rectObj = new Rectangle();
		rectObj.area();

		// can object of Abstract class hold ref of its child class:YES
		Shape shObj = rectObj;
		shObj.area();// RunTime:

		Shape[] shapes = new Shape[3];
		shapes[0] = cirObj;// upcasting
		shapes[1] = rectObj;
		shapes[2] = sqObj;
		System.out.println("------------------------");

		for (int i = 0; i < shapes.length; i++) {
			shapes[i].area();
			if (shapes[i] instanceof Circle)
				((Circle) shapes[i]).circleMethod();// DownCasting
		}

		showArea(cirObj);
		showArea(rectObj);
		showArea(sqObj);

		Product prdObj = new Product();
		//showArea(prdObj);

		System.out.println("------------------------");

		// working with collection use adv for loop
		// for each loop
		for (Shape s : shapes)// for each Shape s in collection shapes
		{
			s.area();
		}
		// foreach loop:starts with first element till last element
		// by default :fwd only
		// by default:ReadOnly

		System.out.println("------------------------");

		int[] arr = { 23, 45, 67, 8, 9, 0, 33, 576 };

		for (int no : arr) {
			System.out.print(no + "    ");
		}

		System.out.println("\n--------------");

		String[] names = { "Ram", "Seeta", "Nitesh", "Ramesh", "Umesh" };

		for (String str : names) {
			System.out.print(str + "   ");
		}

	}

}
