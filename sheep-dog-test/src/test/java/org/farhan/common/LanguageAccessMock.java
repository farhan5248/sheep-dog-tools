package org.farhan.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.farhan.helper.ILanguageAccess;

public class LanguageAccessMock implements ILanguageAccess {

	private static String stepName = "";
	private static ArrayList<String> previousSteps = new ArrayList<String>();

	public LanguageAccessMock(String stepName) {
		LanguageAccessMock.stepName = stepName;
	}

	@Override
	public ArrayList<String> getProjectComponents() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String> getComponentObjects(String component) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object addStepDefinition(Object stepObject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createStepDefinitionParameters(Object stepDefinition) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object createStepObject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getHeaderString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> getParameters(Object stepDefinition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getParametersString(Object parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getStep() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getStepDefinitionName(Object stepDefinition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> getStepDefinitions(Object stepObject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getStepName() {
		return stepName;
	}

	@Override
	public ArrayList<String> getPreviousSteps() {
		return previousSteps;
	}

	@Override
	public boolean hasParameters(Object stepDefinition) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getOutputName() {
		return "src-gen-step-defs";
	}

	@Override
	public Object getOrCreateStepObject(String objectQualifiedName) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getStepObject(String objectQualifiedName) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveObject(Object theObject, Map<Object, Object> options) throws Exception {
		// TODO Auto-generated method stub

	}

}
