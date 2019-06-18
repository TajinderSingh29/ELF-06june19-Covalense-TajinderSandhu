package com.covalense.coreJavaApp.overLoading;

public class Train {
	
	void search(int i)
	{
		System.out.println("Search With Train number ");
	}
	
	void search(String s)
	{
		System.out.println("Search With Train Name ");
	}
	
	void search(String s,int i)
	{
		System.out.println("Search With Train name&number ");
	}

}
