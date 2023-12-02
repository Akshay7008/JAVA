import java.util.Scanner;

public class Divisiblity_Check {

	public static void main(String[] args) {
		
		int num;
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		
		if(num%5==0 & num%7==0)
		{
		System.out.println("Number "+num+" divisible by 5 and 7");	
		}
		else {
		System.out.println("Number "+num+" not divisible by 5 and 7");
		}
	}

}
