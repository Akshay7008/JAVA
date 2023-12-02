import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		
		int a;
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		
		if(a%2==0) { 
		System.out.print(a+" Number is Even");
		}
		else {
			System.out.println(a+" Number is odd");
		}
			
	}
}
