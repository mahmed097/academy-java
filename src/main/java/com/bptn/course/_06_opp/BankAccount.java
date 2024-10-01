package com.bptn.course._06_opp;

class BankAccount {

	// Initialize Attributes
	private String accountNumber;
	private double balance;

	// Constructor
	public BankAccount(String accountNumber, double initialBalance) {
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
	}

	// Deposit Void Method

	public void deposit(double amount) {
		if (amount > 0)
			balance += amount;
	}

	public void withdraw(double amount) {
		if (amount > 0 && balance >= amount)
			balance -= amount;
	}

	// Getter Balance
	public double getBalance() {
		return balance;
	}

	public void displayAccountInfo() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Current Balance : " + balance);

	}

}
