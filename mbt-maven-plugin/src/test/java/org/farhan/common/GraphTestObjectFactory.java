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
		} else if (className.endsWith("OrdersTxtFileJavaFile")) {
			foo.setPath("src/test/java/org/farhan/objects/acme/OrdersTxtFile.java");
		} else if (className.endsWith("AcmeOrdersTxtFileStepsJavaFile")) {
			foo.setPath("src/test/java/org/farhan/stepdefs/acme/AcmeOrdersTxtFileSteps.java");
		} else if (className.endsWith("AcmeNightlyJobStepsJavaFile")) {
			foo.setPath("src/test/java/org/farhan/stepdefs/acme/AcmeNightlyJobSteps.java");
		} else if (className.endsWith("AcmeReportingJobStepsJavaFile")) {
			foo.setPath("src/test/java/org/farhan/stepdefs/acme/AcmeReportingJobSteps.java");
		} else if (className.endsWith("BatchJobTestingFeatureFile")) {
			foo.setPath("src/test/resources/cucumber/Batch-Job Testing.feature");
		} else if (className.endsWith("NightlyJobJavaFile")) {
			foo.setPath("src/test/java/org/farhan/objects/acme/NightlyJob.java");
		} else if (className.endsWith("ReportingJobJavaFile")) {
			foo.setPath("src/test/java/org/farhan/objects/acme/ReportingJob.java");
		} else if (className.endsWith("ApplicationTestingFeatureFile")) {
			foo.setPath("src/test/resources/cucumber/Application Testing.feature");
		} else if (className.endsWith("AccountDetailsPageJavaFile")) {
			foo.setPath("src/test/java/org/farhan/objects/acme/AccountDetailsPage.java");
		} else if (className.endsWith("AccountSearchRequestJavaFile")) {
			foo.setPath("src/test/java/org/farhan/objects/acme/AccountSearchRequest.java");
		} else if (className.endsWith("AcmeAccountDetailsPageStepsJavaFile")) {
			foo.setPath("src/test/java/org/farhan/stepdefs/acme/AcmeAccountDetailsPageSteps.java");
		} else if (className.endsWith("AcmeAccountSearchRequestStepsJavaFile")) {
			foo.setPath("src/test/java/org/farhan/stepdefs/acme/AcmeAccountSearchRequestSteps.java");
		} else if (className.endsWith("AcmeHomePageStepsJavaFile")) {
			foo.setPath("src/test/java/org/farhan/stepdefs/acme/AcmeHomePageSteps.java");
		} else if (className.endsWith("AcmeLogInRequestStepsJavaFile")) {
			foo.setPath("src/test/java/org/farhan/stepdefs/acme/AcmeLogInRequestSteps.java");
		} else if (className.endsWith("HomePageJavaFile")) {
			foo.setPath("src/test/java/org/farhan/objects/acme/HomePage.java");
		} else if (className.endsWith("LogInRequestJavaFile")) {
			foo.setPath("src/test/java/org/farhan/objects/acme/LogInRequest.java");
		} else {
			Assertions.fail("Can't set the path for class " + className);
		}
	}
}
