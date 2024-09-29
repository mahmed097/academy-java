package com.bptn.course._week1_._day1_;

public class C10 {
	public static void main(String[] args) {
		double gallonPrice = 2.35;
		double milesPerGallon = 40;
		double totalFunds = 8.0;
		double numGallons = totalFunds / gallonPrice;
		double distance = numGallons * milesPerGallon;
		System.out.println(distance);
	}
}
