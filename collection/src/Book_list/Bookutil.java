package Book_list;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Bookutil {
	
	public static   List<List_book> getbook ()
	{
		List<List_book> list=new ArrayList<List_book>();
		
		list.add(new List_book(10, "GOT", "RR_MARTIN", 4500));
		list.add(new List_book(11, "MAHABHARAT", "XYZ", 850));
		list.add(new List_book(12, "MONEYHIEST", "PROFESSOR", 1000));
		list.add(new List_book(13, "DARK", "ABC", 257));
		list.add(new List_book(14, "LEO", "KJSNKJ", 3000));
		
		return list;
		
	}

}
