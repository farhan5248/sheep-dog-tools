package org.farhan.mbt.cucumber;

import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.body.ConstructorDeclaration;

public class CucumberSpringClass extends CucumberClass {

	public CucumberSpringClass(String thePath) {
		super(thePath);
		getType().addExtendedType("TestSteps");
		theJavaClass.addImport("org.farhan.common.TestSteps");
		// TODO create a test for constructor creation
		ConstructorDeclaration constructor = getType().addConstructor(Modifier.Keyword.PUBLIC);
		constructor.addAndGetParameter(getObjectNameFromPath(thePath), "object");
		constructor.createBody().addStatement("super(object);");
	}

	protected String getFactoryImport(String step) {
		return getPackageDeclaration().replaceFirst(".stepdefs.", ".objects.") + "." + getInterfaceName(step);
	}

	protected String getCallForFactory(String step) {
		return "object";
	}

}
