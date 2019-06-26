package com.covalense.corejavaapp.collectionApp.foreachloop;

import java.util.ArrayList;
import java.util.Iterator;

public class TestGenericArrayListB {
	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(9.2);
		al.add(2.0);
		al.add(23.0);
		al.add(25.6);
		
		Iterator<Double> it=al.iterator();
		while (it.hasNext()) {
			Double d=it.next();
			System.out.println(d);
			
		}
	}

}
