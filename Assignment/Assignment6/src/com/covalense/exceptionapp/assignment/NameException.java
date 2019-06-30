package com.covalense.exceptionapp.assignment;

public class NameException extends RuntimeException {
	private String message;

	public NameException(String message) {
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
