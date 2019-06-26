package com.covalense.corejavaapp.collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayListProduct {
	public static void main(String[] args) {

		ArrayList<Product> al = new ArrayList<Product>();

		Product p1 = new Product();
		p1.name = "Iphone";
		p1.cost = 150000;
		p1.rating = 6.5;

		Product p2 = new Product();
		p2.name = "Bike";
		p2.cost = 1500000;
		p2.rating = 7.5;

		Product p3 = new Product();
		p3.name = "Mi";
		p3.cost = 15000;
		p3.rating = 5.5;

		Product p4 = new Product();
		p4.name = "Car";
		p4.cost = 15000000;
		p4.rating = 8.5;

		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		Collections.sort(al);
		for (Product p : al) {
			System.out.println("name is " +p.name);
			System.out.println("cost is " + p.cost);
			System.out.println("rating is " + p.rating);
			System.out.println("****************");
		}
	}

}
