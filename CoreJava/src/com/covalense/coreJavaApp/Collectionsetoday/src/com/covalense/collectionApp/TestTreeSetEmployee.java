package com.covalense.collectionApp;

import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestTreeSetEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.name = "Divya";
		e1.id = 5;
		e1.salary = 25000;

		Employee e2 = new Employee();
		e2.name = "Trsiha";
		e2.id = 2;
		e2.salary = 35000;

		Employee e3 = new Employee();
		e3.name = "Priya";
		e3.id = 4;
		e3.salary = 15000;

		Employee e4 = new Employee();
		e4.name = "Riya";
		e4.id = 3;
		e4.salary = 45000;

		EmployeeById r = new EmployeeById();
		EmployeeBySalary s = new EmployeeBySalary();
		EmployeeByName n = new EmployeeByName();
		TreeSet<Employee> ts = new TreeSet<Employee>(n);
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);

		for (Employee e : ts) {
			System.out.println("Name is " + e.name);
			System.out.println("Id is " + e.id);
			System.out.println("Salary is " + e.salary);
			System.out.println("**********************");

		}
	}

}
