package org.farhan.mbt.core;

import java.util.ArrayList;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;

public class TestSetup extends UMLElement {

	private Interaction umlElement;
	private ArrayList<TestStep> testSteps;

	public TestSetup(String name, TestSuite parent) {
		testSteps = new ArrayList<TestStep>();
		umlElement = addInteraction((Class) parent.getUmlElement(), name, "");
		createAnnotation(umlElement, "background", "");
	}

	public void setDescription(String backgroundDescription) {
		umlElement.createOwnedComment().setBody(backgroundDescription);
	}

	public void setTags(ArrayList<String> tags) {
		if (!tags.isEmpty()) {
			for (String t : tags) {
				createAnnotation(umlElement, "tags", t);
			}
		}
	}

	public TestStep addTestStep(String name) {
		TestStep testStep = new TestStep(name, this);
		testSteps.add(testStep);
		return testStep;
	}

	public Interaction getUmlElement() {
		return umlElement;
	}
}
