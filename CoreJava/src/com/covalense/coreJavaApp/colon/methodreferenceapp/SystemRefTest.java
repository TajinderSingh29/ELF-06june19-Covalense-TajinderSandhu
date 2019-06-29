package com.covalense.corejavaapp.colon.methodreferenceapp;

import java.util.stream.Stream;


public class SystemRefTest {
	public static void main(String[] args) {

		Stream<Integer> s = Stream.of(5, 6, 4, 1, 2);
		s.forEach(System.out::println);
	}

}
