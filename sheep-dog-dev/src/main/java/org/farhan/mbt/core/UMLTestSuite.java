package org.farhan.mbt.core;

import java.util.ArrayList;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;

public class UMLTestSuite extends UMLElement {

	private Class umlElement;
	private UMLTestSetup testSetup;
	private ArrayList<UMLTestCase> testCaseList;

	public UMLTestSuite(Class umlElement, UMLTestProject parent) {
		testCaseList = new ArrayList<UMLTestCase>();
		testSetup = null;
		this.umlElement = umlElement;
	}

	public UMLTestSuite(String name, UMLTestProject parent) {
		testCaseList = new ArrayList<UMLTestCase>();
		testSetup = null;
		this.umlElement = addClass(name, parent.getUmlElement());
	}

	public UMLTestCase addTestCase(String name) {
		UMLTestCase testCase = new UMLTestCase(name, this);
		testCaseList.add(testCase);
		return testCase;
	}

	public UMLTestSetup addTestSetup(String name) {
		testSetup = new UMLTestSetup(name, this);
		return testSetup;
	}

	public String getDescription() {
		if (umlElement.getOwnedComments().size() > 0) {
			return umlElement.getOwnedComments().get(0).getBody();
		}
		return "";
	}

	public String getName() {
		return umlElement.getName();
	}

	public ArrayList<UMLTestCase> getTestCaseList() {
		if (testCaseList.isEmpty()) {
			for (Behavior b : umlElement.getOwnedBehaviors()) {
				if (b.getEAnnotation("background") == null) {
					testCaseList.add(new UMLTestCase((Interaction) b));
				}
			}
		}
		return testCaseList;
	}

	public UMLTestSetup getTestSetup() {
		if (testSetup == null) {
			for (Behavior b : umlElement.getOwnedBehaviors()) {
				if (b.getEAnnotation("background") != null) {
					testSetup = new UMLTestSetup((Interaction) b, this);
				}
			}
		}
		return testSetup;
	}

	public Class getUmlElement() {
		return umlElement;
	}

	public boolean hasTestSetup() {
		return getTestSetup() != null;
	}

	public void setDescription(String description) {
		umlElement.createOwnedComment().setBody(description);
	}

}
