package com.covalence.filehandlingapp.assignment;

import java.io.Serializable;

public class StudentBean implements Serializable{
	private String name;
	private int age;
	private double percentage;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

}
