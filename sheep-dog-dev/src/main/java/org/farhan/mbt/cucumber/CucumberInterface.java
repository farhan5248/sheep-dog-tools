package org.farhan.mbt.cucumber;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;
import org.farhan.dsl.common.TestStepNameHelper;

import com.github.javaparser.ast.body.MethodDeclaration;

public class CucumberInterface extends CucumberJava {

	public CucumberInterface(String thePath) {
		super(thePath);
		getType().setInterface(true);
	}

	public MethodDeclaration addStepDefinition(String step) throws Exception {
		if (theJavaClass.getImports().isEmpty()) {
			theJavaClass.addImport("java.util.HashMap");
		}
		if (!TestStepNameHelper.isEdge(step) && TestStepNameHelper.getAttachment(step).isEmpty()) {

			MethodDeclaration aMethod = addMethod(
					getSetOrAssert(step) + convertToPascalCase(TestStepNameHelper.getDetails(step))
							+ convertToPascalCase(TestStepNameHelper.getStateType(step)));
			aMethod.removeBody();
			addParameter(aMethod, "HashMap<String, String>", "keyMap");
			return aMethod;

		} else if (TestStepNameHelper.isEdge(step)) {
			return addMethod("transition").removeBody();
		} else {
			// data table or doc string will cover this
			// TODO rename this to createStepForStepObjWithoutAttachment. have the converter
			// call either this or a docstring or datatable method
			return null;
		}
	}

	public void addStepParameters(String stepDefinitionName, ArrayList<String> paramList) throws Exception {
		if (paramList.isEmpty()) {
			return;
		}
		MethodDeclaration aMethod;
		if (TestStepNameHelper.isNegativeStep(stepDefinitionName)) {
			aMethod = addMethod(getSetOrAssert(stepDefinitionName)
					+ convertToPascalCase(TestStepNameHelper.getDetails(stepDefinitionName)) + "Negative");
			aMethod.removeBody();
			addParameter(aMethod, "HashMap<String, String>", "keyMap");
		} else {
			for (String param : paramList) {
				aMethod = addMethod(getSetOrAssert(stepDefinitionName)
						+ convertToPascalCase(TestStepNameHelper.getDetails(stepDefinitionName))
						+ StringUtils.capitalize(convertToCamelCase(param)));
				aMethod.removeBody();
				addParameter(aMethod, "HashMap<String, String>", "keyMap");
			}
		}
	}

}
