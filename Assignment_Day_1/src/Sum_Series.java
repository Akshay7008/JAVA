import java.util.Scanner;

public class Sum_Series {

	public static void main(String[] args) {
		
		int num,sum=0;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		for (int i=0;i<=num;i++) {
			sum+=i;
		}
		System.out.println(sum);

	}

}
