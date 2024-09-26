package com.bptn.course._03_flow_control._04_switch_statement;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to the menu!");
		System.out.println("Please choose a item form the list: ");
		System.out.println("1. Burgers - 8.99");
		System.out.println("2. Pizza - 12.99");
		System.out.println("3. Pasta - 9.99");
		System.out.println("4. Rice - 5.99");
		System.out.println("5. Salad - 6.99");
		System.out.println("6. Exit ");

		double burger = 8.99;
		double pizza = 12.99;
		double pasta = 9.99;
		double rice = 5.99;
		double salad = 6.99;

		double total = 0.0;

		int choice = scan.nextInt();

		while (choice != 6) {

			switch (choice) {
			case 1:
				System.out.println("You Ordered Burger!");
				total += burger;
				System.out.println("Do you want anything else");
				choice = scan.nextInt();
				break;
			case 2:
				System.out.println("You Ordered Pizza!");
				total += pizza;
				System.out.println("Do you want anything else");
				choice = scan.nextInt();
				break;
			case 3:
				System.out.println("You Ordered Pasta!");
				total += pasta;
				System.out.println("Do you want anything else");
				choice = scan.nextInt();
				break;
			case 4:
				System.out.println("You Ordered Rice!");
				total += rice;
				System.out.println("Do you want anything else");
				choice = scan.nextInt();
				break;
			case 5:
				System.out.println("You Ordered Salad!");
				total += salad;
				System.out.println("Do you want anything else");
				choice = scan.nextInt();
				break;
			default:
				System.out.println("Invalid Choice choose again");
				choice = scan.nextInt();

			}
		}
		System.out.println("You Exited The Menu");
		System.out.println("Your Total Price is " + total);
		scan.close();

	}

}
