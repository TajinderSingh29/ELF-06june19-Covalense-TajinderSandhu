package com.covalense.corejavaapp.basicprogram;

public class LargeNumber {

	public static void main(String[] args) 
	{
		int num1=14;
		int num2=12;
		int num3=15;
		if(num1>num2 && num1>num3)
		{
			System.out.println(num1+" num1 is the largest");	
		}
		else if(num2>num3)
		{
			System.out.println(num2+" num2 is the largest");	
		}
		else {
			System.out.println(num3+" num3 is the largest");
		}

	}

}
