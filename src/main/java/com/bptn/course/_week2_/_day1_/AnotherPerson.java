package com.bptn.course._week2_._day1_;

public class AnotherPerson {
	   private String name;
	   private String email;

	   public AnotherPerson(String initName, String initEmail) {
	      name = initName;
	      email = initEmail;
	   }

	   public String toString() {
	     String name = "unknown";
	     // The local variable name here will be used,
	     //  not the instance variable name.
	     return  this.name + ": " + email;
	   }

	   // main method for testing
	   public static void main(String[] args) {
	      // call the constructor to create a new person
	      AnotherPerson p1 = new AnotherPerson("Sana", "sana@gmail.com");
	      System.out.println(p1);
	   }
	}
