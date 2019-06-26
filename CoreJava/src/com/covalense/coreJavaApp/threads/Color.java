package com.covalense.corejavaapp.threads;

import java.util.concurrent.Callable;

public class Color implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		int k=1;
		for (int i = 1; i <=5; i++) {
			k=k*i;
		}
		return k;
	}

}
