package com.bptn.course._week1_._day2_;

//FREEZE CODE BEGIN
import java.util.Scanner;

public class UserInfo {
	public static void main(String[] args) {
		// Create an object from scanner class
		Scanner myObj = new Scanner(System.in);

		// Print a statement on the console
		System.out.println("Enter you name , favourite city, age and salary");
//FREEZE CODE END
		// Get string input for name

		String name;
		name = myObj.nextLine();
		// Get string input for fav city
		String favCity;
		favCity = myObj.nextLine();

		// Get numerical input for user's age

		int age;
		age = myObj.nextInt();
		// Get numerical input for user's salary
		int salary;
		salary = myObj.nextInt();
//FREEZE CODE BEGIN     
		// Output of all the inputs provided by the user
		System.out.println("Name: " + name);
		System.out.println("Favourite city : " + favCity);
		System.out.println("Age : " + age);
		System.out.println("Salary : " + salary);

		// Question for you: why is this here? Edit this comment to explain: what does
		// it do and why?
		myObj.close();
	}
}
//FREEZE CODE END
