package com.covalense.corejavaapp.constructor;

public class TestStudent {
	public static void main(String[] args) {
		Student s1=new Student("Sonu", 27, 72.09);
		
		Student s2=new Student("Riya", 25, 80.25);
		
		s1.Display();
		System.out.println("********************************");
		s2.Display();
	}

}
