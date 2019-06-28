package com.covalense.corejava.assesmenttest.ques3;

public class Pen {
	int number;

	public Pen(int i) {
		number = i;
	}

	Pen getPen() {
		return new Pen(100);
	}

}
