package com.covalense.coreJavaApp.logger;

import java.util.logging.Level;
import java.util.logging.Logger;
		
public class BuyProduct {
	private static final Logger loger=Logger.getLogger("Yantra");
	void buy()
	{
		loger.log(Level.SEVERE, "hi i am SEVERE from buyproduct");
		loger.log(Level.WARNING, "hi i am WARNING from buyproduct");
		loger.log(Level.INFO, "hi i am INFO from buyproduct");
		loger.log(Level.CONFIG, "hi i am CONFIG from buyproduct");
		loger.log(Level.FINE, "hi i am FINE from buyproduct");
		loger.log(Level.FINER, "hi i am FINER from buyproduct");
		loger.log(Level.FINEST, "hi i am FINEST from buyproduct");
	}

}
