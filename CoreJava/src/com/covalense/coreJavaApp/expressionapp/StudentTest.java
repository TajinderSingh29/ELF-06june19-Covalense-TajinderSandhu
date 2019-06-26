package com.covalense.corejavaapp.expressionapp;

import java.util.function.Consumer;

import lombok.extern.java.Log;

@Log
public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student("Sonu", 24, 20, 19);

		Consumer<Student> c = s -> {
			double avg = (s.m1 + s.m2 + s.m3) / 3.0;
			log.info(s.name + " Average is " + avg);
		};
		c.accept(s1);

	}
}
