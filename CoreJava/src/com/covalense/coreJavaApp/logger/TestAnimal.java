package com.covalense.coreJavaApp.logger;

public class TestAnimal {
	public static void main(String[] args) {
		Animal a=new Cow();
		Cow c= (Cow)a;
		c.sound();
		c.divide(15, 2);
		System.out.println("*************");
		
		Animal s=new Loin();
		Loin l= (Loin)s;
		l.sound();
		l.divide(40, 2);
		
	}

}
