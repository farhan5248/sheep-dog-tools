package org.farhan.mbt.core;

import java.util.ArrayList;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;

public class StepObject extends UMLElement {

	private Class umlElement;
	private ArrayList<StepDefinition> stepDefinitionList;

	public StepObject(String name, TestProject parent) {
		stepDefinitionList = new ArrayList<StepDefinition>();
		umlElement = addClass(name, parent.getUmlElement());
	}

	public StepObject(Class umlElement, TestProject parent) {
		stepDefinitionList = new ArrayList<StepDefinition>();
		this.umlElement = umlElement;
	}

	public void setDescription(String description) {
		umlElement.createOwnedComment().setBody(description);
	}

	public StepDefinition addStepDefinition(String name) {
		StepDefinition stepDefinition = new StepDefinition(name, this);
		stepDefinitionList.add(stepDefinition);
		return stepDefinition;
	}

	public Class getUmlElement() {
		return umlElement;
	}

	public String getName() {
		return umlElement.getName();
	}

	public String getDescription() {
		if (umlElement.getOwnedComments().size() > 0) {
			return umlElement.getOwnedComments().get(0).getBody();
		}
		return "";
	}

	public ArrayList<StepDefinition> getStepDefinitionList() {
		if (stepDefinitionList.isEmpty()) {
			for (Behavior b : umlElement.getOwnedBehaviors()) {
				stepDefinitionList.add(new StepDefinition((Interaction) b, this));
			}
		}
		return stepDefinitionList;
	}

	public String getNameLong() {
		return umlElement.getEAnnotation("StepDefinition").getDetails().get("LongName");
	}

}
