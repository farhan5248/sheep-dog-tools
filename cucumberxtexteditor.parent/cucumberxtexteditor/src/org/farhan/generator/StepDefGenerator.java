package org.farhan.generator;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.resource.SaveOptions;
import org.farhan.cucumber.AbstractScenario;
import org.farhan.cucumber.Cell;
import org.farhan.cucumber.CucumberFactory;
import org.farhan.cucumber.Examples;
import org.farhan.cucumber.ExamplesTable;
import org.farhan.cucumber.Feature;
import org.farhan.cucumber.Given;
import org.farhan.cucumber.Row;
import org.farhan.cucumber.ScenarioOutline;
import org.farhan.cucumber.Step;
import org.farhan.cucumber.StepTable;
import org.farhan.validation.StepValidator;

public class StepDefGenerator {

	private static void logError(Exception e, Step step) {
		// TODO inject the logger instead
		System.out.println("There was a problem generating for step: " + step.getName());
		StringWriter sw = new StringWriter();
		e.printStackTrace(new PrintWriter(sw));
		System.out.println(sw.toString());
	}

	public static TreeSet<String> getPreviousObjects(Given step) {
		AbstractScenario as = (AbstractScenario) step.eContainer();
		TreeSet<String> previousObjects = new TreeSet<String>();
		for (Step aStep : as.getSteps()) {
			if (aStep.equals(step)) {
				break;
			} else {
				String[] objectParts = StepValidator.getObject(aStep.getName()).split("/");
				previousObjects.add(objectParts[objectParts.length - 1]);
			}
		}
		return previousObjects;
	}

	public static String getProblems(Step step) {
		try {
			// check if the object exists
			URI objectURI = getObjectURI(step);
			if (!(new ResourceSetImpl().getURIConverter().exists(objectURI, null))) {
				return "This object doesn't exist for: " + objectURI.path();
			}
			// check if the keyword exists
			Resource theResource = getOrCreateResource(objectURI);
			Feature theObject = getOrCreateObject(theResource, StepValidator.getObject(step.getName()));
			AbstractScenario theStepDef = getStepDef(theObject, step);
			if (theStepDef == null) {
				return "This object step definition doesn't exist for: " + objectURI.path();
			}
			// check if the parameters exist
			EList<Cell> headers = getHeader(step);
			if (headers != null) {
				if (getParameters(theStepDef, headers) == null) {
					return "This object step definition parameter set doesn't exist for: " + objectURI.path();
				}
			}
		} catch (Exception e) {
			logError(e, step);
		}
		return "";
	}

	public static void generate(Step step) {
		try {
			URI objectURI = getObjectURI(step);
			Resource theResource = getOrCreateResource(objectURI);
			Feature theObject = getOrCreateObject(theResource, StepValidator.getObject(step.getName()));
			AbstractScenario theStepDef = getOrCreateStepDef(theObject, step);
			EList<Cell> headers = getHeader(step);
			if (headers != null) {
				getOrCreateParameters(theStepDef, headers);
			}
			theResource.save(SaveOptions.newBuilder().format().getOptions().toOptionsMap());
		} catch (Exception e) {
			logError(e, step);
		}
	}

	private static Resource getOrCreateResource(URI objectURI) throws Exception {
		Resource theResource = new ResourceSetImpl().createResource(objectURI);
		if (new ResourceSetImpl().getURIConverter().exists(objectURI, null)) {
			theResource.load(new HashMap());
		}
		return theResource;
	}

	private static URI getObjectURI(Step step) {
		String projectName = step.eResource().getURI().toPlatformString(false).split("/")[1];
		String outputDir = CucumberOutputConfigurationProvider.stepDefsOutput.getOutputDirectory();
		String fileName = getQualifiedName(step);
		return URI.createPlatformResourceURI("/" + projectName + "/" + outputDir + "/" + fileName, true);
	}

	private static String getQualifiedName(Step step) {
		String component = StepValidator.getComponent(step.getName());
		String object = StepValidator.getObject(step.getName());

		// if there is a component and the object has a /, we're done
		if (!component.isEmpty() && object.contains("/")) {
			return component + "/" + object + ".feature";
		}
		// Create a list of previous steps in reverse order
		AbstractScenario as = (AbstractScenario) step.eContainer();
		ArrayList<Step> previousSteps = new ArrayList<Step>();
		String lastComponent = "Unknown service";
		for (Step aStep : as.getSteps()) {
			if (aStep.equals(step)) {
				break;
			} else {
				previousSteps.add(0, aStep);
				// keep track of the last component to assign to undeclared object components
				if (!StepValidator.getComponent(aStep.getName()).isEmpty()) {
					lastComponent = StepValidator.getComponent(aStep.getName());
				}
			}
		}
		// search all previous steps for a more complete object path. While doing so,
		// if the component is empty, set it
		String[] objectParts = object.split("/");
		String objectKey = objectParts[objectParts.length - 1];
		for (Step previousStep : previousSteps) {
			// if the step has a matching object
			String previousObject = StepValidator.getObject(previousStep.getName());
			String previousComponent = StepValidator.getComponent(previousStep.getName());
			if (previousObject.endsWith(objectKey)) {

				// if the object doesn't have / and the matching object does. Set it
				if (!object.contains("/") && previousObject.contains("/")) {
					object = previousObject;
				}
				// if the component is empty and the matching component isn't. Set it
				if (component.isEmpty() && !previousComponent.isEmpty()) {
					component = previousComponent;
				}
				// if we have both, we're done
				if (!component.isEmpty() && object.contains("/")) {
					break;
				}
			} else {
			}
		}
		// TODO, in the future, get the background too if there is one and search there
		// or throw an exception
		if (component.isEmpty()) {
			return lastComponent + "/" + object + ".feature";
		} else {
			return component + "/" + object + ".feature";
		}
	}

	private static EList<Cell> getHeader(Step step) {
		StepTable stepTable = step.getTheStepTable();
		if (stepTable != null) {
			return stepTable.getRows().get(0).getCells();
		} else {
			return null;
		}
	}

	private static Feature getOrCreateObject(Resource res, String object) {

		Feature theObject;
		if (!res.getContents().isEmpty()) {
			theObject = (Feature) res.getContents().get(0);
		} else {
			theObject = CucumberFactory.eINSTANCE.createFeature();
			theObject.setName(object);
			res.getContents().add(theObject);
		}
		return theObject;
	}

	private static AbstractScenario getStepDef(Feature theObject, Step step) {
		for (AbstractScenario stepDef : theObject.getAbstractScenarios()) {
			if (stepDef.getName().contentEquals(step.getName())) {
				return stepDef;
			}
		}
		return null;
	}

	private static AbstractScenario getOrCreateStepDef(Feature theObject, Step step) {
		for (AbstractScenario stepDef : theObject.getAbstractScenarios()) {
			if (stepDef.getName().contentEquals(step.getName())) {
				return stepDef;
			}
		}
		AbstractScenario theStepDef;
		// TODO when using Step Definition keyword, allow 0 or more tables (Examples)
		if (getHeader(step) != null) {
			theStepDef = CucumberFactory.eINSTANCE.createScenarioOutline();
		} else {
			theStepDef = CucumberFactory.eINSTANCE.createScenario();
		}
		theStepDef.setName(step.getName());
		theObject.getAbstractScenarios().add(theStepDef);
		return theStepDef;
	}

	private static Examples getParameters(AbstractScenario theStepDef, EList<Cell> theStepDefParameters) {
		ScenarioOutline so = (ScenarioOutline) theStepDef;
		if (!so.getExamples().isEmpty()) {
			String headersString = cellsToString(theStepDefParameters);
			for (Examples parameters : so.getExamples()) {
				String paramSetString = cellsToString(parameters.getTheExamplesTable().getRows().get(0).getCells());
				if (headersString.contentEquals(paramSetString)) {
					return parameters;
				}
			}
		}
		return null;
	}

	private static Examples getOrCreateParameters(AbstractScenario theStepDef, EList<Cell> theStepDefParameters) {
		ScenarioOutline so = (ScenarioOutline) theStepDef;
		if (!so.getExamples().isEmpty()) {
			String headersString = cellsToString(theStepDefParameters);
			for (Examples parameters : so.getExamples()) {
				String paramSetString = cellsToString(parameters.getTheExamplesTable().getRows().get(0).getCells());
				if (headersString.contentEquals(paramSetString)) {
					return parameters;
				}
			}
		}
		Examples parameters = CucumberFactory.eINSTANCE.createExamples();
		parameters.setName(Integer.toString(so.getExamples().size() + 1));
		so.getExamples().add(parameters);

		ExamplesTable parametersTable = CucumberFactory.eINSTANCE.createExamplesTable();
		parameters.setTheExamplesTable(parametersTable);

		Row row = CucumberFactory.eINSTANCE.createRow();
		parametersTable.getRows().add(row);
		for (Cell srcCell : theStepDefParameters) {
			Cell cell = CucumberFactory.eINSTANCE.createCell();
			cell.setName(srcCell.getName());
			row.getCells().add(cell);
		}
		return parameters;
	}

	private static String cellsToString(EList<Cell> cells) {
		String cellsAsString = "";
		List<String> sortedCells = new ArrayList<String>();
		for (Cell cell : cells) {
			sortedCells.add(cell.getName());
		}
		Collections.sort(sortedCells);
		for (String cell : sortedCells) {
			cellsAsString += cell;
		}
		return cellsAsString;
	}

}
