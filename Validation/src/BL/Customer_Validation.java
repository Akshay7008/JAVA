package BL;

public class Customer_Validation {

	private static Boolean isvalidmail(String email) throws Exception {
		if (email.contains("@") && email.endsWith(".com"))
			return true;
		else
			System.out.println("");
		throw new Exception_customer("--------enter the valid email---------");

	}

	private static boolean isvalidAge(int age) throws Exception {
		if (age > 18)
			return true;
		else
			throw new Exception_customer("---------you are below 18-------");
	}
	
	public static Customer validcustomer(String name, int age, String email, String password) throws Exception
	{
		if (isvalidmail(email) && isvalidAge(age))
		{
			Customer c1=new Customer(name, age, email, password);
			return c1;
		}
			else
				throw new Exception_customer("-------expectionoccurs--------");
	}

}
