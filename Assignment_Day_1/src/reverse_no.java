
public class reverse_no {

	public static void main(String[] args) {
		
		int num=123;
		int a=0;
		int rev=0;
		while(num>0)
		{
			a=num%10;
			rev=(rev*10)+a;
			num=num/10;
			
		}
		System.out.println(a);
		System.out.println(rev);
	}

}
