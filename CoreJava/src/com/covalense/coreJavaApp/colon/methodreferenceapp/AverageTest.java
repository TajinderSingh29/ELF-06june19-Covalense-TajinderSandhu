package com.covalense.corejavaapp.colon.methodreferenceapp;

public class AverageTest {
	public static void main(String[] args) {
		MyStudent ms = new MyStudent();
		Average a = ms::average;

		a.avg(15, 24, 35);

	}

}
