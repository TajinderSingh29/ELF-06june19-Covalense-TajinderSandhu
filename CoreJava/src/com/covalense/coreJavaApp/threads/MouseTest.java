package com.covalense.corejavaapp.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MouseTest {
	public static void main(String[] args) {
		Mouse t1 = new Mouse("frist");
		Mouse t2 = new Mouse("second");
		Mouse t3 = new Mouse("third");
		Mouse t4 = new Mouse("fourth");
		Mouse t5 = new Mouse("fifth");

		ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute(t1);
		service.execute(t2);
		service.execute(t3);
		service.execute(t4);
		service.execute(t5);

		service.shutdown();
	}

}
