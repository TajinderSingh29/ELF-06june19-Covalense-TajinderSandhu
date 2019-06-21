package com.covalense.corejavaapp.abstraction;

public class SBI implements ATMCard {

	public void validate() {
		System.out.println("Card is Validate by SBI");

	}

	public void info() {
		System.out.println("Information Check by SBI ");
	}

}
