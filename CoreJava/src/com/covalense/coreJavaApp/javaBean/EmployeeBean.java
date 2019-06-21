package com.covalense.corejavaapp.javabean;

import java.sql.Date;

public class EmployeeBean {
	private String name;
	private int id;
	private String dept;
	private int salary;
	private int age;
	private Date joiningDate;
	private String gender;

	public EmployeeBean() {
		
	}

	public EmployeeBean(String name, int id, String dept, int salary, int age, Date joiningDate, String gender) {
		this.name = name;
		this.id = id;
		this.dept = dept;
		this.salary = salary;
		this.age = age;
		this.joiningDate = joiningDate;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
