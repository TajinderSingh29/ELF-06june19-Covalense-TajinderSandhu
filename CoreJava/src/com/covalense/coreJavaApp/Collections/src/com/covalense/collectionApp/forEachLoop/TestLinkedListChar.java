package com.covalense.collectionApp.forEachLoop;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkedListChar {
	public static void main(String[] args) {
		LinkedList<Character> li=new LinkedList<Character>();
		
		li.add('A');
		li.add('B');
		li.add('C');
		li.add('D');
		li.add('E');
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
		Iterator<Character> it = li.iterator();
		while (it.hasNext()) {
			Object r = it.next();
			System.out.println(r);
		}
		System.out.println("**************ListIterator*************");
		System.out.println("*************ForWard**************");
		ListIterator<Character> lit=li.listIterator();
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
