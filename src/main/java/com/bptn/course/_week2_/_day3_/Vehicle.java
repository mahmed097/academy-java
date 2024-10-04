package com.bptn.course._week2_._day3_;

public class Vehicle {

    //declare instance variables- colour and brand
     String colour;
     String brand;

    Vehicle() {
        this("Black", "Tesla");
    }

    // add parameterized constructor 
    
    public Vehicle(String colour, String brand){
      //initialize the instance variable colour and brand with parameter colour and brand
      this.colour = colour;
      this.brand = brand;
    }
    //Do not modify this code as we have parameters that pass the test case
    public static void main(String[] args) {
        Car car = new Car("White", "Audi", "Chromecoloured");
        Bike bike = new Bike("Grey", "BMW", "Silvercoloured");
        System.out.println(car.colour + " " + car.brand + " " + car.steeringWheel);
        System.out.println(bike.colour + " " + bike.brand + " " + bike.bikeHandle);

    }

}

/*

Something new that I learned from this task is the use of super, when to use it and how to use it 
in a constructor method to pass variable to the parent class. One issue I had along the way was that 
I declare my variables as private, thus given me an error. One thing ill take away from this lesson is how to 
use the super keyword, especially when using it in a constructor method.

*/
