package com.bptn.course._week2_._day4_;

//InsufficientFundsException.java 
public class InsufficientFundsException extends Exception {

	private double amount;

	public InsufficientFundsException(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

}
