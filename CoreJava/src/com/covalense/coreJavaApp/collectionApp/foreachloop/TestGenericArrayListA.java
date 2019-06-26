package com.covalense.corejavaapp.collectionApp.foreachloop;

import java.util.ArrayList;

public class TestGenericArrayListA {
	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(9.2);
		al.add(2.0);
		al.add(23.0);
		al.add(25.6);

		for (Double d : al) {
			System.out.println(d);
		}
	}

}
