package org.farhan.common;

import java.util.HashMap;
import java.util.Set;

import org.junit.jupiter.api.Assertions;

import com.google.common.reflect.ClassPath;
import com.google.common.reflect.ClassPath.ClassInfo;

public abstract class GraphTestObjectFactory {

	private static String preOrPost = "pre";
	private static HashMap<String, GraphTestObject> classes = new HashMap<String, GraphTestObject>();

	public static void setPre(boolean b) {
		if (b) {
			preOrPost = "pre";
		} else {
			preOrPost = "post";
		}
	}

	public static Class<?> getClassInPackage(String rootPkg, String testObjName) throws Exception {

		Set<ClassInfo> testObjs = ClassPath.from(ClassLoader.getSystemClassLoader()).getAllClasses();
		for (ClassInfo testObj : testObjs) {
			if (testObj.getName().endsWith(testObjName + "Impl")
					&& testObj.getName().startsWith("org.farhan.objects." + rootPkg + "." + preOrPost)) {
				return Class.forName(testObj.getName());
			}
		}
		return null;
	}

	public static GraphTestObject get(String packageName, String className) {
		try {
			if (classes.get(className) != null) {
				return classes.get(className);
			} else {
				Class<?> gmoClass = getClassInPackage(packageName, className);
				GraphTestObject gmo = (GraphTestObject) gmoClass.getConstructor().newInstance();
				classes.put(className, gmo);
				return gmo;
			}
		} catch (Exception e) {
			Assertions.fail("There was an error creating class\n");
		}
		return null;
	}

}
