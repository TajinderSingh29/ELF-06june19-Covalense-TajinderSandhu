package com.covalense.exceptionapp.assignment;

public class IdCheckedException extends Exception {
	private String message;

	public IdCheckedException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return message;
	}

}
