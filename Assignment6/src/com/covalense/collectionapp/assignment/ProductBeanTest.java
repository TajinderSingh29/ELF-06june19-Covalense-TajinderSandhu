package com.covalense.collectionapp.assignment;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class ProductBeanTest {
	public static void main(String[] args) {
		ArrayList<ProductBean> arrayList = new ArrayList<ProductBean>();

		ProductBean productBean = new ProductBean();
		productBean.setName("Iphone");
		productBean.setCost(100000);
		productBean.setRating(8.5);

		ProductBean productBean1 = new ProductBean();
		productBean1.setName("Mi");
		productBean1.setCost(40000);
		productBean1.setRating(6.5);

		ProductBean productBean2 = new ProductBean();
		productBean2.setName("Nokia");
		productBean2.setCost(10000);
		productBean2.setRating(4.5);

		ProductBean productBean3 = new ProductBean();
		productBean3.setName("Samsung");
		productBean3.setCost(15000);
		productBean3.setRating(7.5);

		ProductBean productBean4 = new ProductBean();
		productBean4.setName("Redimi");
		productBean4.setCost(1000);
		productBean4.setRating(3.5);

		arrayList.add(productBean);
		arrayList.add(productBean1);
		arrayList.add(productBean2);
		arrayList.add(productBean3);
		arrayList.add(productBean4);
		for (ProductBean product : arrayList) {
			if (product.getCost() > 20000) {
				log.info("Name is " + product.getName());
				log.info("Cost is " + product.getCost());
				log.info("Rating is " + product.getRating());
			}
		}
	}
}
