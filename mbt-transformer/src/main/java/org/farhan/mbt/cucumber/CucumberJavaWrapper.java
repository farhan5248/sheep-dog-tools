package org.farhan.mbt.cucumber;

import java.io.File;
import java.util.List;

import org.apache.commons.text.CaseUtils;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.Utilities;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier.Keyword;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
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

	public MethodDeclaration createStep(String stepName) {
		String keyword = stepName.split(" ")[0];
		String annotation = stepName.replaceFirst(keyword + " ", "");
		String name = getMethodName(annotation);

		// TODO initialise the class if this is the first step being added
		// TODO add the imports
		if (name.startsWith("set") || name.startsWith("assert")) {
			ClassOrInterfaceDeclaration javaClassType = (ClassOrInterfaceDeclaration) theJavaClass.getType(0);
			javaClassType.setInterface(true);
		} else {

		}
		List<MethodDeclaration> methods = theJavaClass.getType(0).getMethodsByName(name);
		if (methods.isEmpty()) {
			MethodDeclaration aMethod = theJavaClass.getType(0).addMethod(name, Keyword.PUBLIC);
			if (name.startsWith("set") || name.startsWith("assert")) {
				aMethod.removeBody();
			} else {
				aMethod.addSingleMemberAnnotation("Given", "\"^" + annotation + "$\"");
			}
			return aMethod;
		} else {
			return methods.getFirst();
		}
	}

	@Override
	public Object get() {
		// TODO probably don't need this anymore
		return theJavaClass;
	}

	@Override
	public File getFile() {
		return theFile;
	}

	private String getMethodName(String name) {
		String newName = name;
		newName = newName.replaceAll("\\.", "");
		newName = newName.replaceAll("\\-", "");
		newName = newName.replaceAll("/", "");
		newName = newName.replaceAll(",", "");
		newName = CaseUtils.toCamelCase(newName, false, ' ');
		return newName;
	}

	private String getPackageDeclaration() {
		String packageName = theFile.getAbsolutePath()
				.replaceAll("\\" + File.separator + "[^\\" + File.separator + "]*$", "");
		packageName = packageName.replace(File.separator, ".");
		packageName = packageName.replaceFirst("^.*org.farhan", "org.farhan");
		return packageName;
	}

	@Override
	public void load() {
		if (theFile.exists() && theJavaClass.getTypes() != null) {
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
