package com.covalense.corejavaapp.abstraction;

public class TestGoogle {
	public static void main(String[] args) {

		Browser b = new Browser();
		Gmail g = new Gmail();
		GDrive gd = new GDrive();

		b.open(gd);

	}

}
