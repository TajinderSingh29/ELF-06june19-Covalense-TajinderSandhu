package com.covalense.corejavaapp.filehandling;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class FileHandlingExample {
	public static void main(String[] args) {
		try {
			//FileUtils.writeStringToFile(new File("MyTextFile.txt"), "This is my Text File!!!");
			
			/*
			 * FileUtils.writeStringToFile(new File("D:\\Hello\\MyTextFile2.txt"),
			 * "This is my Text File!!!", Charset.defaultCharset());
			 * System.out.println("Done!!!");
			 */
			 
			
			
			  System.out.println("Read data from file"); String
			  fileData=FileUtils.readFileToString(new
			  File("D:\\Hello\\MyTextFile2.txt"),Charset.defaultCharset());
			  System.out.println(fileData);
			 
		} catch (IOException e) {
			e.printStackTrace();
		}

	}// End of Main

}// End of class
