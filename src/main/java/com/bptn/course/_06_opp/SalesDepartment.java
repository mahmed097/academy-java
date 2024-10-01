package com.bptn.course._06_opp;

class SalesDepartment extends Department {
	
	//Attribute
	private double totalSalesAmount;

	//Super Constructor
	public SalesDepartment(String nameOfDepartment, int numOfEmployees, double totalSalesAmount) {
		super(nameOfDepartment, numOfEmployees);
		this.totalSalesAmount = totalSalesAmount;
	}
	
	@Override
	public void departmentInfo() {
		super.departmentInfo();
		System.out.println("Number of Total Sales: "  + totalSalesAmount);
		
	}
	
	

}
