import java.util.Scanner;

public class sum_odd_even {

	public static void main(String[] args) {
		
		int num,evenadd=0,oddadd=0;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		for (int i=1;i<=num;i++)
		{
		if (i%2==0)
			evenadd+=i;
		else
			oddadd+=i;
		}
		System.out.println("even no addition:"+evenadd+"  "+"odd no addition"+oddadd);
	}

}
