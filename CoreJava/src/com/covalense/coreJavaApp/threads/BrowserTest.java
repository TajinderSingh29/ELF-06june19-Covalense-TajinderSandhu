package com.covalense.corejavaapp.threads;

public class BrowserTest {
	public static void main(String[] args) {
		PVR p = new PVR();

		Browsers t1 = new Browsers(p);
		t1.start();
		
		Browsers t2 = new Browsers(p);
		t2.start();
		
		Browsers t3 = new Browsers(p);
		t3.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		p.leaveMe();
	}

}
