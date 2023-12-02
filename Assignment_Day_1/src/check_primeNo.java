import java.util.Scanner;

public class check_primeNo {

	public static void main(String[] args) {
		
		
		int num;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		num= sc.nextInt();
		boolean flag=false;
		for (int i=2;i<num;i++)
		{
		  if (num%i==0) 
		  {
			flag=false;
			break;
			}
		  else {
			  flag=true;
		  }
		  
		}
		if (flag==false)
			System.out.println("Number is Not Prime");
		else
			System.out.println("Number is Prime");
		

	}

}
