package Client;

import BL.Date;

public class tester_date {

	public static void main(String[] args) {
		
		Date d1=new Date();
		d1.display();
		
		Date d2=new Date(4, 05, 2000);
		d2.display();
		
		Date d3=new Date(2023);
		d3.display();
	}

}
