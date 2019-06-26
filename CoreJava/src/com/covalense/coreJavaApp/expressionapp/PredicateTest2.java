package com.covalense.corejavaapp.expressionapp;

import java.util.function.Predicate;

import lombok.extern.java.Log;

@Log
public class PredicateTest2 {
	public static void main(String[] args) {

		Predicate<String> p = a -> a.length()>5;
		boolean x = p.test("Tajinder");
		log.info(x+"");
	}

}
