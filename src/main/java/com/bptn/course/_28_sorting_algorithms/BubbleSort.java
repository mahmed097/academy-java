package com.bptn.course._28_sorting_algorithms;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		int[] arr = { 5, 3, -1, 7, 10, 2 };
		System.out.println("Before sort: " + Arrays.toString(arr));

		BubbleSort.bubbleSort(arr);

		System.out.println("After sort: " + Arrays.toString(arr));

	}

}
