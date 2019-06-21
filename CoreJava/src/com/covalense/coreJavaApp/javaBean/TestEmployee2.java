package com.covalense.corejavaapp.javabean;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class TestEmployee2 {
	private static final Logger loger = Logger.getLogger("MainMethod");

	public static void main(String[] args) {
		LogManager.getLogManager().reset();
		loger.setLevel(Level.SEVERE);

		ConsoleHandler ch = new ConsoleHandler();
		ch.setLevel(Level.SEVERE);
		loger.setLevel(Level.SEVERE);
		loger.addHandler(ch);

		EmployeeBean2 eb = new EmployeeBean2();
		eb.setAge(25);
		eb.setDept("Software");
		eb.setGender("Male");
		eb.setId(1);
		eb.setName("Sonu");
		eb.setSalary(20000);

		loger.log(Level.SEVERE, "Name is " + eb.getName());
		loger.log(Level.SEVERE, "Age is " + eb.getAge());
		loger.log(Level.SEVERE, "Dept is " + eb.getDept());
		loger.log(Level.SEVERE, "Id is " + eb.getId());
		loger.log(Level.SEVERE, "Gender is " + eb.getGender());
		loger.log(Level.SEVERE, "Salary is " + eb.getSalary());

	}

}
