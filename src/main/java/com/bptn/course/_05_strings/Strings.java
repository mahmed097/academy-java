package com.bptn.course._05_strings;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {

		String userName = "   testuser";
//		System.out.println(userName.length());
//		System.out.println(userName.charAt(2));
//		System.out.println(userName.substring(4));
//		System.out.println(userName.substring(2,4));
//		System.out.println(userName.equals("testusr"));

		Scanner scanner = new Scanner(System.in);

		System.out.println("Write down a name: ");
		String input = scanner.nextLine();
		input.trim();
		input.toLowerCase();

		int vowel = 0;
		int constant = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowel++;

			} else if (ch >= 'a' && ch <= 'z') {

				constant++;
			}

		}

		System.out.println("The number of vowels are: " + vowel);
		System.out.println("The number of constants are: " + constant);

	}
}
