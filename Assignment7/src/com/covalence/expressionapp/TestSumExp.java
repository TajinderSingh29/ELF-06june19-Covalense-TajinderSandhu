package com.covalence.expressionapp;

import lombok.extern.java.Log;

@Log
public class TestSumExp {
	public static void main(String[] args) {
		
		Sum s=(a,b)-> a+b;
		int i=s.add(5, 6);
		log.info("Sum is "+i);
		
	}

}
