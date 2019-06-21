package com.covalense.corejavaapp.javabean;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeBean2 {
	private String name;
	private int id;
	private String dept;
	private int salary;
	private int age;
	private Date joiningDate;
	private String gender;

}// End of Class
