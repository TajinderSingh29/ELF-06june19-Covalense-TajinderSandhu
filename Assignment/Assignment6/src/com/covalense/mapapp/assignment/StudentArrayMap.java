package com.covalense.mapapp.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import lombok.extern.java.Log;

@Log
public class StudentArrayMap {
	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();

		Student student = new Student();
		student.name = "Sonu";
		student.age = 20;
		student.percentage = 65.28;

		Student student1 = new Student();
		student1.name = "Trisha";
		student1.age = 21;
		student1.percentage = 85.28;

		Student student2 = new Student();
		student2.name = "Priya";
		student2.age = 18;
		student2.percentage = 60.28;

		Student student3 = new Student();
		student3.name = "Riya";
		student3.age = 22;
		student3.percentage = 55.28;

		Student student4 = new Student();
		student4.name = "Saini";
		student4.age = 30;
		student4.percentage = 45.28;

		arrayList.add(student);
		arrayList.add(student1);
		arrayList.add(student2);
		arrayList.add(student3);
		arrayList.add(student4);

		HashMap<Integer, ArrayList<Student>> map = new HashMap<Integer, ArrayList<Student>>();
		map.put(1, arrayList);
		map.put(2, arrayList);
		map.put(3, arrayList);
		map.put(4, arrayList);
		for (Map.Entry<Integer, ArrayList<Student>> studentMap : map.entrySet()) {
			Integer key = studentMap.getKey();
			ArrayList<Student> val = studentMap.getValue();
			log.info("Key is " + key);
			log.info("Value is " + val);

		}

	}
}
