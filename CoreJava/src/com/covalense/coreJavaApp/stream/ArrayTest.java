package com.covalense.corejavaapp.stream;

import java.util.stream.Stream;

import lombok.extern.java.Log;

@Log
public class ArrayTest {
	public static void main(String[] args) {

		Integer a[] = { 5, 6, 4, 1, 2 };
		Stream<Integer> s = Stream.of(a);
		s.forEach(i -> log.info("" + i));

		Stream<Integer> s1 = Stream.of(9, 10, 5, 6, 7, 8, 9, 5);
		s1.forEach(i -> log.info("" + i));
	}

}
