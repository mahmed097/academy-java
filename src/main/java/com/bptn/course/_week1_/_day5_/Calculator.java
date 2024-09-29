package com.bptn.course._week1_._day5_;

import java.util.*;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("/...Calculator Menu.../"); // Print Calculator Menu
		System.out.println("Press 1 for addition");
		System.out.println("Press 2 for subtraction");
		System.out.println("Press 3 for multiplication");
		System.out.println("Press 4 for division");
		System.out.println("Press 5 to square a number");
		System.out.println("Press 6 to find a square root");
		System.out.println("Press 7 to find the reciprocal");

		/* Initialize all my variables that I'm going to use */
		int choice = 0;
		double total = 0.0;
		boolean ifExitIsNotPressed = true;
		int exitOrNot = 0;

		double firstNumber = 0.0;
		double secondNumber = 0.0;

		choice = scan.nextInt(); // Ask for users input to choose a calculation

		do { // We need to use a do while loop for menu loops
			switch (choice) { // Switch case to choose between different users input
			case 1:

				/* ask for users inputs */
				System.out.println("Enter the first number: ");
				firstNumber = scan.nextDouble();
				System.out.println("Enter the second number: ");
				secondNumber = scan.nextDouble();

				total = firstNumber + secondNumber; // Perform addition calculation

				System.out.println(
						"The addition of the numbers " + firstNumber + " and " + secondNumber + " is = " + total); // output
																													// calculation
				System.out.println("To continue calculation Press 1, else press any other number to exit");

				exitOrNot = scan.nextInt(); // Ask user to either press 1 to continue or any other number to exit and
											// store in exitOrNot

				if (exitOrNot != 1) {// If they press any other key other than 1, set ifExitIsNotPressed to false to
										// break out of the do-while loop and exit program
					ifExitIsNotPressed = false;
					break;
				} else { // If pressed 1, ask user for another calculation
					System.out.println("Choose another calculation: ");
					choice = scan.nextInt();
					break;
				}

			case 2:

				/* Ask for inputs */
				System.out.println("Enter the first number: ");
				firstNumber = scan.nextDouble();
				System.out.println("Enter the second number: ");
				secondNumber = scan.nextDouble();

				total = firstNumber - secondNumber; // Perform subtraction calculation

				System.out.println(
						"The subtraction of the numbers " + firstNumber + " and " + secondNumber + " is = " + total); // output
																														// calculation
				System.out.println("To continue calculation Press 1, else press any other number to exit");

				exitOrNot = scan.nextInt(); // Ask user to either press 1 to continue or any other number to exit and
											// store in exitOrNot

				if (exitOrNot != 1) {// If they press any other key other than 1, set ifExitIsNotPressed to false to
										// break out of the do-while loop and exit program
					ifExitIsNotPressed = false;
					break;
				} else {
					System.out.println("Choose another calculation: ");// If pressed 1, ask user for another calculation
					choice = scan.nextInt();
					break;
				}

			case 3:

				/* Ask for users inputs */
				System.out.println("Enter the first number: ");
				firstNumber = scan.nextDouble();
				System.out.println("Enter the second number: ");
				secondNumber = scan.nextDouble();

				total = firstNumber * secondNumber; // Perform multiplication calculation

				System.out.println(
						"The product of the numbers " + firstNumber + " and " + secondNumber + " is = " + total); // output
																													// calculation
				System.out.println("To continue calculation Press 1, else press any other number to exit");

				exitOrNot = scan.nextInt(); // Ask user to either press 1 to continue or any other number to exit and
											// store in exitOrNot

				if (exitOrNot != 1) { // If they press any other key other than 1, set ifExitIsNotPressed to false to
										// break out of the do-while loop and exit program
					ifExitIsNotPressed = false;
					break;
				} else {
					System.out.println("Choose another calculation: "); // If pressed 1, ask user for another calculation
					choice = scan.nextInt();
					break;
				}

			case 4:

				/* Ask for users inputs */
				System.out.println("Enter the first number: ");
				firstNumber = scan.nextDouble();
				System.out.println("Enter the second number: ");
				secondNumber = scan.nextDouble();

				total = firstNumber / secondNumber; // Perform division calculation

				System.out.println(
						"The division of the numbers " + firstNumber + " and " + secondNumber + " is = " + total); // Output
																													// calculation
				System.out.println("To continue calculation Press 1, else press any other number to exit");

				exitOrNot = scan.nextInt(); // Ask user to either press 1 to continue or any other number to exit and
											// store in exitOrNot

				if (exitOrNot != 1) { // If they press any other key other than 1, set ifExitIsNotPressed to false to
										// break out of the do-while loop and exit program
					ifExitIsNotPressed = false;
					break;
				} else {
					System.out.println("Choose another calculation: "); // If pressed 1, ask user for another calculation
					choice = scan.nextInt();
					break;
				}
			case 5:
				/* Ask for users inputs */
				System.out.println("Enter the number to find Square: ");
				firstNumber = scan.nextDouble();

				total = firstNumber * firstNumber; // Perform squaring a number calculation

				System.out.println("The Square of the number " + firstNumber + " is = " + total); // Output calculation
				System.out.println("To continue calculation Press 1, else press any other number to exit");

				exitOrNot = scan.nextInt(); // Ask user to either press 1 to continue or any other number to exit and
											// store in exitOrNot

				if (exitOrNot != 1) { // If they press any other key other than 1, set ifExitIsNotPressed to false to
										// break out of the do-while loop and exit program
					ifExitIsNotPressed = false;
					break;
				} else { // If pressed 1, ask user for another calculation
					System.out.println("Choose another calculation: ");
					choice = scan.nextInt();
					break;
				}
			case 6:
				/* Ask for users inputs */
				System.out.println("Enter the number to find Square Root: ");
				firstNumber = scan.nextDouble();

				total = Math.sqrt(firstNumber); // Perform Square Root of a number calculation

				System.out.println("The Square Root of the number " + firstNumber + " is = " + total);// Output
																										// calculation
				System.out.println("To continue calculation Press 1, else press any other number to exit");

				exitOrNot = scan.nextInt(); // Ask user to either press 1 to continue or any other number to exit and
											// store in exitOrNot

				if (exitOrNot != 1) { // If they press any other key other than 1, set ifExitIsNotPressed to false to
										// break out of the do-while loop and exit program
					ifExitIsNotPressed = false;
					break;
				} else { // If pressed 1, ask user for another calculation
					System.out.println("Choose another calculation: ");
					choice = scan.nextInt();
					break;
				}

			case 7:
				/* Ask for users inputs */
				System.out.println("Enter the number to find Reciprocal: ");
				firstNumber = scan.nextDouble();

				total = 1 / firstNumber; // Perform the reciprocal of a number calculation

				System.out.println("The Reciprocal of the number " + firstNumber + " is = " + total); // Output
																										// calculation
				System.out.println("To continue calculation Press 1, else press any other number to exit");

				exitOrNot = scan.nextInt(); // Ask user to either press 1 to continue or any other number to exit and
											// store in exitOrNot

				if (exitOrNot != 1) { // If they press any other key other than 1, set ifExitIsNotPressed to false to
										// break out of the do-while loop and exit program
					ifExitIsNotPressed = false;
					break;
				} else { // If pressed 1, ask user for another calculation
					System.out.println("Choose another calculation: ");
					choice = scan.nextInt();
					break;
				}

			default:
				/* Check for invalid user input */
				System.out.println("Invalid choice! Please make a valid choice. ");
				System.out.println("To continue calculation Press 1, else press any other number to exit");

				exitOrNot = scan.nextInt();
				if (exitOrNot != 1) { // If they press any other key other than 1, set ifExitIsNotPressed to false to
										// break out of the do-while loop and exit program
					ifExitIsNotPressed = false;
					break;
				} else {// If pressed 1, ask user for another calculation
					System.out.println("Choose another calculation: ");
					choice = scan.nextInt();
					break;
				}

			}
			;
		} while (ifExitIsNotPressed); // While loop condition, while ifExitIsNotPressed is true

		scan.close();
	}
}

/*
 * 
 * What was new about this task for the past 2 days was the use of do while
 * loops. I've always used either a for-loop or a while loop for my iterations,
 * but to be able to have hands on experience using do-while loop, when to use
 * them and how to implement it is extremely beneficial for me. One of the
 * issues that I've encountered is how to find the square root of a number. I
 * wasn't sure how to find that number. I was able to figure it out and you have
 * to use Math.sqrt to find the square root of a number. What I'll take from
 * this lesson is How and when to use do-while loops and how to implement switch
 * statements.
 * 
 */
