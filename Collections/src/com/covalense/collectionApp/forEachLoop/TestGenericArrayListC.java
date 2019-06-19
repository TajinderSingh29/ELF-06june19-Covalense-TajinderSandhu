package com.covalense.collectionApp.forEachLoop;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestGenericArrayListC {
	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(9.2);
		al.add(2.0);
		al.add(23.0);
		al.add(25.6);
		System.out.println("********Forward");
		ListIterator<Double> it = al.listIterator();
		while (it.hasNext()) {
			Double d = it.next();
			System.out.println(d);

		}
		System.out.println("********BackWard");
		while (it.hasPrevious()) {
			Double d = it.previous();
			System.out.println(d);

		}
	}

}
