package com.covalense.exceptionapp.assignment;

import lombok.extern.java.Log;

@Log
public class UncheckedExceptionTest {
	public static void main(String[] args) {
		ValidaterForName validaterForName = new ValidaterForName();
		
		try {
			validaterForName.validate("Ish");
		} catch (Exception e) {
			log.info(e.getMessage()+"");
		}

	}

}
