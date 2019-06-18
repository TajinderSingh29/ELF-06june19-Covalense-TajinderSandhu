package com.covalense.coreJavaApp.abstraction;

public class HDFC implements ATMCard {

	public void validate() {
		System.out.println("Card is Validate by HDFC");

	}

	public void info() {
		System.out.println("Information Check by HDFC ");
	}

}
