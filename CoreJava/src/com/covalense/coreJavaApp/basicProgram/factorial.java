package com.covalense.corejavaapp.basicprogram;

public class factorial {
	static int fact(int a)
	{
		/*
		  int b=1; 
		  for (int i = 1; i <=a; i++) 
		  b=b*i; 
		  return b;
		 */
		if (a==0) 
		{
			return 1;
		}
		return a*fact(a-1);
	}
	public static void main(String[] args) 
	{
		int i=fact(5);
		System.out.println("Result is "+i);
	}

}
