package com.covalense.coreJavaApp.constuctor;

public class Student {
	String name;
	int age;
	double percentage;

	public Student(String name,int age,double percentage)
	{
		this.name=name;
		this.age=age;
		this.percentage=percentage;
	}
	
	void Display() 
	{
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		System.out.println("Percentage is "+percentage);

	}
}
