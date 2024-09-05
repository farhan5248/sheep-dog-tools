package org.farhan.helper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.farhan.cucumber.AbstractScenario;
import org.farhan.cucumber.Cell;
import org.farhan.cucumber.CucumberFactory;
import org.farhan.cucumber.Examples;
import org.farhan.cucumber.ExamplesTable;
import org.farhan.cucumber.Feature;
import org.farhan.cucumber.Row;
import org.farhan.cucumber.Scenario;
import org.farhan.cucumber.ScenarioOutline;
import org.farhan.cucumber.Step;
import org.farhan.cucumber.StepTable;
import org.farhan.generator.CucumberOutputConfigurationProvider;

public class LanguageAccessImpl implements ILanguageAccess {

	Step step;

	public LanguageAccessImpl(Object step) {
		this.step = (Step) step;
	}

	public EObject addStepDefinition(EObject stepObject) {
		AbstractScenario stepDefinition;
		// TODO when using Step Definition keyword, allow 0 or more tables (Examples)
		if (getHeader() != null) {
			stepDefinition = CucumberFactory.eINSTANCE.createScenarioOutline();
		} else {
			stepDefinition = CucumberFactory.eINSTANCE.createScenario();
		}
		stepDefinition.setName(step.getName());
		((Feature) stepObject).getAbstractScenarios().add(stepDefinition);
		return stepDefinition;
	}

	private String cellsToString(EList<Cell> cells) {
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

	public void createStepDefinitionParameters(EObject stepDefinition) {
		if (stepDefinition instanceof Scenario) {
			// This is temp hack while I hijack the feature file definition. I guess before
			// I go to Adoc, I should update this language
			return;
		}
		ScenarioOutline so = (ScenarioOutline) stepDefinition;
		Examples parameters = CucumberFactory.eINSTANCE.createExamples();
		parameters.setName(Integer.toString(so.getExamples().size() + 1));
		so.getExamples().add(parameters);

		ExamplesTable parametersTable = CucumberFactory.eINSTANCE.createExamplesTable();
		parameters.setTheExamplesTable(parametersTable);

		Row row = CucumberFactory.eINSTANCE.createRow();
		parametersTable.getRows().add(row);
		for (Cell srcCell : getHeader()) {
			Cell cell = CucumberFactory.eINSTANCE.createCell();
			cell.setName(srcCell.getName());
			row.getCells().add(cell);
		}

	}

	public EObject createStepObject() {
		Feature theFeature = CucumberFactory.eINSTANCE.createFeature();
		theFeature.setName(StepHelper.getObject(getStepName()));
		return theFeature;
	}

	private EList<Cell> getHeader() {
		StepTable stepTable = step.getTheStepTable();
		if (stepTable != null) {
			return stepTable.getRows().get(0).getCells();
		} else {
			return null;
		}
	}

	public String getHeaderString() {
		return cellsToString(getHeader());
	}

	public EList<?> getParameters(EObject stepDefinition) {
		ScenarioOutline so = (ScenarioOutline) stepDefinition;
		return so.getExamples();
	}

	public String getParametersString(EObject parameters) {
		Examples e = (Examples) parameters;
		return cellsToString(e.getTheExamplesTable().getRows().get(0).getCells());
	}

	public EObject getStep() {
		return step;
	}

	public String getStepDefinitionName(EObject stepDefinition) {
		return ((AbstractScenario) stepDefinition).getName();
	}

	public EList<?> getStepDefinitions(EObject stepObject) {
		return ((Feature) stepObject).getAbstractScenarios();
	}

	public String getStepName() {
		return step.getName();
	}

	public Resource getStepResource() {
		return step.eResource();
	}

	public ArrayList<String> getPreviousSteps() {
		AbstractScenario as = (AbstractScenario) step.eContainer();
		ArrayList<String> stepNames = new ArrayList<String>();
		for (Step s : as.getSteps()) {
			if (s.getName() != null) {
				stepNames.add(s.getName());
			}
		}
		return stepNames;
	}

	public boolean hasParameters(EObject stepDefinition) {
		if (stepDefinition instanceof Scenario) {
			return false;
		}
		ScenarioOutline so = (ScenarioOutline) stepDefinition;
		return !so.getExamples().isEmpty();
	}

	public String getProjectName(Resource stepResource) {
		return stepResource.getURI().toPlatformString(false).split("/")[1];
	}

	public String getOutputName() {
		return CucumberOutputConfigurationProvider.stepDefsOutput.getOutputDirectory();
	}

	public ArrayList<String> getProjectComponents() throws Exception {
		IFolder folder = getProject()
				.getFolder(CucumberOutputConfigurationProvider.stepDefsOutput.getOutputDirectory());
		ArrayList<String> components = new ArrayList<String>();
		for (IResource ir : folder.members()) {
			components.add(ir.getName());
		}
		return components;
	}

	public ArrayList<String> getComponentObjects(String component) throws Exception {
		IFolder folder = getProject()
				.getFolder(CucumberOutputConfigurationProvider.stepDefsOutput.getOutputDirectory() + "/" + component);

		ArrayList<String> components = new ArrayList<String>();
		for (String stepDefObjectResource : getFolderResources(folder)) {
			// ([^\/]+)\/([^\/]+)\/(.*).feature group 3
			components.add(stepDefObjectResource.split("/" + component + "/")[1].replace(".feature", ""));
		}
		return components;
	}

	private static ArrayList<String> getFolderResources(IFolder folder) throws Exception {
		ArrayList<String> files = new ArrayList<String>();
		for (IResource r : folder.members()) {
			if (r instanceof IFolder) {
				files.addAll(getFolderResources((IFolder) r));
			} else {
				files.add(r.getProjectRelativePath().toString());
			}
		}
		return files;
	}

	private IProject getProject() {
		return ResourcesPlugin.getWorkspace().getRoot()
				.getFile(new Path(step.eResource().getURI().toPlatformString(true))).getProject();
	}

}
