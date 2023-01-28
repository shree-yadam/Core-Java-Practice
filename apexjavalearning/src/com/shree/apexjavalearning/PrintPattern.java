package com.shree.apexjavalearning;

public class PrintPattern {
	public static void main(String[] args) {
		//rightTriangleStarPattern(8);
		//leftTriangleStarPattern(8);
		//pyramidStarPattern(6);
		//diamondStarPattern(11);
		//downwardTriangleStarPattern(6);
		//reversePyramidStarPattern(7);
		//rightDownMirrorStarPattern(8);
		//rightPascalTrianglePattern(11);
		//leftPascalTrianglePattern(11);
		//sandglassStarPattern(6);
		hollowSquarePattern(5);
	}
	
	public static void rightTriangleStarPattern(int depth) {
		for(int i = 0; i < depth; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	public static void leftTriangleStarPattern(int depth) {
		for(int i = 0; i < depth; i++) {
			for(int j = 0; j < depth - i - 1; j++) {
				System.out.print("  ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	public static void pyramidStarPattern(int depth) {
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
	
	public static void diamondStarPattern(int maxDepth) {
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
				System.out.print("* ");
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
	
	public static void rightDownMirrorStarPattern(int depth) {
		for(int i = depth; i > 0; i-- ) {
			for(int j = depth; j >= i ; j--) {
				System.out.print("  ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	public static void rightPascalTrianglePattern(int maxDepth) {
		int depth = (maxDepth%2 == 0) ? maxDepth - 1: maxDepth;
		
		rightTriangleStarPattern(depth/2 + 1);
		downwardTriangleStarPattern(depth/2);
	}
	
	public static void leftPascalTrianglePattern(int maxDepth) {
		int depth = (maxDepth%2 == 0) ? maxDepth - 1: maxDepth;
		
		leftTriangleStarPattern(depth/2 + 1);
		rightDownMirrorStarPattern(depth/2);
	}
	
	public static void sandglassStarPattern(int depth) {
		
		reversePyramidStarPattern(depth);
		pyramidStarPattern(depth);
	}
	
	public static void hollowSquarePattern(int width) {
		for(int i = 0; i < width; i++) {
			System.out.print("* ");
		}
		for(int i = 0; i < width - 2; i++) {
			System.out.println("");
			System.out.print("* ");
			for(int j = 0; j < width - 2; j++) {
				System.out.print("  ");
			}
			System.out.print("* ");
		}
		System.out.println("");
		for(int i = 0; i < width; i++) {
			System.out.print("* ");
		}
	}

}
