package com.covalense.corejavaapp.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TestLog {
	private static final Logger loger=Logger.getLogger("Yantra");
	
	public static void main(String[] args) {
		
		LogManager.getLogManager().reset();
		loger.setLevel(Level.ALL);
		
		try {
			FileHandler fh=new FileHandler("MyLogFile.log",true);
			fh.setLevel(Level.ALL);
			fh.setFormatter(new SimpleFormatter());
			loger.addHandler(fh);
			
			loger.log(Level.SEVERE,"Hi its a SEVERE Message");
			loger.log(Level.WARNING,"Hi its a WARNING Message");
			loger.log(Level.INFO,"Hi its a INFO Message");
			loger.log(Level.CONFIG,"Hi its a CONFIG Message");
			loger.log(Level.FINE,"Hi its a FINE Message");
			loger.log(Level.FINER,"Hi its a FINER Message");
			loger.log(Level.FINEST,"Hi its a FINEST Message");	
			
			BuyProduct bp=new BuyProduct();
			bp.buy();
			
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

}
