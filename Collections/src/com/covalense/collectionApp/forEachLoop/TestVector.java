package com.covalense.collectionApp.forEachLoop;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestVector {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.add(15);
		v.add(20);
		v.add(25);
		v.add(5);
		v.add(1);
		System.out.println("*************Simple s.o.p**************");
		System.out.println(v);
		
		System.out.println("************For Loop***************");
		for (int i = 0; i < v.size(); i++) {
			Integer r = v.get(i);
			System.out.println(r);
		}
		System.out.println("*************For each**************");
		for (Object t : v) {
			System.out.println(t);
		}
		System.out.println("**************Iterator*************");
		Iterator<Integer> it = v.iterator();
		while (it.hasNext()) {
			Object r = it.next();
			System.out.println(r);
		}
		System.out.println("**************ListIterator*************");
		System.out.println("*************ForWard**************");
		ListIterator<Integer> lit=v.listIterator();
		while (lit.hasNext()) {
			Object r = lit.next();
			System.out.println(r);
		}
		System.out.println("************Backward***************");
		while (lit.hasPrevious()) {
			Object r = lit.previous();
			System.out.println(r);
		}
		System.out.println("************Enumeration***************");
		Enumeration<Integer> e=v.elements();
		while (e.hasMoreElements()) {
			Integer k= e.nextElement();
			System.out.println(k);
			
		}
	}
}
