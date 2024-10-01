package com.bptn.course._week2_._monday_instructor_lead_;

class Car1 { 
    String color;
    String brand; 
    int price; 
    
    Car1(String color,String brand, int price){
        this.color = color;
        this.brand = brand; 
        this.price = price; 
    } 
    
    public void printCarDetails() { 
      System.out.println(color + " " + brand + " " + price); 
    }

}  

class Main{ 
    public static void main(String args[]) {
        Car1 car1 = new Car1("white", "BMW", 70000);                                
        car1.printCarDetails();
   } 
}