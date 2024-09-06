package org.farhan.helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface ILanguageAccess {

	public ArrayList<String> getProjectComponents() throws Exception;

	public ArrayList<String> getComponentObjects(String component) throws Exception;

	public Object addStepDefinition(Object stepObject);

	public void createStepDefinitionParameters(Object stepDefinition);

	public Object createStepObject();

	public String getHeaderString();

	public List<?> getParameters(Object stepDefinition);

	public String getParametersString(Object parameters);

	public Object getStep();

	public String getStepDefinitionName(Object stepDefinition);

	public List<?> getStepDefinitions(Object stepObject);

	public String getStepName();

	public ArrayList<String> getPreviousSteps();

	public boolean hasParameters(Object stepDefinition);

	public String getOutputName();

	public Object getOrCreateStepObject(String objectQualifiedName) throws Exception;

	public Object getStepObject(String objectQualifiedName) throws Exception;

	public void saveObject(Object thObject, Map<Object, Object> options) throws Exception;

}
