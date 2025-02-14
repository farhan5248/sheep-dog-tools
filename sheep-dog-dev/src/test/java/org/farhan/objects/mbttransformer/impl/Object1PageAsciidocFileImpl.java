package org.farhan.objects.mbttransformer.impl;

import java.util.HashMap;

import org.farhan.common.AdocFileObject;
import org.farhan.objects.mbttransformer.Object1PageAsciidocFile;
import org.farhan.objects.mbttransformer.ObjectPageAsciidocFile;

import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class Object1PageAsciidocFileImpl extends AdocFileObject
		implements Object1PageAsciidocFile, ObjectPageAsciidocFile {

	@Override
	public void assertObjectSectionName(HashMap<String, String> keyMap) {
		assertStepObjectName(keyMap.get("Name"));
	}

	@Override
	public void assertObjectSectionStatements(HashMap<String, String> keyMap) {
		assertStepObjectStatements(keyMap.get("Name"), keyMap.get("Statements"));
	}

	@Override
	public void assertPresent(HashMap<String, String> keyMap) {
		assertObjectExists();
	}

	@Override
	public void assertStepDefinitionParametersTableSectionName(HashMap<String, String> keyMap) {
		assertStepDefinitionExists(keyMap.get("Name"));
	}

	@Override
	public void assertStepDefinitionParametersTableSectionParameters(HashMap<String, String> keyMap) {
		assertStepDefinitionParametersExists(keyMap.get("Name"), keyMap.get("Parameters"));
	}

	@Override
	public void assertStepDefinitionParametersTableSectionRow(HashMap<String, String> keyMap) {
		assertStepDefinitionParametersTableRowExists(keyMap.get("Name"), keyMap.get("Parameters"), keyMap.get("Row"));
	}

	@Override
	public void assertStepDefinitionSectionDescription(HashMap<String, String> keyMap) {
		assertStepDefinitionDescription(keyMap.get("Name"), keyMap.get("Description"));
	}

	@Override
	public void assertStepDefinitionSectionName(HashMap<String, String> keyMap) {
		assertStepDefinitionExists(keyMap.get("Name"));
	}

	@Override
	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}

}
