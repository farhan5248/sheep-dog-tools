package org.farhan.mbt.junit;

import org.farhan.dsl.common.TestStepNameHelper;

import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.body.ConstructorDeclaration;

public class JunitSpringClass extends JunitClass {

	public JunitSpringClass(String thePath) {
		super(thePath);
	}

	protected void addConstructor(String name) {
		if (getType().getConstructors().isEmpty()) {
			ConstructorDeclaration constructor = getType().addConstructor(Modifier.Keyword.PUBLIC);
			constructor.addAndGetParameter(getObjectNameFromPath(thePath), "object");
			constructor.createBody().addStatement("super(object,\"" + TestStepNameHelper.getComponentName(name)
					+ "\",\"" + TestStepNameHelper.getObjectName(name) + "\");");
			theJavaClass.addImport(getPackageDeclaration().replaceFirst(".stepdefs.", ".objects.") + "."
					+ getObjectNameFromPath(thePath));
		}
	}

}
