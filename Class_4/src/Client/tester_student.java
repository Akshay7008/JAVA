package Client;

import java.util.Scanner;

import BL.Student;

public class tester_student {

	public static void main(String[] args) {

		Student student1 = new Student("Smith", "LA", 52);
		student1.display();

//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the name ,city , and age");
//		String nm = s.next();
//		String c1 = s.next();
//		int a = s.nextInt();
//
//		Student student2 = new Student(nm, c1, a);
//		student2.display();

//		System.out.println(student2.getAge());
		
		student1.setCity("Mexico");
		student1.display();

	}

}
