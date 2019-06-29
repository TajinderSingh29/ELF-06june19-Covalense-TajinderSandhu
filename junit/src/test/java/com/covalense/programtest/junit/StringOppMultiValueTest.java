package com.covalense.programtest.junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.covalense.junit.StringOpp;

@RunWith(Parameterized.class)
public class StringOppMultiValueTest {
	private String name;
	private int value;
	private StringOpp strOpp = new StringOpp();

	public StringOppMultiValueTest(String name, int value) {
		this.name = name;
		this.value = value;
	}

	@Parameters
	public static Collection<Object[]> getParis() {
		Object[][] obj = { { "apple", 5 }, { "sonu", 4 }, { "taj mahal", 9 } };
		return Arrays.asList(obj);
	}

	@Test
	public void testcountCharInString() {
		int result = strOpp.countCharInString(name);
		assertEquals(value, result);

	}
}
