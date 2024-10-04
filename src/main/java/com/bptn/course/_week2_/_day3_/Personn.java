package com.bptn.course._week2_._day3_;

public class Personn {
	   // instance variables
	   private String name;
	   private String email;
	   private String phoneNumber;

	   // Static counter variable
	   public static int personCounter = 0;

	   // static method to print out counter
	   public static void printPersonCounter() {
	        System.out.println("Person counter: " + personCounter);
	   }

	   // constructor: construct a Person copying in the data into the instance variables
	   public Personn(String initName, String initEmail, String initPhone) {
	      name = initName;
	      email = initEmail;
	      phoneNumber = initPhone;
	      personCounter++;
	   }

	   // toString() method
	   public String toString() {
	     return  name + ": " + email + " " + phoneNumber;
	   }

	   // main method for testing
	   public static void main(String[] args) {
	      // call the constructor to create a new person
	      Personn p1 = new Personn("Sana", "sana@gmail.com", "123-456-7890");
	      Personn p2 = new Personn("Mohamed", "mohammed@gmail.com", "456-789-7890");

	      // add another person here
	      Personn.printPersonCounter();
	   }
	}
