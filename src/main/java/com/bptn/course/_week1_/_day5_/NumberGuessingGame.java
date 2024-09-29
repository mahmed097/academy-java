package com.bptn.course._week1_._day5_;

import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {

		int targetNumber = 23;
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number between 1 and 100."); // Ask user guess
		int guess = scan.nextInt();

		while (guess < 1 || guess > 100) { // While guess is not a valid guess ask user to input a valid guess

			System.out.println("Invalid number, please guess a number: "); // Checks for valid number from 1-100
			guess = scan.nextInt();
		}

		while (guess != targetNumber) { // While the guessed number is not equal to targetNumber
			if (guess > targetNumber) { // If guess is too high, print "Too high! Try again." and make user guess again
				System.out.println("Too high! Try again.");
				System.out.println("Please enter a number between 1 and 100.");
				guess = scan.nextInt();
			} else { // Else the guess is too low and tell user that and get user to guess again
				System.out.println("Too low! Try again.");
				System.out.println("Please enter a number between 1 and 100.");
				guess = scan.nextInt();
			}
		}

		System.out.println("Congratulations! You guessed the number correctly!"); // Print that you guess the number
																					// successfully

		scan.close();
	}
}

/*
 * 
 * I created a guessing game. Firstly I initialized both the targetNumber,
 * scanner object and guess variable. Then I asked the user to input a guess
 * from 1-100. If the user inputs a guess from outside this range, then i
 * created a while loop to handle that case and ask the user to guess again. It
 * exits the while-loop when a valid input is inputed. After that I created a
 * while-loop with the condition, while you inputed the wrong guess, print that
 * the value is either too low or too high and makes the user guess again. Once
 * the user guesses the right answer, it prints
 * "Congratulations! You guessed the number correctly!" and the program ends.
 * 
 */
