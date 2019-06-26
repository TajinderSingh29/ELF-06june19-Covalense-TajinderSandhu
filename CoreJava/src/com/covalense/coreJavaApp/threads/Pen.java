package com.covalense.corejavaapp.threads;

import lombok.extern.java.Log;

@Log
public class Pen extends Thread {

	@Override
	public void run() {
		int a = 10;
		for (int i = 0; i < a; i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			log.info("Run() output " + i);
		}
	}

}
