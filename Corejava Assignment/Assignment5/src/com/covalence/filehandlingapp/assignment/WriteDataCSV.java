package com.covalence.filehandlingapp.assignment;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import lombok.extern.java.Log;

@Log
public class WriteDataCSV {
	public static void main(String[] args) {

		FileOutputStream fout = null;
		ObjectOutputStream obj = null;
		try {
			Employee e = new Employee();
			e.set("Sonu", 22, "IT", 20000);
			fout = new FileOutputStream("person.csv");
			obj = new ObjectOutputStream(fout);
			obj.writeObject(e);
			log.info("done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				if (fout != null)
					fout.close();
				if (obj != null)
					obj.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
