package com.covalense.corejavaapp.collectionApp.foreachloop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestArrayListC {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(15);
		al.add(9.2);
		al.add('A');
		al.add("Riya");
		al.add(105);
		al.add(91.2);
		ListIterator lit = al.listIterator();
		System.out.println("----ForWord");
		while (lit.hasNext()) {
			Object r = lit.next();
			System.out.println(r);

		}
		System.out.println("----Backward");
		while (lit.hasPrevious()) {
			Object r = lit.previous();
			System.out.println(r);

		}
	}

}
