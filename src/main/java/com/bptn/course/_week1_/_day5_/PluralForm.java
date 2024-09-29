package com.bptn.course._week1_._day5_;

import java.util.Scanner;

public class PluralForm {
	public static void main(String[] args) {

		// Initialize scanner
		Scanner scan = new Scanner(System.in);

		// Initialize variables
		int amt;
		String word;

		// Ask user for input
		System.out.println("# in: ");
		amt = scan.nextInt();

		// Check for non-negative integer values for amt
		while (amt < 0) {
			System.out.println("Please input non-negative integer values: ");
			System.out.println("# in: ");
			amt = scan.nextInt();
		}

		System.out.println("word: ");
		word = scan.nextLine(); // To consume the line break (more about this at the end of file)
		word = scan.nextLine();

		while (word.isEmpty()) { // Checks if user enters an empty line and ask user to enter a valid word
			System.out.println("Please input a word: ");
			System.out.println("word: ");
			word = scan.nextLine();
		}

		// Write all the test cases for all the rules

		if (amt == 1) { // Checking if number is = 1, if so just print the concatenation of the number
						// and the word
			System.out.println(amt + " " + word);
		} else if (((word.substring(word.length() - 2, word.length()))).equals("ay")
				|| ((word.substring(word.length() - 2, word.length()))).equals("oy")
				|| ((word.substring(word.length() - 2, word.length()))).equals("ey")
				|| ((word.substring(word.length() - 2, word.length()))).equals("uy")) { // Handle the case for "ay",
																						// "oy", "ey", "uy"
			System.out.println(amt + " " + word + "s");
		} else if (((word.substring(word.length() - 2, word.length()))).equals("fe")) { // Handle the case for replacing
																						// "fe" with "ves"
			System.out.println(amt + " " + word.substring(0, word.length() - 2) + "ves");
		} else if (((word.substring(word.length() - 1))).equals("y")) { // Handle the case for replacing "y" with "ves"
			System.out.println(amt + " " + word.substring(0, word.length() - 1) + "ies");
		} else if (((word.substring(word.length() - 2, word.length()))).equals("sh")
				|| ((word.substring(word.length() - 2, word.length()))).equals("ch")) { // Handle the case for "sh" or
																						// "ch" with adding "es" the end
			System.out.println(amt + " " + word + "es");
		} else if (((word.substring(word.length() - 2, word.length()))).equals("us")) { // Handle the case for replacing
																						// "us" with "i"
			System.out.println(amt + " " + word.substring(0, word.length() - 2) + "i");
		} else { // Add "s" to the end
			System.out.println(amt + " " + word + "s");
		}

		scan.close();

	}
}

/*
 * 
 * The new task that I learned for today is the use of the substring method in
 * the string object. I effectively learned how to use them to get the last
 * characters or a string to solve this problem. Main issue that I had for this
 * problem is how to get a subsection of a string, but I figured out that I can
 * use the substring() method to solve this problem for me. From this lesson I
 * will remember how to use the substring method, have a better grasp of if-else
 * and else-if statements and also the use of scanners as well.
 * 
 * 
 * One error that I encountered that I would like to share is a
 * StringIndexOutOfBoundsException when I try to incorporate nextLine() to read
 * the word. The reason I got that error is because when I try to read nextInt()
 * before nextLine() to get the user amt value, because nextInt() does not
 * consume any whitespace or newline, that means that if the user enters a
 * number and presses enter, there's still a line break in the stream. So when I
 * call nextLine() after nextInt(), it reads that line break and returns the
 * empty string, thus causing a StringIndexOutOfBoundsException. The solution
 * for this is to include 2 nextLine(), one to consume the line break and one to
 * read the users input and it worked for me and I didn't get that
 * StringIndexOutOfBoundsException error.
 * 
 */
