package com.covalense.corejavaapp.wrapper;

public class ConvertStringToNumber {
	public static void main(String[] args) {
		String x="40";
		String y="50";
		
		System.out.println(x+y);
		
		int i=Integer.parseInt(x);
		int j=Integer.parseInt(y);
		System.out.println(i+j);
		
		String s="false";
		
		boolean b=Boolean.parseBoolean(s);
		if(b) {
			System.out.println("its work");
		}
		else
		{
			System.out.println("not work");
		}
	}

}
