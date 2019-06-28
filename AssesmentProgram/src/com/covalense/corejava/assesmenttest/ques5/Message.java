package com.covalense.corejava.assesmenttest.ques5;

public class Message implements Comparable<Message> {
	String msg;
	String date;
	String time;

	@Override
	public int compareTo(Message o) {
		if (this.date.length() > o.date.length()) {
			return -1;
		} else if (this.date.length() < o.date.length()) {
			return 1;
		} else {
			return 0;
		}
	}
}
