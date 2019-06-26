package com.covalense.corejavaapp.constructorrefernce;

import lombok.extern.java.Log;

@Log
public class BoyTest {
	public static void main(String[] args) {
		MyBoy mb = Boy::new;
		Boy b = mb.getboy("Sonu", 1.74, 22);
		log.info("Name is " + b.name);
		log.info("Height is " + b.height);
		log.info("Age is " + b.age);
	}

}
