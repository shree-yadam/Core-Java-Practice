package com.shree.apexjavalearning;

public class TestString {
	public static void main(String[] args) {
		String str = "java";
		str += " changed";
		
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer("Java");
		
		sb.append(" changed buffer");
		
		System.out.println(sb.toString());
	}
}
