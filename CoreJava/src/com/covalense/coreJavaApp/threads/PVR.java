package com.covalense.corejavaapp.threads;

import lombok.extern.java.Log;

@Log
public class PVR {
	synchronized void book() {
		for (int i = 0; i < 5; i++) {
			log.info("book() call  " + i);
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	synchronized void leaveMe() {
		notify();
	}
}
