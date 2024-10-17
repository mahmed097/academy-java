package com.bptn.course._28_sorting_algorithms;

import java.util.Arrays;

public class InsertionSort {

	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j -= 1;
			}
			arr[j + 1] = key;
		}
	}

	public static void main(String[] args) {

		int[] arr = { 5, 3, -1, 7, 10, 2 };
		System.out.println("Before sort: " + Arrays.toString(arr));

		insertionSort(arr);

		System.out.println("After sort: " + Arrays.toString(arr));

	}

}
