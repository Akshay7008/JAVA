package BL;

public class Student {

	private String name, city;
	private int age;

	public Student() {
		name = "ABC";
		city = "XYZ";
		age = 12;
	}

	public Student(String name, String city, int age) {
		this.name = name;
		this.city = city;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("City: " + city);
		System.out.println("Age: " + age);
	}

}
