package com.covalense.corejavaapp.collection.foreachloop;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkedList {
	public static void main(String[] args) {

		LinkedList li = new LinkedList();
		li.add(15); 
		li.add('A');
		li.add("Str");
		li.add(5.6);
		System.out.println("*************Simple s.o.p**************");
		System.out.println(li);
		System.out.println("************For Loop***************");
		for (int i = 0; i < li.size(); i++) {
			Object r = li.get(i);
			System.out.println(r);
		}
		System.out.println("*************For each**************");
		for (Object t : li) {
			System.out.println(t);
		}
		System.out.println("**************Iterator*************");
		Iterator it = li.iterator();
		while (it.hasNext()) {
			Object r = it.next();
			System.out.println(r);
		}
		System.out.println("**************ListIterator*************");
		System.out.println("*************ForWard**************");
		ListIterator lit = li.listIterator();
		while (lit.hasNext()) {
			Object r = lit.next();
			System.out.println(r);
		}
		System.out.println("************Backward***************");
		while (lit.hasPrevious()) {
			Object r = lit.previous();
			System.out.println(r);
		}
	}

}
