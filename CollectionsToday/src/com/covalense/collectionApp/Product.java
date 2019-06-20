package com.covalense.collectionApp;

public class Product implements Comparable<Product> {
	int cost;
	String name;
	double rating;

	@Override
	public int compareTo(Product o) {
		Double d = this.rating;
		Double e = o.rating;
		return -(d.compareTo(e));
	}

}
