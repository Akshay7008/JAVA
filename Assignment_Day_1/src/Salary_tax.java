import java.util.Scanner;

public class Salary_tax {

	public static void main(String[] args) {
		
		double salary,tax;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the salary");
		salary=s.nextFloat();
		
		if (salary<=50000) {
			tax=0;
			System.out.println("No Tax");
		}
		else if (salary>=50000 & salary<300000)
		{
			tax=salary-(salary*0.8);
			System.out.println(tax);
		}
		else 
		{
			tax=salary+salary*0.7;
			System.out.println(tax);
			
		}

	}

}
