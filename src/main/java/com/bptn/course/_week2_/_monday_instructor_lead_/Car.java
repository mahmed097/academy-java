package com.bptn.course._week2_._monday_instructor_lead_;

class Car {

    //Declare a String color, String brand, int price
    private String color;
    private String brand;
    private int price;

    public Car() {
        // calls the parameterized constructor
        this("red","toyota", 10000);
    }

    public Car(String color, String brand, int price) //Define a parameterized constructor with parameters String color, String brand, int price
    {
    //Assign Constructor parameters String color, String brand, and int price to Class variables with the this keyword.
    color = this.color;
    brand = this.brand;
    price = this.price;
    }

    void printCarDetails() {
        this.print();
    }

    private void print() {
        
            System.out.println(color=" + color" + " brand=" + brand + ", price=" + price + '}');
    }
}
