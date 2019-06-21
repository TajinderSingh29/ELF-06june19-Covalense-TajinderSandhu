package com.covalense.corejavaapp.overloading;

public class TestPhone {
	public static void main(String[] args) {
		Girl g = new Girl();
		Phone p = new Phone();
		Iphone ip = new Iphone();
		MiPhone mip = new MiPhone();
		g.take(ip);
		g.take(mip);

	}

}
