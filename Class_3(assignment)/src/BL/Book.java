package BL;

public class Book {
	
	private int bookid, price;
	private String bookname,author;
	
	public Book()
	{
		bookid=101;
		bookname="ABC";
		author="XYZ";
		price=200;
	}
	
	public Book(int bookid, String bookname,String author, int price)
	{
		this.bookid=bookid;
		this.bookname=bookname;
		this.author=author;
		this.price=price;
	}
	
	
	
	
	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void display()
	{
		System.out.print(bookid+" ");
		System.out.print(bookname+" ");
		System.out.print(author+" ");
		System.out.print(price+" ");
	}

}