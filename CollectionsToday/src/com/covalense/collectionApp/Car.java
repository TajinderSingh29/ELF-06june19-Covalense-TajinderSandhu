package com.covalense.collectionApp;

public class Car implements Comparable<Car> {

	String name;
	String brand;
	double rating;
	int cost;

	@Override
	public int compareTo(Car o) {
		return this.name.compareTo(o.name);
	}

}
