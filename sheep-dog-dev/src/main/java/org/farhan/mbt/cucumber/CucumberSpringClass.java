package org.farhan.mbt.cucumber;

import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.body.ConstructorDeclaration;

public class CucumberSpringClass extends CucumberClassAndInterface {

	public CucumberSpringClass(String thePath) {
		super(thePath);
		if (!isStepObj()) {
			getType().addExtendedType("TestSteps");
			theJavaClass.addImport("org.farhan.common.TestSteps");
			// TODO create a test for constructor creation
			ConstructorDeclaration constructor = getType().addConstructor(Modifier.Keyword.PUBLIC);
			// TODO this is duplicate code, think about moving this to a super class
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
		}
	}

	protected String getFactoryImport(String step) {
		return getPackageDeclaration().replaceFirst(".stepdefs.", ".objects.") + "." + getInterfaceName(step);
	}

	protected String getCallForFactory(String step) {
		return "object";
	}

}
