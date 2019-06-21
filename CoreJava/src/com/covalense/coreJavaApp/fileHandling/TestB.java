package com.covalense.corejavaapp.filehandling;

import java.io.File;
import java.io.IOException;

public class TestB {
	public static void main(String[] args) {
		File f = new File("folder/newfolder/file");
		boolean res=f.mkdirs();
		
		System.out.println("Result is "+res);
		
	}

}
