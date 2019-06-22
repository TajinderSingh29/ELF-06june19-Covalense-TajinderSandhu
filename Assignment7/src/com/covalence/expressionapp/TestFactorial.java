package com.covalence.expressionapp;

import lombok.extern.java.Log;

@Log
public class TestFactorial {
	public static void main(String[] args) {
		Factorial f = a -> {
			int k = 1;
			for (int i = 1; i <= a; i++) {
				k = k + i;
			}
			return k;
		};

		int res = f.fact(5);
		log.info("Result of factorial is " + res);
	}

}
