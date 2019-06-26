package com.covalense.corejavaapp.implementlambda;

import lombok.extern.java.Log;

@Log
public class LoanTest {
	public static void main(String[] args) {
		Loan l = Loan.PERSONAL;
		int constvalue = l.getValue();
		log.info(" Value for personal loan "+constvalue);
	}
}
