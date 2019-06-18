package com.covalense.coreJavaApp.fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class TestD {
	public static void main(String[] args) {
		String msg="ding ding dinga.... dam dam dagana";
		char c[]=msg.toCharArray();
		
		try {
			FileWriter fw=new FileWriter("password.txt");
			fw.write(c);
			fw.flush();
			fw.close();
			System.out.println("Done.....!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
