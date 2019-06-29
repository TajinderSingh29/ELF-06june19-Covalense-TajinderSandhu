package com.covalense.corejavaapp.jodadatetime;

import java.time.LocalDate;

import lombok.extern.java.Log;

@Log
public class LocalDateTest {
	public static void main(String[] args) {

		LocalDate a = LocalDate.now();
		LocalDate a1 = LocalDate.now();
		log.info("" + a);
		log.info("" + a.getDayOfMonth());
		log.info("" + a.getDayOfYear());
		log.info("" + a.getMonthValue());
		log.info("" + a.getYear());
		log.info("" + a.getChronology());
		log.info("" + a.getClass());
		log.info("" + a.getDayOfWeek());
		log.info("" + a.getEra());
		log.info("" + a.getMonth());

		log.info("" + a.lengthOfMonth());
		log.info("" + a.compareTo(a1));

	}
}
