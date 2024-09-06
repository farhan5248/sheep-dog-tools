package org.farhan.common;

public class XtextFactory extends TestObjectFactory {

	public static TestObject get(String className) {
		return get("xtext", className);
	}
}
