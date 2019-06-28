package com.covalense.corejava.assesmenttest.ques2;

import lombok.extern.java.Log;

/**
 * 
 * WAP to calculate simple interest using lambda expression
 *
 */
@Log
public class SimpleInterestTest {
	public static void main(String[] args) {
		SimpleInterestCalculate s = (a, b, c) -> a * b * c / 100.0;
		double afterCalculation = s.simpleInterest(100, 5, 6.6);
		log.info("Simple Interest is " + afterCalculation);
	}

}
