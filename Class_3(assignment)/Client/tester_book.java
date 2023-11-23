package Client;

import BL.Book;

public class tester_book {

	public static void main(String[] args) {
		
		Book b;
		b=new Book();
		
		b.display();
		
		Book book1=new Book(102, "2 States", "MEM", 1500);
		book1.display();
		System.out.println(book1.getBookname());
		book1.setBookname("Games of Thrones");
		System.out.println(book1.getBookname());

	}

}
