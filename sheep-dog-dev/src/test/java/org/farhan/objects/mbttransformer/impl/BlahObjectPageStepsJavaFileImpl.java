package org.farhan.objects.mbttransformer.impl;

import java.util.HashMap;

import org.farhan.common.JavaFileObject;
import org.farhan.objects.mbttransformer.BlahHomePageStepsJavaFile;
import org.farhan.objects.mbttransformer.BlahLoginPageStepsJavaFile;
import org.farhan.objects.mbttransformer.BlahLogoutPageStepsJavaFile;
import org.farhan.objects.mbttransformer.BlahObjectPageStepsJavaFile;

import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class BlahObjectPageStepsJavaFileImpl extends JavaFileObject implements BlahObjectPageStepsJavaFile,
		BlahHomePageStepsJavaFile, BlahLoginPageStepsJavaFile, BlahLogoutPageStepsJavaFile {

	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}

	@Override
	public void assertFieldsSectionAnnotation(HashMap<String, String> keyMap) {
		assertMethodAnnotationExists(keyMap.get("Method Name"), keyMap.get("Annotation"));
	}

	@Override
	public void assertFieldsSectionMethodName(HashMap<String, String> keyMap) {
		assertMethodExists(keyMap.get("Method Name"));
	}

	@Override
	public void assertFieldsSectionParameterName(HashMap<String, String> keyMap) {
		assertMethodParameterExists(keyMap.get("Method Name"), keyMap.get("Parameter Name"));
	}

	@Override
	public void assertFieldsSectionParameterType(HashMap<String, String> keyMap) {
		assertMethodParameterType(keyMap.get("Method Name"), keyMap.get("Parameter Name"),
				keyMap.get("Parameter Type"));
	}

	@Override
	public void assertFieldsSectionReturnType(HashMap<String, String> keyMap) {
		assertMethodReturnType(keyMap.get("Method Name"), keyMap.get("Return Type"));
	}

	@Override
	public void assertFieldsSectionStatement(HashMap<String, String> keyMap) {
		assertMethodStatementExists(keyMap.get("Method Name"), keyMap.get("Statement"));
	}

	@Override
	public void assertFieldsSectionVisibility(HashMap<String, String> keyMap) {
		assertMethodAccessSpecifier(keyMap.get("Method Name"), keyMap.get("Visibility"));
	}

	@Override
	public void assertObjectSectionImport(HashMap<String, String> keyMap) {
		assertImportExists(keyMap.get("Import"));
	}

	@Override
	public void assertObjectSectionInterfaceName(HashMap<String, String> keyMap) {
		assertInterfaceNameIs(keyMap.get("Interface Name"));
	}

	@Override
	public void assertObjectSectionPackage(HashMap<String, String> keyMap) {
		assertPackage(keyMap.get("Package"));
	}

	@Override
	public void assertPresent(HashMap<String, String> keyMap) {
		assertObjectExists();
	}

	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}

	@Override
	public void assertObjectSectionClassName(HashMap<String, String> keyMap) {
		assertClassNameIs(keyMap.get("Class Name"));
	}

	@Override
	public void assertObjectSectionExtends(HashMap<String, String> keyMap) {
		assertExtendsIs(keyMap.get("Extends"));
	}

	@Override
	public void assertObjectSectionConstructorName(HashMap<String, String> keyMap) {
		assertConstructorExists(keyMap.get("Constructor Name"));
	}

	@Override
	public void assertObjectSectionStatement(HashMap<String, String> keyMap) {
		assertConstructorStatementExists(keyMap.get("Constructor Name"), keyMap.get("Statement"));
	}

	@Override
	public void assertObjectSectionClassAnnotation(HashMap<String, String> keyMap) {
		assertClassAnnotationExists(keyMap.get("Class Annotation"));
	}

	@Override
	public void assertObjectSectionConstructorAnnotation(HashMap<String, String> keyMap) {
		assertConstructorAnnotationExists(keyMap.get("Constructor Name"), keyMap.get("Constructor Annotation"));
	}

}
