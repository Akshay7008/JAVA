package com.map;

public class bookmap {

	private int bookid;
	private String bookname, authname;
	private double price;

	public bookmap(int bookid, String bookname, String authname, double price) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.authname = authname;
		this.price = price;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthname() {
		return authname;
	}

	public void setAuthname(String authname) {
		this.authname = authname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getBookid() {
		return bookid;
	}

	@Override
	public String toString() {
		return "bookmap [bookid=" + bookid + ", bookname=" + bookname + ", authname=" + authname + ", price=" + price
				+ "]";
	}

}
