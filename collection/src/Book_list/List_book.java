package Book_list;

public class List_book {
	
	private int bookid;
	private String bookname,authname;
	private double price;
	public List_book(int bookid, String bookname, String authname, double price) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.authname = authname;
		this.price = price;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
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
	
	
	@Override
	public String toString() {
		return "List_book [bookid=" + bookid + ", bookname=" + bookname + ", authname=" + authname + ", price=" + price
				+ "]";
	}
	
	
	
	

}
