package org.farhan.helper;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public interface ILanguageAccess {

	public ArrayList<String> getProjectComponents() throws Exception;

	public ArrayList<String> getComponentObjects(String component) throws Exception;

	public EObject addStepDefinition(EObject stepObject);

	public void createStepDefinitionParameters(EObject stepDefinition);

	public EObject createStepObject();

	public String getHeaderString();

	public EList<?> getParameters(EObject stepDefinition);

	public String getParametersString(EObject parameters);

	public EObject getStep();

	public String getStepDefinitionName(EObject stepDefinition);

	public EList<?> getStepDefinitions(EObject stepObject);

	public String getStepName();

	public Resource getStepResource();

	public ArrayList<String> getPreviousSteps();

	public boolean hasParameters(EObject stepDefinition);

	public String getProjectName(Resource stepResource);

	public String getOutputName();

}
