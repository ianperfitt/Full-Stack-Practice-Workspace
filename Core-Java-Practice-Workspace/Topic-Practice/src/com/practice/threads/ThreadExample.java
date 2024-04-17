package com.practice.threads;

public class ThreadExample extends Thread {

	@Override
	public void run() {
		System.out.println("Inside : " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		Thread thread = new ThreadExample();
		thread.start();

	}

}
