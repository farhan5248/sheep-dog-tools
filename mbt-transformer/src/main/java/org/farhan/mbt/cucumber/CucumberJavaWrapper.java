package org.farhan.mbt.cucumber;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.CaseUtils;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.Validator;
import org.farhan.validation.MBTVertexValidator;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier.Keyword;
import com.github.javaparser.ast.PackageDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.utils.SourceRoot;

public class CucumberJavaWrapper implements ConvertibleObject {

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

	private void addAnnotation(MethodDeclaration aMethod, String step) {
		String keyword = getKeyword(step);
		String stepName = getStepName(step, keyword);
		aMethod.addSingleMemberAnnotation("Given", "\"^" + stepName + "$\"");
	}

	private void addImports(String componentName) {
		if (theJavaClass.getImports().isEmpty()) {
			if (isStepObj()) {
				theJavaClass.addImport("java.util.HashMap");
			} else {
				theJavaClass.addImport("org.farhan.common." + componentName + "Factory");
				theJavaClass.addImport("io.cucumber.java.en.Given");
				theJavaClass.addImport("io.cucumber.datatable.DataTable");
			}
		}
	}

	private void addStatementForAttachment(String step, String arguments) {
		String objectName = Validator.getObjectName(step);
		String objectType = Validator.getObjectType(step);
		String sectionName = getSection(step);
		String componentName = getComponentName(step);
		String modality = getModality(step);
		String statementName = componentName + "Factory" + ".get(\"" + objectName + objectType + "\")." + modality
				+ "InputOutputs(" + arguments + sectionName + ");";
		BlockStmt body = getMethod(getMethodNameForStepDef(step)).getBody().get();
		body.addStatement(statementName);
		// this needs to be before transition so
		// put a copy at position 2 and delete the ref at the end
		body.getStatements().add(2, body.getStatements().getLast().get());
		body.getStatements().removeLast();
	}

	private void addStatementForComponent(BlockStmt body, String componentName, String objectName, String objectType) {
		body.addStatement(componentName + "Factory" + ".get(\"" + objectName + objectType + "\").setComponent(\""
				+ componentName + "\");");
	}

	private void addStatementForPath(BlockStmt body, String componentName, String objectName, String objectType) {
		body.addStatement(componentName + "Factory" + ".get(\"" + objectName + objectType + "\").setPath(\""
				+ objectName + "\");");
	}

	private void addStatementForState(BlockStmt body, String step, String componentName, String objectName,
			String objectType, String objectState) {
		body.addStatement(componentName + "Factory" + ".get(\"" + objectName + objectType + "\").setInputOutputs(\""
				+ objectState + "\");");
	}

	private void addStatementForTransition(BlockStmt body, String step, String componentName, String objectName,
			String objectType) {
		body.addStatement(componentName + "Factory" + ".get(\"" + objectName + objectType + "\").transition();");
	}

	public void createDataTable(String step, ArrayList<ArrayList<String>> dataTable) {
		if (isStepObj()) {
			String modality = getModality(step);
			for (String columnName : dataTable.getFirst()) {
				getMethod(modality + StringUtils.capitalize(columnName)).removeBody();
			}
		} else {
			getMethod(getMethodNameForStepDef(step)).addParameter("DataTable", "dataTable");
			addStatementForAttachment(step, "dataTable");
		}
	}

	public void createDocString(String step) {
		if (isStepObj()) {
			String modality = getModality(step);
			getMethod(modality + "Content").removeBody();
		} else {
			getMethod(getMethodNameForStepDef(step)).addParameter("String", "docString");
			addStatementForAttachment(step, "\"Content\", docString");
		}
	}

	public MethodDeclaration createStep(String step) {
		String componentName = getComponentName(step);
		String objectName = Validator.getObjectName(step);
		String objectType = Validator.getObjectType(step);
		String objectState = Validator.getObjectState(step);
		String modality = getModality(step);
		addImports(componentName);
		if (isStepObj()) {
			if (!Validator.isEdge(step) && Validator.getObjectAttachment(step).isEmpty()) {
				MethodDeclaration aMethod = getMethod(modality + objectState);
				aMethod.removeBody();
				return aMethod;
			} else {
				// data table or doc string will cover this
				return null;
			}
		} else {
			MethodDeclaration aMethod = getMethod(getMethodNameForStepDef(step));
			addAnnotation(aMethod, step);
			BlockStmt body = aMethod.getBody().get();
			if (body.isEmpty()) {
				body = aMethod.createBody();
			}
			addStatementForComponent(body, componentName, objectName, objectType);
			addStatementForPath(body, componentName, objectName, objectType);
			if (Validator.isEdge(step)) {
				addStatementForTransition(body, step, componentName, objectName, objectType);
			} else {
				if (Validator.getObjectAttachment(step).isEmpty()) {
					addStatementForState(body, step, componentName, objectName, objectType, objectState);
				}
			}
			return aMethod;
		}
	}

	@Override
	public Object get() {
		// TODO probably don't need this anymore
		return theJavaClass;
	}

	private String getComponentName(String stepName) {
		PackageDeclaration component = theJavaClass.getPackageDeclaration().get();
		return StringUtils.capitalize(component.getName().getIdentifier());
	}

	@Override
	public File getFile() {
		return theFile;
	}

	private String getKeyword(String stepName) {
		return stepName.split(" ")[0];
	}

	public MethodDeclaration getMethod(String methodName) {
		List<MethodDeclaration> methods = getType().getMethodsByName(methodName);
		if (methods.isEmpty()) {
			return getType().addMethod(methodName, Keyword.PUBLIC);
		} else {
			return methods.getFirst();
		}
	}

	private String getMethodNameForStepDef(String step) {
		String methodName = step.replaceFirst(getKeyword(step) + " ", "");
		// TODO fine a regex to remove all special characters or everthing that's not
		// a-zA-Z0-9
		methodName = methodName.replaceAll("\\.", "");
		methodName = methodName.replaceAll("\\-", "");
		methodName = methodName.replaceAll("/", "");
		methodName = methodName.replaceAll(",", "");
		methodName = CaseUtils.toCamelCase(methodName, false, ' ');
		return methodName;
	}

	private String getPackageDeclaration() {
		String packageName = theFile.getAbsolutePath()
				.replaceAll("\\" + File.separator + "[^\\" + File.separator + "]*$", "");
		packageName = packageName.replace(File.separator, ".");
		// TODO use src.test.java instead of org.farhan.
		packageName = packageName.replaceFirst("^.*org.farhan", "org.farhan");
		return packageName;
	}

	private String getSection(String stepName) {
		String section = Validator.getDetailsName(stepName) + Validator.getDetailsType(stepName);
		if (!section.isEmpty() && !section.contentEquals("nullnull")) {
			section = ", \"" + section.replace(" ", "") + "\"";
		} else {
			section = "";
		}
		return section;
	}

	private String getModality(String stepName) {
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

	private String getStepName(String stepName, String keyword) {
		return stepName.replaceFirst(keyword + " ", "");
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
	public void load() {
		if (theFile.exists() && theJavaClass.getTypes() == null) {
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

}
