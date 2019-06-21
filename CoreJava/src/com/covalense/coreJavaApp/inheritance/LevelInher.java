package com.covalense.corejavaapp.inheritance;

public class LevelInher {
	
	void level1() {
		System.out.println("Level1");
	}

}
 class Level12 extends LevelInher
{
	 void level2() {
			System.out.println("Level2");
		}

	public void speed() {
		
	}
}
 class Level3 extends Level12
{
	 void level3() {
			System.out.println("Level3");
		}
}

