package com.covalense.collectionapp.assignment;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class StudentBeanTest {
	public static void main(String[] args) {
		ArrayList<StudentBean> arrayList = new ArrayList<StudentBean>();

		StudentBean studentBean = new StudentBean();
		studentBean.setName("Sonu");
		studentBean.setAge(20);
		studentBean.setPercentage(65.28);

		StudentBean studentBean1 = new StudentBean();
		studentBean1.setName("Trisha");
		studentBean1.setAge(21);
		studentBean1.setPercentage(85.28);

		StudentBean studentBean2 = new StudentBean();
		studentBean2.setName("Priya");
		studentBean2.setAge(18);
		studentBean2.setPercentage(60.28);

		StudentBean studentBean3 = new StudentBean();
		studentBean3.setName("Riya");
		studentBean3.setAge(22);
		studentBean3.setPercentage(55.28);

		StudentBean studentBean4 = new StudentBean();
		studentBean4.setName("Saini");
		studentBean4.setAge(30);
		studentBean4.setPercentage(45.28);

		arrayList.add(studentBean);
		arrayList.add(studentBean1);
		arrayList.add(studentBean2);
		arrayList.add(studentBean3);
		arrayList.add(studentBean4);

		for (StudentBean student : arrayList) {
			log.info("Name is " + student.getName());
			log.info("Age is " + student.getAge());
			log.info("Percentage is " + student.getPercentage());

		}
	}
}
