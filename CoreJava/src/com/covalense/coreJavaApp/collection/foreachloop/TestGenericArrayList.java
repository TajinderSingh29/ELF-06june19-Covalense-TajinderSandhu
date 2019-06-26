package com.covalense.corejavaapp.collection.foreachloop;

import java.util.ArrayList;

public class TestGenericArrayList {
	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(9.2);
		al.add(2.0);
		al.add(23.0);
		al.add(25.6);
		for (int i = 0; i < al.size(); i++) {
			Double d = al.get(i);
			System.out.println(d);

		}
	}

}
