package com.covalense.corejavaapp.basicprogram;

public class Discount 
{
	public static void main(String[] args) 
	{
		double price=1500;
		double discount=25;
		int count=1;
		if(count==1)
		{
			price=price-(price*discount)/100;
			System.out.println(price);
		}
		System.out.println(price+" acutal price is you have pay in paytm");

	}

}
