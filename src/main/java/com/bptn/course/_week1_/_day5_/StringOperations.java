package com.bptn.course._week1_._day5_;

import java.util.Scanner;

class StringOperations {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("/...String Menu.../"); // Print String Menu
		System.out.println("Press 1 for Palindrome Check");
		System.out.println("Press 2 to reverse a String");
		System.out.println("Press 3 to Concatenate two Strings");
		System.out.println("Press 4 for String Comparison");
		System.out.println("Press 5 to Calculate the Length of String");

		/* Initialize all my variables that I'm going to use */

		String firstString = "";
		String secondString = "";
		boolean ifExitIsNotPressed = true;
		int choice = 0;

		choice = scan.nextInt(); // Ask user input

		do {
			switch (choice) { // Switch statement for each choice

			case 1:
				System.out.println("Palindrome Check");
				System.out.println("Enter a string: ");// Request user to input a string
				firstString = scan.next();

				for (int i = firstString.length() - 1; i >= 0; i--) { // Reverse the inputed string and store it in
																		// secondString
					secondString += firstString.charAt(i);
				}
				if (firstString.equals(secondString)) { // Check if its a Palindrome or not
					System.out.println(firstString + " is a palindrome");
				} else {
					System.out.println(firstString + " is not a palindrome");
				}
				ifExitIsNotPressed = false; // Exit out of do-while loop by making ifExitIsNotPressed = false
				break;

			case 2:

				System.out.println("reverse a String");
				System.out.println("Enter a string: ");// Request user to input a string
				firstString = scan.next();

				for (int i = firstString.length() - 1; i >= 0; i--) { // Reverse the inputed string and store it in
																		// secondString
					secondString += firstString.charAt(i);
				}

				System.out.println("The reverse of the inputed string is: " + secondString); // output the reverse
																								// string
				ifExitIsNotPressed = false; // Exit out of do-while loop by making ifExitIsNotPressed = false
				break;

			case 3:

				System.out.println("Enter first string: ");// Request user to input the first string
				firstString = scan.next();

				System.out.println("Enter second string: ");// Request user to input the second string
				secondString = scan.next();

				System.out.println(firstString + secondString); // Printing out the Concatenate of two Strings

				ifExitIsNotPressed = false; // Exit out of do-while loop by making ifExitIsNotPressed = false
				break;

			case 4:

				System.out.println("String Comparison");
				System.out.println("Enter First string: "); // Request user to input the first string
				firstString = scan.next();
				System.out.println("Enter Second string: "); // Request user to input the second string
				secondString = scan.next();

				if (firstString.equals(secondString)) { // Check if strings are equal and print a message either it is
														// equal or its not equal
					System.out.println("The entered strings are equal");
				} else {
					System.out.println("The entered strings are not equal");
				}

				ifExitIsNotPressed = false; // Exit out of do-while loop by making ifExitIsNotPressed = false
				break;

			case 5:

				System.out.println("String Comparison");
				System.out.println("Enter a string: ");// Request user to input a string
				firstString = scan.next();

				System.out.println("The length of the entered string is: " + (firstString.length())); // Print the
																										// length or the
																										// string

				ifExitIsNotPressed = false; // Exit out of do-while loop by making ifExitIsNotPressed = false
				break;

			default:
				// Checks for invalid choice and requests user to input a valid choice
				System.out.println("Invalid choice! Please make a valid choice. ");
				choice = scan.nextInt();
				break;
			}

		} while (ifExitIsNotPressed);

		scan.close();
	}
}
/*
 * 
 * One thing that was new for me about this task is how to reverse a string.
 * Because we can't use any function to automatically reverse the string for us,
 * i had to create a for loop and store each char in a separate string variable
 * from last character to the first. One of the issues I ran into is how to
 * reverse a string in java. I found out how to by created a for loop from
 * firstString.length() - 1 to 0. From this lesson, i'll make sure to remember
 * how to use do-while loop, switch statements and how to reverse a string.
 * 
 * 
 */
