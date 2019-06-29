package com.covalense.corejavaapp.stream;

import java.util.ArrayList;
import java.util.Comparator;

import lombok.extern.java.Log;

@Log
public class StudentTest {
	static Comparator<Student> c = (i, j) -> {
		if (i.percentage > j.percentage) {
			return 1;
		} else if (i.percentage < j.percentage) {
			return -1;
		} else {
			return 0;
		}
	};

	static Student getTopper(ArrayList<Student> al) {

		return al.stream().max(c).get();

	}

	static Student getleast(ArrayList<Student> al) {
		return al.stream().min(c).get();
	}

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student("Priya", 65.28);
		Student s2 = new Student("neha", 78.25);
		Student s3 = new Student("trisha", 88.80);
		Student s4 = new Student("aman", 55.25);

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		Student s = getTopper(al);
		log.info("Topper is " + s.name +" "+ s.percentage);

		Student l = getleast(al);
		log.info("Least is " + l.name +" "+ l.percentage);
	}

}
