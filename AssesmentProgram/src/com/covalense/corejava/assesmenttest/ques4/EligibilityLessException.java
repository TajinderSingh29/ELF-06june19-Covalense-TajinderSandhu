package com.covalense.corejava.assesmenttest.ques4;

public class EligibilityLessException extends RuntimeException {
	private String message;

	public EligibilityLessException(String message) {
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
