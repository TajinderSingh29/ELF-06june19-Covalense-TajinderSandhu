package com.covalense.corejavaapp.interfacetopic;

public class TestPerson {
	
	public static void main(String[] args) {
		 
		Person p=new Person();
		p.eat();
		p.walk();
		System.out.println("*************************************");
		Human h=new Person();
		h.walk();
		System.out.println("*************************************");

		Animal a=new Person();
		a.eat();
	}

}
