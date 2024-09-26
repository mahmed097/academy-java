package com.bptn.course._03_flow_control._04_switch_statement;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// if-else, nested-if, if-else-if-ladder
		
		System.out.println("Enter a number (1-7): ");
		int day = scan.nextInt();
		// Switch Case 
		switch(day) {
		case 1: System.out.println("Monday");
		break;
		case 2: System.out.println("Tuesday");
		break;
		case 3: System.out.println("Wednesday");
		break;
		case 4: System.out.println("Thursday");
		break;
		case 5: System.out.println("Friday");
		break;
		case 6: System.out.println("Saturday");
		break;
		case 7: System.out.println("Sunday");
		break;
		default: System.out.println("Invalid Number");
		
		}
		
	}
}
