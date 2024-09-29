package com.bptn.course._week1_._day2_;

//FREEZE CODE BEGIN
import java.util.Scanner; // import the Scanner class 

class Main {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String userName;
//FREEZE CODE END

		// Ask the user to enter the username by printing "Enter Username" and read the
		// input given by the user
		// Fill in the code for the above part below
		System.out.println("Enter Username");
		userName = myObj.nextLine();

//FREEZE CODE BEGIN        
		// Print the username
		System.out.println("Username is: " + userName);
		myObj.close();
	}
}
//FREEZE CODE END
