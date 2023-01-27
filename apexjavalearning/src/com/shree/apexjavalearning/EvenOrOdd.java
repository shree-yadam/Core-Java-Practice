package com.shree.apexjavalearning;

import java.util.Scanner;

public class EvenOrOdd {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		if(isEven(num)) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}
		
	}
	
	public static boolean isEven(int num) {
		return (num%2 == 0);
	}

}
