package com.covalense.corejavaapp.collectionApp.foreachloop;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestArrayListD {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(15);
		al.add(9.2);
		al.add('A');
		al.add("Riya");
		al.add(105);
		al.add(91.2);
		ListIterator lit = al.listIterator(al.size());
		
		while (lit.hasPrevious()) {
			Object r = lit.previous();
			System.out.println(r);

		}
	}

}