package org.farhan.mbt.cucumber;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;
import org.farhan.dsl.common.TestStepNameHelper;

import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.Statement;

public class CucumberClass extends CucumberJava {
	public CucumberClass(String thePath) {
		super(thePath);
		theJavaClass.addImport("io.cucumber.java.en.Given");
	}

	public MethodDeclaration addStepDefinition(String step) throws Exception {
		theJavaClass.addImport(getFactoryImport(step));
		MethodDeclaration aMethod = addMethod(convertToCamelCase(step).replace("'", ""));
		BlockStmt body = aMethod.getBody().get();
		if (body.isEmpty()) {
			if (aMethod.getAnnotations().isEmpty()) {
				aMethod.addSingleMemberAnnotation("Given", "\"^" + step + "$\"");
			}
			body = aMethod.createBody();
			body.addStatement(getCallForFactory(step) + getCallForComponent(step) + ";");
			body.addStatement(getCallForFactory(step) + getCallForPath(step) + ";");
			if (TestStepNameHelper.isEdge(step)) {
				body.addStatement(getCallForFactory(step) + getCallForTransition() + ";");
			} else {
				if (TestStepNameHelper.getAttachment(step).isEmpty()) {
					body.addStatement(getCallForFactory(step) + getCallForInputOutputsForState(step) + ";");
				}
			}
		}
		return aMethod;
	}

	public void addStepParameters(String step, ArrayList<String> paramList) throws Exception {
		if (paramList.isEmpty()) {
			return;
		}
		MethodDeclaration aMethod;
		aMethod = addMethod(convertToCamelCase(step).replace("'", ""));
		String statement;
		if (paramList.size() == 1 && paramList.get(0).contentEquals("Content")) {
			addParameter(aMethod, "String", "docString");
			statement = getCallForFactory(step) + getCallForInputOutputsForDocString(step)
					+ ";";
		} else {
			theJavaClass.addImport("io.cucumber.datatable.DataTable");
			addParameter(aMethod, "DataTable", "dataTable");
			statement = getCallForFactory(step) + getCallForInputOutputsForDataTable(step)
					+ ";";
		}
		BlockStmt body = aMethod.getBody().get();
		if (getStatement(body, statement) == null) {
			body.addStatement(statement);
			body.getStatements().add(2, body.getStatements().getLast().get());
			body.getStatements().removeLast();
		}
	}

	private String getCallForComponent(String step) {
		return ".setComponent(\"" + TestStepNameHelper.getComponentName(step) + "\")";
	}

	protected String getCallForFactory(String step) {
		String factoryName = getFactoryName(step);
		String interfaceName = getInterfaceName(step);
		return factoryName + ".get(\"" + interfaceName + "\")";
	}

	private String getCallForInputOutputsForDataTable(String step) throws Exception {
		return "." + getSetOrAssert(step) + "InputOutputs(" + "dataTable" + getSectionArg(step) + getNegativeArg(step)
				+ ")";
	}

	private String getCallForInputOutputsForDocString(String step) throws Exception {
		return "." + getSetOrAssert(step) + "InputOutputs(" + "\"Content\", docString" + getSectionArg(step) + ")";
	}

	private String getCallForInputOutputsForState(String step) throws Exception {

		return "." + getSetOrAssert(step) + "InputOutputs(\""
				+ StringUtils.capitalize(TestStepNameHelper.getStateType(step)) + "\"" + getSectionArg(step) + ")";
	}

	private String getCallForPath(String step) {
		return ".setPath(\"" + TestStepNameHelper.getObjectName(step) + "\")";
	}

	private String getCallForTransition() {
		return ".transition()";
	}

	protected String getFactoryImport(String step) {
		return "org.farhan.common." + getFactoryName(step);
	}

	private String getFactoryName(String step) {
		String name = TestStepNameHelper.getComponentName(step);
		name = convertToCamelCase(name);
		return StringUtils.capitalize(name) + "Factory";
	}

	protected String getInterfaceName(String step) {
		String name = TestStepNameHelper.getObjectName(step);
		String nameParts[] = name.split("/");
		name = nameParts[nameParts.length - 1];
		name = convertToCamelCase(name);
		name = name + StringUtils.capitalize(TestStepNameHelper.getObjectType(step));
		return name;
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

	private Statement getStatement(BlockStmt body, String statement) {
		for (Statement s : body.getStatements()) {
			if (s.toString().contentEquals(statement)) {
				return s;
			}
		}
		return null;
	}
}
