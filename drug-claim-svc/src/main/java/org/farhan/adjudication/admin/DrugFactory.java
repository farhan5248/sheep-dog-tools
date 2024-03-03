package org.farhan.adjudication.admin;

import java.util.TreeMap;

public class DrugFactory {

	private static TreeMap<String, Drug> dinList = new TreeMap<String, Drug>();

	public static Drug create(String din) {
		if (dinList.get(din) != null) {
			return dinList.get(din);
		} else {
			return dinList.put(din, new Drug(din));
		}
	}

	public static Drug get(String din) {
		return dinList.get(din);
	}

	public static void reset() {
		dinList = new TreeMap<String, Drug>();
	}

}
