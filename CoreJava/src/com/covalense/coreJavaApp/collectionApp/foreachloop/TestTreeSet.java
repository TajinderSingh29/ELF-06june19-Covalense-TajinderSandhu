package com.covalense.corejavaapp.collectionApp.foreachloop;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();

		ts.add(1.5);
		ts.add(2.6);
		ts.add(3.9);
		ts.add(3.8);
		System.out.println(ts);
		System.out.println("******************");
		for (Object t : ts) {
			System.out.println(t);
		}
		System.out.println("******************");
		Iterator it = ts.iterator();
		while (it.hasNext()) {
			Object r = it.next();
			System.out.println(r);
		}
	}

}
