package com.covalense.corejavaapp.collection.foreachloop;

import java.util.HashSet;
import java.util.Iterator;

public class TestGenericHashSet {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Trisha");
		hs.add("Dinga");
		hs.add("Vipin");
		hs.add("Sonu");
		System.out.println(hs);
		System.out.println("******************");
		for (Object t : hs) {
			System.out.println(t);
		}
		System.out.println("******************");
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			Object r = it.next();
			System.out.println(r);
		}
	}

}
