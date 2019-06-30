package com.covalense.collectionapp.assignment;

import java.util.Comparator;

public class EmployeeSortBySalary implements Comparator<EmployeeSort> {

	@Override
	public int compare(EmployeeSort e1, EmployeeSort e2) {
		if (e1.salary > e2.salary) {
			return 1;
		} else if (e1.salary < e2.salary) {
			return -1;
		} else {
			return 0;
		}
	}
}
