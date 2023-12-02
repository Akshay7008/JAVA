package com.bank;

import java.util.Scanner;

public class TestBankAccount {

	public static void main(String[] args) {

		BankAccount act1 = new BankAccount(101, "Ram", 45000);
		System.out.println(act1);

		// menu 1:create account
		// menu2:withdraw
		// 3:deposite
		// 4:apply for locker
		// 5:get balance

		act1.deposite(5000);

		Scanner sc = new Scanner(System.in);
		System.out.println("Do You Want To Apply For Locker?(Yes/No)");

		String choice = sc.next();

		if (choice.equals("Yes")) {
			System.out.println("Apply For Locker");
			System.out.println("Locker Id Months");
			act1.applyLocker(sc.nextInt(),sc.nextInt());
			System.out.println(act1);
			
			
		} else
		{
			System.out.println("No Locker");
		}

	}

}
