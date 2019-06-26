package com.covalense.corejavaapp.implementlambda;

import java.util.Comparator;
import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1 = new Employee("Anitha", 3, 998.5);
		Employee e2 = new Employee("Deepa", 6, 1998.5);
		Employee e3 = new Employee("Priya", 4, 598.5);
		Employee e4 = new Employee("Raju", 1, 798.5);
		Comparator<Employee> c = (e, f) -> {
			if (e.id > f.id) {
				return 1;
			} else if (e.id < f.id) {
				return -1;
			} else {
				return 0;
			}
		};

		Comparator<Employee> c2 = (e, f) -> e.name.compareTo(f.name);

		TreeSet<Employee> ts = new TreeSet<Employee>(c2);
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);

		for (Employee e : ts) {
			log.info("Name is " + e.name);
			log.info("Id is " + e.id);
			log.info("Salary is " + e.salary);
			log.info("**********************");

		}

	}
}
