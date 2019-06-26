package com.covalense.corejavaapp.map;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		int a[]= {5,6,2,1,4};
		int b[]= {30,40,50,60,20,80};
		/*int i = 0;
			for (int j = 2; j < b.length; j++) {
				b[j]=a[i++];
			}
			
			for (int k = 0; k < b.length; k++) {
				System.out.println(b[k]);
			}
	}*/
		
		System.arraycopy(a, 0, b, 2, 4);
		
		for (int k = 0; k < b.length; k++) {
			System.out.println(b[k]);
		}
	}
	
}
