package com.covalense.stringapp.assigment;

public class RevreseNotEven {
	public static void main(String[] args) {
		String input = "Hoga beda hudugi nana bittu";
		char ch[] = input.toCharArray();

		String newString = "";
		for (int i = 0; i < ch.length; i++) {
			int k = i;
			if (i % 2 == 0) {
				while (i < ch.length && ch[i] != ' ') {
					i++;
				}
			}
			int j = i - 1;
			while (j >= k) {
				newString = newString + ch[j];
				j--;
			}
			newString = newString + " ";
		}
		System.out.println(newString);
	}
}
