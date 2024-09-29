package com.bptn.course._week1_._day2_;

//Import the Scanner Libray
import java.util.Scanner;

public class NegNumbers {
	public static void main(String[] args) {
		// Paste your code here.

		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a number to see if its positive or negative: ");
		int number = scanner.nextInt();

		if (number == 0) {
			System.out.println("The number is equal to zero.");
		} else if (number < 0) {
			System.out.println("The number is negative.");
		} else {
			System.out.println("The number is positive.");
		}
		scanner.close();
	}

}
