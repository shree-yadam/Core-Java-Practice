package com.shree.apexjavalearning;

public class PrintPattern {
	public static void main(String[] args) {
		//printRightTriangleStarPattern(8);
		printleftTriangleStarPattern(8);
	}
	
	public static void printRightTriangleStarPattern(int depth) {
		for(int i = 0; i < depth; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	public static void printleftTriangleStarPattern(int depth) {
		for(int i = 0; i < depth; i++) {
			for(int j = 0; j < depth - i; j++) {
				System.out.print("  ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
