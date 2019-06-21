package com.covalense.corejavaapp.array;

import lombok.extern.java.Log;

@Log
public class MyArrayClassTest {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		MyArrayClass myArrayClass = new MyArrayClass();
		int dataSize = 12;
		for (int i = 0; i < dataSize; i++) {
			myArrayClass.add("value "+ i);

		}
		log.info("Removing 3rd Position");
		/* myArrayClass.remove(3); */
		for (int i = 0; i <dataSize; i++) {
			log.info("Output : " + myArrayClass.get(i));
		}
		long endTime = System.currentTimeMillis();
		log.info("Total Execution time -: " + (endTime - startTime) + "ms");
	}
}
