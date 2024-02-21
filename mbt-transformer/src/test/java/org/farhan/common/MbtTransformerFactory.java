package org.farhan.common;

import java.util.HashMap;

import org.farhan.mbt.core.Utilities;
import org.junit.jupiter.api.Assertions;

public class MbtTransformerFactory {

	private static HashMap<String, GraphModelObject> classes = new HashMap<String, GraphModelObject>();

	public static GraphModelObject get(String className) {
		try {
			if (classes.get(className) != null) {
				return classes.get(className);
			} else {
				Class<?> gmoClass = Class.forName("org.farhan.objects.mbtTransformer." + className);
				if (className.endsWith("File")) {
					FileObject foo = (FileObject) gmoClass.getConstructor().newInstance();
					foo.setBaseDir("mbt-transformer");
					// TODO delete this method after regenerating the test code with setPath as an
					// attribute
					setPath(className, foo);
					classes.put(className, foo);
					return foo;
				} else if (className.endsWith("Goal")) {
					GraphModelObject gmo = (GraphModelObject) gmoClass.getConstructor().newInstance();
					classes.put(className, gmo);
					return gmo;
				} else {
					Assertions.fail("Unknown class name: " + className);
				}
			}
		} catch (Exception e) {
			Assertions.fail("There was an error creating class\n" + Utilities.getStackTraceAsString(e));
		}
		return null;
	}

	private static void setPath(String className, FileObject foo) {
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
		} else if (className.endsWith("Blah2JsonRequestJavaFile")) {
			foo.setPath("src/test/java/org/farhan/objects/blah2/JsonRequest.java");
		} else if (className.endsWith("BlahDataTablePageJavaFile")) {
			foo.setPath("src/test/java/org/farhan/objects/blah/DataTablePage.java");
		} else if (className.endsWith("BlahDocStringPageJavaFile")) {
			foo.setPath("src/test/java/org/farhan/objects/blah/DocStringPage.java");
		} else if (className.endsWith("BlahObjectPageJavaFile")) {
			foo.setPath("src/test/java/org/farhan/objects/blah/ObjectPage.java");
		} else if (className.endsWith("ProcessAdocFile")) {
			foo.setPath("src/test/resources/AsciiDoc/Process.adoc");
		} else if (className.endsWith("ProcessGraphFile")) {
			foo.setPath("target/Graphs/Process.graph");
		}
	}
}
