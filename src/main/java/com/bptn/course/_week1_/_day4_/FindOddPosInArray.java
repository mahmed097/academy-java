package com.bptn.course._week1_._day4_;

//FREEZE CODE BEGIN
public class FindOddPosInArray {
	public static void main(String[] args) {

		int[] numbers = new int[] { 10, 20, 30, 40, 50 };

		System.out.println("At odd indexes, the elements are: ");
//FREEZE CODE END

		// Add your code here
		for (int i = 0; i < numbers.length; i++) { // for-loop from index 0 to length of array
			if ((i % 2) == 0) { // if i is even skip iteration
				continue;
			}
			System.out.println(numbers[i]); // else i is odd and print the number at odd index
		}

	}
}
