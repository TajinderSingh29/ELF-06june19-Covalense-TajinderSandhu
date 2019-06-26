package com.covalense.corejavaapp.collectionApp.foreachloop;

import java.util.Iterator;
import java.util.TreeSet;

public class TestGenericTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();

		ts.add(15);
		ts.add(25);
		ts.add(35);
		ts.add(45);
		System.out.println(ts);
		System.out.println("******************");
		for (Object t : ts) {
			System.out.println(t);
		}
		System.out.println("******************");
		Iterator<Integer> it = ts.iterator();
		while (it.hasNext()) {
			Object r = it.next();
			System.out.println(r);
		}
	}

}
