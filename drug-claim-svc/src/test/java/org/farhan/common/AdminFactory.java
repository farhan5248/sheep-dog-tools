package org.farhan.common;

public class AdminFactory extends GraphTestObjectFactory {

	public static GraphTestObject get(String className) {
		return get("admin", className);
	}

	public static GraphTestObject create(String className) {
		return create("admin", className);
	}
}
