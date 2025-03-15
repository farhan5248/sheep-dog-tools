package org.farhan.mbt.core;

import java.util.ArrayList;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;

public class TestCase extends UMLElement {

	private Interaction umlElement;
	private ArrayList<TestStep> testStepList;
	private ArrayList<TestData> testDataList;

	public TestCase(String name, TestSuite parent) {
		testStepList = new ArrayList<TestStep>();
		testDataList = new ArrayList<TestData>();
		umlElement = addInteraction((Class) parent.getUmlElement(), name, "");
	}

	public TestCase(Interaction umlElement) {
		testStepList = new ArrayList<TestStep>();
		testDataList = new ArrayList<TestData>();
		this.umlElement = umlElement;
	}

	public void setTags(ArrayList<String> tags) {
		if (!tags.isEmpty()) {
			for (String t : tags) {
				createAnnotation(umlElement, "tags", t);
			}
		}
	}

	public void setDescription(String scenarioDescription) {
		umlElement.createOwnedComment().setBody(scenarioDescription);
	}

	public TestStep addTestStep(String name) {
		TestStep testStep = new TestStep(name, this);
		testStepList.add(testStep);
		return testStep;
	}

	public Interaction getUmlElement() {
		return umlElement;
	}

	public TestData addTestData(String name) {
		TestData testData = new TestData(name, this);
		testDataList.add(testData);
		return testData;
	}

	public boolean isBackground() {
		return umlElement.getEAnnotation("background") != null;
	}

	public boolean isScenarioOutline() {
		// if there's an annotation not called tags or background
		for (EAnnotation a : umlElement.getEAnnotations()) {
			if (!a.getSource().contentEquals("tags") && !a.getSource().contentEquals("background")) {
				return true;
			}
		}
		return false;
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

	public ArrayList<TestData> getTestDataList() {
		if (testDataList.isEmpty()) {
			for (EAnnotation a : umlElement.getEAnnotations()) {
				if (!a.getSource().contentEquals("tags")) {
					testDataList.add(new TestData(a, this));
				}
			}
		}
		return testDataList;
	}

}
