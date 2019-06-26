package com.covalense.corejavaapp.implementlambda;

import lombok.extern.java.Log;

@Log
public class GenderTest {
	public static void main(String[] args) {
		log.info(Gender.MALE + "");
		log.info(Gender.FEMALE.ordinal() + "");

		Gender g = Gender.FEMALE;
		switch (g) {
		case MALE:
			log.info("Yes Its male");
			break;
		case FEMALE:
			log.info("Yes Its female");
			break;
		case OTHER:
			log.info("Yes Its cross gender");
			break;

		default:
			break;
		}

	}

}
