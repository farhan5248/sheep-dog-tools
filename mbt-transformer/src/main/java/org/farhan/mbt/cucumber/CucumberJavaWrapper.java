package org.farhan.mbt.cucumber;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.StepWrapper;
import org.farhan.mbt.core.Utilities;
import org.farhan.validation.MBTVertexValidator;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier.Keyword;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.utils.SourceRoot;

public class CucumberJavaWrapper implements ConvertibleObject {

	private File theFile;
	private CompilationUnit theJavaClass;
	private static String lastComponent = "InitialComponent";

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

	public void createDataTable(String step, ArrayList<ArrayList<String>> dataTable) {
		if (isStepObj()) {
			createDataTableForStepObj(step, dataTable);
		} else {
			createDataTableForStepDef(step);
		}
	}

	public void createDocString(String step) {
		if (isStepObj()) {
			createDocStringForStepObj(step);
		} else {
			createDocStringForStepDef(step);
		}
	}

	public MethodDeclaration createStep(String step) {
		if (isStepObj()) {
			return createStepForStepObj(step);
		} else {
			return createStepForStepDef(step);
		}
	}

	@Override
	public Object get() {
		return theJavaClass;
	}

	@Override
	public File getFile() {
		return theFile;
	}

	public MethodDeclaration getMethod(String methodName) {
		List<MethodDeclaration> methods = getType().getMethodsByName(methodName);
		if (methods.isEmpty()) {
			return getType().addMethod(methodName, Keyword.PUBLIC);
		} else {
			return methods.getFirst();
		}
	}

	@Override
	public void load() {
		if (theFile.exists() && getType().getMethods().isEmpty()) {
			SourceRoot javaSrcDir = new SourceRoot(theFile.getParentFile().toPath());
			theJavaClass = javaSrcDir.parse("", theFile.getName());
		}
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

	private void addParameter(MethodDeclaration aMethod, String type, String name) {
		if (aMethod.getParameters().isEmpty()) {
			aMethod.addParameter(type, name);
		}
	}

	private void createDataTableForStepDef(String step) {
		MethodDeclaration aMethod = getMethod(getMethodNameForStepDef(step));
		addParameter(aMethod, "DataTable", "dataTable");
		BlockStmt body = aMethod.getBody().get();
		if (StepWrapper.isEdge(step) && body.getStatements().size() == 4
				|| !StepWrapper.isEdge(step) && body.getStatements().size() == 3) {
			return;
		} else {
			body.addStatement(getCallForFactory(step) + getCallForInputOutputsForDataTable(step) + ";");
			body.getStatements().add(2, body.getStatements().getLast().get());
			body.getStatements().removeLast();
		}
	}

	private void createDataTableForStepObj(String step, ArrayList<ArrayList<String>> dataTable) {
		String setOrAssert = getSetOrAssert(step);
		String sectionName = getSection(step);
		for (String columnName : dataTable.getFirst()) {
			MethodDeclaration aMethod = getMethod(
					setOrAssert + sectionName + Utilities.upperFirst(removeSpecialChars(columnName)));
			aMethod.removeBody();
			addParameter(aMethod, "HashMap<String, String>", "keyMap");
		}
	}

	private void createDocStringForStepDef(String step) {
		MethodDeclaration aMethod = getMethod(getMethodNameForStepDef(step));
		addParameter(aMethod, "String", "docString");
		BlockStmt body = aMethod.getBody().get();
		if (StepWrapper.isEdge(step) && body.getStatements().size() == 4
				|| !StepWrapper.isEdge(step) && body.getStatements().size() == 3) {
			return;
		} else {
			body.addStatement(getCallForFactory(step) + getCallForInputOutputsForDocString(step) + ";");
			body.getStatements().add(2, body.getStatements().getLast().get());
			body.getStatements().removeLast();
		}
	}

	private void createDocStringForStepObj(String step) {
		MethodDeclaration aMethod = getMethod(getSetOrAssert(step) + getSection(step) + "Content");
		aMethod.removeBody();
		addParameter(aMethod, "HashMap<String, String>", "keyMap");

	}

	private MethodDeclaration createStepForStepDef(String step) {
		if (theJavaClass.getImports().isEmpty()) {
			theJavaClass.addImport("org.farhan.common." + getFactoryName(step));
			theJavaClass.addImport("io.cucumber.java.en.Given");
			theJavaClass.addImport("io.cucumber.datatable.DataTable");
		}
		MethodDeclaration aMethod = getMethod(getMethodNameForStepDef(step));
		{
			String keyword = step.split(" ")[0];
			String stepName = step.substring(keyword.length());
			if (aMethod.getAnnotations().isEmpty()) {
				aMethod.addSingleMemberAnnotation("Given", "\"^" + stepName + "$\"");
			}
		}
		BlockStmt body = aMethod.getBody().get();
		if (body.isEmpty()) {
			body = aMethod.createBody();
			body.addStatement(getCallForFactory(step) + getCallForComponent(step) + ";");
			body.addStatement(getCallForFactory(step) + getCallForPath(step) + ";");
			if (StepWrapper.isEdge(step)) {
				body.addStatement(getCallForFactory(step) + getCallForTransition() + ";");
			} else {
				if (StepWrapper.getObjectAttachment(step).isEmpty()) {
					body.addStatement(getCallForFactory(step) + getCallForInputOutputsForState(step) + ";");
				}
			}
		}
		return aMethod;
	}

	private MethodDeclaration createStepForStepObj(String step) {
		if (theJavaClass.getImports().isEmpty()) {
			theJavaClass.addImport("java.util.HashMap");
		}
		if (!StepWrapper.isEdge(step) && StepWrapper.getObjectAttachment(step).isEmpty()) {
			MethodDeclaration aMethod = getMethod(getMethodNameForStepObj(step));
			aMethod.removeBody();
			addParameter(aMethod, "HashMap<String, String>", "keyMap");
			return aMethod;

		} else if (StepWrapper.isEdge(step)) {
			return getMethod("transition").removeBody();
		} else {
			// data table or doc string will cover this
			return null;
		}
	}

	private String getCallForComponent(String step) {
		String name = StepWrapper.getComponentName(step);
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

	private String getCallForInputOutputsForDataTable(String step) {
		return "." + getSetOrAssert(step) + "InputOutputs(" + "dataTable" + getSectionArg(step) + ")";
	}

	private String getCallForInputOutputsForDocString(String step) {
		return "." + getSetOrAssert(step) + "InputOutputs(" + "\"Content\", docString" + getSectionArg(step) + ")";
	}

	private String getCallForInputOutputsForState(String step) {

		return "." + getSetOrAssert(step) + "InputOutputs(\"" + Utilities.upperFirst(StepWrapper.getObjectState(step))
				+ "\"" + getSectionArg(step) + ")";
	}

	private String getCallForPath(String step) {
		return ".setPath(\"" + StepWrapper.getObjectName(step) + "\")";
	}

	private String getCallForTransition() {
		return ".transition()";
	}

	private String getFactoryName(String step) {
		String name = StepWrapper.getComponentName(step);
		if (name.isEmpty()) {
			name = lastComponent;
		} else {
			lastComponent = name;
		}
		name = removeSpecialChars(name);
		return Utilities.upperFirst(name) + "Factory";
	}

	private String getInterfaceName(String step) {
		String name = StepWrapper.getObjectName(step);
		String nameParts[] = name.split("/");
		name = nameParts[nameParts.length - 1];
		name = removeSpecialChars(name);
		name = name + Utilities.upperFirst(StepWrapper.getObjectType(step));
		return name;
	}

	private String getMethodNameForStepDef(String step) {
		String name = step.substring(step.split(" ")[0].length());
		name = removeSpecialChars(name);
		name = name.replace("'", "");
		name = Utilities.lowerFirst(name);
		return name;
	}

	private String getMethodNameForStepObj(String step) {
		return getSetOrAssert(step) + getSection(step) + Utilities.upperFirst(StepWrapper.getObjectState(step));
	}

	private String getPackageDeclaration() {
		String packageName = theFile.getAbsolutePath()
				.replaceAll("\\" + File.separator + "[^\\" + File.separator + "]*$", "");
		packageName = packageName.replace(File.separator, ".");
		// TODO use src.test.java instead of org.farhan.
		packageName = packageName.replaceFirst("^.*org.farhan", "org.farhan");
		return packageName;
	}

	private String getSection(String step) {
		String sectionName = StepWrapper.getDetailsName(step);
		String sectionType = StepWrapper.getDetailsType(step);
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

	private String getSetOrAssert(String stepName) {
		String text = MBTVertexValidator.getStateModality(stepName);
		String modality = "";
		if (text == null) {
			modality = "set";
		} else {
			if (text.endsWith("be")) {
				modality = "assert";
			} else if (text.startsWith("is")) {
				modality = "set";
			} else {
				// TODO throw an exception but generally the text should be valid by this point
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

	private String removeSpecialChars(String text) {
		text = Utilities.removeDelimiterAndCapitalize(text, " ");
		text = Utilities.removeDelimiterAndCapitalize(text, "\\.");
		text = Utilities.removeDelimiterAndCapitalize(text, "\\-");
		text = Utilities.removeDelimiterAndCapitalize(text, "/");
		text = Utilities.removeDelimiterAndCapitalize(text, ",");
		return text;
	}

}
