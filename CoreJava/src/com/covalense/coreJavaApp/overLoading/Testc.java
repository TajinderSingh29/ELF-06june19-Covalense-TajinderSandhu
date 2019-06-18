package com.covalense.coreJavaApp.overLoading;
 class Animal
{
	void eat()
	{
		System.out.println("******");
	}
}

class cow extends Animal
{
	void eat()
	{
		System.out.println("++++++++++");
	}
}
class Lion extends Animal
{
	void eat()
	{
		System.out.println("------------");
	}
}
public class Testc {
	 
	public static void main(String[] args) {
		Animal a ;
		a=new cow();
		a.eat();
	}

}
