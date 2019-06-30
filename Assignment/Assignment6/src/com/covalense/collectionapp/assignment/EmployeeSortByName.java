package com.covalense.collectionapp.assignment;

import java.util.Comparator;

public class EmployeeSortByName implements Comparator<EmployeeSort> {

	@Override
	public int compare(EmployeeSort e1, EmployeeSort e2) {
		return e1.name.compareTo(e2.name);
	}

}
