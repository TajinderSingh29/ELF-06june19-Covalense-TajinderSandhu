package com.covalense.collectionapp.assignment;

import java.util.Comparator;

public class EmployeeSortById implements Comparator<EmployeeSort> {

	@Override
	public int compare(EmployeeSort e1, EmployeeSort e2) {
		if (e1.id > e2.id) {
			return 1;
		} else if (e1.id < e2.id) {
			return -1;
		} else {
			return 0;
		}
	}
}
