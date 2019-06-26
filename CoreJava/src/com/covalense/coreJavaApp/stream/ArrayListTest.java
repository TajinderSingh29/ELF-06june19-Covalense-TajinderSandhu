package com.covalense.corejavaapp.stream;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class ArrayListTest {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(6);
		al.add(4);
		al.add(3);
		al.add(2);

		List<Integer> l = al.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		log.info(l + "");
	}

}
