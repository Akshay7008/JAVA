package BL;

public class Student {
	
	private int rollno,m1,m2,m3;
	private String name,qualification,grade;
	
	public void assign(int rollno,int m1,int m2,int m3,String name,String qualification)
	{
		this.rollno=rollno;
		this.name=name;
		this.qualification=qualification;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	private double total=0;
	private void total()
	{
		 total=m1+m2+m3;
//		System.out.println(total);	
	}
	private void percentage()
	{
		double per=(total/300)*100;
		System.out.println(per);
	}
	
	private void grade()
	{
		if (total<100)
			grade="B";
		else if (total>=100 && total<300)
			grade="A";
		else
			grade="A+";
	}
	
	public void display()
	{
		total();
		percentage();
		grade();
		
		System.out.println("rollno"+rollno);
		System.out.println("name"+name);
		System.out.println("qualication"+qualification);
		System.out.println("m1"+m1);
		System.out.println("m2"+m2);
		System.out.println("m3"+m3);
		System.out.println("grade"+grade);
		
	}
}
