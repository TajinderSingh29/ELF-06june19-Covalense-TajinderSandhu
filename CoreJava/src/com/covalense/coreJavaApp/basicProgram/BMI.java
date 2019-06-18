package com.covalense.coreJavaApp.basicProgram;

public class BMI 
{
	/*
	 public static void main(String[] args) {
	  double height=1.75;
	   double weight=68.4; 
	   double res=weight/(height*height);
	  System.out.println("The BMI is "+res); }
	 */
	static double calBmi(double ht,double wg)
	{
		double res=wg/(ht*ht);
		return res;
	}
	
	static void result(double res)
	{
		if (res<=18.5) 
		{
			System.out.println("Under Weight");
		}
		else if(res>18.5 && res<=24.5)
		{
			System.out.println("Normal");
		}
		else if(res>25 && res<=29.9)
		{
			System.out.println("OverWeight");
		}
		else
		{
			System.out.println("Obese");
		}
	}
	
	public static void main(String[] args) 
	{
		double t=calBmi(1.75, 68.4);
		System.out.println("BMI is "+t);
		result(t);
	}
}
