package com.code;

import java.util.ArrayList;
import java.util.List;

import com.validation.custexception;

public class Testercust {

	public static void main(String[] args) {

		List<Customer> mangament=new ArrayList<Customer>();
		mangament=utilcustomer.getcustomerdetails();
		
	
		
		System.out.println("1:Display all customer /n2:Add Customer /n3:Show Customer's name only");

		
	}

}
