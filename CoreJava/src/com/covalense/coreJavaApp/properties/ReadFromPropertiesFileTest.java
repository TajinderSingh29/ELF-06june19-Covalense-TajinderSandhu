package com.covalense.corejavaapp.properties;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;

@Log
public class ReadFromPropertiesFileTest {
	public static void main(String[] args) {

		try {
			FileInputStream inputStream = new FileInputStream("demo.properties");
			Properties p = new Properties();
			p.load(inputStream);

			String name = p.getProperty("Companyname");
			String Phonenumber = p.getProperty("Phonenumber");
			log.info("Company name is " + name);
			log.info("Company phonenumber is " + Phonenumber);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
