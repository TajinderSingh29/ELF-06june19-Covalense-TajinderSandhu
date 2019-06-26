package com.covalense.corejavaapp.expressionapp;

public class Car {
	double fuelqty;

	public Car(double fuel) {
		this.fuelqty = fuel;
	}

	Car getFuelQty() {
		return new Car(20.00);
	}

	/*
	 * @Override public String toString() { return "Car [fuelqty=" + fuelqty + "]";
	 * }
	 */
	
}
