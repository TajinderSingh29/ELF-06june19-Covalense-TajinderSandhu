package com.covalense.stringapp.assigment;

import java.util.logging.Logger;

public class ReverseChar {
	private final static Logger loger = Logger.getLogger("Output");

	public static void main(String[] args) {
		String input = "how are you doing";
		char ch[] = input.toCharArray();
		String newString = "";
		for (int i = 0; i < ch.length; i++) {
			int k = i;
			while (i < ch.length && ch[i] != ' ') {
				i++;
			}
			int j = i - 1;
			while (j >= k) {
				newString = newString + ch[j];
				j--;
			}
			newString = newString + " ";
		}
		loger.info(newString);
	}

}
