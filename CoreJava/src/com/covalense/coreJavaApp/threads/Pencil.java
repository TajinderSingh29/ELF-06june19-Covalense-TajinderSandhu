package com.covalense.corejavaapp.threads;

import lombok.extern.java.Log;

@Log
public class Pencil extends Thread {
	@Override
	public void run() {
		String s = getName();
		log.info("Run() output " + s);
	}
}
