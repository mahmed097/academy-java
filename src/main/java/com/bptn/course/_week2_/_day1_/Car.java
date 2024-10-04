package com.bptn.course._week2_._day1_;

class Car {

    // Fill in the code for Step 2

//Create your Attributes
   private String color;
   private String brand;
   private int price;

      //Your constructor class
      public Car(String color, String brand, int price) {
        // Fill in the code for Step 4
        this.color= color;
        this.brand = brand;
        this.price = price;

      }

      //create printCarDetails method that references the print method 
      void printCarDetails() {
          this.print();
    }

    // Fill in the code
    private void print() {
    //     // fill in code
    System.out.println("Car{" +
                  "color='" + color + '\'' +
                  ", brand='" + brand + '\'' +
                  ", price=" + price +
                  '}');
     }
}

/*

What was new to me about this task was how to use the "this" keyword and learn about constructors. One small problem
That I encountered was that I sometimes forget to use the this keyword when initializing the constructor. What Ill take away from
this lesson is when and where to use the this keyword and how to implement a constructor.

*/
