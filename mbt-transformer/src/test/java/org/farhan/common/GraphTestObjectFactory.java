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
				if (className.endsWith("File")) {
					FileObject foo = (FileObject) gmoClass.getConstructor().newInstance();
					// TODO this should be set by the step definition
					// The step should call setComponent and setPath on the object just like
					// set/assert and transition are called
					setPathAndComponent(className, foo, packageName);
					classes.put(className, foo);
					return foo;
				} else {
					GraphTestObject gmo = (GraphTestObject) gmoClass.getConstructor().newInstance();
					classes.put(className, gmo);
					return gmo;
				}
			}
		} catch (Exception e) {
			Assertions.fail("There was an error creating class\n");
		}
		return null;
	}

	private static void setPathAndComponent(String className, FileObject foo, String componentName) {
		foo.setComponent(componentName);
		if (className.endsWith("PstUmlFile")) {
			foo.setPath("target/uml/pst.uml");
		} else if (className.endsWith("ProcessFeatureFile")) {
			foo.setPath("src/test/resources/Cucumber/Process.feature");
		} else if (className.endsWith("BlahDataTablePageStepsJavaFile")) {
			foo.setPath("src/test/java/org/farhan/stepdefs/blah/BlahDataTablePageSteps.java");
		} else if (className.endsWith("BlahDocStringPageStepsJavaFile")) {
			foo.setPath("src/test/java/org/farhan/stepdefs/blah/BlahDocStringPageSteps.java");
		} else if (className.endsWith("BlahObjectPageStepsJavaFile")) {
			foo.setPath("src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java");
		} else if (className.endsWith("Blah2JsonRequestStepsJavaFile")) {
			foo.setPath("src/test/java/org/farhan/stepdefs/blah2/Blah2JsonRequestSteps.java");
		} else if (className.endsWith("JsonRequestJavaFile")) {
			foo.setPath("src/test/java/org/farhan/objects/blah2/JsonRequest.java");
		} else if (className.endsWith("DataTablePageJavaFile")) {
			foo.setPath("src/test/java/org/farhan/objects/blah/DataTablePage.java");
		} else if (className.endsWith("DocStringPageJavaFile")) {
			foo.setPath("src/test/java/org/farhan/objects/blah/DocStringPage.java");
		} else if (className.endsWith("ObjectPageJavaFile")) {
			foo.setPath("src/test/java/org/farhan/objects/blah/ObjectPage.java");
		} else if (className.endsWith("ProcessAdocFile")) {
			foo.setPath("src/test/resources/AsciiDoc/Process.adoc");
		} else if (className.endsWith("ProcessGraphFile")) {
			foo.setPath("target/Graphs/Process.graph");
		} else {
			Assertions.fail("Can't set the path for class " + className);
		}
	}
}
