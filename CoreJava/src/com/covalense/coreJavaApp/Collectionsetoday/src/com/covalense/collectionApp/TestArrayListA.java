package com.covalense.collectionApp;

import java.util.ArrayList;

public class TestArrayListA {
	public static void main(String[] args) {
		ArrayList<Students> al = new ArrayList<Students>();

		Students s1 = new Students();
		s1.name = "Divya";
		s1.id = 1;
		s1.percentage = 78.98;

		Students s2 = new Students();
		s2.name = "Trsiha";
		s2.id = 2;
		s2.percentage = 81.98;

		Students s3 = new Students();
		s3.name = "Priya";
		s3.id = 3;
		s3.percentage = 95.98;

		Students s4 = new Students();
		s4.name = "Riya";
		s4.id = 4;
		s4.percentage = 54.98;

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);

		for (Students s : al) {
			System.out.println("name is " + s.name);
			System.out.println("Id is " + s.id);
			System.out.println("percentage is" + s.percentage);
			System.out.println("**********************");

		}
	}

}
