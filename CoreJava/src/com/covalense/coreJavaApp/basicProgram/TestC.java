package com.covalense.coreJavaApp.basicProgram;

public class TestC {
	public static void main(String[] args)
		{
			BMI2 bmi=new BMI2();
			bmi.weight=68.4;
			bmi.height=1.74;
			double r=bmi.calBmi();
			System.out.println("BMI is "+r);
			bmi.result(r);

		}
	}


