package com.covalense.corejava.assesmenttest.ques5;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class MessageStored {
	public static void main(String[] args) {

		Message m = new Message();
		m.msg = "hello";
		m.date = "2019-06-28";
		m.time = "16:27:56";

		Message m1 = new Message();
		m1.msg = "how are u";
		m1.date = "2019-06-28";
		m1.time = "16:40:23.327";

		Message m2 = new Message();
		m2.msg = "bye";
		m2.date = "2019-06-28";
		m2.time = "16:44:23.327";

		ArrayList<Message> arrayList = new ArrayList<Message>();
		arrayList.add(m);
		arrayList.add(m1);
		arrayList.add(m2);
		for (Message message : arrayList) {
			log.info("Message is " + message.msg);
			log.info("Date is " + message.date);
			log.info("Time is " + message.time);
		}
	}
}
