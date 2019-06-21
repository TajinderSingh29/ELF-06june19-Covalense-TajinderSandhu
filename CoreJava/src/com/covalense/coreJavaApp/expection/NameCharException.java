package com.covalense.corejavaapp.expection;

public class NameCharException extends RuntimeException {

	private String message;

	public NameCharException(String message) {
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
