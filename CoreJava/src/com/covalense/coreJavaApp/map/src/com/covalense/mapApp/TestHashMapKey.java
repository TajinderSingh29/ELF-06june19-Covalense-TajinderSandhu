package com.covalense.mapApp;

import java.util.HashMap;
import java.util.Set;

public class TestHashMapKey {
	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("One", 1);
		hm.put("Two", 2);
		hm.put("Three", 3);
		hm.put("Four", 4);

		Set<String> ts = hm.keySet();
		for (String s : ts) {
			System.out.println(s);
		}
	}
}
