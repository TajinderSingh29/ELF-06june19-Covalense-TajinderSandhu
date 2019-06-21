package com.covalense.corejavaapp.basicprogram;

public class BMI2 
{
	double weight;
	double height;
	
	 double calBmi()
	{
		double res=weight/(height*height);
		return res;
	}
	
	 void result(double res)
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

public static class TestC
{
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

}
