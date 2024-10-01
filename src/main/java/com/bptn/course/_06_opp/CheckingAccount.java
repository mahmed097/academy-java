package com.bptn.course._06_opp;

class CheckingAccount extends BankAccount

{
	//Attribute
	private double overDraftLimit;

	// Super Constructor
	public CheckingAccount(String accountNumber, double initialBalance, double overDraftLimit) {
		super(accountNumber, initialBalance);
		this.overDraftLimit = overDraftLimit;
	}

	@Override
	public void withdraw(double amount) {
		if (amount > 0 && amount <= (getBalance() + overDraftLimit)) {
			super.withdraw(amount);
		}
	}

}
