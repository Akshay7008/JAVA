package com.java8features;

public class TestMathClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MathClass2 mObj=new MathClass2();
		mObj.sum();
		//i/f object can hold ref of provider class which implements same i/f 
	
		MathInterface2  obj=new MathClass2();
		
		obj.sum();//sum method is implemented by class MathClass2
		
		
		
	}

}
