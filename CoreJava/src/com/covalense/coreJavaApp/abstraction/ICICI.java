package com.covalense.coreJavaApp.abstraction;

public class ICICI implements ATMCard {

	public void validate() {
		System.out.println("Card is Validate by ICICI");

	}

	public void info() {
		System.out.println("Information Check by ICICI ");
	}

}
