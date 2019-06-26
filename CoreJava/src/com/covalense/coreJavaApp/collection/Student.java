package com.covalense.corejavaapp.collection;

public class Student implements Comparable<Student> {
	int id;
	String name;
	double percentage;

	@Override
	public int compareTo(Student s) {
		return this.name.compareTo(s.name);
	}

	/* logic to sort student with respect to percentage */
	/*
	 * logic to sort student with respect to percentage
	 * 
	 * @Override public int compareTo(Student s) { if (this.percentage <
	 * s.percentage) { return -1;
	 * 
	 * } else if (this.percentage > s.percentage) { return 1;
	 * 
	 * } else { return 0; } }
	 */

	/* logic to sort student with respect to id */
	/*
	 * @Override public int compareTo(Student s) { { if (this.id < s.id) { return
	 * -1;
	 * 
	 * } else if (this.id > s.id) { return 1; }
	 * 
	 * else { return 0; } } }
	 */

}
