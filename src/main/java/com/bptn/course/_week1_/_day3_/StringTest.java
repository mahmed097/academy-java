package com.bptn.course._week1_._day3_;

public class StringTest {
	   public static void main(String[] args) {
	     String greeting = "Hello";

	     // This code gets the class of the greeting object
	     Class currClass = greeting.getClass();
	     System.out.println(currClass);

	     // This code gets the parent class for the child class
	     Class parentClass = currClass.getSuperclass();
	     System.out.println(parentClass);
	   }
	}
