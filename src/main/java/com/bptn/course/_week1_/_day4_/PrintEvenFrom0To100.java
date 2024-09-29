package com.bptn.course._week1_._day4_;

public class PrintEvenFrom0To100 {
	public static void main(String args[]) {
		int evenNumber = 1;

		System.out.print("Printing the  even numbers from 1 to 100: \n");

		for (int i = 1; i < 100; i++) { // for-loop from 1 to 100
			if (i % 2 != 0) { // if number is odd skip iteration
				continue;
			}
			System.out.println(i); // if even print i
		}

	}
}
