package com.covalense.corejava.assesmenttest.ques1;

public class CheckSoundAnimal {

	void soundBasedOnAnimal(Animal a) {
		if (a instanceof Cow) {
			a.soundOfAnimal();
		} else if (a instanceof Dog) {
			a.soundOfAnimal();
		}
	}

}
