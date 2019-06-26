package com.covalense.corejavaapp.expressionapp;

import java.util.function.Function;

import lombok.extern.java.Log;

@Log
public class NumberCharacterFunction {
	public static void main(String[] args) {
		Function<String, Integer> f = str -> str.length();
		int x = f.apply("tajinder");
		log.info(x + "");
	}

}
