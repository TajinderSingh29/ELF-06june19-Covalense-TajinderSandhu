package com.covalense.corejavaapp.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestLinkedHashMap {
	public static void main(String[] args) {

		LinkedHashMap<Character, Double> lhm = new LinkedHashMap<Character, Double>();
		lhm.put('A', 1.2);
		lhm.put('B', 2.6);
		lhm.put('C', 3.4);
		lhm.put('D', 4.7);

		for (Map.Entry<Character, Double> e : lhm.entrySet()) {
			Character key = e.getKey();
			Double val = e.getValue();

			System.out.println("Key is " + key);
			System.out.println("Value is " + val);
			System.out.println("************");

		}
	}

}
