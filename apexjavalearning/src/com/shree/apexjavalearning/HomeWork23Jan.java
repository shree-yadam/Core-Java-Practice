package com.shree.apexjavalearning;

import java.util.Scanner;

public class HomeWork23Jan {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Boolean isCorrectInput = true;
		
		do {
			isCorrectInput = true;
			
			System.out.println("Enter the left operand: ");
			int x = sc.nextInt();
			
			System.out.println("Enter the right operand: ");
			int y = sc.nextInt();
			
			System.out.println("Please select the operation you want to perform. Enter the number: ");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("Enter the number: ");
			
			int operation = sc.nextInt();
	
			switch(operation) {
			
			case 1:
				System.out.println(x + " + " + y + " = " + sum(x, y));
				break;
			case 2:
				System.out.println(x + " - " + y + " = " + diff(x, y));
				break;
			case 3:
				System.out.println(x + " x " + y + " = " + product(x, y));
				break;
			case 4:
				System.out.println(x + " / " + y + " gives quotient " + quotient(x, y) + " and remainder " + remainder(x, y));
				break;
			default:
				isCorrectInput = false;
				System.out.println("Invalid value: Try again!");
				
			}
		
		} while(!isCorrectInput);
	}

	static int sum(int x, int y) {
		return x + y;
	}
	
	static int diff(int x, int y) {
		return x - y;
	}
	
	static int product(int x, int y) {
		return x * y;
	}
	
	static int quotient(int x, int y) {
		return x/y;
	}
	
	static int remainder(int x, int y) {
		return x % y;
	}
}


