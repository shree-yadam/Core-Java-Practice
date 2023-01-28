package com.shree.apexjavalearning;

public class PrintPattern {
	public static void main(String[] args) {
		//printRightTriangleStarPattern(8);
		//printLeftTriangleStarPattern(8);
		//printPyramidStarPattern(6);
		//printDiamondStarPattern(11);
		//downwardTriangleStarPattern(6);
		reversePyramidStarPattern(7);
	}
	
	public static void printRightTriangleStarPattern(int depth) {
		for(int i = 0; i < depth; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	public static void printLeftTriangleStarPattern(int depth) {
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
	
	public static void printPyramidStarPattern(int depth) {
		for(int i = 0; i < depth; i++) {
			for(int j = 0; j < depth - i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	public static void printDiamondStarPattern(int maxDepth) {
		if(maxDepth%2 == 0) {
			maxDepth--;
		}
		
		int depth = maxDepth/2 + 1;
		
		for(int i = 0; i < depth; i++) {
			for(int j = 0; j < depth - i - 1; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2*i + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		depth--;
		for(int i = depth; i > 0; i--) {
			for(int j = 0; j <= depth - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2*i - 1; j++) {
				System.out.print("*");
			}

			System.out.println("");
		}
	}
	
	public static void downwardTriangleStarPattern(int depth) {
		for(int i = depth; i > 0; i--) {
			for(int j = 0; j < i; j++ ) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void reversePyramidStarPattern(int depth) {
		for(int i = depth; i > 0; i-- ) {
			for(int j = depth; j > i ; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
		
	}

}
