package com.covalense.exceptionapp.assignment;

import lombok.extern.java.Log;

@Log
public class ValidaterException  {
	
	void validate(int id) throws IdCheckedException {
		if(id > 0)
		{
			log.info("Id is validate");
		}
		else {
			throw new  IdCheckedException("Id Is not Valid!!");
		} 
	}
}
