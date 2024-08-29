package org.farhan.mbt.cucumber;

import java.io.File;
import java.util.ArrayList;

import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.Utilities;
import org.farhan.helper.StepHelper;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier.Keyword;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.utils.SourceRoot;

public class CucumberJavaWrapper implements ConvertibleObject {

	private static String lastComponent = "InitialComponent";
	private File theFile;
	private CompilationUnit theJavaClass;

	public CucumberJavaWrapper(File theFile) {
		this.theFile = theFile;
		theJavaClass = new CompilationUnit();
		theJavaClass.setStorage(theFile.toPath());
		ClassOrInterfaceDeclaration javaClassType = new ClassOrInterfaceDeclaration();
		javaClassType.setName(theFile.getName().replace(".java", ""));
		javaClassType.setPublic(true);
		theJavaClass.addType(javaClassType);
		theJavaClass.setPackageDeclaration(getPackageDeclaration());
		if (isStepObj()) {
			getType().setInterface(true);
		}
	}

	private void addParameter(MethodDeclaration aMethod, String type, String name) {
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

	private void createDocStringForStepDef(String step) throws Exception {
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

	private void createDocStringForStepObj(String step) throws Exception {
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

	private MethodDeclaration createStepForStepDef(String step) throws Exception {
		if (theJavaClass.getImports().isEmpty()) {
			theJavaClass.addImport("org.farhan.common." + getFactoryName(step));
			theJavaClass.addImport("io.cucumber.java.en.Given");
			theJavaClass.addImport("io.cucumber.datatable.DataTable");
		}
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

	private MethodDeclaration createStepForStepObj(String step) throws Exception {
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

	private void createStepTableForStepDef(String step) throws Exception {
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

	private void createStepTableForStepObj(String step, ArrayList<ArrayList<String>> stepTableRowList)
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

	private String getCallForComponent(String step) {
		String name = StepHelper.getComponentName(step);
		if (name.isEmpty()) {
			name = lastComponent;
		} else {
			lastComponent = name;
		}
		return ".setComponent(\"" + name + "\")";
	}

	private String getCallForFactory(String step) {
		String factoryName = getFactoryName(step);
		String interfaceName = getInterfaceName(step);
		return factoryName + ".get(\"" + interfaceName + "\")";
	}

	private String getCallForInputOutputsForDataTable(String step) throws Exception {
		return "." + getSetOrAssert(step) + "InputOutputs(" + "dataTable" + getSectionArg(step) + ")";
	}

	private String getCallForInputOutputsForDocString(String step) throws Exception {
		return "." + getSetOrAssert(step) + "InputOutputs(" + "\"Content\", docString" + getSectionArg(step) + ")";
	}

	private String getCallForInputOutputsForState(String step) throws Exception {

		return "." + getSetOrAssert(step) + "InputOutputs(\"" + Utilities.upperFirst(StepHelper.getStateType(step))
				+ "\"" + getSectionArg(step) + ")";
	}

	private String getCallForPath(String step) {
		return ".setPath(\"" + StepHelper.getObjectName(step) + "\")";
	}

	private String getCallForTransition() {
		return ".transition()";
	}

	private String getFactoryName(String step) {
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
	public File getFile() {
		return theFile;
	}

	private String getInterfaceName(String step) {
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

	private String getMethodNameForStepDef(String step) {
		String name = step.substring(step.split(" ")[0].length());
		name = removeSpecialChars(name);
		name = name.replace("'", "");
		name = Utilities.lowerFirst(name);
		return name;
	}

	private String getMethodNameForStepObj(String step) throws Exception {
		return getSetOrAssert(step) + getSection(step)
				+ Utilities.removeDelimiterAndCapitalize(StepHelper.getStateType(step), " ");
	}

	private String getPackageDeclaration() {
		String packageName = theFile.getAbsolutePath()
				.replaceAll("\\" + File.separator + "[^\\" + File.separator + "]*$", "");
		packageName = packageName.replace(File.separator, ".");
		packageName = packageName.replaceFirst("^.*org.farhan", "org.farhan");
		return packageName;
	}

	private String getSection(String step) {
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

	private String getSectionArg(String step) {
		if (!getSection(step).isEmpty()) {
			return ", \"" + getSection(step) + "\"";
		} else {
			return "";
		}
	}

	private String getSetOrAssert(String stepName) throws Exception {
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

	private ClassOrInterfaceDeclaration getType() {
		return (ClassOrInterfaceDeclaration) theJavaClass.getType(0);
	}

	private boolean isStepObj() {
		if (getType().getName().asString().endsWith("Steps")) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public void load() throws Exception {
		try {
			if (theFile.exists() && getType().getMethods().isEmpty()) {
				SourceRoot javaSrcDir = new SourceRoot(theFile.getParentFile().toPath());
				theJavaClass = javaSrcDir.parse("", theFile.getName());
			}
		} catch (Exception e) {
			throw new Exception("There was a problem loading file: " + theFile.getAbsolutePath());
		}
	}

	private String removeSpecialChars(String text) {
		text = Utilities.removeDelimiterAndCapitalize(text, " ");
		text = Utilities.removeDelimiterAndCapitalize(text, "\\.");
		text = Utilities.removeDelimiterAndCapitalize(text, "\\-");
		text = Utilities.removeDelimiterAndCapitalize(text, "/");
		text = Utilities.removeDelimiterAndCapitalize(text, ",");
		return text;
	}

	@Override
	public void save() {
		File parentDir = theFile.getParentFile();
		parentDir.mkdirs();
		SourceRoot javaSrcDir = new SourceRoot(parentDir.toPath());
		javaSrcDir.add(theJavaClass);
		javaSrcDir.saveAll();
	}

	@Override
	public void setFile(File theFile) {
		this.theFile = theFile;
	}
}
