package com.bptn.course._09_inheritance;

public class MathUtil {
 
// static dataType propertyName;
 static double valueOfPi = 3.14;
 static int count = 0;
 
 public MathUtil() {
	 addToCount();
 }
 
// static returnType methodName;
 static int add(int a, int b) {
  return a + b;
 }
 
 static void addToCount() {
	 count++;
 }
 
 public void displayData() {
  System.out.print("This is not static");
 }
 
 


}