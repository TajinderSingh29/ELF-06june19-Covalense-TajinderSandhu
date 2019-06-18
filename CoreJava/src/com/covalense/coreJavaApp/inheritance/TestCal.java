package com.covalense.coreJavaApp.inheritance;
public class TestCal {
	public static void main(String[] args) {
		SaintificCal sc=new SaintificCal();
		
		sc.add();
		sc.sub();
		sc.sin();
		sc.cos();
		System.out.println(" ");
		Calculator c=new Calculator();
		c.add();
		c.sub();
	}

}
