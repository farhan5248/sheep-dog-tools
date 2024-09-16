package org.farhan.helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface ILanguageAccess {

	public Object createStepDefinition(Object stepObject, String predicate);

	public void createStepDefinitionParameters(Object stepDefinition);

	public Object createStepObject(String objectQualifiedName) throws Exception;

	public ArrayList<String> getAllSteps();

	public ArrayList<String> getBackgroundSteps();

	public ArrayList<String> getComponentObjects(String component) throws Exception;

	public ArrayList<String> getPreviousSteps();

	public ArrayList<String> getProjectComponents() throws Exception;

	public Object getStep();

	public String getStepDefinitionDescription(Object stepDefinition);

	public String getStepDefinitionName(Object stepDefinition);

	public List<?> getStepDefinitionParameters(Object stepDefinition);

	public String getStepDefinitionParametersString(Object parameters);

	public List<?> getStepDefinitions(Object stepObject);

	public String getStepName();

	public Object getStepObject(String objectQualifiedName) throws Exception;

	public String getStepParametersString();

	public boolean hasParameters(Object stepDefinition);

	public void saveObject(Object thObject, Map<Object, Object> options) throws Exception;

}
