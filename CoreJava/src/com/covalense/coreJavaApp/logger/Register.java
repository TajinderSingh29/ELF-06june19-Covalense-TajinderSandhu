package com.covalense.corejavaapp.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Register {
	private static final Logger loger=Logger.getLogger("Hello");
	void connectDB()
	{
		loger.log(Level.SEVERE,"Hi i am SEVERE connectDB() in register");
		loger.log(Level.WARNING,"Hi i am WARNING connectDB() in register");
		loger.log(Level.CONFIG,"Hi i am CONFIG connectDB() in register");
		loger.log(Level.INFO,"Hi i am INFO connectDB() in register");
		loger.log(Level.FINE,"Hi i am FINE connectDB() in register");
		loger.log(Level.FINER,"Hi i am FINER connectDB() in register");
		loger.log(Level.FINEST,"Hi i am FINEST connectDB() in register");
		
	}
	
	void store()
	{
		loger.log(Level.SEVERE,"Hi i am SEVERE store() in register");
		loger.log(Level.WARNING,"Hi i am WARNING store() in register");
		loger.log(Level.CONFIG,"Hi i am CONFIG store() in register");
		loger.log(Level.INFO,"Hi i am INFO store() in register");
		loger.log(Level.FINE,"Hi i am FINE store() in register");
		loger.log(Level.FINER,"Hi i am FINER store() in register");
		loger.log(Level.FINEST,"Hi i am FINEST store() in register");
	}

}
