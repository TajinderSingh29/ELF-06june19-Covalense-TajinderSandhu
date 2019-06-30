package com.covalense.assignmentApp;

public class PrimeNumber {
	public static void main(String[] args) {
		int num = 3;
		int count = 0;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count > 1) {
			System.out.println("Number is not prime number " + num);
		} else {
			System.out.println("Number is prime number " + num);

		}

	}
}