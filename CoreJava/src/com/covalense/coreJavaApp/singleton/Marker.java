package com.covalense.corejavaapp.singleton;

public class Marker {

	private final static Marker m = new Marker();

	private Marker() {

	}

	public static Marker getMarker() {
		return m;
	}

}
