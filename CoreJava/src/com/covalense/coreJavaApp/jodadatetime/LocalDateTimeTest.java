package com.covalense.corejavaapp.jodadatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import lombok.extern.java.Log;

@Log
public class LocalDateTimeTest {
	public static void main(String[] args) {
		LocalDate c = LocalDate.now();
		LocalDate dateTime = LocalDate.of(1995, 9, 29);
		log.info("" + dateTime);

		log.info("" + c);
		Period p = Period.between(c, dateTime);
		log.info("" + p);

		LocalDate l = dateTime.plusYears(60);
		log.info("" + l);

		Period p1 = Period.between(l, dateTime);
		log.info("" + p1);

		ZoneId id = ZoneId.systemDefault();
		log.info("" + id);

		ZoneId ids = ZoneId.of("Australia/Sydney");
		ZonedDateTime dateTime2 = ZonedDateTime.now(ids);
		log.info("" + dateTime2.toLocalDateTime());

	}
}
