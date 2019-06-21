package com.covalense.corejavaapp.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EnterData {
	public static void main(String[] args) {

		String msg = "hi all good evening";
		byte b[] = msg.getBytes();

		try {
			FileOutputStream fout = new FileOutputStream("myfile.txt");
			fout.write(b);
			fout.close();
			System.out.println("data is written into file");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
