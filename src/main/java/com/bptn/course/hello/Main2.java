package com.bptn.course.hello;

import java.util.HashMap;

public class Main2 {

	public static String solve(int[] arr, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(i, arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			int difference = target - arr[i];
			if (map.containsValue(difference)) {
				return ("[" + i + "," + map.get(difference) + "]");
			}
		}
		return null;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 1, 2, 3 };
		int target = 3;
		System.out.println(solve(arr, target));

	}

}
