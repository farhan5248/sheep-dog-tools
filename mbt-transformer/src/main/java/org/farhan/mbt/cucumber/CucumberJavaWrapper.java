package org.farhan.mbt.cucumber;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.CaseUtils;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.Validator;
import org.farhan.validation.MBTEdgeValidator;
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
	}

	private void addImports(String componentName) {
		if (theJavaClass.getImports().isEmpty()) {
			theJavaClass.addImport("org.farhan.common." + componentName + "Factory");
			theJavaClass.addImport("io.cucumber.java.en.Given");
			theJavaClass.addImport("io.cucumber.datatable.DataTable");
		}
	}

	
	
	private void addAttachmentStatement(String stepName, String arguments) {
		// TODO be consistent about capitalize and toLowerCase. Validator needs to be
		// renamed to something more appropriate. Then all methods like getSection or
		// getComponentName should be moved there
		String objectName = Validator.getObjectName(stepName);
		String objectType = Validator.getObjectType(stepName);
		String sectionName = getSection(stepName);
		String componentName = getComponentName(stepName);
		String modality = getSetAssert(stepName);
		String statementName = componentName + "Factory" + ".get(\"" + objectName + objectType + "\")." + modality
				+ "InputOutputs(" + arguments + sectionName + ");";
		BlockStmt body = getStep(stepName).getBody().get();
		body.addStatement(statementName);
		// this needs to be before transition so put a copy at position 2 and delete the
		// ref at the end
		body.getStatements().add(2, body.getStatements().getLast().get());
		body.getStatements().removeLast();
	}

	public void createDataTable(String stepName) {
		getStep(stepName).addParameter("DataTable", "dataTable");
		addAttachmentStatement(stepName, "dataTable");
	}

	public void createDocString(String stepName) {
		getStep(stepName).addParameter("String", "docString");
		addAttachmentStatement(stepName, "\"Content\", docString");
	}

	public MethodDeclaration createStep(String stepName) {
		PackageDeclaration component = theJavaClass.getPackageDeclaration().get();
		String componentName = StringUtils.capitalize(component.getName().getIdentifier());
		String objectName = Validator.getObjectName(stepName);
		String objectType = Validator.getObjectType(stepName);
		addImports(componentName);

		MethodDeclaration aMethod = getStep(stepName);
		if (aMethod == null) {
			aMethod = theJavaClass.getType(0).addMethod(getMethodName(stepName), Keyword.PUBLIC);
			if (getMethodName(stepName).startsWith("set") || getMethodName(stepName).startsWith("assert")) {
				// TODO this is not needed because it should be done in createDataTable or
				// createDocString
				ClassOrInterfaceDeclaration javaClassType = (ClassOrInterfaceDeclaration) theJavaClass.getType(0);
				javaClassType.setInterface(true);
				aMethod.removeBody();
			} else {
				String keyword = stepName.split(" ")[0];
				String annotation = stepName.replaceFirst(keyword + " ", "");
				aMethod.addSingleMemberAnnotation("Given", "\"^" + annotation + "$\"");
				BlockStmt body = aMethod.createBody();

				addAttachmentStatement(stepName, "dataTable");

				body.addStatement(componentName + "Factory" + ".get(\"" + objectName + objectType
						+ "\").setComponent(\"" + componentName + "\");");
				body.addStatement(componentName + "Factory" + ".get(\"" + objectName + objectType + "\").setPath(\""
						+ objectName + "\");");
				String attachment = MBTVertexValidator.getAttachment(stepName);
				if (attachment != null) {
					if (attachment.isEmpty()) {
						body.addStatement(componentName + "Factory" + ".get(\"" + objectName + objectType
								+ "\").setInputOutputs(\""
								+ StringUtils.capitalize(MBTVertexValidator.getStateType(stepName)) + "\");");
					}
				}
				if (MBTEdgeValidator.isEdge(stepName)) {
					body.addStatement(
							componentName + "Factory" + ".get(\"" + objectName + objectType + "\").transition();");
				}
			}
		}
		return aMethod;
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

	private String getMethodName(String stepName) {
		String keyword = stepName.split(" ")[0];
		String annotation = stepName.replaceFirst(keyword + " ", "");
		String newName = annotation;
		// TODO fine a regex to remove all special characters or everthing that's not
		// a-zA-Z0-9
		newName = newName.replaceAll("\\.", "");
		newName = newName.replaceAll("\\-", "");
		newName = newName.replaceAll("/", "");
		newName = newName.replaceAll(",", "");
		newName = CaseUtils.toCamelCase(newName, false, ' ');
		return newName;
	}

	private String getSetAssert(String stepName) {
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

	private String getPackageDeclaration() {
		String packageName = theFile.getAbsolutePath()
				.replaceAll("\\" + File.separator + "[^\\" + File.separator + "]*$", "");
		packageName = packageName.replace(File.separator, ".");
		// TODO use src.test.java instead of org.farhan.
		packageName = packageName.replaceFirst("^.*org.farhan", "org.farhan");
		return packageName;
	}

	private String getSection(String stepName) {
		String detailsName = MBTVertexValidator.getDetailsName(stepName);
		String detailsType = StringUtils.capitalize(MBTVertexValidator.getDetailsType(stepName));
		String section = detailsName + detailsType;
		if (!section.isEmpty() && !section.contentEquals("nullnull")) {
			section = ", \"" + section.replace(" ", "") + "\"";
		} else {
			section = "";
		}
		return section;
	}

	public MethodDeclaration getStep(String stepName) {
		List<MethodDeclaration> methods = theJavaClass.getType(0).getMethodsByName(getMethodName(stepName));
		if (methods.isEmpty()) {
			return null;
		} else {
			return methods.getFirst();
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
