package org.farhan.mbt.core;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.UMLFactory;

public class TestCase implements TestStepParent {

	private TestSuite parent;
	// TODO change to private after refactoring done
	public Interaction umlElement;
	private ArrayList<TestStep> testSteps;

	public TestCase(String name, TestSuite parent) {
		this.parent = parent;
		testSteps = new ArrayList<TestStep>();
		// TODO don't pass the parent
		umlElement = addAbstractScenario((Class) parent.get(), name, "");
	}

	private Interaction addAbstractScenario(Class theClass, String interactionName, String annotationName) {
		Interaction anInteraction = (Interaction) theClass.getOwnedBehavior(interactionName);
		if (anInteraction == null) {
			anInteraction = UMLFactory.eINSTANCE.createInteraction();
			anInteraction.setName(interactionName);
			theClass.setClassifierBehavior(anInteraction);
		}
		if (!annotationName.isEmpty()) {
			createAnnotation(anInteraction, annotationName);
		}
		return anInteraction;
	}

	private EAnnotation createAnnotation(Interaction anInteraction, String name) {
		// TODO combine this method and the one below to BehavioredClassifier
		EAnnotation a = anInteraction.getEAnnotation(name);
		if (a == null) {
			a = anInteraction.createEAnnotation(name);
		}
		return a;
	}

	private EAnnotation createAnnotation(Class className, String name, String key) {
		EAnnotation a = className.getEAnnotation(name);
		if (a == null) {
			a = className.createEAnnotation(name);
		}
		if (!key.isEmpty()) {
			a.getDetails().put(key, "");
		}
		return a;
	}

	public void setScenarioTags(ArrayList<String> tags) {

		if (!tags.isEmpty()) {
			for (String t : tags) {
				createAnnotation(umlElement, "tags", t);
			}
		}
	}

	public void setScenarioDescription(String scenarioDescription) {
		umlElement.createOwnedComment().setBody(scenarioDescription);
	}

	public TestStep addStep(String name) {
		TestStep testStep = new TestStep(name, this);
		testSteps.add(testStep);
		return testStep;
	}

	@Override
	public Interaction getUmlElement() {
		return umlElement;
	}

}
