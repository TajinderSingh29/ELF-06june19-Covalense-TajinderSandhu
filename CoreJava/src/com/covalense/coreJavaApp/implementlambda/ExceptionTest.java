package com.covalense.corejavaapp.implementlambda;

import lombok.extern.java.Log;

@Log
public class ExceptionTest {
	public static void main(String[] args) {
		try {

		} catch (ArithmeticException | NullPointerException e) {
			log.info(e.getMessage() + "");
		} catch (Exception e) {
			log.info(e.getMessage() + "");
		}
	}

}
