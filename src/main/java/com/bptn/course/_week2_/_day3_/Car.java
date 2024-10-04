package com.bptn.course._week2_._day3_;

public class Car extends Vehicle {

	   //instance variable 
	   String steeringWheel;

	   //add parameterized constructor- use super keyword to call parent constructor
	   public Car(String colour, String brand, String steeringWheel){
	    super(colour,brand); //pass colour and brand to the parent class
	    this.steeringWheel=steeringWheel; //initialize the instance variable steeringWheel with parameter steeringWheel
	   }

	}

	/*

	Something new that I learned from this task is the use of super, when to use it and how to use it 
	in a constructor method to pass variable to the parent class. One issue I had along the way was that 
	I declare my variables as private, thus given me an error. One thing ill take away from this lesson is how to 
	use the super keyword, especially when using it in a constructor method.

	*/