package com.covalense.coreJavaApp.array;

public class StringArray {
	public static void main(String[] args) {
		String[] s=new String[4];
		s[0]="Sonu";
		s[1]="Dikshith";
		s[2]="Trisha";
		s[3]="Tandeep";
		
		for (int i = 0; i <=s.length; i++) {
			System.out.println(s[i]);
			
		}
		System.out.println(s.length);

	}

}
