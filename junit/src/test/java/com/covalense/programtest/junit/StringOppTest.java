package com.covalense.programtest.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.covalense.junit.StringOpp;

public class StringOppTest {
	private StringOpp strOpp = new StringOpp();

	@Test
	public void testcountCharInString() {
		assertEquals(5, strOpp.countCharInString("ramya"));
	}

	@Test(expected = NullPointerException.class)
	public void testcountCharInStringForException() {
		strOpp.countCharInString(null);
	}
}
