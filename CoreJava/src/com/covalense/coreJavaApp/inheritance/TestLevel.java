package com.covalense.coreJavaApp.inheritance;

public class TestLevel {
	public static void main(String[] args) {
		Level3 l1=new Level3();
		l1.level1();
		l1.level2();
		l1.level3();
		System.out.println(" ");

		Level12 l2=new Level3();
		l2.level1();
		l2.level2();
		System.out.println(" ");

		LevelInher l3=new LevelInher();
		l3.level1();
	}

}
