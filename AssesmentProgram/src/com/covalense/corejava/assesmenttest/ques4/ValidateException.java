package com.covalense.corejava.assesmenttest.ques4;

import lombok.extern.java.Log;

@Log
public class ValidateException {
	void validate(int marks) {
		if (marks > 40) {
			log.info("student eligibility for the exam");
		} else {
			throw new EligibilityLessException("student not eligibility for the exam");
		}
	}

}
