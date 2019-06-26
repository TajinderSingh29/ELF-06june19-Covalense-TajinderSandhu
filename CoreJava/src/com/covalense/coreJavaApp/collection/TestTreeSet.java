package com.covalense.corejavaapp.collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<Student>();
		Student s1 = new Student();
		s1.name = "Divya";
		s1.id = 1;
		s1.percentage = 78.98;

		Student s2 = new Student();
		s2.name = "Trsiha";
		s2.id = 2;
		s2.percentage = 81.98;

		Student s3 = new Student();
		s3.name = "Priya";
		s3.id = 3;
		s3.percentage = 95.98;

		Student s4 = new Student();
		s4.name = "Riya";
		s4.id = 4;
		s4.percentage = 54.98;

		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		Iterator<Student> it = ts.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("name is " + s.name);
			System.out.println("Id is " + s.id);
			System.out.println("percentage is" + s.percentage);
			System.out.println("**********************");

		}
	}
}
