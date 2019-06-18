package com.covalense.coreJavaApp.basicProgram;

public class Pect
{
	static double calpect(double totm,double obtm)
	{
		double res=obtm*100/totm;
		return res;
	}
	public static void main(String[] args) 
	{
		double r=calpect(700, 500);
		System.out.println(r);
	}
	

}
