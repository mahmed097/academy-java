package com.bptn.course._week1_._day4_;

//FREEZE CODE BEGIN
class ReverseNumber {
 public static void main(String[] args) {

     int inputNumber = 1234, reversedValue = 0;
//FREEZE CODE END

     //inputNumer = // something else to test, remove later

     // Add your code here
     while(inputNumber!=0){
      int remainder = inputNumber %10; //get the last digit of inputNumber
      reversedValue = reversedValue * 10 + remainder; // multiply the reversedValue by 10 then add the last digit
      inputNumber = inputNumber/10; // divide by 10 to remove the last digit 
      
     }
//FREEZE CODE BEGIN
     System.out.println(reversedValue);
 }
}
//FREEZE CODE END

/*
What I've learned is how to use remainders to get the last digit of a value. The key issue I was getting is that I was only getting the 
last value, what I had to do is to run a while loop to loop through the end of each value. What I'm going to take 
away from this lesson is how to use % and to get the last value of a number by doing % 10. 
*/