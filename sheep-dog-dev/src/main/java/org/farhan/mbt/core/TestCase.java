package org.farhan.mbt.core;

import java.util.ArrayList;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;

public class TestCase extends UMLElement {

	private Interaction umlElement;
	private ArrayList<TestStep> testStepList;
	private ArrayList<TestData> testDataList;

	public TestCase(String name, TestSuite parent) {
		testStepList = new ArrayList<TestStep>();
		testDataList = new ArrayList<TestData>();
		umlElement = addInteraction((Class) parent.getUmlElement(), name, "");
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

}
