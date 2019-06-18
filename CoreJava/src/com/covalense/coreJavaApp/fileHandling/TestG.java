package com.covalense.coreJavaApp.fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestG {
	
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("password.txt");
			int i;
			while ((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
