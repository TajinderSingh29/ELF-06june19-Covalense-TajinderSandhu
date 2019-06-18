package com.covalense.coreJavaApp.casting;

public class TestB {
	public static void main(String[] args) {
		Bus b = new Van();
		Van v = (Van) b;
		System.out.println(v.model = 3215);
		v.move();
		System.out.println(v.seats = 50);
		v.turn();
	}

}
