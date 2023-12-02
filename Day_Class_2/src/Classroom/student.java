package Classroom;

public class student {

	private int rollno, mark1, mark2, mark3;

	public void assignment(int rno, int m1, int m2, int m3) {
		rollno = rno;
		mark1 = m1;
		mark2 = m2;
		mark3 = m3;
	}

	public void display() {
		System.out.println("rollno:" + rollno + " " + "marks" + mark1 + "," + mark2 + "," + mark3);
		float total;
		total = mark1 + mark2 + mark3;
		float per;
		per = total / 3;
		System.out.println("Total marks=" + total +" "+ "percentage" + per);

		if (total < 100)
			System.out.println("grade C");
		else if (total > 100 & total < 200)
			System.out.println("Grade B");
		else
			System.out.println("Grade A");
	}

}
