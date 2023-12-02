package BL;

public class Customer {

	private int custid;
	private int id;	
	private String name;
	private int age;
	private String email,password;
	
	public Customer(String name, int age, String email, String password) {
		super();
		this.custid=id;
		id++;
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", name=" + name + ", age=" + age + ", email=" + email + ", password="
				+ password + "]";
	}
	
	
	
	
	
}
