package com.shree.apexjavalearning;

public class TestArray {
	public static void main(String[] args) {
		int[] array = new int[10];
		
		int[] otherArr = new int[] {1, 2, 3};
		System.out.println(array[3]);
		//System.out.println(otherArr[3]);// ArrayIndexOutOfBounds Exception
		int value = 100;
		for(int i = 0; i < array.length; i++) {
			array[i] = value + i;
			System.out.println(array[i]);
		}
	}
}
