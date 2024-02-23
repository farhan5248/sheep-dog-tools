package org.farhan.common;

public class MbtMavenPluginFactory extends GraphTestObjectFactory {
	public static GraphTestObject get(String className) {
		return get("mbtMavenPlugin", className);
	}
}
