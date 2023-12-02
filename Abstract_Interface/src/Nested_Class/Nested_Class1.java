package Nested_Class;

public class Nested_Class1 {
	private int no1;
	
	public Nested_Class1()
	{
		System.out.println("this is outer constr");
	}
	
	private class Inner
	{
		private int no2;
		
		public Inner()
		{
			no2=no2+no1;
			System.out.println(no2);
		}
	}
}
