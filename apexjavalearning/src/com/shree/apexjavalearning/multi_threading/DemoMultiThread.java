package com.shree.apexjavalearning.multi_threading;

public class DemoMultiThread {
	public static void main(String[] args) {
		System.out.println("Main started!");
		
		Thread threadA = new Thread(new ThreadA());
		threadA.start();
		
		Thread threadB = new Thread(new ThreadB());
		threadB.start();
		
		System.out.println("Main finsihed");
	}
}
