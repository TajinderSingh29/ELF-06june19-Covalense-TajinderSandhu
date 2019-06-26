package com.covalense.corejavaapp.threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import lombok.extern.java.Log;

@Log
public class ColorTest {
	public static void main(String[] args) {
		Color c = new Color();

		FutureTask<Integer> ft = new FutureTask<Integer>(c);
		Thread t1 = new Thread(ft);
		t1.start();

		try {
			int a = ft.get();
			log.info("value is " + a);

		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

}
