package com.covalense.coreJavaApp.expection;

public class TestV {
	public static void main(String[] args) {
		System.out.println("Main Started");
		Validater v=new Validater();
		try {
			v.validate("ish");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Main Ended");
	}

}
