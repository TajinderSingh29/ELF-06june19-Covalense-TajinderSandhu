package com.covalense.corejavaapp.array;

public class DeclareArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6 };

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}
		System.out.println("************************************");
		
		int c[] = { 1, 2, 3, 4, 5, 6 };

		for (int i =c.length-1;i>=0 ;i--) {
			System.out.println(c[i]);

		}
		System.out.println("*************");
		char b[] = { 'a', 'b', 'c', 'd', 'e', 'f' };

		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);

		}
	}

}
