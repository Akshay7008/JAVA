import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		
		float a,b,c,total;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Angles");
		a=s.nextFloat();
		b=s.nextFloat();
		c=s.nextFloat();
		total=a+b+c;
		
		if(total==180) 
		{
			System.out.println("its is triangle");
			
		}
		else 
		{
			System.out.println("not a triangle");
		}

		
	}

}
