package com.covalense.coreJavaApp.fileHandling;

import java.io.Serializable;

public class PersonBean implements Serializable {

	private String name;
	private transient int id;

	public PersonBean() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
