package com.covalense.corejava.assesmenttest.ques1;

/**
 * 
 * WAP to print sound of an animal based on the object received by the method.
 *
 */
public class AnimalTest {
	public static void main(String[] args) {

		Cow cow = new Cow();
		Dog dog = new Dog();

		CheckSoundAnimal soundAnimal = new CheckSoundAnimal();
		soundAnimal.soundBasedOnAnimal(cow);
		soundAnimal.soundBasedOnAnimal(dog);

	}

}
