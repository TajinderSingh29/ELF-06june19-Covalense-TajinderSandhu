package com.covalense.corejavaapp.collection.foreachloop;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {
	public static void main(String[] args) {
		HashSet hs = new HashSet();

		hs.add(15);
		hs.add(2.6);
		hs.add('A');
		hs.add("Riya");
		System.out.println(hs);
		System.out.println("******************");
		for (Object t : hs) {
			System.out.println(t);
		}
		System.out.println("******************");
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			Object r = it.next();
			System.out.println(r);
		}

	}

}
