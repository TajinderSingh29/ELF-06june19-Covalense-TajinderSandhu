package com.covalense.mapApp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class TestHashMapValue {
	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("One", 1);
		hm.put("Two", 2);
		hm.put("Three", 3);
		hm.put("Four", 4);

		Collection<Integer> ci = hm.values();
		Iterator<Integer> it = ci.iterator();
		while (it.hasNext()) {
			Integer r = it.next();
			System.out.println(r);
		}
	}
}
