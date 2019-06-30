package com.covalense.exceptionapp.assignment;

import lombok.extern.java.Log;

@Log
public class CheckedExceptionTest {
	public static void main(String[] args) {
		log.info("Main Started");
		ValidaterException validaterException = new ValidaterException();
		try {
			validaterException.validate(0);
		} catch (IdCheckedException e) {
			log.info(e.getMessage() + "");
		}
		log.info("Main Ended");

	}

}
