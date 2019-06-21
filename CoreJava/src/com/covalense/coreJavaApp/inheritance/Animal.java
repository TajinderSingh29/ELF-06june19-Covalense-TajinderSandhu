package com.covalense.corejavaapp.inheritance;
public class Animal 
{
	void eat() {
		System.out.println("Eat What they want");
	}

}

class Tiger extends Animal
{
	void Run() {
		System.out.println("Run");
	}
}
class Cow extends Animal
{
	void milk() {
		System.out.println("milk");
	}
}
