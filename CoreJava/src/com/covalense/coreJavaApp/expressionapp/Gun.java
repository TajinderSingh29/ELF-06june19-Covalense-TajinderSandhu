package com.covalense.corejavaapp.expressionapp;

public class Gun {

	int bullet;

	public Gun(int i) {
		bullet = i;
	}

	Gun getGun() {
		return new Gun(100);
	}

}
