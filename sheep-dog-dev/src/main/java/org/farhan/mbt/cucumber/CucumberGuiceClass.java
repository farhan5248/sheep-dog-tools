package org.farhan.mbt.cucumber;

import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.body.ConstructorDeclaration;

public class CucumberGuiceClass extends CucumberClassAndInterface {

	public CucumberGuiceClass(String thePath) {
		super(thePath);
		if (!isStepObj()) {
			getType().addExtendedType("TestSteps");
			theJavaClass.addImport("org.farhan.common.TestSteps");
			theJavaClass.addImport("io.cucumber.guice.ScenarioScoped");
			getType().addMarkerAnnotation("ScenarioScoped");
			// TODO create a test for constructor creation
			ConstructorDeclaration constructor = getType().addConstructor(Modifier.Keyword.PUBLIC);
			// TODO create no component, single component, component with package tests
			// get the component name from the path
			String[] pathParts = thePath.split("/");
			String componentName = "";
			if (pathParts.length > 7) {
				// why 7? src, test, java, org, farhan, stepdefs
				componentName = pathParts[6];
			}
			String objectName = pathParts[pathParts.length - 1].replace("Steps.java", "")
					.replaceFirst("(?i)^" + componentName, "");
			constructor.addAndGetParameter(objectName, "object");
			constructor.createBody().addStatement("super(object);");
			theJavaClass.addImport("com.google.inject.Inject");
			constructor.addMarkerAnnotation("Inject");
		}
	}

	protected String getFactoryImport(String step) {
		// TODO get stepdefs and objects from the CucumberPathConverter. In fact the
		// directory layers should be defined in the abstract PathConverter
		return getPackageDeclaration().replaceFirst(".stepdefs.", ".objects.") + "." + getInterfaceName(step);
	}

	protected String getCallForFactory(String step) {
		return "object";
	}

}
