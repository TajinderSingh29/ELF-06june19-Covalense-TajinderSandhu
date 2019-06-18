package com.covalense.coreJavaApp.immutableClass;

public class TestEmployee1 {
	public static void main(String[] args) {
		
		Employee e=new Employee("Dev", 30, 1.84, 'M', true);
		System.out.println("Name is "+e.getName());
		System.out.println("Age is "+e.getAge());
		System.out.println("Height is "+e.getHeight());
		System.out.println("Gender is "+e.getGender());
		System.out.println("Status is "+e.isStatus());
	}

}
