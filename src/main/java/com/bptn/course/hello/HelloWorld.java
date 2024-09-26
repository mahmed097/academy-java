package com.bptn.course.hello;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        int inputNumber = 1200, reversedValue = 0;
// FREEZE CODE END

        //inputNumer = // something else to test, remove later

        // Add your code here
        while(inputNumber!=0){
         int remainder = inputNumber %10; //get the last digit of inputNumber
         reversedValue = reversedValue * 10 + remainder; // multipy the reversedValue by 10 then add the last digit
         inputNumber = inputNumber/10; // divide by 10 to remove the last digit 
         
        }
// FREEZE CODE BEGIN
        System.out.println(reversedValue);
    
	}

}
