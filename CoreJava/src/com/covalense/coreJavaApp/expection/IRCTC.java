package com.covalense.coreJavaApp.expection;

public class IRCTC {
	void bookTicket() {
		System.out.println("Book Ticket Started");
		try {
			System.out.println(10 / 2);
		} catch (ArithmeticException e) {
			System.out.println("Number cannot by divide with");
			throw e;
		}

		System.out.println("Book Ticket ended");
	}

}
