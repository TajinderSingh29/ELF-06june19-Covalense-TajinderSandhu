package com.covalense.coreJavaApp.javaBean;

public class TestAa {
	public static void main(String[] args) {

		Person p = new Person();
		p.setName("Dinga");
		p.setAge(25);
		DB1 k = new DB1();
		DB2 l = new DB2();
		k.receive(p);
		l.receive(p);
	}

}
