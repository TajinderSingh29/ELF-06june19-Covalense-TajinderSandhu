package com.covalence.filehandlingapp.assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import lombok.extern.java.Log;

@Log
public class ReadDataStudent {
	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("student.txt");
			ois = new ObjectInputStream(fis);
			StudentBean studentBean = (StudentBean) ois.readObject();

			log.info("Age is " + studentBean.getAge());
			log.info("Name is " + studentBean.getName());
			log.info("percentage is " + studentBean.getPercentage());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}

	}

}
