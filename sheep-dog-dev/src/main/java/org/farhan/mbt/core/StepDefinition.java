package org.farhan.mbt.core;

import java.util.ArrayList;
import java.util.TreeMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Interaction;

public class StepDefinition extends UMLElement {

	private Interaction umlElement;
	private ArrayList<StepParameters> stepParametersList;

	public StepDefinition(String name, StepObject parent) {
		stepParametersList = new ArrayList<StepParameters>();
		umlElement = addInteraction(parent.getUmlElement(), name, "");
		// TODO make tests for this by doing adoc(unsorted) uml adoc (sorted)
		TreeMap<String, Interaction> sorted = new TreeMap<String, Interaction>();
		EList<Behavior> behaviors = umlElement.getOwnedBehaviors();
		for (int i = behaviors.size(); i > 0; i--) {
			sorted.put(behaviors.get(i - 1).getName(), (Interaction) behaviors.get(i - 1));
			behaviors.removeLast();
		}
		for (String key : sorted.keySet()) {
			behaviors.add(sorted.get(key));
		}
	}

	public StepDefinition(Interaction umlElement, StepObject parent) {
		stepParametersList = new ArrayList<StepParameters>();
		this.umlElement = umlElement;
	}

	public void setDescription(String description) {
		umlElement.createOwnedComment().setBody(description);
	}

	public void setNameLong(String stepDefinitionNameLong) {
		createAnnotation(umlElement, "StepDefinition", "LongName", stepDefinitionNameLong);
	}

	public StepParameters addStepParameters(String name) {
		StepParameters stepParameters = new StepParameters(name, this);
		stepParametersList.add(stepParameters);
		return stepParameters;
	}

	public Interaction getUmlElement() {
		return umlElement;
	}

	public String getName() {
		return umlElement.getName();
	}

	public String getDescription(StepDefinition srcStepDefinition) {
		if (umlElement.getOwnedComments().size() > 0) {
			return umlElement.getOwnedComments().get(0).getBody();
		}
		return "";
	}

	public ArrayList<StepParameters> getStepParametersList() {
		if (stepParametersList.isEmpty()) {
			for (EAnnotation a : umlElement.getEAnnotations()) {
				if (!a.getSource().contentEquals("StepDefinition")) {
					stepParametersList.add(new StepParameters(a, this));
				}
			}
		}
		return stepParametersList;
	}
}
