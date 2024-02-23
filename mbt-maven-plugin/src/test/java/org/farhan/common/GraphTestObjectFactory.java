package org.farhan.common;

import java.util.HashMap;

import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.Utilities;
import org.junit.jupiter.api.Assertions;

public abstract class GraphTestObjectFactory {

	private static HashMap<String, GraphTestObject> classes = new HashMap<String, GraphTestObject>();

	public static GraphTestObject get(String componentName, String className) {
		try {
			if (classes.get(className) != null) {
				return classes.get(className);
			} else {
				// TODO this should be set by the step definition, same like setPath
				ConvertibleProject.baseDir = "target/src-gen/" + componentName + "/";
				Class<?> gmoClass = Class
						.forName("org.farhan.objects." + componentName + ".impl." + className + "Impl");
				if (className.endsWith("File")) {
					FileObject foo = (FileObject) gmoClass.getConstructor().newInstance();
					// TODO delete this method after regenerating the test code with setPath as an
					// attribute
					setPath(className, foo);
					classes.put(className, foo);
					return foo;
				} else if (className.endsWith("Goal")) {
					GraphTestObject gmo = (GraphTestObject) gmoClass.getConstructor().newInstance();
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
		if (className.endsWith("AcmeToolDoItGoalStepsJavaFile")) {
			foo.setPath("src/test/java/org/farhan/stepdefs/acmeTool/AcmeToolDoItGoalSteps.java");
		} else if (className.endsWith("AcmeToolInputTxtFileStepsJavaFile")) {
			foo.setPath("src/test/java/org/farhan/stepdefs/acmeTool/AcmeToolInputTxtFileSteps.java");
		} else if (className.endsWith("AcmeToolOutputTxtFileStepsJavaFile")) {
			foo.setPath("src/test/java/org/farhan/stepdefs/acmeTool/AcmeToolOutputTxtFileSteps.java");
		} else if (className.endsWith("DoItGoalJavaFile")) {
			foo.setPath("src/test/java/org/farhan/objects/acmeTool/DoItGoal.java");
		} else if (className.endsWith("InputTxtFileJavaFile")) {
			foo.setPath("src/test/java/org/farhan/objects/acmeTool/InputTxtFile.java");
		} else if (className.endsWith("OutputTxtFileJavaFile")) {
			foo.setPath("src/test/java/org/farhan/objects/acmeTool/OutputTxtFile.java");
		} else if (className.endsWith("PlugInTestingFeatureFile")) {
			foo.setPath("src/test/resources/cucumber/Plug-In Testing.feature");
		}
	}
}
