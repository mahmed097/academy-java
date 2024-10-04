package com.bptn.course._week2_._day3_;

public class Employee extends Person {

	   private int id;

	   public Employee(String theName, int id) {
	      super(theName);
	      this.id = id;
	   }

	   public int getId() {
	      return id;
	   }

	   public static void main(String[] args) {
	      
	      Employee emp = new Employee("Dani", 10);

	      //use the getter methods and print the name & id of the emp object
	    //  System.out.println(emp.getName());
	      System.out.println(emp.getId());
	   }
	}
