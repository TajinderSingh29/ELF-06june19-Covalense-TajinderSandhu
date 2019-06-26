package com.covalense.corejavaapp.collection.foreachloop;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestGerenicArrayListString {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Trsiha");
		a.add("Aruna");
		a.add("Priya");
		a.add("Neha");

		/* System.out.println(a); */

		/*
		 * for (String s : a) { System.out.println(s);
		 * 
		 * }
		 */
		/*
		 * for (int i = 0; i < a.size(); i++) { String s=a.get(i);
		 * System.out.println(s);
		 * 
		 * }
		 */
		/*
		 * Iterator<String> it=a.iterator(); while (it.hasNext()) { String s=it.next();
		 * System.out.println(s); }
		 */
		System.out.println("******************Forward");
		ListIterator<String> it = a.listIterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}

		System.out.println("******************BackWard");
		while (it.hasPrevious()) {
			String s = it.previous();
			System.out.println(s);
		}
	}

}
