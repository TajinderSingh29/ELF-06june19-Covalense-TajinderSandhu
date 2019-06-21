package com.covalense.corejavaapp.expection;

public class Paytm {
	void getTicket() {
		System.out.println("Ticket Started");

		IRCTC i = new IRCTC();
		i.bookTicket();
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Exception Occur in paytm");
		} finally {
			System.out.println("Ticket ended");
		}
	}

}
