package org.farhan.common;

public class MbtTransformerFactory extends TestObjectFactory {

	public static TestObject get(String className) {
		return get("mbttransformer", className);
	}
}
