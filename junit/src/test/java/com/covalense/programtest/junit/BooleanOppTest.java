package com.covalense.programtest.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.covalense.junit.BooleanOpp;

public class BooleanOppTest {
	private BooleanOpp bp = new BooleanOpp();

	@Test
	public void testoddEven() {
		assertEquals(true, bp.oddEven(7));
	}

}
