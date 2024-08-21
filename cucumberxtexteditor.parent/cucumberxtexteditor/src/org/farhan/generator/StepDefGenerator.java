package org.farhan.generator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.resource.SaveOptions;
import org.farhan.cucumber.AbstractScenario;
import org.farhan.cucumber.Cell;
import org.farhan.cucumber.CucumberFactory;
import org.farhan.cucumber.Examples;
import org.farhan.cucumber.ExamplesTable;
import org.farhan.cucumber.Feature;
import org.farhan.cucumber.Row;
import org.farhan.cucumber.ScenarioOutline;

public class StepDefGenerator {

	public static void generate(IFileSystemAccess2 fsa, String stepComponent, String stepObject, String stepName,
			EList<Cell> headers) throws Exception {
		Resource theResource;
		String fileName = stepComponent + "/" + stepObject + ".feature";
		URI uri = fsa.getURI(fileName, MyOutputConfigurationProvider.DEFAULT_OUTPUT_ONCE);
		if (fsa.isFile(fileName, MyOutputConfigurationProvider.DEFAULT_OUTPUT_ONCE)) {
			theResource = new ResourceSetImpl().getResource(uri, true);
		} else {
			theResource = new ResourceSetImpl().createResource(uri);
		}
		Feature theObject = getOrCreateObject(theResource, stepComponent, stepObject);
		AbstractScenario theStepDef = getOrCreateStepDef(theObject, stepName, headers);
		if (headers != null) {
			getOrCreateExamples(theStepDef, headers);
		}
		theResource.save(SaveOptions.newBuilder().format().getOptions().toOptionsMap());
	}

	private static Feature getOrCreateObject(Resource res, String component, String object) {

		Feature theFeature;
		if (!res.getContents().isEmpty()) {
			theFeature = (Feature) res.getContents().get(0);
		} else {
			theFeature = CucumberFactory.eINSTANCE.createFeature();
			theFeature.setName(object);
			res.getContents().add(theFeature);
		}
		return theFeature;
	}

	private static AbstractScenario getOrCreateStepDef(Feature theFeature, String stepName, EList<Cell> header) {
		for (AbstractScenario stepDef : theFeature.getAbstractScenarios()) {
			if (stepDef.getName().contentEquals(stepName)) {
				return stepDef;
			}
		}
		AbstractScenario theStepDef;
		if (header != null) {
			theStepDef = CucumberFactory.eINSTANCE.createScenarioOutline();
		} else {
			theStepDef = CucumberFactory.eINSTANCE.createScenario();
		}
		theStepDef.setName(stepName);
		theFeature.getAbstractScenarios().add(theStepDef);
		return theStepDef;
	}

	private static Examples getOrCreateExamples(AbstractScenario theStepDef, EList<Cell> theStepDefParameters) {
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
