package org.farhan.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.farhan.helper.ILanguageAccess;

public class LanguageAccessMock implements ILanguageAccess {

	private static String objectQualifiedName;
	private static String stepDefinitionName;
	private static String stepName = "";
	private static ArrayList<String> stepHeaders = new ArrayList<String>();
	private static ArrayList<String> previousSteps = new ArrayList<String>();
	private static HashMap<String, ArrayList<ArrayList<String>>> stepObject = null;

	public LanguageAccessMock(String stepName) {
		LanguageAccessMock.stepName = stepName;
	}

	public LanguageAccessMock() {
	}

	@Override
	public Object addStepDefinition(Object stepObject) {
		// TODO rename to createStepDefinition
		createStepDefinition(stepName);
		LanguageAccessMock.stepDefinitionName = stepName;
		return stepDefinitionName;
	}

	private String cellsToString(List<String> cells) {
		String cellsAsString = "";
		List<String> sortedCells = new ArrayList<String>();
		for (String cell : cells) {
			sortedCells.add(cell);
		}
		Collections.sort(sortedCells);
		for (String cell : sortedCells) {
			cellsAsString += cell;
		}
		return cellsAsString;
	}

	public Object createStepDefinition(String stepDefinitionName) {
		if (LanguageAccessMock.stepObject.get(stepDefinitionName) == null) {
			LanguageAccessMock.stepObject.put(stepDefinitionName, new ArrayList<ArrayList<String>>());
		}
		return LanguageAccessMock.stepObject.get(stepDefinitionName);
	}

	@Override
	public void createStepDefinitionParameters(Object stepDefinitionName) {
		LanguageAccessMock.stepObject.get(stepDefinitionName).add(stepHeaders);
	}

	@Override
	public ArrayList<String> getComponentObjects(String component) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getHeaderString() {
		return cellsToString(stepHeaders);
	}

	@Override
	public Object getOrCreateStepObject(String objectQualifiedName) throws Exception {
		LanguageAccessMock.objectQualifiedName = objectQualifiedName;
		if (stepObject == null) {
			stepObject = new HashMap<String, ArrayList<ArrayList<String>>>();
		}
		return stepObject;
	}

	@Override
	public String getOutputName() {
		return "src-gen-step-defs";
	}

	@Override
	public List<?> getParameters(Object stepDefinition) {
		return LanguageAccessMock.stepObject.get(stepDefinition.toString());
	}

	@Override
	public String getParametersString(Object parameters) {
		return cellsToString((ArrayList<String>) parameters);
	}

	@Override
	public ArrayList<String> getPreviousSteps() {
		return previousSteps;
	}

	@Override
	public ArrayList<String> getProjectComponents() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getStep() {
		return stepName;
	}

	public String getStepDefinitionName() {
		return LanguageAccessMock.stepDefinitionName;
	}

	@Override
	public String getStepDefinitionName(Object stepDefinition) {
		return (String) stepDefinition;
	}

	@Override
	public List<?> getStepDefinitions(Object stepObject) {
		ArrayList<String> stepDefinitionNames = new ArrayList<String>();
		for (String name : LanguageAccessMock.stepObject.keySet()) {
			stepDefinitionNames.add(name);
		}
		return stepDefinitionNames;
	}

	@Override
	public String getStepName() {
		return stepName;
	}

	@Override
	public Object getStepObject(String objectQualifiedName) throws Exception {
		return stepObject;
	}

	public String getStepObjectName() {
		return LanguageAccessMock.objectQualifiedName;
	}

	@Override
	public boolean hasParameters(Object stepDefinition) {
		return !LanguageAccessMock.stepObject.get(stepName).isEmpty();
	}

	@Override
	public void saveObject(Object theObject, Map<Object, Object> options) throws Exception {
	}

	public void setStepHeaders(String header) {
		LanguageAccessMock.stepHeaders.add(header);
	}

	public void setStepName(String stepName) {
		LanguageAccessMock.stepName = stepName;
	}

}
