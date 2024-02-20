package org.farhan.common;

public class PharmacyFactory extends GraphModelObjectFactory {

	public static GraphModelObject get(String className) {
		return get("pharmacy", className);
	}
}
