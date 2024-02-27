package org.farhan.common;

public class MbtTransformerFactory extends GraphTestObjectFactory {

	public static GraphTestObject get(String className) {
		return get("mbtTransformer", className);
	}
}
