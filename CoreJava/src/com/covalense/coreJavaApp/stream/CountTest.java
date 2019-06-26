package com.covalense.corejavaapp.stream;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class CountTest {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(6);
		al.add(4);
		al.add(3);
		al.add(2);
		long l=al.stream().filter(i -> i%3==0).count();
		log.info("Number of object are "+l);
	}

}
