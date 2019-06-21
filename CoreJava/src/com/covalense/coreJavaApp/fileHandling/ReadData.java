package com.covalense.corejavaapp.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadData {
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("Trisha.txt");
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
