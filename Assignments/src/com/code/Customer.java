package com.code;

public class Customer {
	
//	 custid,firstname,lastname,email,salary.
	private int custid;
	private static int id=10001;
	private String fname,lname,email;
	private double salary;
	public Customer() {
		super();
	}
	public Customer(String fname, String lname, String email, double salary) {
		super();
		this.custid=id;
		id++;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.salary = salary;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCustid() {
		return custid;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", salary="
				+ salary + "]";
	}
	
	
	
	

}
