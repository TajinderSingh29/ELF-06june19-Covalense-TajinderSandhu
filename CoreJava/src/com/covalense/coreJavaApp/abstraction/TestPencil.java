package com.covalense.coreJavaApp.abstraction;

public class TestPencil {
	public static void main(String[] args) {

		Pencil p = new Marker();
		p.write();
		p.draw();
		p.color();
	}

}
