package com.covalense.coreJavaApp.logger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.omg.CORBA.PRIVATE_MEMBER;

public class TestA {
	private static final  Logger loger=Logger.getLogger("Riya");
	public static void main(String[] args) {
		
		LogManager.getLogManager().reset();
		loger.setLevel(Level.ALL);
		
		ConsoleHandler ch=new ConsoleHandler();
		ch.setLevel(Level.SEVERE);
		loger.addHandler(ch);
		
		loger.log(Level.SEVERE,"Hi its a SEVERE Message");
		loger.log(Level.WARNING,"Hi its a WARNING Message");
		loger.log(Level.INFO,"Hi its a INFO Message");
		loger.log(Level.CONFIG,"Hi its a CONFIG Message");
		loger.log(Level.FINE,"Hi its a FINE Message");
		loger.log(Level.FINER,"Hi its a FINER Message");
		loger.log(Level.FINEST,"Hi its a FINEST Message");
		

	}

}
