package org.farhan.mbt.cucumber;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.xtext.impl.RuleCallImpl;
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement;
import org.farhan.CucumberStandaloneSetup;
import org.farhan.cucumber.AbstractScenario;
import org.farhan.cucumber.Background;
import org.farhan.cucumber.Cell;
import org.farhan.cucumber.CucumberFactory;
import org.farhan.cucumber.Examples;
import org.farhan.cucumber.Feature;
import org.farhan.cucumber.Line;
import org.farhan.cucumber.Row;
import org.farhan.cucumber.Scenario;
import org.farhan.cucumber.ScenarioOutline;
import org.farhan.cucumber.Statement;
import org.farhan.cucumber.Step;
import org.farhan.cucumber.Tag;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.graph.MBTPathInfo;

import com.google.inject.Injector;

public class CucumberFeatureWrapper implements ConvertibleObject {

	private File theFile;
	private Feature theFeature;

	public CucumberFeatureWrapper(File theFile) {
		setFile(theFile);
		theFeature = CucumberFactory.eINSTANCE.createFeature();
		theFeature.setName(theFile.getName().replace(".feature", ""));
	}

	@Override
	public void setFile(File theFile) {
		this.theFile = theFile;
	}

	@Override
	public File getFile() {
		return theFile;
	}

	@Override
	public void load() {
		URI uri = URI.createFileURI(theFile.getAbsolutePath());
		CucumberStandaloneSetup.doSetup();
		Resource res = new ResourceSetImpl().getResource(uri, true);
		theFeature = (Feature) res.getContents().get(0);
		// TODO validate it using the xtext api and throw the exception if it's invalid
	}

	@Override
	public void save() {
		Injector injector = new CucumberStandaloneSetup().createInjectorAndDoEMFRegistration();
		ResourceSet rs = injector.getInstance(ResourceSet.class);
		URI uri = URI.createFileURI(theFile.getAbsolutePath());
		Resource r = rs.createResource(uri);
		r.getContents().add(theFeature);
		try {
			r.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Object get() {
		return theFeature;
	}

	public String getFeatureName() {
		return theFeature.getName();
	}

	public String getFeatureTags() {
		return getTags(theFeature.getTags());
	}

	public String getFeatureDescription() {
		return convertStatementsToString(theFeature.getStatements());
	}

	private String convertStatementsToString(EList<Statement> eList) {
		String contents = "";
		for (Statement s : eList) {
			contents += s.getName() + "\n";
		}
		return contents.trim();
	}

	public EList<AbstractScenario> getAbstractScenarioList() {
		return theFeature.getAbstractScenarios();
	}

	public boolean isBackground(AbstractScenario abstractScenario) {
		return abstractScenario instanceof Background;
	}

	public boolean isScenarioOutline(AbstractScenario abstractScenario) {
		return abstractScenario instanceof ScenarioOutline;
	}

	public String getScenarioName(AbstractScenario abstractScenario) {
		return abstractScenario.getName();
	}

	public String getScenarioTags(AbstractScenario abstractScenario) {
		Scenario scenario = (Scenario) abstractScenario;
		return getTags(scenario.getTags());
	}

	private String getTags(EList<Tag> tagList) {
		String tags = "";
		for (Tag t : tagList) {
			tags += "," + t.getName().replace("@", "");
		}
		tags.replaceFirst(",", "");
		return tags;
	}

	public String getScenarioDescription(AbstractScenario abstractScenario) {
		return convertStatementsToString(abstractScenario.getStatements());
	}

	public EList<Step> getStepList(Object object, AbstractScenario abstractScenario) {
		return abstractScenario.getSteps();
	}

	public String getStep(Step step) {
		CompositeNodeWithSemanticElement keyword = (CompositeNodeWithSemanticElement) step.eAdapters().getFirst();
		RuleCallImpl rc = (RuleCallImpl) keyword.getGrammarElement();
		rc.getRule().getName();
		return rc.getRule().getName() + " " + step.getName();
	}

	public String getDocString(Step stepSrc) {
		String text = "";
		String indent = "          ";
		for (Line l : stepSrc.getTheDocString().getLines()) {
			if (l.getName() != null) {
				text += "\n" + l.getName().replaceFirst(indent, "").stripTrailing();
			}
		}
		return text.replaceFirst("\n", "");
	}

	public ArrayList<ArrayList<String>> getDataTable(Step stepSrc) {
		ArrayList<ArrayList<String>> dataTable = new ArrayList<ArrayList<String>>();
		ArrayList<String> row;
		for (Row r : stepSrc.getTheStepTable().getRows()) {
			row = new ArrayList<String>();
			for (Cell c : r.getCells()) {
				row.add(c.getName());
			}
			dataTable.add(row);
		}
		return dataTable;
	}

	public String getBackgroundName(AbstractScenario abstractScenario) {
		return abstractScenario.getName();
	}

	public String getBackgroundDescription(AbstractScenario abstractScenario) {
		return convertStatementsToString(abstractScenario.getStatements());
	}

	public String getScenarioOutlineName(AbstractScenario abstractScenario) {
		return abstractScenario.getName();
	}

	public String getScenarioOutlineTags(AbstractScenario abstractScenario) {
		ScenarioOutline scenarioOutline = (ScenarioOutline) abstractScenario;
		return getTags(scenarioOutline.getTags());
	}

	public String getScenarioOutlineDescription(AbstractScenario abstractScenario) {
		return convertStatementsToString(abstractScenario.getStatements());
	}

	public EList<Examples> getExamplesList(AbstractScenario abstractScenario) {
		ScenarioOutline scenarioOutline = (ScenarioOutline) abstractScenario;
		return scenarioOutline.getExamples();
	}

	public String getExamplesName(Examples examples) {
		return examples.getName();
	}

	public String getExamplesTable(Examples examples) {
		String header = "";
		for (Cell c : examples.getTheExamplesTable().getRows().getFirst().getCells()) {
			header += c.getName() + ",";
		}
		return header;
	}

	public ArrayList<Row> getExamplesRowList(Examples examples) {
		ArrayList<Row> body = new ArrayList<Row>();
		body.addAll(examples.getTheExamplesTable().getRows());
		body.remove(0);
		return body;
	}

	public HashMap<String, String> getExamplesRow(Examples examples, Row examplesRow) {
		HashMap<String, String> row = new HashMap<String, String>();
		EList<Cell> header = examples.getTheExamplesTable().getRows().getFirst().getCells();
		for (int i = 0; i < header.size(); i++) {
			row.put(header.get(i).getName(), examplesRow.getCells().get(i).getName());
		}
		return row;
	}

	public boolean hasDocString(Step step) {
		return step.getTheDocString() != null;
	}

	public boolean hasDataTable(Step step) {
		return step.getTheStepTable() != null;
	}

}
