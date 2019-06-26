package com.covalense.corejavaapp.expressionapp;

import java.util.function.Function;

import lombok.extern.java.Log;

@Log
public class SquareFunction {
	public static void main(String[] args) {
		Function<Integer, Integer> f = r -> r * r;
		int x = f.apply(5);
		log.info(x + "");

	}

}
