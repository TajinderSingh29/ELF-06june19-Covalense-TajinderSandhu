package com.covalense.coreJavaApp.abstraction;

public class SBI implements ATMCard {

	public void validate() {
		System.out.println("Card is Validate by SBI");

	}

	public void info() {
		System.out.println("Information Check by SBI ");
	}

}
