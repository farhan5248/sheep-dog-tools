package org.farhan.mbt.cucumber;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.TreeSet;

import org.apache.commons.lang3.StringUtils;
import org.farhan.dsl.common.TestStepNameHelper;
import org.farhan.mbt.convert.ConvertibleObject;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier.Keyword;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.Statement;

public class CucumberClassAndInterface implements ConvertibleObject {

	// TODO split this into CucumberClass and CucumberInterface
	protected static String lastComponent = "InitialComponent";
	protected String thePath;
	protected CompilationUnit theJavaClass;

	public CucumberClassAndInterface(String thePath) {
		this.thePath = thePath;
		// TODO if the contents are parsed in, then this might create duplication. So
		// move this out or check if these elements exist
		theJavaClass = new CompilationUnit();
		theJavaClass.setStorage(Paths.get(thePath));
		ClassOrInterfaceDeclaration javaClassType = new ClassOrInterfaceDeclaration();
		{
			String[] pathParts = thePath.split("/");
			javaClassType.setName(pathParts[pathParts.length - 1].replace(".java", ""));
		}
		javaClassType.setPublic(true);
		theJavaClass.addType(javaClassType);
		theJavaClass.setPackageDeclaration(getPackageDeclaration());
		if (isStepObj()) {
			getType().setInterface(true);
		} else {
			theJavaClass.addImport("io.cucumber.java.en.Given");
		}
	}

	protected void addParameter(MethodDeclaration aMethod, String type, String name) {
		if (aMethod.getParameters().isEmpty()) {
			aMethod.addParameter(type, name);
		}
	}

	public MethodDeclaration addStepDefinition(String step) throws Exception {
		if (isStepObj()) {
			return createStepDefinitionForStepObj(step);
		} else {
			return createStepDefinitionForStepDef(step);
		}
	}

	protected MethodDeclaration createStepDefinitionForStepDef(String step) throws Exception {

		theJavaClass.addImport(getFactoryImport(step));
		MethodDeclaration aMethod = getMethod(getMethodNameForStepDef(step));
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

	protected MethodDeclaration createStepDefinitionForStepObj(String step) throws Exception {
		if (theJavaClass.getImports().isEmpty()) {
			theJavaClass.addImport("java.util.HashMap");
		}
		if (!TestStepNameHelper.isEdge(step) && TestStepNameHelper.getAttachment(step).isEmpty()) {
			MethodDeclaration aMethod = getMethod(getMethodNameForStepObj(step));
			aMethod.removeBody();
			addParameter(aMethod, "HashMap<String, String>", "keyMap");
			return aMethod;

		} else if (TestStepNameHelper.isEdge(step)) {
			return getMethod("transition").removeBody();
		} else {
			// data table or doc string will cover this
			// TODO rename this to createStepForStepObjWithoutAttachment. have the converter
			// call either this or a docstring or datatable method
			return null;
		}
	}

	@Override
	public Object get() {
		return theJavaClass;
	}

	protected String getCallForComponent(String step) {
		String name = TestStepNameHelper.getComponentName(step);
		if (name.isEmpty()) {
			name = lastComponent;
		} else {
			lastComponent = name;
		}
		return ".setComponent(\"" + name + "\")";
	}

	protected String getCallForFactory(String step) {
		String factoryName = getFactoryName(step);
		String interfaceName = getInterfaceName(step);
		return factoryName + ".get(\"" + interfaceName + "\")";
	}

	protected String getCallForInputOutputsForDataTable(String step) throws Exception {
		return "." + getSetOrAssert(step) + "InputOutputs(" + "dataTable" + getSectionArg(step) + getNegativeArg(step)
				+ ")";
	}

	private String getNegativeArg(String step) {
		if (TestStepNameHelper.isNegativeStep(step)) {
			return ", true";
		} else {
			return "";
		}
	}

	protected String getCallForInputOutputsForDocString(String step) throws Exception {
		return "." + getSetOrAssert(step) + "InputOutputs(" + "\"Content\", docString" + getSectionArg(step) + ")";
	}

	protected String getCallForInputOutputsForState(String step) throws Exception {

		return "." + getSetOrAssert(step) + "InputOutputs(\""
				+ StringUtils.capitalize(TestStepNameHelper.getStateType(step)) + "\"" + getSectionArg(step) + ")";
	}

	protected String getCallForPath(String step) {
		return ".setPath(\"" + TestStepNameHelper.getObjectName(step) + "\")";
	}

	protected String getCallForTransition() {
		return ".transition()";
	}

	protected String getFactoryImport(String step) {
		return "org.farhan.common." + getFactoryName(step);
	}

	protected String getFactoryName(String step) {
		String name = TestStepNameHelper.getComponentName(step);
		if (name.isEmpty()) {
			name = lastComponent;
		} else {
			lastComponent = name;
		}
		name = removeSpecialChars(name);
		return StringUtils.capitalize(name) + "Factory";
	}

	protected String getInterfaceName(String step) {
		String name = TestStepNameHelper.getObjectName(step);
		String nameParts[] = name.split("/");
		name = nameParts[nameParts.length - 1];
		name = removeSpecialChars(name);
		name = name + StringUtils.capitalize(TestStepNameHelper.getObjectType(step));
		return name;
	}

	public MethodDeclaration getMethod(String methodName) {
		if (getType().getMethodsByName(methodName).isEmpty()) {
			return getType().addMethod(methodName, Keyword.PUBLIC);
		} else {
			return getType().getMethodsByName(methodName).getFirst();
		}
	}

	protected String getMethodNameForStepDef(String step) {
		String name = step;
		name = removeSpecialChars(name);
		name = name.replace("'", "");
		name = lowerFirst(name);
		return name;
	}

	protected String getMethodNameForStepObj(String step) throws Exception {
		return getSetOrAssert(step) + getSection(step)
				+ removeDelimiterAndCapitalize(TestStepNameHelper.getStateType(step), " ");
	}

	protected String getPackageDeclaration() {
		String packageName;
		packageName = thePath.replaceAll("\\" + "/" + "[^\\" + "/" + "]*$", "");
		packageName = packageName.replace("-", "");
		packageName = packageName.replace("/", ".");
		packageName = packageName.replaceFirst("^srcgen\\.test\\.java\\.org\\.farhan", "org.farhan");
		return packageName.toLowerCase();
	}

	@Override
	public String getPath() {
		return thePath;
	}

	protected String getSection(String step) {
		String sectionName = TestStepNameHelper.getDetailsName(step);
		String sectionType = TestStepNameHelper.getDetailsType(step);
		if (sectionName == null) {
			return "";
		}
		if (!sectionName.isEmpty()) {
			String section = StringUtils.capitalize(sectionName) + StringUtils.capitalize(sectionType);
			return section.replace(" ", "");
		} else {
			return "";
		}
	}

	protected String getSectionArg(String step) {
		if (!getSection(step).isEmpty()) {
			return ", \"" + getSection(step) + "\"";
		} else {
			return "";
		}
	}

	protected String getSetOrAssert(String stepName) throws Exception {
		String text = TestStepNameHelper.getStateModality(stepName);
		String modality = "";
		if (text.isEmpty()) {
			modality = "set";
		} else {
			if (text.endsWith("be")) {
				modality = "assert";
			} else if (text.startsWith("is")) {
				modality = "set";
			} else {
				throw new Exception("Can't determine the modality for: " + stepName);
			}
		}
		return modality;
	}

	private Statement getStatement(BlockStmt body, String statement) {
		for (Statement s : body.getStatements()) {
			if (s.toString().contentEquals(statement)) {
				return s;
			}
		}
		return null;
	}

	protected ClassOrInterfaceDeclaration getType() {
		return (ClassOrInterfaceDeclaration) theJavaClass.getType(0);
	}

	protected boolean isStepObj() {
		if (getType().getName().asString().endsWith("Steps")) {
			return false;
		} else {
			return true;
		}
	}

	private String lowerFirst(String text) {
		if (!text.isEmpty()) {
			return text.substring(0, 1).toLowerCase() + text.substring(1);
		}
		return text;
	}

	@Override
	public void parse(String text) throws Exception {
		try {
			if (text.isEmpty()) {
				return;
			}
			if (getType().getMethods().isEmpty()) {
				InputStream content = new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8));
				theJavaClass = new JavaParser().parse(content).getResult().get();
			}
		} catch (Exception e) {
			throw new Exception("There was a problem parsing file: " + thePath);
		}
	}

	protected String removeDelimiterAndCapitalize(String text, String delimiter) {
		String[] nameParts = text.split(delimiter);
		text = "";
		for (String s : nameParts) {
			text += StringUtils.capitalize(s);
		}
		return text;
	}

	protected String removeSpecialChars(String text) {
		text = removeDelimiterAndCapitalize(text, " ");
		text = removeDelimiterAndCapitalize(text, "\\.");
		text = removeDelimiterAndCapitalize(text, "\\-");
		text = removeDelimiterAndCapitalize(text, "/");
		text = removeDelimiterAndCapitalize(text, ",");
		return text;
	}

	public String toString() {
		// TODO make tests for this
		TreeSet<String> sorted = new TreeSet<String>();
		for (int i = theJavaClass.getImports().size(); i > 0; i--) {
			sorted.add(theJavaClass.getImports().get(i - 1).getNameAsString());
			theJavaClass.getImports().remove(i - 1);
		}
		for (String name : sorted) {
			theJavaClass.addImport(name);
		}
		return theJavaClass.toString();
	}

	public void addStepParameters(String stepDefinitionName, ArrayList<String> paramList) throws Exception {
		if (paramList.isEmpty()) {
			return;
		}
		if (isStepObj()) {
			setStepDefinitionParametersForStepObj(stepDefinitionName, paramList);
		} else {
			setStepDefinitionParametersForStepDef(stepDefinitionName, paramList);
		}
	}

	private void setStepDefinitionParametersForStepDef(String stepDefinitionName, ArrayList<String> paramList)
			throws Exception {
		MethodDeclaration aMethod;
		aMethod = getMethod(getMethodNameForStepDef(stepDefinitionName));
		BlockStmt body = aMethod.getBody().get();
		String statement;
		if (paramList.size() == 1 && paramList.get(0).contentEquals("Content")) {
			addParameter(aMethod, "String", "docString");
			statement = getCallForFactory(stepDefinitionName) + getCallForInputOutputsForDocString(stepDefinitionName)
					+ ";";
		} else {
			theJavaClass.addImport("io.cucumber.datatable.DataTable");
			addParameter(aMethod, "DataTable", "dataTable");
			statement = getCallForFactory(stepDefinitionName) + getCallForInputOutputsForDataTable(stepDefinitionName)
					+ ";";
		}
		if (getStatement(body, statement) == null) {
			body.addStatement(statement);
			body.getStatements().add(2, body.getStatements().getLast().get());
			body.getStatements().removeLast();
		}
	}

	private void setStepDefinitionParametersForStepObj(String stepDefinitionName, ArrayList<String> paramList)
			throws Exception {
		MethodDeclaration aMethod;

		if (TestStepNameHelper.isNegativeStep(stepDefinitionName)) {
			aMethod = getMethod(getSetOrAssert(stepDefinitionName) + getSection(stepDefinitionName) + "Negative");
			aMethod.removeBody();
			addParameter(aMethod, "HashMap<String, String>", "keyMap");
		} else {
			for (String param : paramList) {
				aMethod = getMethod(getSetOrAssert(stepDefinitionName) + getSection(stepDefinitionName)
						+ StringUtils.capitalize(removeSpecialChars(param)));
				aMethod.removeBody();
				addParameter(aMethod, "HashMap<String, String>", "keyMap");
			}
		}
	}
}
