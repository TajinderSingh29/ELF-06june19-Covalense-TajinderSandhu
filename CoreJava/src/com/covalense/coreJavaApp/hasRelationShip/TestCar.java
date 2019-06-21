package com.covalense.corejavaapp.hasrelationship;


public class TestCar {
	public static void main(String[] args) {
		Car c=new Car();
		
		c.ms.Brand="Sony";
		c.ms.modelNumber=12334556;
		c.ms.listen();
		
		c.color="Black";
		c.price=658420;
		c.drive();
		
	}

}
