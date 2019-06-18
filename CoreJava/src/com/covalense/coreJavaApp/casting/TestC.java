package com.covalense.coreJavaApp.casting;

public class TestC {
	public static void main(String[] args) {
		Chips c = new Lays();
		Lays l = (Lays) c;
		l.open();
		l.eat();
		System.out.println("*****************************");
		Chips t = new Bingo();
		Bingo b = (Bingo) t;
		b.open();
		b.byteBingo();

	}

}
