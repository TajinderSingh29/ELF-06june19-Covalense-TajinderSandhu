package com.covalense.collectionapp.assignment;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.name = "Divya";
		employee1.id = 5;
		employee1.salary = 25000;

		Employee employee2 = new Employee();
		employee2.name = "Trsiha";
		employee2.id = 2;
		employee2.salary = 35000;

		Employee employee3 = new Employee();
		employee3.name = "Priya";
		employee3.id = 4;
		employee3.salary = 15000;

		Employee employee4 = new Employee();
		employee4.name = "Riya";
		employee4.id = 3;
		employee4.salary = 45000;

		ArrayList<Employee> arrayList = new ArrayList<Employee>();

		arrayList.add(employee1);
		arrayList.add(employee2);
		arrayList.add(employee3);
		arrayList.add(employee4);

		for (Employee employee : arrayList) {
			log.info("Name is " + employee.name);
			log.info("Id is " + employee.id);
			log.info("Salary is " + employee.salary);

		}

	}

}
