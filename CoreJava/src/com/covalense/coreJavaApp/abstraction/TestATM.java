package com.covalense.corejavaapp.abstraction;

public class TestATM {
	public static void main(String[] args) {
		Machine m = new Machine();
		ICICI ic = new ICICI();
		HDFC hd = new HDFC();
		SBI s = new SBI();

		m.slot(ic);

		System.out.println("****************************");
		m.slot(hd);
		System.out.println("****************************");
		m.slot(s);

	}

}
