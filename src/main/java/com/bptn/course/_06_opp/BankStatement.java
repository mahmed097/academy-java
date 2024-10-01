package com.bptn.course._06_opp;

public class BankStatement {

	public static void main(String[] args) {

//		BankAccount myAccount = new BankAccount("01325", 1200.00);
//
//		myAccount.displayAccountInfo();
//
//		BankAccount secondMyAccount = new BankAccount("01425", 1300.00);
//
//		secondMyAccount.displayAccountInfo();
//
//		SavingsAccount addIntrest = new SavingsAccount("01425", 500, 1);
//		addIntrest.applyIntrest();
//		addIntrest.displayAccountInfo();
		
		CheckingAccount checkOverdraftLimit = new CheckingAccount("1001", 200, 25);
		checkOverdraftLimit.withdraw(250);
		checkOverdraftLimit.displayAccountInfo();
		
		
	}

}
