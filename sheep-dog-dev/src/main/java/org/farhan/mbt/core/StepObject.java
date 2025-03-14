package org.farhan.mbt.core;

import java.util.ArrayList;
import org.eclipse.uml2.uml.Class;

public class StepObject extends UMLElement {

	private Class umlElement;
	private ArrayList<StepDefinition> stepDefinitionList;

	public StepObject(String name, TestProject parent) {
		stepDefinitionList = new ArrayList<StepDefinition>();
		umlElement = addClass(name, parent.getUmlElement());
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

}
