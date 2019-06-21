package com.covalense.corejavaapp.getterandsetter;

public class TestA {
	public static void main(String[] args) {
		Student s = new Student("Priya", 22, 5.5);
		Student d = new Student("Priya", 23, 5.8);

		System.out.println(s);
		System.out.println(d);
		System.out.println(s.equals(d));
	}

}
