package com.covalense.corejavaapp.overloading;

public class TestTrain {
	public static void main(String[] args) 
	{
		Train t=new Train();
		t.search(123456);
		t.search("Any Express");
		t.search("Express", 654321);
	}

}
