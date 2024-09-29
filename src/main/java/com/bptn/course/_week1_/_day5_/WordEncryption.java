package com.bptn.course._week1_._day5_;

import java.util.Scanner;

public class WordEncryption {
	public static void main(String[] args) {

		// Initialize scanner
		Scanner scan = new Scanner(System.in);
		// Initialize variable
		String word;
		String encryptedWord = "";

		// Ask for user input
		System.out.println("Please enter a word: ");
		word = scan.nextLine();

		// Perform Encryption
		for (int i = 0; i < word.length(); i++) {

			if (Character.isDigit(word.charAt(i)) || !(Character.isLetter(word.charAt(i)))) { // Checking if the
																								// character is a digit
																								// or if character is
																								// not a letter by using
																								// Character.isDigit()
																								// and
																								// Character.isLetter()
																								// methods respectively
				encryptedWord += (char) (word.charAt(i)); // Adding the character to encryptedWord
			} else if (word.charAt(i) == 'Z') { // If char is equal to 'Z', wrap back around to 'A'
				encryptedWord += 'A';
			} else if (word.charAt(i) == 'z') { // If char is equal to 'z', wrap back around to 'a'
				encryptedWord += 'a';
			} else {
				encryptedWord += (char) (word.charAt(i) + 1); // Shift the character by one and add it to encryptedWord
			}
		}

		System.out.println("Encrypted word: " + encryptedWord); // Print out encryption message

		scan.close();
	}
}

/*
 * 
 * Two things about this task were new to me. Firstly is how to check if a
 * character is a digit or not. I was able to figure out that There's a method
 * called Character.isDigit() that checks whether a character is a digit and
 * returns a boolean true or false. This method helped me in checking if a
 * character is a digit so I don't perform a shift. Another thing that I learned
 * is how to shift a character by one and I figured out that all that I need to
 * do is just add 1 to the character to shift it. One problem that I encountered
 * is that when I tried to shift a character by one, it would print out the
 * ASCII value and not the character itself. How I solved that The problem is
 * that I had to cast the output to char to get back the character and not the
 * ASCII code of that character. From this lesson I'll be sure to remember how
 * to check for if a character is a digit by using the method
 * Character.isDigit() and also how to shift a character by one or more.
 * 
 * 
 */
