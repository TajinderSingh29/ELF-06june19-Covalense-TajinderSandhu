package com.covalense.corejavaapp.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFileTest {
	public static void main(String[] args) {

		try {
			FileOutputStream outputStream = new FileOutputStream("demo.properties");
			Properties p = new Properties();
			p.setProperty("Companyname", "covalense");
			p.setProperty("Phonenumber", "9876354841");
			p.store(outputStream, "Details");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
