package com.practice.threads;

public class ThreadExample {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			MultithreadThing myThing = new MultithreadThing(i);
			Thread myThread = new Thread(myThing);
			myThread.start();
			try {
				myThread.join();
			} catch (InterruptedException e) {

			}
		}
	}
}
