import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int a=1,n,i;
		double fact=1;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for (i=1;i<=n;i++) {
			fact=fact*i;
			
		}
		System.out.println(fact);
	}

}
