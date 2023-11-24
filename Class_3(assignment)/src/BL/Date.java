package BL;

public class Date {
	
	private int day,month,year;
	
	public Date()
	{
		day=06;
		month=04;
		year=2001;
	}
	
	public Date(int day, int month, int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
		
	}
	
	public Date(int year)
	{
		this();
		this.year=year;
	}
	
	
	public void display()
	{
		System.out.println(day);
		System.out.println(month);
		System.out.println(year);
	}
	

}
