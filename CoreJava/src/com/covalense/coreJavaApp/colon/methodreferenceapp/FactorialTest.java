package com.covalense.corejavaapp.colon.methodreferenceapp;

import lombok.extern.java.Log;

@Log
public class FactorialTest {
	public static void main(String[] args) {

		MyStudent ms = new MyStudent();
		MyFactorial f = ms::myFact;
		int i = f.getFact(5);
		log.info("Factorial is " + i);
	}

}
