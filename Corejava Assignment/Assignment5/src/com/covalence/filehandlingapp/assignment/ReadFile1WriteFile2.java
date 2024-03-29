package com.covalence.filehandlingapp.assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFile1WriteFile2 {
	public static void main(String[] args) {
		String msg = "hi all good evening";
		FileOutputStream fout = null;
		FileInputStream fis = null;

		try {
			fout = new FileOutputStream("file1.txt");
			fout.write(msg.getBytes());
			fout = new FileOutputStream("file2.txt");
			fis = new FileInputStream("file1.txt");
			int i;
			while ((i = fis.read()) != -1) {
				fout.write((char) i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fout != null) {
				try {
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
