package com.covalense.mapApp;

public class ArrayElementsIndex {
	public static void main(String[] args) {
		int a[] = { 5, 6, 2, 1, 4 };
		int b[] = { 30, 40, 50, 60, 20, 80 };
		/*
		 * int destFromIndex = 2; int numberOfElements = 3; int counter = 1;
		 * 
		 * int i = 0; for (int j = 2; j < b.length; j++) { b[j] = a[i++]; if (counter ==
		 * numberOfElements) { break; } counter++; }
		 * 
		 * for (int k = 0; k < b.length; k++) { System.out.println(b[k]); }
		 */
		System.arraycopy(a, 0, b, 2, 2);
		
		for (int k = 0; k < b.length; k++) {
			System.out.println(b[k]);
		}
	}
	
}
