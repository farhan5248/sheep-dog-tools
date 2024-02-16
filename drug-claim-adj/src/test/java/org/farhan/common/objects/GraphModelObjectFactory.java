package org.farhan.common.objects;

import java.util.HashMap;

import org.farhan.common.GraphModelObject;
import org.junit.jupiter.api.Assertions;

public abstract class GraphModelObjectFactory {

	private static HashMap<String, GraphModelObject> classes = new HashMap<String, GraphModelObject>();

	public static GraphModelObject get(String className) {
		try {
			if (classes.get(className) != null) {
				return classes.get(className);
			} else {
				Class<?> gmoClass = Class.forName("org.farhan.objects." + getPackageName(className) + className);
				GraphModelObject gmo = (GraphModelObject) gmoClass.getConstructor().newInstance();
				classes.put(className, gmo);
				return gmo;
			}
		} catch (Exception e) {
			Assertions.fail("There was an error creating class\n");
		}
		return null;
	}

	private static String getPackageName(String className) {
		if (className.startsWith("Pharmacy")) {
			return "pharmacy.";
		} else if (className.startsWith("Admin")) {
			return "admin.";
		} else {
			return null;
		}
	}

}
