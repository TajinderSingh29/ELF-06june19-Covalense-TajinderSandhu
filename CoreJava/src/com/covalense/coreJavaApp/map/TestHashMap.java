package com.covalense.corejavaapp.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("One", 1);
		hm.put("Two", 2);
		hm.put("Three", 3);
		hm.put("Four", 4);

		for (Map.Entry<String, Integer> e : hm.entrySet()) {
			String key = e.getKey();
			Integer val = e.getValue();

			System.out.println("Key is " + key);
			System.out.println("Value is " + val);
			System.out.println("************");

		}
	}

}
