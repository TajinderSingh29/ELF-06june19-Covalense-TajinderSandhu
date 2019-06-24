package com.covalense.stringapp.assigment;

import java.util.logging.Logger;

public class StudentArray {
	private final static Logger loger = Logger.getLogger("Output");
	public static void main(String[] args) {

		Object[] objects = new Object[4];

		StudentBean studentBean = new StudentBean();
		studentBean.setName("Priya");
		studentBean.setAge(20);
		studentBean.setPercentage(68.65);

		StudentBean studentBean1 = new StudentBean();
		studentBean1.setName("Riya");
		studentBean1.setAge(22);
		studentBean1.setPercentage(78.65);

		StudentBean studentBean2 = new StudentBean();
		studentBean2.setName("Trisha");
		studentBean2.setAge(24);
		studentBean2.setPercentage(88.65);

		StudentBean studentBean3 = new StudentBean();
		studentBean3.setName("Manpreet");
		studentBean3.setAge(26);
		studentBean3.setPercentage(98.65);
		objects[0] = studentBean;
		objects[1] = studentBean1;
		objects[2] = studentBean2;
		objects[3] = studentBean3;
		for (int i = 0; i < objects.length; i++) {
			loger.info(objects[i]+"");
		}
	}

}
