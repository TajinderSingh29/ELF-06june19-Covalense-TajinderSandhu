package com.covalense.corejavaapp.basicprogram;

public class Grade 
{
	public static void main(String[] args)
	{
		int pec=55;
		if (pec>=90) 
		{
			System.out.println("Grade A+");

		}
		else if (pec>=80)
		{
			System.out.println("Grade A");

		}
		else if (pec>=70) 
		{
			System.out.println("Grade B");

		}
		else if (pec>=50) 
		{
			System.out.println("Grade C");
		}
		else
		{
			System.out.println("Your are fail better luck next time");
		}
	}

}
