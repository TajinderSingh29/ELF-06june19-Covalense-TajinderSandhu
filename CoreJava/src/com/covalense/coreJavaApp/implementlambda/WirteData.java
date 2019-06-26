package com.covalense.corejavaapp.implementlambda;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import lombok.extern.java.Log;

@Log
public class WirteData {
	public static void main(String[] args) {
		String msg = "hi all good evening";
		byte b[] = msg.getBytes();

		try(FileOutputStream fout = new FileOutputStream("file.txt")) {
			fout.write(b);
			log.info("data is written into file");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
