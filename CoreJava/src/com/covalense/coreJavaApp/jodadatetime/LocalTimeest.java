package com.covalense.corejavaapp.jodadatetime;

import java.time.LocalTime;

import lombok.extern.java.Log;

@Log
public class LocalTimeest {
	public static void main(String[] args) {

		LocalTime a = LocalTime.now();

		log.info("" + a);
		log.info("" + a.getHour());
		log.info("" + a.getMinute());
		log.info("" + a.getSecond());
		log.info("" + a.getNano());
		log.info("" + a.minusHours(2));

	}
}
