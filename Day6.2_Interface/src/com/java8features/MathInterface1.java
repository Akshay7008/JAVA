package com.java8features;

public interface MathInterface1 {

	
	//public abstract
	void add(int i,int j);//abstract
	void subs(int i,int j);
	void div(int i,int j);
	//Java 8 Feature:
	//1:default method:in i/f we can add implemented methods
	//and than method  must be default
	default  int max(int i,int j) {
		
		  if(i>j)
			  return i;
		  else
			  return j;
	  }
	
	//2:static methods
	static void display() {
		System.out.println("---This Is Static Method-----");
	}
	
	
	  
}
