package org.farhan.mbt.cucumber;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;
import org.farhan.dsl.common.TestStepNameHelper;

import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.stmt.BlockStmt;

public class CucumberClass extends CucumberJava {
	public CucumberClass(String thePath) {
		super(thePath);
		theJavaClass.addImport("io.cucumber.java.en.Given");
	}

	public void addStepDefinition(String name, ArrayList<String> paramList) throws Exception {
		theJavaClass.addImport(getFactoryImport(name));
		MethodDeclaration aMethod = addMethod(convertToCamelCase(name).replace("'", ""));
		BlockStmt body = aMethod.getBody().get();
		if (body.isEmpty()) {
			if (aMethod.getAnnotations().isEmpty()) {
				aMethod.addSingleMemberAnnotation("Given", "\"^" + name + "$\"");
			}
			body = aMethod.createBody();
			body.addStatement(getCallForFactory(name) + getCallForComponent(name) + ";");
			body.addStatement(getCallForFactory(name) + getCallForPath(name) + ";");
			if (paramList.size() == 0 && !TestStepNameHelper.isEdge(name)) {
				body.addStatement(getCallForFactory(name) + getCallForInputOutputsForState(name) + ";");
			} else if (paramList.size() == 1 && paramList.get(0).contentEquals("Content")) {
				addParameter(aMethod, "String", "docString");
				body.addStatement(getCallForFactory(name) + getCallForInputOutputsForDocString(name) + ";");
			} else if (paramList.size() >= 1) {
				theJavaClass.addImport("io.cucumber.datatable.DataTable");
				addParameter(aMethod, "DataTable", "dataTable");
				body.addStatement(getCallForFactory(name) + getCallForInputOutputsForDataTable(name) + ";");
			}
			if (TestStepNameHelper.isEdge(name)) {
				body.addStatement(getCallForFactory(name) + getCallForTransition() + ";");
			}
		}
	}

	private String getCallForComponent(String step) {
		return ".setComponent(\"" + TestStepNameHelper.getComponentName(step) + "\")";
	}

	protected String getCallForFactory(String step) {
		String factoryName = convertToPascalCase(TestStepNameHelper.getComponentName(step)) + "Factory";
		String interfaceName = getInterfaceName(step);
		return factoryName + ".get(\"" + interfaceName + "\")";
	}

	private String getCallForInputOutputsForDataTable(String step) throws Exception {
		return "." + getSetOrAssert(step) + "InputOutputs(" + "dataTable" + getSectionArg(step) + getNegativeArg(step)
				+ ")";
	}

	private String getCallForInputOutputsForDocString(String step) throws Exception {
		return "." + getSetOrAssert(step) + "InputOutputs(" + "\"Content\", docString" + getSectionArg(step)
				+ getNegativeArg(step) + ")";
	}

	private String getCallForInputOutputsForState(String step) throws Exception {
		return "." + getSetOrAssert(step) + "InputOutputs(\""
				+ StringUtils.capitalize(TestStepNameHelper.getStateType(step)) + "\"" + getSectionArg(step)
				+ getNegativeArg(step) + ")";
	}

	private String getCallForPath(String step) {
		return ".setPath(\"" + TestStepNameHelper.getObjectName(step) + "\")";
	}

	private String getCallForTransition() {
		return ".transition()";
	}

	protected String getFactoryImport(String step) {
		return "org.farhan.common." + convertToPascalCase(TestStepNameHelper.getComponentName(step)) + "Factory";
	}

	protected String getInterfaceName(String step) {
		String nameParts[] = TestStepNameHelper.getObjectName(step).split("/");
		String name = nameParts[nameParts.length - 1];
		return convertToPascalCase(name) + StringUtils.capitalize(TestStepNameHelper.getObjectType(step));
	}

	private String getNegativeArg(String step) {
		if (TestStepNameHelper.isNegativeStep(step)) {
			return ", true";
		} else {
			return "";
		}
	}

	protected String getObjectNameFromPath(String thePath) {
		String[] pathParts = thePath.split("/");
		String componentName = "";
		if (pathParts.length > 7) {
			// why 7? src-gen, test, java, org, farhan, stepdefs
			componentName = pathParts[6];
		}
		String objectName = pathParts[pathParts.length - 1].replace("Steps.java", "")
				.replaceFirst("(?i)^" + componentName, "");
		return objectName;
	}

	private String getSectionArg(String step) {
		String section = convertToPascalCase(TestStepNameHelper.getDetails(step));
		if (!section.isEmpty()) {
			section = ", \"" + section + "\"";
		}
		return section;
	}
}
