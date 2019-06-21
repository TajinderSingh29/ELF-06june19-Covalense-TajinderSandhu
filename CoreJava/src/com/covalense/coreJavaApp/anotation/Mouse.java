package com.covalense.corejavaapp.anotation;

public class Mouse {
	
	void click() {
		System.out.println("click() method is call");
	}
	
	void doubleclick() {
		System.out.println("doubleclick() method is call");
	}
	
	@Deprecated
	void scroll() {
		System.out.println("scroll() method is call");
	}

}
