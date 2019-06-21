package com.covalense.corejavaapp.immutableclass;

public class TestPerson1 {
	public static void main(String[] args) {
		Person p=new Person("Pooja", 22);
		System.out.println("Name is "+p.getName());
		System.out.println("Age is "+p.getAge());
		
		Person s=new Person("Trisha", 18);
		System.out.println("Name is "+s.getName());
		System.out.println("Age is "+s.getAge());
		
	}

}
