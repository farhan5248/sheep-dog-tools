package org.farhan.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.farhan.helper.ILanguageAccess;

public class EclipseMock implements ILanguageAccess {

	private String validationMessage;
	private String stepName;
	private ArrayList<String> stepParameters;
	private ArrayList<String> previousSteps;
	private HashMap<String, ArrayList<ArrayList<String>>> stepObject;
	private TreeMap<String, String> proposalMap;
	private ArrayList<String> components;
	private ArrayList<String> componentObjects;

	public EclipseMock() {
		stepName = "";
		components = new ArrayList<String>();
		componentObjects = new ArrayList<String>();
		stepParameters = new ArrayList<String>();
		previousSteps = new ArrayList<String>();
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

	@Override
	public Object createStepDefinition(Object stepObject, String predicate) {
		createStepDefinition(predicate);
		return predicate;
	}

	public Object createStepDefinition(String stepDefinitionName) {
		if (this.stepObject.get(stepDefinitionName) == null) {
			this.stepObject.put(stepDefinitionName, new ArrayList<ArrayList<String>>());
		}
		return this.stepObject.get(stepDefinitionName);
	}

	@Override
	public void createStepDefinitionParameters(Object stepDefinitionName) {
		this.stepObject.get(stepDefinitionName).add(stepParameters);
	}

	@Override
	public Object createStepObject(String objectQualifiedName) throws Exception {
		if (stepObject == null) {
			stepObject = new HashMap<String, ArrayList<ArrayList<String>>>();
		}
		return stepObject;
	}

	@Override
	public ArrayList<String> getComponentObjects(String component) {
		return componentObjects;
	}

	@Override
	public ArrayList<String> getPreviousSteps() {
		return previousSteps;
	}

	@Override
	public ArrayList<String> getProjectComponents() {
		return components;
	}

	@Override
	public Object getStep() {
		return stepName;
	}

	@Override
	public String getStepDefinitionName(Object stepDefinition) {
		return (String) stepDefinition;
	}

	@Override
	public List<?> getStepDefinitionParameters(Object stepDefinition) {
		return this.stepObject.get(stepDefinition.toString());
	}

	@Override
	public String getStepDefinitionParametersString(Object parameters) {
		return cellsToString((ArrayList<String>) parameters);
	}

	@Override
	public List<?> getStepDefinitions(Object stepObject) {
		ArrayList<String> stepDefinitionNames = new ArrayList<String>();
		for (String name : this.stepObject.keySet()) {
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

	@Override
	public String getStepParametersString() {
		return cellsToString(stepParameters);
	}

	public String getValidationMessage() {
		return this.validationMessage;
	}

	@Override
	public boolean hasParameters(Object stepDefinition) {
		return !this.stepObject.get(stepDefinition).isEmpty();
	}

	@Override
	public void saveObject(Object theObject, Map<Object, Object> options) throws Exception {
	}

	public void setStepName(String stepName) {
		if (this.stepName.isEmpty()) {
			this.stepName = stepName;
		} else {
			previousSteps.add(this.stepName);
			// TODO convert each step into a definition
			this.stepName = stepName;
		}
	}

	public void setStepParameters(String header) {
		this.stepParameters.add(header);
	}

	public void setValidationMessage(String message) {
		this.validationMessage = message;
	}

	public void setProposalList(TreeMap<String, String> proposalList) {
		this.proposalMap = proposalList;
	}

	public TreeMap<String, String> getProposals() {
		return proposalMap;
	}

}
