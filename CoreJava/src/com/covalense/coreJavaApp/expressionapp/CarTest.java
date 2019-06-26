package com.covalense.corejavaapp.expressionapp;

import java.util.function.Supplier;

import lombok.extern.java.Log;

@Log
public class CarTest {
	public static void main(String[] args) {
		Supplier<Car> s= ()-> new Car(15.5);
		Car g=s.get();
		log.info(g.fuelqty+"");
	}

}
