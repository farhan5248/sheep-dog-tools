package org.farhan.common;

public class PharmacyFactory extends GraphTestObjectFactory {

	public static GraphTestObject get(String className) {
		return get("pharmacy", className);
	}
}
