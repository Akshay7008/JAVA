package com.validation;

import com.code.Customer;

public class Customervalidation {

	private static boolean isvalidname(String name) throws custexception {
		if (name.toLowerCase().contains("a") && name.length() >= 5)
			return true;
		else
			throw new custexception("Invalid Name");

	}

	public static Customer createcustomer (String newname, String lnewname, String nemail, double nsalary)
	{
		try {
			if (isvalidname(newname))
			{
				Customer c1=new Customer(newname, lnewname, nemail, nsalary);
				return c1;		
			}
		} catch (custexception e) 
		{
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
			
			
	}

}
