package com.covalense.coreJavaApp.passObject;

public class TestDrink {
	public static void main(String[] args) {
		WaterBottle wb=new WaterBottle();
		DrinkerWater dw=new DrinkerWater();
		dw.drink(wb);
	}

}
