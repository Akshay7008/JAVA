package BL;

public class Product {

	private int id, qty;
	private String pname;
	private double price;

	public Product() {
		id = 1;
		pname = "PEN";
		price = 10;
		qty = 2;
	}

	public Product(int id, int price, String pname, int qty) {
		this.id = id;
		this.price = price;
		this.pname = pname;
		this.qty = qty;
	}

	public void display() {
		System.out.println("id=" + id);
		System.out.println("productname" + pname);
		System.out.println("price of product" + price);
		System.out.println("quntity" + qty);
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
