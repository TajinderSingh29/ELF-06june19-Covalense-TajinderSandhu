package com.covalense.coreJavaApp.inheritance;

public class TestPen {
	public static void main(String[] args) {
		
		
		Pen p1=new Pen();

		p1.cost=10;
		p1.write();
		System.out.println(" ");
		
		
		Pen p=new Marker();

		p.cost=20;
		p.write();
		//p.color();
		System.out.println(" ");
		Marker m=new Marker();
		m.cost=50;
		m.write();
		m.color();
	}

}
