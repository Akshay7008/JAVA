package Book_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tester_book_list {

	public static void main(String[] args) {
		
		System.out.println("----Books Library-----");
		System.out.println("1:Display Book");
		System.out.println("2: Add Book");
		System.out.println("3:search Name");
		System.out.println("4:All Books Name ");
		
		List<List_book> lib=new ArrayList<List_book>();
		Scanner s=new Scanner(System.in);
		lib=Bookutil.getbook();
		int choice;
		do
		{
			System.out.println("Enter the choice");
			choice=s.nextInt();
			switch(choice)
			{
				case 1:
					for (List_book bk: lib)
					{
						System.out.println(bk);
					}
					break;
				case 2:
					System.out.println("Enter the bookid,bookname,author,price of book");
					lib.add(new List_book(s.nextInt(), s.next(), s.next(), s.nextDouble()))
					break;
				case 3:
					System.out.println("Enter the bookid");
					int id1=s.nextInt();
					for (List_book bk: lib)
					{
						if(bk.getBookid()==id1)
						{
							System.out.println(bk);
						}
					}
					
					break;
				case 4: 
					for (List_book bk: lib)
					{
						System.out.println(bk.getBookname());
					}
					
					break;
				
				
			}
			
		}while(choice<=4);

	}

}
