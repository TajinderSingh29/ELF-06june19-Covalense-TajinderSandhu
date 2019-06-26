package com.covalense.corejavaapp.colon.methodreferenceapp;

import lombok.extern.java.Log;

@Log
public class ColonTest {
	static void open() {
		log.info("********Open Method*********");
		log.info("----->Logic to open the door");
	}

	public static void main(String[] args) {
		Room r=ColonTest::open;
		r.remove();

	}

}
