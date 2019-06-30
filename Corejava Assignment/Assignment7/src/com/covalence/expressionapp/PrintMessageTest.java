package com.covalence.expressionapp;

import lombok.extern.java.Log;

@Log
public class PrintMessageTest {
	public static void main(String[] args) {

		PrintMessage msg = () -> {
			log.info("This is lambda Expression");
		};
		msg.message();
	}

}
