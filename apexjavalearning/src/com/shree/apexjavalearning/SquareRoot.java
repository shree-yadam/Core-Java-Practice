package com.shree.apexjavalearning;

public class SquareRoot {
	public static void main(String[] args) {
		
		int x = 4;
		System.out.println("Square root of " + x + " is " + getSqrt(x));
	}
	
	public static double getSqrt(double num) {
		return Math.sqrt(num);
	}

}
