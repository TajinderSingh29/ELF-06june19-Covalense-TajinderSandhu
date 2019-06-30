package com.covalense.mapapp.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import lombok.extern.java.Log;

@Log
public class EmployeeArrayMap {
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

		HashMap<String, ArrayList<Employee>> map = new HashMap<String, ArrayList<Employee>>();
		map.put("trainee", arrayList);
		map.put("Software developer", arrayList);
		map.put("Manager", arrayList);
		map.put("Product Manager", arrayList);
		for (Map.Entry<String, ArrayList<Employee>> employeeMap : map.entrySet()) {
			String key = employeeMap.getKey();
			ArrayList<Employee> val = employeeMap.getValue();
			log.info("Key is " + key);
			log.info("Value is " + val);

		}
	}
}
