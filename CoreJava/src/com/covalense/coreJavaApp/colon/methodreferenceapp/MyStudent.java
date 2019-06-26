package com.covalense.corejavaapp.colon.methodreferenceapp;

import lombok.extern.java.Log;

@Log
public class MyStudent {

	void average(int a, int b, int c) {
		double r = (a + b + c) / 3.0;
		log.info("Average is " + r);
	}
	
	int myFact(int a) {
		int f=1;
		for (int i = 0; i < a; i++) {
			f=f+i;
		}
		return f;
	}

}
