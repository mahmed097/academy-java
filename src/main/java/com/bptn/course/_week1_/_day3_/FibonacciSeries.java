package com.bptn.course._week1_._day3_;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {

		// Initialize the Scanner Object

		System.out.print("Enter the number of elements: ");

		// Fetch the input from the user and store in the variable called n
		Scanner scanner = new Scanner(System.in); // Initialize scanner
		int n = scanner.nextInt(); // ask user for input

		int first = 0; // First element of Fibonacci series
		int second = 1; // Second element of Fibonacci series

		System.out.print("Fibonacci Series up to " + n + " elements: ");

		// Print the first n elements of Fibonacci series
		for (int i = 0; i < n; i++) {
			System.out.print(first + " ");

			// Fill in the missing piece of code below to print the elelments

			int x = first + second; // find the next sequence in the Fibonacci series
			first = second; // moving one place over in the Fibonacci series by making first = second
			second = x; // and update second to be the addition of first + second (which in this case is
						// x)

		}

		scanner.close();
	}
}
/*
 * What was new to me was working with Fibonacci series. I was confused about
 * how the second value would be printed out when trying to implement the code.
 * I then realized that all I needed to do was only print the first value in the
 * for loop and move one place over by first making x = the first + the second
 * value, then make the first = second and make second = x, allowing me to
 * complete the problem! What I'll take away from this problem is how to use
 * for-loops and how to use scanners.
 */
