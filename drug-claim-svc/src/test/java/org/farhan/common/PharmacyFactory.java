package org.farhan.common;

public class PharmacyFactory extends GraphTestObjectFactory {

	public static GraphTestObject get(String className) {
		return get("pharmacy", className);
	}

	public static GraphTestObject create(String className) {
		return create("pharmacy", className);
	}

}
