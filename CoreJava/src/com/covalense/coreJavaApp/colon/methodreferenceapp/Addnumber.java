package com.covalense.corejavaapp.colon.methodreferenceapp;

import lombok.extern.java.Log;

@Log
public class Addnumber {

	public static void main(String[] args) {
		MyMath a = Demo::sum;
		int i = a.add(10, 5);
		log.info("Sum is " + i);

	}

}
