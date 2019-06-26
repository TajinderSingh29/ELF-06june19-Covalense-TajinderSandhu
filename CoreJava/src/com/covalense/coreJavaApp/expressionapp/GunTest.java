package com.covalense.corejavaapp.expressionapp;

import java.util.function.Supplier;

import lombok.extern.java.Log;

@Log
public class GunTest {
	public static void main(String[] args) {
		Supplier<Gun> s = () -> new Gun(120);
		Gun g = s.get();
		log.info(g.bullet + "");
	}

}
