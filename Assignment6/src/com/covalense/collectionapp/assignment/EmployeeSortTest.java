package com.covalense.collectionapp.assignment;

import java.util.ArrayList;
import java.util.Collections;

import lombok.extern.java.Log;

@Log
public class EmployeeSortTest {
	public static void main(String[] args) {
		EmployeeSort employeeSort1 = new EmployeeSort();
		employeeSort1.name = "Divya";
		employeeSort1.id = 5;
		employeeSort1.salary = 25000;

		EmployeeSort employeeSort2 = new EmployeeSort();
		employeeSort2.name = "Trsiha";
		employeeSort2.id = 2;
		employeeSort2.salary = 35000;

		EmployeeSort employeeSort3 = new EmployeeSort();
		employeeSort3.name = "Priya";
		employeeSort3.id = 4;
		employeeSort3.salary = 15000;

		EmployeeSort employeeSort4 = new EmployeeSort();
		employeeSort4.name = "Riya";
		employeeSort4.id = 3;
		employeeSort4.salary = 45000;

		ArrayList<EmployeeSort> arrayList = new ArrayList<EmployeeSort>();

		arrayList.add(employeeSort1);
		arrayList.add(employeeSort2);
		arrayList.add(employeeSort3);
		arrayList.add(employeeSort4);
		EmployeeSortById employeeSortById = new EmployeeSortById();
		EmployeeSortByName employeeSortByName = new EmployeeSortByName();
		EmployeeSortBySalary employeeSortBySalary = new EmployeeSortBySalary();

		int key = 2;
		switch (key) {
		case 1:
			Collections.sort(arrayList, employeeSortById);
			break;

		case 2:
			Collections.sort(arrayList, employeeSortByName);
			break;

		case 3:
			Collections.sort(arrayList, employeeSortBySalary);
			break;

		default:
			break;
		}

		for (EmployeeSort employeeSort : arrayList) {
			log.info("Name is " + employeeSort.name);
			log.info("Id is " + employeeSort.id);
			log.info("Salary is " + employeeSort.salary);

		}

	}
}
