package com.covalense.corejavaapp.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TestRegister {
	private static final Logger loger=Logger.getLogger("Hello");
	
	public static void main(String[] args) {
		
		LogManager.getLogManager().reset();
		loger.setLevel(Level.ALL);
		
		try {
			FileHandler fh=new FileHandler("NewLogCreate.log",true);
			fh.setLevel(Level.SEVERE);
			fh.setFormatter(new SimpleFormatter());
			loger.addHandler(fh);
			
			loger.log(Level.SEVERE,"Hi i am SEVERE Main Method");
			loger.log(Level.WARNING,"Hi i am WARNING Main Method");
			loger.log(Level.CONFIG,"Hi i am CONFIG Main Method");
			loger.log(Level.INFO,"Hi i am INFO Main Method");
			loger.log(Level.FINE,"Hi i am FINE Main Method");
			loger.log(Level.FINER,"Hi i am Main Method");
			loger.log(Level.FINEST,"Hi i am Main Method");
			
			Register r=new Register();
			r.connectDB();
			r.store();
			
			
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
