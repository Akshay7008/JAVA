package PP2;

import PP1.MathOperations;

public class tester_Mathoperation2 {

	public static void main(String[] args) {
		MathOperations a1 = new MathOperations();

		int s1 = a1.add1(12, 5, 6);
		System.out.println(s1);
		
		short s=45, b=90;
		int s2=a1.add(s, b);
		System.out.println(s2);
		
		short s3=(short) a1.add(s, b);
		System.out.println(s3);
	}

}
