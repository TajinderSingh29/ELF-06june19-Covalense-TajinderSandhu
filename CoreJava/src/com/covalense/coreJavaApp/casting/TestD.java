package com.covalense.corejavaapp.casting;

public class TestD {
	public static void main(String[] args) {
		Animal a = new Cow();
		Cow c = (Cow) a;
		System.out.println(c.i = 5);
		c.eat();
		System.out.println(c.x = 6);
		c.run();
	}

}
