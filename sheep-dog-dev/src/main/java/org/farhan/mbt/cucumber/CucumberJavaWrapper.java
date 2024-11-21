package org.farhan.mbt.cucumber;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.ObjectRepository;
import org.farhan.mbt.core.Utilities;
import org.farhan.helper.StepHelper;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier.Keyword;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.stmt.BlockStmt;

public class CucumberJavaWrapper implements ConvertibleObject {

	protected static String lastComponent = "InitialComponent";
	protected String thePath;
	protected CompilationUnit theJavaClass;

	public CucumberJavaWrapper(String thePath) {
		this.thePath = thePath;
		theJavaClass = new CompilationUnit();
		theJavaClass.setStorage(Paths.get(thePath));
		ClassOrInterfaceDeclaration javaClassType = new ClassOrInterfaceDeclaration();
		String[] pathParts = thePath.split("/");
		javaClassType.setName(pathParts[pathParts.length - 1].replace(".java", ""));
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

	public void createDocString(String step) throws Exception {
		if (isStepObj()) {
			createDocStringForStepObj(step);
		} else {
			createDocStringForStepDef(step);
		}
	}

	protected void createDocStringForStepDef(String step) throws Exception {
		MethodDeclaration aMethod = getMethod(getMethodNameForStepDef(step));
		addParameter(aMethod, "String", "docString");
		BlockStmt body = aMethod.getBody().get();
		if (StepHelper.isEdge(step) && body.getStatements().size() == 4
				|| !StepHelper.isEdge(step) && body.getStatements().size() == 3) {
			// 3rd or 4th can be transition step if it's edge or vertex
			return;
		} else {
			body.addStatement(getCallForFactory(step) + getCallForInputOutputsForDocString(step) + ";");
			body.getStatements().add(2, body.getStatements().getLast().get());
			body.getStatements().removeLast();
			return;
		}
	}

	protected void createDocStringForStepObj(String step) throws Exception {
		MethodDeclaration aMethod = getMethod(getSetOrAssert(step) + getSection(step) + "Content");
		aMethod.removeBody();
		addParameter(aMethod, "HashMap<String, String>", "keyMap");
	}

	public MethodDeclaration createStep(String step) throws Exception {
		if (isStepObj()) {
			return createStepForStepObj(step);
		} else {
			return createStepForStepDef(step);
		}
	}

	protected String getFactoryImport(String step) {
		return "org.farhan.common." + getFactoryName(step);
	}

	protected MethodDeclaration createStepForStepDef(String step) throws Exception {
		theJavaClass.addImport(getFactoryImport(step));
		MethodDeclaration aMethod = getMethod(getMethodNameForStepDef(step));
		{
			String keyword = step.split(" ")[0];
			String stepName = step.substring(keyword.length() + 1);
			if (aMethod.getAnnotations().isEmpty()) {
				aMethod.addSingleMemberAnnotation("Given", "\"^" + stepName + "$\"");
			}
		}
		BlockStmt body = aMethod.getBody().get();
		if (body.isEmpty()) {
			body = aMethod.createBody();
			body.addStatement(getCallForFactory(step) + getCallForComponent(step) + ";");
			body.addStatement(getCallForFactory(step) + getCallForPath(step) + ";");
			if (StepHelper.isEdge(step)) {
				body.addStatement(getCallForFactory(step) + getCallForTransition() + ";");
			} else {
				if (StepHelper.getAttachment(step).isEmpty()) {
					body.addStatement(getCallForFactory(step) + getCallForInputOutputsForState(step) + ";");
				}
			}
		}
		return aMethod;
	}

	protected MethodDeclaration createStepForStepObj(String step) throws Exception {
		if (theJavaClass.getImports().isEmpty()) {
			theJavaClass.addImport("java.util.HashMap");
		}
		if (!StepHelper.isEdge(step) && StepHelper.getAttachment(step).isEmpty()) {
			MethodDeclaration aMethod = getMethod(getMethodNameForStepObj(step));
			aMethod.removeBody();
			addParameter(aMethod, "HashMap<String, String>", "keyMap");
			return aMethod;

		} else if (StepHelper.isEdge(step)) {
			return getMethod("transition").removeBody();
		} else {
			// data table or doc string will cover this
			return null;
		}
	}

	public void createStepTable(String step, ArrayList<ArrayList<String>> stepTableRowList) throws Exception {
		if (isStepObj()) {
			createStepTableForStepObj(step, stepTableRowList);
		} else {
			createStepTableForStepDef(step);
		}
	}

	protected void createStepTableForStepDef(String step) throws Exception {
		theJavaClass.addImport("io.cucumber.datatable.DataTable");
		MethodDeclaration aMethod = getMethod(getMethodNameForStepDef(step));
		addParameter(aMethod, "DataTable", "dataTable");
		BlockStmt body = aMethod.getBody().get();
		if (StepHelper.isEdge(step) && body.getStatements().size() == 4
				|| !StepHelper.isEdge(step) && body.getStatements().size() == 3) {
			return;
		} else {
			body.addStatement(getCallForFactory(step) + getCallForInputOutputsForDataTable(step) + ";");
			body.getStatements().add(2, body.getStatements().getLast().get());
			body.getStatements().removeLast();
		}
	}

	protected void createStepTableForStepObj(String step, ArrayList<ArrayList<String>> stepTableRowList)
			throws Exception {
		String setOrAssert = getSetOrAssert(step);
		String sectionName = getSection(step);
		for (String columnName : stepTableRowList.getFirst()) {
			MethodDeclaration aMethod = getMethod(
					setOrAssert + sectionName + Utilities.upperFirst(removeSpecialChars(columnName)));
			aMethod.removeBody();
			addParameter(aMethod, "HashMap<String, String>", "keyMap");
		}
	}

	@Override
	public Object get() {
		return theJavaClass;
	}

	protected String getCallForComponent(String step) {
		String name = StepHelper.getComponentName(step);
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
		return "." + getSetOrAssert(step) + "InputOutputs(" + "dataTable" + getSectionArg(step) + ")";
	}

	protected String getCallForInputOutputsForDocString(String step) throws Exception {
		return "." + getSetOrAssert(step) + "InputOutputs(" + "\"Content\", docString" + getSectionArg(step) + ")";
	}

	protected String getCallForInputOutputsForState(String step) throws Exception {

		return "." + getSetOrAssert(step) + "InputOutputs(\"" + Utilities.upperFirst(StepHelper.getStateType(step))
				+ "\"" + getSectionArg(step) + ")";
	}

	protected String getCallForPath(String step) {
		return ".setPath(\"" + StepHelper.getObjectName(step) + "\")";
	}

	protected String getCallForTransition() {
		return ".transition()";
	}

	protected String getFactoryName(String step) {
		String name = StepHelper.getComponentName(step);
		if (name.isEmpty()) {
			name = lastComponent;
		} else {
			lastComponent = name;
		}
		name = removeSpecialChars(name);
		return Utilities.upperFirst(name) + "Factory";
	}

	@Override
	public String getPath() {
		return thePath;
	}

	protected String getInterfaceName(String step) {
		String name = StepHelper.getObjectName(step);
		String nameParts[] = name.split("/");
		name = nameParts[nameParts.length - 1];
		name = removeSpecialChars(name);
		name = name + Utilities.upperFirst(StepHelper.getObjectType(step));
		return name;
	}

	public MethodDeclaration getMethod(String methodName) {
		if (getType().getMethodsByName(methodName).isEmpty()) {
			return getType().addMethod(methodName, Keyword.PUBLIC);
		} else {
			return getType().getMethodsByName(methodName).getFirst();
		}
	}

	private String lowerFirst(String text) {
		if (!text.isEmpty()) {
			return text.substring(0, 1).toLowerCase() + text.substring(1);
		}
		return text;
	}

	protected String getMethodNameForStepDef(String step) {
		String name = step.substring(step.split(" ")[0].length());
		name = removeSpecialChars(name);
		name = name.replace("'", "");
		name = lowerFirst(name);
		return name;
	}

	protected String getMethodNameForStepObj(String step) throws Exception {
		return getSetOrAssert(step) + getSection(step)
				+ Utilities.removeDelimiterAndCapitalize(StepHelper.getStateType(step), " ");
	}

	protected String getPackageDeclaration() {
		String packageName = thePath.replaceAll("\\" + "/" + "[^\\" + "/" + "]*$", "");
		packageName = packageName.replace("/", ".");
		packageName = packageName.replaceFirst("^.*org.farhan", "org.farhan");
		return packageName;
	}

	protected String getSection(String step) {
		String sectionName = StepHelper.getDetailsName(step);
		String sectionType = StepHelper.getDetailsType(step);
		if (sectionName == null) {
			return "";
		}
		if (!sectionName.isEmpty()) {
			String section = Utilities.upperFirst(sectionName) + Utilities.upperFirst(sectionType);
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
		String text = StepHelper.getStateModality(stepName);
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

	@Override
	public void load(String text) throws Exception {
		try {
			if (text.isEmpty()) {
				return;
			}
			if (getType().getMethods().isEmpty()) {
				InputStream content = new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8));
				theJavaClass = new JavaParser().parse(content).getResult().get();
			}
		} catch (Exception e) {
			throw new Exception("There was a problem loading file: " + thePath);
		}
	}

	protected String removeSpecialChars(String text) {
		text = Utilities.removeDelimiterAndCapitalize(text, " ");
		text = Utilities.removeDelimiterAndCapitalize(text, "\\.");
		text = Utilities.removeDelimiterAndCapitalize(text, "\\-");
		text = Utilities.removeDelimiterAndCapitalize(text, "/");
		text = Utilities.removeDelimiterAndCapitalize(text, ",");
		return text;
	}

	@Override
	public void save(ObjectRepository fa) throws Exception {
		fa.put(ConvertibleProject.tags, thePath, theJavaClass.toString());
	}
}
