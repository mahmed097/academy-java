package com.bptn.course.hello;

public class Main {

	public static String solve(int[] arr, int target) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					return ("[" + i + "," + j + "]");
				}
			}
		}
		return null;

	}

	public static void main(String[] args) {

		int[] arr = { 0, 1, 2, 3 };
		int target = 4;

		System.out.println(solve(arr, target));
	}
}
