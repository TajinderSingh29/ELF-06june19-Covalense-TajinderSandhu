package com.covalense.corejavaapp.threads;

public class Browsers extends Thread {
	PVR ref;

	Browsers(PVR ref) {
		this.ref = ref;
	}

	@Override
	public void run() {
		ref.book();
	}

}
