package com.java8features;

public class MathClass1 implements MathInterface1 {
//Provide class implements all abstract methods
	 
	@Override
	public void subs(int i, int j) {
	 
	System.out.println("-----sub(i,j)----"+(i-j));	
	}

	@Override
	public void div(int i, int j) {
	 
		System.out.println("-----div(i,j)----"+(i/j));		
	}

	@Override
	public void add(int i, int j) {
		 
		System.out.println("-----add(i,j)----"+(i+j));
	}

}
