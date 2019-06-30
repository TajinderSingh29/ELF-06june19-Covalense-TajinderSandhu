package com.covalence.filehandlingapp.assignment;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import lombok.extern.java.Log;

@Log
public class StudentData {
	public static void main(String[] args) {
		StudentBean studentBean= new StudentBean();
		studentBean.setAge(22);
		studentBean.setName("sonu");
		studentBean.setPercentage(90.82);
		FileOutputStream fos = null;
		ObjectOutputStream obj = null;
		
		try {
			fos = new FileOutputStream("student.txt",true);
			obj = new ObjectOutputStream(fos);
			obj.writeObject(studentBean);
			log.info("Done");
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
