package com.covalense.exceptionapp.assignment;

import lombok.extern.java.Log;

@Log
public class ValidaterForName {
	void validate(String string)  {
		if(string.length()>3)
		{
			log.info("Name is validate");
		}
		else {
			throw new  NameException("Name character Should be greater than three");
		} 
	}

}
