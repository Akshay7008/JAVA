package Book_list;

import java.util.Collections;
import java.util.Comparator;

public class List_book implements Comparable<List_book> {
	
	private int bookid;
	private String bookname,authname;
	private double price;
	
	public static Comparator<List_book> srtbyName;
	
	static {
		srtbyName = (List_book o1 , List_book o2) -> {
			if(o1.getBookname().compareTo(o2.getBookname())== 0)
				return 0;
			else if(o1.getBookname().compareTo(o2.getBookname()) >0 )
				return 1;
			else
				return -1;
		};
	}
	
	
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
	
	
	@Override
	public int compareTo(List_book o)
	{
		if (this.bookid< o.bookid)
			return -1;
		else if (this.bookid>o.bookid)
			return 1;
		else
			return 0;
	}
	
	
	
	
	
	
	

}
