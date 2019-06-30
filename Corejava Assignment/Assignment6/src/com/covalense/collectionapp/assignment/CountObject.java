package com.covalense.collectionapp.assignment;

import lombok.extern.java.Log;

@Log
public class CountObject {
	static int i;

	CountObject() {
		i++;
	}

	void display() {
		log.info(i + "");
	}

}
