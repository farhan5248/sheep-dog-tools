package org.farhan.common;

import java.util.HashMap;
import java.util.Set;
import org.junit.jupiter.api.Assertions;
import com.google.common.reflect.ClassPath;
import com.google.common.reflect.ClassPath.ClassInfo;

public abstract class TestObjectFactory {

	private static HashMap<String, TestObject> classes = new HashMap<String, TestObject>();

	public static void setup() {
		classes = new HashMap<String, TestObject>();
	}

	public static Class<?> getClassInPackage(String rootPkg, String testObjName) throws Exception {

		Set<ClassInfo> testObjs = ClassPath.from(ClassLoader.getSystemClassLoader()).getAllClasses();
		for (ClassInfo testObj : testObjs) {
			if (testObj.getName().endsWith(testObjName + "Impl")
					&& testObj.getName().startsWith("org.farhan.objects." + rootPkg + "." + "impl")) {
				return Class.forName(testObj.getName());
			}
		}
		return null;
	}

	public static TestObject get(String packageName, String className) {
		try {
			if (classes.get(className) != null) {
				return classes.get(className);
			} else {
				Class<?> gmoClass = getClassInPackage(packageName, className);
				TestObject gmo = (TestObject) gmoClass.getConstructor().newInstance();
				classes.put(className, gmo);
				return gmo;
			}
		} catch (Exception e) {
			Assertions
					.fail("There was an error creating class for package, " + packageName + " in class, " + className);
		}
		return null;
	}

}
