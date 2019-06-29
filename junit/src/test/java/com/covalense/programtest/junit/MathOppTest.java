package com.covalense.programtest.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.covalense.junit.MathOpp;

public class MathOppTest {
	private MathOpp m = new MathOpp();

	@Test
	public void testAddMethod() {
		assertEquals(15, m.add(10, 5));
	}

	@Test
	public void testDivMethod() {
		assertEquals(5, m.div(25, 5));
	}

	@Test(expected = ArithmeticException.class)
	public void testDivForException() {
		m.div(25,0);

	}

}
