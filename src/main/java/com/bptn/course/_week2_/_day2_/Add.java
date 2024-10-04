package com.bptn.course._week2_._day2_;
public class Add {

    // Create your code here:

    public int add(int x, int y){ //Created an add method that takes 2 int values and adds them
        return x+y;
    }
    public int add(int x, int y, int z){ //Created an add method that takes 3 int values and adds them
        return x+y+z;
    }
    public double add(double x, double y){ //Created an add method that takes 2 double values and adds them
        return x+y;
    }


    // Do not modify the code below. The code below gives you the idea of how the different methods are called.
    public static void main(String args[]) {
        Add obj = new Add();
        System.out.println(obj.add(12, 21));
        System.out.println(obj.add(11, 23, 10));
        System.out.println(obj.add(100.10, 200.5));
    }
}

/* 

What I learned today is what are overloaded methods and how to use them. I didnt run into any issues
with regarding this lesson but what I will be taking away from this lesson is why and when to use overloaded 
methods.

*/
