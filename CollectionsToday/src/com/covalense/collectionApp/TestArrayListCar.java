package com.covalense.collectionApp;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayListCar {

	public static void main(String[] args) {
		ArrayList<Car> al = new ArrayList<Car>();

		Car c1 = new Car();
		c1.name = "Verna";
		c1.brand = "Honda";
		c1.cost = 1000000;
		c1.rating = 6.5;

		Car c2 = new Car();
		c2.name = "A4";
		c2.brand = "Audi";
		c2.cost = 2000000;
		c2.rating = 6.5;

		Car c3 = new Car();
		c3.name = "Eon";
		c3.brand = "Honda";
		c3.cost = 50000000;
		c3.rating = 6.5;

		Car c4 = new Car();
		c4.name = "B1";
		c4.brand = "Benz";
		c4.cost = 600000000;
		c4.rating = 6.5;

		al.add(c1);
		al.add(c2);
		al.add(c3);
		al.add(c4);
		Collections.sort(al);
		for (Car c : al) {
			System.out.println("Name is " + c.name);
			System.out.println("Brand is " + c.brand);
			System.out.println("Rating is " + c.rating);
			System.out.println("cost is " + c.cost);
			System.out.println("****************");

		}
	}

}
