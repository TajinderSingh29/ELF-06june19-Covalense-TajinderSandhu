package com.covalense.stringapp.assigment;

import java.util.logging.Logger;


public class RevrseString {
	private final static Logger loger = Logger.getLogger("Output");

	public static void main(String[] args) {
		String input = "how are you doing";
		String newString = "";
		char[] ch = input.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {

			newString = newString + ch[i];

		}
		loger.info(newString);
	}

}
