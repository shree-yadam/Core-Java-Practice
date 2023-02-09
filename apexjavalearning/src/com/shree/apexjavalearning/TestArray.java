package com.shree.apexjavalearning;

public class TestArray {
	public static void main(String[] args) {
		int[] array = new int[10];
		
		int[] otherArr = new int[] {1, 2, 3};
		System.out.println(array[3]);
		System.out.println(otherArr[3]);// ArrayIndexOutOfBounds Exception
	}
}
