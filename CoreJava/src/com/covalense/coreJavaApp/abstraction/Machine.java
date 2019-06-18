package com.covalense.coreJavaApp.abstraction;

public class Machine {

	void slot(ATMCard ac) {
		ac.validate();
		ac.info();
	}
}
