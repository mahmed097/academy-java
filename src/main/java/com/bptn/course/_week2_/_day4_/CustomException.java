package com.bptn.course._week2_._day4_;

import java.util.Scanner;
public class CustomException {

    private static void validateFileExtension(String fileName) throws FileExtensionException {
            if(!(fileName.endsWith(".txt"))){ //check if the fileName doesn't end with .txt, if it doesn't throw a FileExtensionException error with message "File doesn't have .txt extension"
            throw new FileExtensionException("File doesn't have .txt extension"); //throw custom error message
        }
    }

    public static void main(String[] args) {
        // Write your code below.
        Scanner scan = new Scanner(System.in); //create scanner object
        System.out.println("Enter the file name with correct extension i.e. .txt ");
        String fileName = scan.next(); //get users filename 
        fileName.toLowerCase();

        try{
            validateFileExtension(fileName); //invoke the validateFileExtension() method 
            System.out.println("Correct file name with extension .txt"); //if no error happened at the validateFileExtension() method print this message 
        }catch(FileExtensionException e){
            System.out.println("Error: " + e.getMessage()); //print error message generated in the validateFileExtension() method
        } finally{
            scan.close(); //close scanner 
        }
    }
}

/*

This lesson has taught me how to use a try-catch-finally block and how to create
your own exceptions. One of the main problem that I came accross is that for the 
catch, I was putting in (validateFileExtension e) as a parameter when I was suppose to put 
(FileExtensionException e) as an parameter. This caused me to get an error. I know now 
that I have to include the thrown exceptions as the parameter in the catch, and I will for sure 
not make the same mistake again. 

*/


