package com.covalence.expressionapp;

import lombok.extern.java.Log;

@Log
public class PrintNumberTest {
	public static void main(String[] args) {
		PrintNumber msg = (num) -> {
			for (int i = 0; i <num; i++) 
			log.info(i+"");
			
		};
		msg.number(6);
	
	}

}
