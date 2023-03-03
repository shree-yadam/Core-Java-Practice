package com.shree.apexjavalearning.multi_threading;

public class ThreadB implements Runnable {

	@Override
	public void run() {
		System.out.println("Starting thread B");
		for(int i = 1; i < 100; i += 2) {
			System.out.println(i);
		}
		System.out.println("Thread B finished");
	}

}
