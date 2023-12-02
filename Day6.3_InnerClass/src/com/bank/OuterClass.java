package com.bank;

public class OuterClass {
	private int no1;

	public OuterClass(int no1) {
		System.out.println("---constr---outer---");
		this.no1 = no1;
	}

	public void display() {

		System.out.println("-------------display------");
	}
	// data member
	// innser class is member of OuterClass

	private class InnerClass {

		private int no2;

		public void changeNo2() {
			no2 = no1 + 1000;// no1 is private member of OuterClass
			System.out.println("No2=" + no2);
		}

	}
}
