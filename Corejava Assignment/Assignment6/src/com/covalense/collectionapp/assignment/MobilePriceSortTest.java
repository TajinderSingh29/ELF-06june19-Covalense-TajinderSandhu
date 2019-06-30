package com.covalense.collectionapp.assignment;

import java.util.ArrayList;
import java.util.Collections;

import lombok.extern.java.Log;

@Log
public class MobilePriceSortTest {
	public static void main(String[] args) {
		ArrayList<MobilePriceSort> arrayList = new ArrayList<MobilePriceSort>();

		MobilePriceSort mobilePriceSort = new MobilePriceSort();
		mobilePriceSort.name="Iphone";
		mobilePriceSort.cost=100000;
		mobilePriceSort.rating=8.5;

		MobilePriceSort mobilePriceSort1 = new MobilePriceSort();
		mobilePriceSort1.name="Mi";
		mobilePriceSort1.cost=40000;
		mobilePriceSort1.rating=6.5;

		MobilePriceSort mobilePriceSort2 = new MobilePriceSort();
		mobilePriceSort2.name="Nokia";
		mobilePriceSort2.cost=10000;
		mobilePriceSort2.rating=4.5;

		MobilePriceSort mobilePriceSort3 = new MobilePriceSort();
		mobilePriceSort3.name="Samsung";
		mobilePriceSort3.cost=15000;
		mobilePriceSort3.rating=7.5;

		MobilePriceSort mobilePriceSort4 = new MobilePriceSort();
		mobilePriceSort4.name="Redimi";
		mobilePriceSort4.cost=1000;
		mobilePriceSort4.rating=3.5;

		arrayList.add(mobilePriceSort);
		arrayList.add(mobilePriceSort1);
		arrayList.add(mobilePriceSort2);
		arrayList.add(mobilePriceSort3);
		arrayList.add(mobilePriceSort4);
		Collections.sort(arrayList);
		for (MobilePriceSort product : arrayList) {
				log.info("Name is " + product.name);
				log.info("Cost is " + product.cost);
				log.info("Rating is " + product.rating);
			}
		}
	}


