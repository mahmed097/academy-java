package com.bptn.course._06_opp;

class Department {

	// Attributes
	private String nameOfDepartment;
	private int numOfEmployees;

	// Constructor
	public Department(String nameOfDepartment, int numOfEmployees) {
		this.nameOfDepartment = nameOfDepartment;
		this.numOfEmployees = numOfEmployees;

	}
	
	public void departmentInfo() {
		System.out.println("Name of Department: "  + nameOfDepartment);
		System.out.println("Number of Employee: "  + numOfEmployees);
	}

}
