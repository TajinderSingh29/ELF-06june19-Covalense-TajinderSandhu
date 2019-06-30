package com.covalense.stringapp.assigment;

import java.util.logging.Logger;

public class CountCharacter {
	private final static Logger loger = Logger.getLogger("Output");

	public static void main(String[] args) {
		String input = "Hi Dear my friends";
		String newString = " ";
		int nc = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				newString = newString + nc + " ";
				nc = 0;
			} else {
				nc++;
				newString = newString + input.charAt(i);
			}
		}
		newString = newString + nc;
		loger.info(newString);
	}
}
