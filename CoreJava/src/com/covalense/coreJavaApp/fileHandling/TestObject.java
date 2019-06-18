package com.covalense.coreJavaApp.fileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObject {
	public static void main(String[] args) {
		PersonBean pb = new PersonBean();
		pb.setId(18);
		pb.setName("Trisha");
		FileOutputStream fos = null;
		ObjectOutputStream obj = null;
		try {
			fos = new FileOutputStream("hello.txt");
			obj = new ObjectOutputStream(fos);
			obj.writeObject(pb);
			System.out.println("Done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (obj != null) {
				try {
					obj.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}

		}

	}

}
