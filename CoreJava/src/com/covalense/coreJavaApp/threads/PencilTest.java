package com.covalense.corejavaapp.threads;

import lombok.extern.java.Log;

@Log
public class PencilTest {
	public static void main(String[] args) {
		log.info("Main Started");
		Pencil t1 = new Pencil();
		t1.setName("Bengari");
		t1.start();
		Pencil t2 = new Pencil();
		t2.setName("Saini");
		t2.start();
		log.info("Main Ended");
	}

}
