package com.bank;

public class BankAccount {

	private int actid;
	private String name;
	private double balance;

	private Locker lockerObj;

	// write a method to assign locker to account
	public void applyLocker(int lockerid, int months) {
		this.lockerObj = new Locker(lockerid, months);
		System.out.println("---done-----");
	}

	public BankAccount(int actid, String name, double balance) {
		super();
		this.actid = actid;
		this.name = name;
		this.balance = balance;
	}

	public void deposite(double amount) {
		this.balance = balance + amount;

		System.out.println("---after Deposite Balance:" + balance);
	}

	public void withdraw(double amount) {
		this.balance = balance - amount;

		System.out.println("---after Withdraw Balance:" + balance);
	}

	@Override
	public String toString() {
		if (lockerObj == null) {
			System.out.println("No Locker Assigned ");

			return "BankAccount [actid=" + actid + ", name=" + name + ", balance=" + balance + "]";
		}
		else
		{
			System.out.println("  Locker Assigned ");

			return "BankAccount [actid=" + actid + ", name=" + name + ", balance=" + balance + "  "+lockerObj+" ]";
		
		}
	}

//create a locker  class for BankAccount
	private class Locker {

		private int lockerId;
		private int rate, months;

		public Locker(int lockerid, int month) {
			rate = 1000;
			this.lockerId = lockerid;
			this.months = month;
			System.out.println("Locker Get Assigned for BankAccount:" + actid);
		}

		@Override
		public String toString() {
			return "Locker [lockerId=" + lockerId + ", Charges=" + (rate * months) + "]";
		}

	}

}
