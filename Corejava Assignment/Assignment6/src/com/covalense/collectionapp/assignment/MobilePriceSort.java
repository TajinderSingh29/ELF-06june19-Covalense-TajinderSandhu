package com.covalense.collectionapp.assignment;

public class MobilePriceSort implements Comparable<MobilePriceSort> {
	int cost;
	String name;
	double rating;

	@Override
	public int compareTo(MobilePriceSort p) {
		Integer i = this.cost;
		Integer a = p.cost;
		return i.compareTo(a);
	}

}
