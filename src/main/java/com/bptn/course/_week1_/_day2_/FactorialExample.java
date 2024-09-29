package com.bptn.course._week1_._day2_;

import java.util.Scanner;

public class FactorialExample {
	public static void main(String[] args) {

		// Fill in the code below
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input = ");
		int number = scanner.nextInt();

		int factorialNumber = 1;

		for (int i = 1; i <= number; i++) {
			factorialNumber *= i;
		}

		System.out.println("Output = " + factorialNumber);
		
		scanner.close();

	}
}
