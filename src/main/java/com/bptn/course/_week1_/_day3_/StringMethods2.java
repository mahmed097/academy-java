package com.bptn.course._week1_._day3_;

public class StringMethods2 {
	public static void main(String[] args) {
		String message = "Hello!";

		System.out.println(message.compareTo("Hello there"));
		System.out.println(message.compareTo("Hello!"));
		System.out.println(message.compareTo("And"));
		System.out.println(message.compareTo("Zoo"));

		System.out.println(message.equals("Hello!"));
		System.out.println(message.equals("hello!"));
	}
}
