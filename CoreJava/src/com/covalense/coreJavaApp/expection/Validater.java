package com.covalense.coreJavaApp.expection;

public class Validater {
	void validate(String name) {
		if(name.length()>=4)
		{
			System.out.println("Name is validate");
		}
		else {
			throw new NameCharException("Your is not validate because name letter should greater than Four letter");
		} 
	}

}
