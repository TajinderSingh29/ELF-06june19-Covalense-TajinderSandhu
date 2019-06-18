package com.covalense.coreJavaApp.inheritance;

public class Pen {
	
	int cost;
	
	void write() 
	{
		System.out.println("Write with Pen");
	}

}

class Marker extends Pen
{
	@Override
	void write() 
	{
		System.out.println("Write with Marker");
	}
	void color()
	{
		System.out.println("Color Which u Want!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
	
}
