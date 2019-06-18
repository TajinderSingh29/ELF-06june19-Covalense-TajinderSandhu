package com.covalense.coreJavaApp.expection;

public class TestA {
	public static void main(String[] args) {
		System.out.println("Main Started");
		String s = null;
		try {
			System.out.println(10 / 2);

			System.out.println(s.length());

		}

		catch (ArithmeticException e) {
			System.out.println("Number cannot by divide with");
		} catch (NullPointerException e) {
			System.out.println("Null Exception Occur");
		} catch (Exception e) {
			System.out.println("This catch all exception which above is not declare");
		}
		System.out.println("Main Ended");
	}

}
