package com.bptn.course._week2_._day4_;

public class ExceptionLearning{

    public static void main(String[] args) {

        try {
            //  Block of code to try
            int a = 11;
            int b = 0;
            System.out.println(a/b); //print out answer for a/b


        } catch (ArithmeticException e) { //Handle an ArithmeticException when thrown 
            //  Block of code to handle errors
            System.out.println("The number cannot be divided by zero");
        }
    }

}

/*

What I learned from this lesson is how to catch errors using a try-catch block,
and all about the different exceptions that can be thrown. I didn't run into 
any issues when working on the code above. The key takeaways I'll have from this
lesson is how to properly use a try-catch block and also the hierarchy for handling 
different error exceptions.

*/

