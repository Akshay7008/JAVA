package com.java8features;

public class TestMathClass1 {

	public static void main(String[] args) {

//create provider class instance
		MathClass1 mObj=new MathClass1();
		mObj.add(102, 243);
		// mObj.div(22, 0);
		mObj.subs(23, 2);
		mObj.div(22, 2);
		
		//default
		System.out.println("Max:"+mObj.max(34, 67));
		
		//statitc
		MathInterface1.display();
		
		//Lab:can we override default method in provider class?
		

	}

}
