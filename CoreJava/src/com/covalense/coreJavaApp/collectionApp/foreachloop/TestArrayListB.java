package com.covalense.corejavaapp.collectionApp.foreachloop;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayListB {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(15);
		al.add(9.2);
		al.add('A');
		al.add("Riya");
		al.add(105);
		al.add(91.2);
		Iterator it = al.iterator();
		while (it.hasNext()) {
			Object r = it.next();
			System.out.println(r);

		}
	}

}
