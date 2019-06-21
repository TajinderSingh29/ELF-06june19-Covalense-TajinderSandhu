package com.covalense.corejavaapp.basicprogram;

public class Seinor
{
	public static void main(String[] args) {
		int age=50;
		double price=700;
		double discount=15.2;
		if(age>=60)
		{
			price=price-(price*discount)/100;
			System.out.println(price);
		}
		System.out.println(" your Ticket price is"+price);

	}

}
