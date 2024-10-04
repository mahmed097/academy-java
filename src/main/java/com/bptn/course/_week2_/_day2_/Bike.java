package com.bptn.course._week2_._day2_;

public class Bike extends Vehicle {
    
    //Step 3a: Declare String bikeHandle 
    private String bikeHandle;

    //Step 3b: Define parameterized constructor for color, brand, bikeHandle

    public Bike(String color, String brand, String bikeHandle)
    {
        super(color,brand);
        this.bikeHandle = bikeHandle;
    }
    //Step 3c: Create a print() method as per the specification in the above

    public void print() 
    { 
     super.print(); 
    }
}
