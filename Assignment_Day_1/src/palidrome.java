import java.util.Iterator;

public class palidrome {

	public static void main(String[] args) {
		boolean flag = false;
		int a[] = { 1, 2, 3,1 };
		int[] b = new int[a.length];
		// System.out.println(a[a.length-3]);
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		System.out.println("length is " + a.length);
		for (int i = 0; i < a.length; i++) {
			b[i] = a[(a.length - 1) - i];

		}
//		System.out.println(b[2]);

		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[i]) {

				flag = true;
				
			} else {
				flag = false;
				break;
			}
		}

		if (flag == true)
			System.out.println("palidrome");
		else
			System.out.println("Not Palodrome");

	}

}
