package com.functionalProgramming;

public class TesterFunctionInterface {

	public static void main(String[] args) {

		// SAM:void display()
		MyFunctionInterface1 obj1;
		obj1 = () -> {
			System.out.println("--display method----");
		};
		obj1.display();
		
		
		obj1=()->{System.out.println("Welcome To FP");
		   System.out.println("-----------------");  
		};
		obj1.display();
		
		System.out.println("----lambda for function void (String str)");
		
		//void showName(String str)
		
		MyFunctionInterface2 obj2;
		obj2 = (str) -> {
			System.out.println("Welcome :"+str);
		};
		
		obj2.showName("Sonali");
		
		obj2=(str)->{System.out.println("welcome :"+str.toUpperCase());};
		obj2.showName("Nitesh");
		
		
		
		//void addition(int i,int j)
		MyFunctionInterface3 obj3;
		obj3=(i,j)->{System.out.println("Addition="+(i+j));};
		
		obj3.addition(56, 78);
		
		
		//int max(int i,int j)
		
		MyFunctionInterface4 obj4=(x,y)->{
			
			if(x>y)
				return x;
			else
				return y;
		};
		int m=obj4.max(45, 12);
		System.out.println("Max="+m);
		//can we have default or static methods in function interfaces
		

	}

}
//class providerSAM implements MyFunctionInterface1
//{
//public void display(){
//sysout("---display-----");
//}
//}

//void (String custName) {
//	
//	
//}


