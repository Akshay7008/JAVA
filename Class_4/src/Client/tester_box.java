package Client;

import BL.box;

public class tester_box {

	public static void main(String[] args) {

		box[] t1 = new box[5];

		box b1 = new box(12, 5, 20);
//		b1.display();
		t1[0] = b1;

		box b2 = new box(45, 8, 6);
		t1[1] = b2;
		box b3 = new box(7, 56, 10);
		t1[2] = b3;
		box b4 = new box(23, 89, 14);
		t1[3] = b4;

		for (int i = 0; i < t1.length; i++) 
		{
			if (t1[i] != null)
				t1[i].display();
			System.out.println();
		}
		
		boolean r1=b4.equals(b3);
		System.out.println(r1);

	}

}
