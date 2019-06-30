package com.covalense.assignmentApp;

public class Pattern11 {
	public static void main(String[] args) {
		int n = 7;
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				if (j == 0 || j == n - 1 || j + i == n - 1 || i == n / 2 || i == 0 || i == n - 1 || j == i
						|| j == n / 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}
}
