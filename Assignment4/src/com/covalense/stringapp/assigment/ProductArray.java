package com.covalense.stringapp.assigment;

import java.util.logging.Logger;

public class ProductArray {
	private final static Logger loger = Logger.getLogger("Output");
	public static void main(String[] args) {
		Object[] objects = new Object[5];

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
		
		objects[0] = productBean1;
		objects[1] = productBean2;
		objects[2] = productBean3;
		objects[3] = productBean4;
		for (int i = 0; i < objects.length; i++) {
			loger.info(objects[i]+"");
		}
	}

}
