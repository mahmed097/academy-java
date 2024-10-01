package com.bptn.course._06_opp;

class TechDepartment extends Department {

	// Attribute
	private double totalPurchaseAmount;

	// Super Constructor
	public TechDepartment(String nameOfDepartment, int numOfEmployees, double totalPurchaseAmount) {
		super(nameOfDepartment, numOfEmployees);
		this.totalPurchaseAmount = totalPurchaseAmount;
	}

}
