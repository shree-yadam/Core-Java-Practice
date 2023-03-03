package com.shree.apexjavalearning.multi_threading;

public class ThreadA implements Runnable {

	@Override
	public void run() {
		System.out.println("Starting thread A");
		for(int i = 0; i < 100; i += 2) {
			System.out.println(i);
		}
		System.out.println("Thread A finished");
	}

}
