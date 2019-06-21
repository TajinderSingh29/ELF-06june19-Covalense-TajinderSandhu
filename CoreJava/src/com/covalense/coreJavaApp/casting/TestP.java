package com.covalense.corejavaapp.casting;

public class TestP {
	public static void main(String[] args) {
		Pen p = new Marker();
		Marker m = (Marker) p;
		System.out.println(m.cost = 20);
		m.write();
		System.out.println(m.size = 2.0);
		m.color();
	}

}
