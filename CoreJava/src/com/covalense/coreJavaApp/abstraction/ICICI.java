package com.covalense.corejavaapp.abstraction;

public class ICICI implements ATMCard {

	public void validate() {
		System.out.println("Card is Validate by ICICI");

	}

	public void info() {
		System.out.println("Information Check by ICICI ");
	}

}
