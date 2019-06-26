package com.covalense.corejavaapp.threads;

public class MarkerTest {
	public static void main(String[] args) {
		
		Marker m=new Marker();
		
		Thread t1=new Thread(m);
		t1.start();
		
		Thread t2=new Thread(m);
		t2.start();
	}

}
