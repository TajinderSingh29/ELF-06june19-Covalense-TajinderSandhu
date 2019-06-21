package com.covalense.corejavaapp.abstraction;

public class Machine {

	void slot(ATMCard ac) {
		ac.validate();
		ac.info();
	}
}
