package org.farhan.common;

public class AdminFactory extends GraphModelObjectFactory {

	public static GraphModelObject get(String className) {
		return get("admin", className);
	}
}
