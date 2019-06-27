package com.covalence.expApp;

interface LengthCheck {
	int StringLength(String st);

}

public class TestString {
	public static void main(String[] args) {

		LengthCheck lc = st -> st.length();

		int i = lc.StringLength("Tajinder");
		System.out.println("Length of String is " + i);
	}

}
