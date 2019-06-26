package com.covalense.corejavaapp.constructorrefernce;

import lombok.extern.java.Log;

@Log
public class Pen {
	Pen() {
		log.info("Zero Parameterized constructor");
	}

	void write() {
		log.info("Pen write() method is call");
	}

}
