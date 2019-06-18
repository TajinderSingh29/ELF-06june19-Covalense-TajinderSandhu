package com.covalense.coreJavaApp.expection;

import java.io.File;
import java.io.IOException;

public class TestChecked {
	public static void main(String[] args) {
		File f = new File("Priya.txt");

		try {
			f.createNewFile();
		} catch (IOException e) {
			System.out.println("Checked exception");
		}
	}

}
