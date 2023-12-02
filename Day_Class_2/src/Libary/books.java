package Libary;

public class books {
//	bname,id,author,price
	private String bname, author;
	private int id, price;

	public void assignment(String nm, String name) {
		bname = nm;
		author = name;

	}

	public void display() {
		id = 45;
		price = 4500;
		System.out.println("Name of book" + bname + " " + "Name of author" + author + " " + id + " " + "Cost" + price);

	}

}
