package com.covalense.corejavaapp.collection.foreachloop;

import java.util.ArrayList;

public class TestArrayListA {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(15);
		al.add(9.2);
		al.add('A');
		al.add("Riya");
		al.add(105);
		al.add(91.2);

		for (Object t : al) {
			System.out.println(t);
		}
	}
}
