package com.bptn.course._week1_._day1_;

public class C9 {
	public static void main(String[] args) {
		double height = 60; // in inches (60 inches is 5 feet)
		double weight = 110; // in pounds
		double heightSquared = height * height;
		double bodyMassIndex = weight / heightSquared;
		double bodyMassIndexMetric = bodyMassIndex * 703;
		System.out.println(bodyMassIndexMetric);
	}
}
