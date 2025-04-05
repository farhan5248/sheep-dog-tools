package org.farhan.mbt.cucumber;

import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.body.ConstructorDeclaration;

public class CucumberGuiceClass extends CucumberClass {

	public CucumberGuiceClass(String thePath) {
		super(thePath);
		getType().addExtendedType("TestSteps");
		theJavaClass.addImport("org.farhan.common.TestSteps");
		theJavaClass.addImport("io.cucumber.guice.ScenarioScoped");
		getType().addMarkerAnnotation("ScenarioScoped");
		// TODO create a test for constructor creation
		ConstructorDeclaration constructor = getType().addConstructor(Modifier.Keyword.PUBLIC);
		// TODO create no component, single component, component with package tests
		// get the component name from the path
		constructor.addAndGetParameter(getObjectNameFromPath(thePath), "object");
		constructor.createBody().addStatement("super(object);");
		theJavaClass.addImport("com.google.inject.Inject");
		constructor.addMarkerAnnotation("Inject");
	}

	protected String getFactoryImport(String step) {
		return getPackageDeclaration().replaceFirst(".stepdefs.", ".objects.") + "." + getInterfaceName(step);
	}

	protected String getCallForFactory(String step) {
		return "object";
	}

}
