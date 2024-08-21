package org.farhan.generator;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.farhan.cucumber.AbstractScenario;
import org.farhan.cucumber.Cell;
import org.farhan.cucumber.CucumberFactory;
import org.farhan.cucumber.Examples;
import org.farhan.cucumber.ExamplesTable;
import org.farhan.cucumber.Feature;
import org.farhan.cucumber.Row;
import org.farhan.cucumber.ScenarioOutline;

public class FileGenerator {

	public static void getContent(IFileSystemAccess2 fsa, String fileName, String component, String object,
			String stepDefName, EList<Cell> headers) {
		try {
			Resource theResource = getResource(fsa, fileName);
			Feature theObject = getObject(theResource, component, object);
			AbstractScenario theStepDef = getStepDef(theObject, stepDefName, headers);
			if (headers != null) {
				Examples theExamples = getExamples(theStepDef, headers);
			}
			theResource.save(null);
		} catch (Exception e) {
			System.out.println("There was a problem loading file: " + fileName);
			System.out.println(getStackTraceAsString(e));
		}
	}

	private static Examples getExamples(AbstractScenario theStepDef, EList<Cell> headers) {
		ScenarioOutline so = (ScenarioOutline) theStepDef;
		if (!so.getExamples().isEmpty()) {
			String headersString = cellsToString(headers);
			for (Examples parameters : so.getExamples()) {
				String paramSetString = cellsToString(parameters.getTheExamplesTable().getRows().get(0).getCells());
				if (headersString.contentEquals(paramSetString)) {
					return parameters;
				}
			}
		}
		// then make a new one
		Examples parameters = CucumberFactory.eINSTANCE.createExamples();
		parameters.setName(Integer.toString(so.getExamples().size()) + 1);
		so.getExamples().add(parameters);

		ExamplesTable parametersTable = CucumberFactory.eINSTANCE.createExamplesTable();
		parameters.setTheExamplesTable(parametersTable);

		Row row = CucumberFactory.eINSTANCE.createRow();
		parametersTable.getRows().add(row);
		for (Cell srcCell : headers) {
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

	private static String getStackTraceAsString(Exception e) {
		StringWriter sw = new StringWriter();
		e.printStackTrace(new PrintWriter(sw));
		return sw.toString();
	}

	private static Resource getResource(IFileSystemAccess2 fsa, String fileName) {
		Resource res;
		URI uri = fsa.getURI(fileName, MyOutputConfigurationProvider.DEFAULT_OUTPUT_ONCE);
		if (fsa.isFile(fileName, MyOutputConfigurationProvider.DEFAULT_OUTPUT_ONCE)) {
			res = new ResourceSetImpl().getResource(uri, true);
		} else {
			res = new ResourceSetImpl().createResource(uri);
		}
		return res;
	}

	private static Feature getObject(Resource res, String component, String object) {

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

	private static AbstractScenario getStepDef(Feature theFeature, String stepName, EList<Cell> header) {
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

}
