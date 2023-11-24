package Client;

import BL.Employee_static;

public class tester_employee {

	public static void main(String[] args) {
		
		Employee_static emp1=new Employee_static("Smith", "smith@gmail.com");
				System.out.println(emp1);
				
		Employee_static emp2=new Employee_static();
		System.out.println(emp2);

	}

}
