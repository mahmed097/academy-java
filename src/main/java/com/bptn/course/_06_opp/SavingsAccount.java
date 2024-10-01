package com.bptn.course._06_opp;

public class SavingsAccount extends BankAccount {

	private double intrestRate;

	// Super Constructor
	public SavingsAccount(String accountNumber, double initialBalance, double intrestRate) {
		super(accountNumber, initialBalance);
		this.intrestRate = intrestRate;
	}

	public void applyIntrest() {
		double intrest = getBalance() * intrestRate / 100;
		deposit(intrest);
	}

}
