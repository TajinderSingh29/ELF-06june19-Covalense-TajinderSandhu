package com.covalense.corejavaapp.implementlambda;

import lombok.extern.java.Log;

@Log
public class FruitTest {
	public static void main(String[] args) {

		String input = "hello";

		switch (input) {
		case "apple":
			log.info(" hi apple ");
			break;
		case "cat":
			log.info(" hi cat ");
			break;

		default:
			log.info(" sorry wrong input ");
			break;
		}

	}

}
