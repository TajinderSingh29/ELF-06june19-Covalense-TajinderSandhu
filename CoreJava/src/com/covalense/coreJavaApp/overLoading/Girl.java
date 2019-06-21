package com.covalense.corejavaapp.overloading;

public class Girl {
	
	void take(Phone p)
	{
		if(p instanceof MiPhone)
		{
			System.out.println("Thank u Brother");
		}
		else if(p instanceof Iphone)
		{
			System.out.println("I Love u");

		}
		
	}

}
