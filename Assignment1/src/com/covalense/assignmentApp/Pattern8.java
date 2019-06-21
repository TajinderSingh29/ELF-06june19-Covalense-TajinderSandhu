package com.covalense.assignmentApp;

public class Pattern8 {
	public static void main(String[] args) {
		int n = 7;
		int sp = n / 2;
		int st = 1;
		for (int j = 1; j <= n; j++) {
			for (int i = 1; i <= sp; i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= st; i++) {
				if (i == 1 || i == st)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
			if (j <= n / 2) {
				sp--;
				st = st + 2;
			} else {
				sp++;
				st = st - 2;
			}
		}

	}

}
