package com.covalense.corejavaapp.threads;

import lombok.extern.java.Log;

@Log
public class Marker implements Runnable {

	@Override
	public void run() {
		log.info("run in marker");
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			log.info("run() call " + i);
		}
	}

}
