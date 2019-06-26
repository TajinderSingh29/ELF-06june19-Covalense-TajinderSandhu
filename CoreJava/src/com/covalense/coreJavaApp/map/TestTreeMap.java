package com.covalense.corejavaapp.map;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args) {

		TreeMap<String, Double> tm = new TreeMap<String, Double>();
		tm.put("One", 1.2);
		tm.put("Two", 2.6);
		tm.put("Three", 3.4);
		tm.put("Four", 4.7);

		for (Map.Entry<String, Double> e : tm.entrySet()) {
			String key = e.getKey();
			Double val = e.getValue();

			System.out.println("Key is " + key);
			System.out.println("Value is " + val);
			System.out.println("************");

		}
	}

}
