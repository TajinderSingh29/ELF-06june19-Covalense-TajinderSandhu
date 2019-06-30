package com.covalense.assignmentApp;

public class Pattern9a {
	public static void main(String[] args) {
		int n = 5;
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				if (j == n / 2 || i == n / 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
