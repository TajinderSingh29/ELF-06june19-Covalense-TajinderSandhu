package com.covalence.expressionapp;


public class TestSquare {
	public static void main(String[] args) {
		
		Square s=(a) ->
		{
			return a*a;
		};
		
		int i=s.squarecal(5);
		System.out.println("Square is "+i);
		
	}

}
