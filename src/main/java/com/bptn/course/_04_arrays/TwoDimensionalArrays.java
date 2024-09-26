package com.bptn.course._04_arrays;

public class TwoDimensionalArrays {

	public static void main(String[] args) {

		int[][] grades = { { 85, 90, 75 }, { 88, 92, 60 }, { 70, 65, 75 } };

//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				grades[i][j] += 2;
//				System.out.println(grades[i][j]);
//				System.out.println("\t");
//			}
//		}
		//Added comment 
		
		int maxValue = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (grades[i][j] > maxValue) {
					maxValue = grades[i][j];
				}
			}
			System.out.println(maxValue);
			maxValue = 0;
		}

	}
}
