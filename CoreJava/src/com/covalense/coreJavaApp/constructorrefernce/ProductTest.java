package com.covalense.corejavaapp.constructorrefernce;

import lombok.extern.java.Log;

@Log
public class ProductTest {
	public static void main(String[] args) {
		MyProduct mp = Product::new;
		Product p = mp.getproduct("IPHONE", 800000);
		log.info("Name is " + p.name);
		log.info("Cost is " + p.cost);
	}

}
