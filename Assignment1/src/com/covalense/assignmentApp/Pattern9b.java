package com.covalense.assignmentApp;

public class Pattern9b {
	public static void main(String[] args) {
		int n = 5;
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				if (j + i == n - 1 || j == i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
