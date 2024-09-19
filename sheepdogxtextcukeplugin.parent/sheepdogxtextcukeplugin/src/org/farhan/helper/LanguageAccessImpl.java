package org.farhan.helper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.farhan.mbt.cucumber.AbstractScenario;
import org.farhan.mbt.cucumber.Background;
import org.farhan.mbt.cucumber.Cell;
import org.farhan.mbt.cucumber.CucumberFactory;
import org.farhan.mbt.cucumber.Feature;
import org.farhan.mbt.cucumber.ParametersTable;
import org.farhan.mbt.cucumber.Row;
import org.farhan.mbt.cucumber.Statement;
import org.farhan.mbt.cucumber.Step;
import org.farhan.mbt.cucumber.StepDefinition;
import org.farhan.mbt.cucumber.StepObject;
import org.farhan.mbt.cucumber.StepTable;
import org.farhan.mbt.cucumber.StepParameters;
import org.farhan.mbt.generator.CucumberOutputConfigurationProvider;

public class LanguageAccessImpl implements ILanguageAccess {

	private static ArrayList<String> getFolderResources(IFolder folder) throws Exception {
		ArrayList<String> files = new ArrayList<String>();
		if (folder.exists()) {
			for (IResource r : folder.members()) {
				if (r instanceof IFolder) {
					files.addAll(getFolderResources((IFolder) r));
				} else {
					files.add(r.getProjectRelativePath().toString());
				}
			}
		}
		return files;
	}

	Step step;

	public LanguageAccessImpl(Step step) {
		this.step = step;
	}

	private String cellsToString(List<Cell> cells) {
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

	@Override
	public Object createStepDefinition(Object stepObject, String predicate) {
		StepDefinition stepDefinition;
		stepDefinition = CucumberFactory.eINSTANCE.createStepDefinition();
		stepDefinition.setName(predicate);
		((StepObject) stepObject).getStepDefinitions().add(stepDefinition);
		return stepDefinition;
	}

	public void createStepDefinitionParameters(Object stepDefinition) {
		// If the step doesn't have a step table, then don't do anything

		StepDefinition so = (StepDefinition) stepDefinition;
		StepParameters parameters = CucumberFactory.eINSTANCE.createStepParameters();
		parameters.setName(Integer.toString(so.getStepParameters().size() + 1));
		so.getStepParameters().add(parameters);

		ParametersTable parametersTable = CucumberFactory.eINSTANCE.createParametersTable();
		parameters.setParametersTable(parametersTable);

		Row row = CucumberFactory.eINSTANCE.createRow();
		parametersTable.getRows().add(row);
		for (Cell srcCell : getHeader()) {
			Cell cell = CucumberFactory.eINSTANCE.createCell();
			cell.setName(srcCell.getName());
			row.getCells().add(cell);
		}
	}

	private Object createStepObject() {
		StepObject stepObject = CucumberFactory.eINSTANCE.createStepObject();
		stepObject.setName(StepHelper.getObject(getStepName()));
		return stepObject;
	}

	@Override
	public Object createStepObject(String objectQualifiedName) throws Exception {
		Object stepObject = getStepObject(objectQualifiedName);
		if (stepObject != null) {
			return stepObject;
		} else {
			Resource theResource = new ResourceSetImpl().createResource(getObjectURI(objectQualifiedName));
			theResource.getContents().add((EObject) createStepObject());
			return theResource.getContents().get(0);
		}
	}

	@Override
	public ArrayList<Object> getAllSteps() {
		AbstractScenario as = (AbstractScenario) step.eContainer();
		ArrayList<Object> stepNames = new ArrayList<Object>();
		for (Step s : as.getSteps()) {
			if (s.getName() != null) {
				stepNames.add(s);
			}
		}
		return stepNames;
	}

	@Override
	public ArrayList<Object> getBackgroundSteps() {
		ArrayList<Object> steps = new ArrayList<Object>();
		Feature feature = (Feature) step.eContainer().eContainer();
		if (feature.getAbstractScenarios().getFirst() instanceof Background) {
			for (Step s : feature.getAbstractScenarios().getFirst().getSteps()) {
				steps.add(s);
			}
		}
		return steps;
	}

	@Override
	public ArrayList<String> getFiles() throws Exception {
		IFolder folder = getProject()
				.getFolder(CucumberOutputConfigurationProvider.stepDefsOutput.getOutputDirectory());
		ArrayList<String> components = new ArrayList<String>();
		for (IResource ir : folder.members()) {
			components.add(ir.getName());
		}
		return components;
	}

	@Override
	public ArrayList<String> getFilesRecursively(String component) throws Exception {
		IFolder folder = getProject()
				.getFolder(CucumberOutputConfigurationProvider.stepDefsOutput.getOutputDirectory() + "/" + component);

		ArrayList<String> components = new ArrayList<String>();
		for (String stepDefObjectResource : getFolderResources(folder)) {
			// ([^\/]+)\/([^\/]+)\/(.*).feature group 3
			components.add(stepDefObjectResource.replaceFirst(".*" + component + "/", component + "/"));
		}
		return components;
	}

	private List<Cell> getHeader() {
		StepTable stepTable = step.getTheStepTable();
		if (stepTable != null) {
			return stepTable.getRows().get(0).getCells();
		} else {
			return null;
		}
	}

	private URI getObjectURI(String objectQualifiedName) {
		String projectName = getProjectName(getStepResource());
		String outputDir = getOutputName();
		String fileName = objectQualifiedName;
		return URI.createPlatformResourceURI("/" + projectName + "/" + outputDir + "/" + fileName, true);
	}

	private String getOutputName() {
		return CucumberOutputConfigurationProvider.stepDefsOutput.getOutputDirectory();
	}

	public ArrayList<Object> getPreviousSteps() {
		AbstractScenario as = (AbstractScenario) step.eContainer();
		ArrayList<Object> steps = new ArrayList<Object>();
		for (Step s : as.getSteps()) {
			if (s.getName() != null) {
				if (s.equals(step)) {
					break;
				} else {
					steps.add(s);
				}
			}
		}
		return steps;
	}

	private IProject getProject() {
		return ResourcesPlugin.getWorkspace().getRoot()
				.getFile(new Path(step.eResource().getURI().toPlatformString(true))).getProject();
	}

	private String getProjectName(Resource stepResource) {
		return stepResource.getURI().toPlatformString(false).split("/")[1];
	}

	public Object getStep() {
		return step;
	}

	@Override
	public String getStepDefinitionDescription(Object stepDefinition) {

		String description = "";
		if (stepDefinition instanceof StepDefinition) {
			StepDefinition as = (StepDefinition) stepDefinition;
			for (Statement s : as.getStatements()) {
				description += s.getName() + "\n";
			}
		}
		return description;
	}

	public String getStepDefinitionName(Object stepDefinition) {
		return ((StepDefinition) stepDefinition).getName();
	}

	@Override
	public List<?> getStepDefinitionParameters(Object stepDefinition) {
		StepDefinition so = (StepDefinition) stepDefinition;
		return so.getStepParameters();
	}

	@Override
	public String getStepDefinitionParametersString(Object parameters) {
		StepParameters e = (StepParameters) parameters;
		return cellsToString(e.getParametersTable().getRows().get(0).getCells());
	}

	public EList<?> getStepDefinitions(Object stepObject) {
		return ((StepObject) stepObject).getStepDefinitions();
	}

	public String getStepName() {
		return step.getName();
	}

	@Override
	public String getStepName(Object step) {
		return ((Step) step).getName();
	}

	@Override
	public Object getStepObject(String objectQualifiedName) throws Exception {
		Resource theResource = new ResourceSetImpl().createResource(getObjectURI(objectQualifiedName));
		if (new ResourceSetImpl().getURIConverter().exists(theResource.getURI(), null)) {
			theResource.load(new HashMap());
			return theResource.getContents().get(0);
		} else {
			return null;
		}
	}

	@Override
	public String getStepObjectDescription(String objectQualifiedName) throws Exception {
		StepObject stepObject = (StepObject) getStepObject(objectQualifiedName);
		String description = "";
		if (stepObject != null) {
			for (Statement s : stepObject.getStatements()) {
				description += s.getName() + "\n";
			}
		}
		return description;
	}

	@Override
	public String getStepParametersString() {
		return cellsToString(getHeader());
	}

	public Resource getStepResource() {
		return step.eResource();
	}

	public boolean hasParameters(Object stepDefinition) {
		return (step.getTheStepTable() != null);
	}

	@Override
	public void saveObject(Object theObject, Map<Object, Object> options) throws Exception {
		((EObject) theObject).eResource().save(options);
	}

}
