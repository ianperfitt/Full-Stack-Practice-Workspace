package com.practice.unittesting;

public class SimpleCalculator {

	public int add(int numberA, int numberB) {
		if (numberA < 0 || numberB < 0) {
			throw new IllegalArgumentException();
		}
		return numberA + numberB;
	}
}