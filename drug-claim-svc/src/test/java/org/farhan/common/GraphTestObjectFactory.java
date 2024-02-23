package org.farhan.common;

import java.util.HashMap;

import org.junit.jupiter.api.Assertions;

public abstract class GraphTestObjectFactory {

	private static String preOrPost = "pre";
	private static HashMap<String, GraphTestObject> classes = new HashMap<String, GraphTestObject>();

	public static GraphTestObject get(String packageName, String className) {
		try {
			if (classes.get(className) != null) {
				return classes.get(className);
			} else {
				Class<?> gmoClass = Class
						.forName("org.farhan.objects." + packageName + "." + preOrPost + "." + className + "Impl");
				GraphTestObject gmo = (GraphTestObject) gmoClass.getConstructor().newInstance();
				classes.put(className, gmo);
				return gmo;
			}
		} catch (Exception e) {
			Assertions.fail("There was an error creating class\n");
		}
		return null;
	}

	public static void setPre(boolean b) {
		if (b) {
			preOrPost = "pre";
		} else {
			preOrPost = "post";
		}
	}
}
