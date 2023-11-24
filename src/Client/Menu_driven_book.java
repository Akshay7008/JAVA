package Client;

import java.util.Scanner;

import BL.Book;

public class Menu_driven_book {

	public static void main(String[] args) {
		
		System.out.println("Menu 1:to diplay books");
		System.out.println("Menu 2:Add New Book");
		System.out.println("Menu 3:Update Book");
		System.out.println(" Menu 4:Delete Book");
		System.out.println("Menu 5:edit name");
		System.out.println("Menu 6:edit Author");
		System.out.println("Menu 7:edit price");
		System.out.println("Menu 8:get book details by bookid");
		System.out.println("Menu 9:Show All Books price >450");
		System.out.println(" Menu 10:Show All Books names only");
		
		int choice;
		int index=0;
		
		Book [] lib=new Book[5];
		
		do 
		{
			System.out.println("enter the choice");
			Scanner s=new Scanner(System.in);
			choice=s.nextInt();
			
			switch (choice)
			{
			
			case 1:
				for (int i=0;i<lib.length;i++)
				{
					if (lib[i]!=null)
						lib[i].display();
					System.out.println();
				}			
				break;

			case 2:
				System.out.println("Enter the booid,name,auhtorname,price");
				if (index<lib.length)
				{
					Book b1=new Book(s.nextInt(), s.next(), s.next(), s.nextInt());
					lib[index]=b1;
					index++;
				}
				else
					System.out.println("ARRAY is FULL");
				break;
				
			case 3:
				System.out.println("Enter the book id which u want to upadte");
				int update_id=s.nextInt();
				for (int i=0;i<lib.length;i++)
				{
					if (lib[i].getBookid()==update_id)
					{
						lib[i].setAuthor(s.next());
						lib[i].setBookname(s.next());
						lib[i].setPrice(s.nextInt());
						break;
					}
						
				}
				break;
				
			case 4:
				System.out.println("Enter the book id which u want to delete");
				int delete_id=s.nextInt();
				for (int i=0;i<lib.length;i++)
				{
					if (lib[i].getBookid()==delete_id)
					{
						lib[i]=null;
						break;
					}
				}
				break;
			
			case 5:
				System.out.println("Enter the id for edit the name");
				int editid=s.nextInt();
				for (int i=0;i<lib.length;i++)
				{
					if (lib[i].getBookid()==editid)
						System.out.println("Enter the book Name");
						
						lib[i].setBookname(s.next());
						break;
				}
//				System.out.println("id not found");
				break;
				
			case 6:
				System.out.println("Enter the id for edit the author");
				int editid1=s.nextInt();
				for (int i=0;i<lib.length;i++)
				{
					if (lib[i].getBookid()==editid1)
						
						System.out.println("Enter the author Name");
						lib[i].setAuthor(s.next());
					break;
						
				}
//				System.out.println("id not found");
				break;
				
			case 7:
				System.out.println("Enter the id for edit the price");
				int id_price=s.nextInt();
				for (int i=0;i<lib.length;i++)
				{
					if (lib[i].getBookid()==id_price)
						System.out.println("Enter the price");
						
						lib[i].setPrice(s.nextInt());
					break;
						
				}
//				System.out.println("id not found");
				break;
				
			case 8:
				System.out.println("Enter the id for edit the price");
				int id_details=s.nextInt();
				for (int i=0;i<lib.length;i++)
				{
					if (lib[i].getBookid()==id_details)
						
						lib[i].display();
					break;
						
				}
//				System.out.println("id not found");
				break;
				
				
			case 9:
				for (int i=0;i<lib.length;i++)
				{
					if (lib[i].getPrice()>450)
						lib[i].display();
					break;
				}
//				System.out.println("NO book price is more than 450");
				break;
				
			case 10:
				for (int i=0;i<lib.length;i++)
				{
					System.out.println(lib[i].getBookname());
				}
				break;
												
			default:
			}
				
		}while(choice<=10);
			

	}

}
