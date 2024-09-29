package com.bptn.course._week1_._day3_;

public class StepsToZero {
	public static int numberOfSteps(int num) {
		int steps = 0;

		// Fill in the code below based on the problem statement
		while (num > 0) {
			if ((num % 2) == 0) {
				num = num / 2;
				steps++;
			} else {
				num -= 1;
				steps++;
			}
		}
		return steps;
	}

// FREEZE CODE BEGIN
	public static void main(String[] args) {
		// Test 1
		int num = 123;
		int steps = numberOfSteps(num);
		System.out.println("Number of steps to reduce " + num + " to zero: " + steps);

		// Test 2
		num = 14;
		steps = numberOfSteps(num);
		System.out.println("Number of steps to reduce " + num + " to zero: " + steps);
	}
}
// FREEZE CODE END
