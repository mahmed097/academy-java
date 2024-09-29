package com.bptn.course._week1_._day2_;

public class Fibonacci {
	public static void main(String[] args) {

		// Predefined numbers to start off the Fibonacci series:
		int num1 = 0;
		int num2 = 1;

		// Print the first two numbers of the Fibonacci series:
		System.out.println(num1);
		System.out.println(num2);

		// Print the next 8 numbers of the Fibonacci series:
		for (int i = 0; i < 8; i++) {
			int num3 = num1 + num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
		}
	}
}
