package org.farhan.mbt.core;

import java.util.ArrayList;
import java.util.Map.Entry;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;

public class TestSetup extends UMLElement {

	private Interaction umlElement;
	private ArrayList<TestStep> testStepList;

	public TestSetup(String name, TestSuite parent) {
		testStepList = new ArrayList<TestStep>();
		umlElement = addInteraction((Class) parent.getUmlElement(), name, "");
		createAnnotation(umlElement, "background", "");
	}

	public TestSetup(Interaction umlElement, TestSuite parent) {
		testStepList = new ArrayList<TestStep>();
		this.umlElement = umlElement;
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
		testStepList.add(testStep);
		return testStep;
	}

	public Interaction getUmlElement() {
		return umlElement;
	}

	public String getName() {
		return umlElement.getName();
	}

	public ArrayList<String> getTags() {
		ArrayList<String> tags = new ArrayList<String>();
		if (umlElement.getEAnnotation("tags") != null) {
			for (Entry<String, String> t : umlElement.getEAnnotation("tags").getDetails()) {
				tags.add(t.getKey());
			}
		}
		return tags;
	}

	public String getDescription() {
		if (umlElement.getOwnedComments().size() > 0) {
			return umlElement.getOwnedComments().get(0).getBody();
		}
		return "";
	}

	public ArrayList<TestStep> getTestStepList() {
		if (testStepList.isEmpty()) {
			for (Message m : umlElement.getMessages()) {
				testStepList.add(new TestStep(m, this));
			}
		}
		return testStepList;
	}
}
