package com.bptn.course._week1_._day1_;

public class WeatherChannel {
	public static void main(String[] args) {
		double temperature = 70.5;
		int radioChannel = 101;
		boolean sunny = true;

		// Imagine that this is a weather news channel reporting on the weather for the
		// day,
		// with temperature in degrees Fahrenheit.
		System.out.print("Welcome to the weather report on Channel ");
		System.out.println(radioChannel);
		System.out.print("The temperature today is ");
		System.out.println(temperature);
		System.out.print("Is it sunny today? ");
		System.out.println(sunny);
	}
}
