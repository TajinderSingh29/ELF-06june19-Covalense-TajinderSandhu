package com.covalense.corejava.assesmenttest.ques4;

import lombok.extern.java.Log;

/**
 * 
 * WAP to create a custom exception to validate student eligibility for the
 * exam.
 *
 */
@Log
public class CustomExceptionTest {
	public static void main(String[] args) {
		ValidateException validateException = new ValidateException();

		try {
			validateException.validate(30);
		} catch (Exception e) {
			log.info(e.getMessage() + "");
		}

	}

}
