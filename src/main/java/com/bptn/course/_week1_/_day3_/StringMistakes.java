package com.bptn.course._week1_._day3_;

public class StringMistakes {
	public static void main(String[] args) {
		String str1 = "Hello!";

		// Print out the first letter?
		System.out.println("The first letter in " + str1 + ": " + str1.substring(0, 1));

		// Print out the last character?
		System.out.println("The last char. in " + str1 + ": " + str1.substring(5));

		// Print str1 in lower case
		String s = str1.toLowerCase();
		System.out.println("In lowercase: " + s);

	}
}
