package org.farhan.mbt.cucumber;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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

import com.google.inject.Injector;

public class CucumberFeatureWrapper implements ConvertibleObject {

	private Feature theFeature;
	private File theFile;

	public CucumberFeatureWrapper(File theFile) {
		setFile(theFile);
		theFeature = CucumberFactory.eINSTANCE.createFeature();
		theFeature.setName(theFile.getName().replace(".feature", ""));
	}

	private String convertStatementsToString(EList<Statement> eList) {
		String contents = "";
		for (Statement s : eList) {
			contents += s.getName() + "\n";
		}
		return contents.trim();
	}

	public Background createBackground(String backgroundName) {
		Background background = CucumberFactory.eINSTANCE.createBackground();
		background.setName(backgroundName);
		theFeature.getAbstractScenarios().add(background);
		return background;
	}

	public void createDocString(Step step, String docString) {
		step.setTheDocString(CucumberFactory.eINSTANCE.createDocString());
		for (String l : docString.split("\n")) {
			Line line = CucumberFactory.eINSTANCE.createLine();
			// I'm not sure why only 9 leading spaces are needed instead of 10 and why a
			// trailing space gets added automatically
			line.setName("         " + l);
			step.getTheDocString().getLines().add(line);
		}
	}

	public Examples createExamples(ScenarioOutline scenarioOutline, String examplesName) {
		Examples examples = CucumberFactory.eINSTANCE.createExamples();
		examples.setName(examplesName);
		scenarioOutline.getExamples().add(examples);
		return examples;
	}

	public void createExamplesRow(Examples examples, ArrayList<String> examplesRow) {
		Row row = CucumberFactory.eINSTANCE.createRow();
		for (String srcCell : examplesRow) {
			Cell cell = CucumberFactory.eINSTANCE.createCell();
			cell.setName(srcCell);
			row.getCells().add(cell);
		}
		examples.getTheExamplesTable().getRows().add(row);
	}

	public void createExamplesTable(Examples examples, ArrayList<String> headers) {
		examples.setTheExamplesTable(CucumberFactory.eINSTANCE.createExamplesTable());
		Row row = CucumberFactory.eINSTANCE.createRow();
		for (String srcCell : headers) {
			Cell cell = CucumberFactory.eINSTANCE.createCell();
			cell.setName(srcCell);
			row.getCells().add(cell);
		}
		examples.getTheExamplesTable().getRows().add(row);
	}

	public Scenario createScenario(String scenarioName) {
		Scenario scenario = CucumberFactory.eINSTANCE.createScenario();
		scenario.setName(scenarioName);
		theFeature.getAbstractScenarios().add(scenario);
		return scenario;
	}

	public ScenarioOutline createScenarioOutline(String scenarioOutlineName) {
		ScenarioOutline scenarioOutline = CucumberFactory.eINSTANCE.createScenarioOutline();
		scenarioOutline.setName(scenarioOutlineName);
		theFeature.getAbstractScenarios().add(scenarioOutline);
		return scenarioOutline;
	}

	public Step createStep(AbstractScenario abstractScenario, String name) {
		String keyword = name.split(" ")[0];
		Step step = null;
		switch (keyword) {
		case "Given":
			step = CucumberFactory.eINSTANCE.createGiven();
			break;
		case "When":
			step = CucumberFactory.eINSTANCE.createWhen();
			break;
		case "Then":
			step = CucumberFactory.eINSTANCE.createThen();
			break;
		case "But":
			step = CucumberFactory.eINSTANCE.createBut();
			break;
		case "And":
			step = CucumberFactory.eINSTANCE.createAnd();
			break;
		case "*":
			step = CucumberFactory.eINSTANCE.createAsterisk();
			break;
		}
		step.setName(name.substring(keyword.length() + 1));
		abstractScenario.getSteps().add(step);
		return step;
	}

	public void createStepTable(Step step, ArrayList<ArrayList<String>> stepTableRowList) {
		step.setTheStepTable(CucumberFactory.eINSTANCE.createStepTable());
		for (ArrayList<String> srcRow : stepTableRowList) {
			Row row = CucumberFactory.eINSTANCE.createRow();
			for (String srcCell : srcRow) {
				Cell cell = CucumberFactory.eINSTANCE.createCell();
				cell.setName(srcCell);
				row.getCells().add(cell);
			}
			step.getTheStepTable().getRows().add(row);
		}
	}

	@Override
	public Object get() {
		return theFeature;
	}

	public EList<AbstractScenario> getAbstractScenarioList() {
		return theFeature.getAbstractScenarios();
	}

	public String getBackgroundDescription(AbstractScenario abstractScenario) {
		return convertStatementsToString(abstractScenario.getStatements());
	}

	public String getBackgroundName(AbstractScenario abstractScenario) {
		return abstractScenario.getName();
	}

	public String getDocString(Step stepSrc) {
		String text = "";
		String indent = "          ";
		for (Line l : stepSrc.getTheDocString().getLines()) {
			if (l.getName() != null) {
				text += "\n" + l.getName().replaceFirst(indent, "").stripTrailing();
			} else {
				text += "\n";
			}
		}
		return text.replaceFirst("\n", "");
	}

	public EList<Examples> getExamplesList(AbstractScenario abstractScenario) {
		ScenarioOutline scenarioOutline = (ScenarioOutline) abstractScenario;
		return scenarioOutline.getExamples();
	}

	public String getExamplesName(Examples examples) {
		return examples.getName();
	}

	public ArrayList<String> getExamplesRow(Examples examples, Row examplesRow) {
		ArrayList<String> row = new ArrayList<String>();
		EList<Cell> header = examples.getTheExamplesTable().getRows().getFirst().getCells();
		for (int i = 0; i < header.size(); i++) {
			row.add(examplesRow.getCells().get(i).getName());
		}
		return row;
	}

	public ArrayList<Row> getExamplesRowList(Examples examples) {
		ArrayList<Row> body = new ArrayList<Row>();
		body.addAll(examples.getTheExamplesTable().getRows());
		body.remove(0);
		return body;
	}

	public ArrayList<String> getExamplesTable(Examples examples) {
		ArrayList<String> header = new ArrayList<String>();
		for (Cell c : examples.getTheExamplesTable().getRows().getFirst().getCells()) {
			header.add(c.getName());
		}
		return header;
	}

	public String getFeatureDescription() {
		return convertStatementsToString(theFeature.getStatements());
	}

	public String getFeatureName() {
		return theFeature.getName();
	}

	public ArrayList<String> getFeatureTags() {
		return getTags(theFeature.getTags());
	}

	@Override
	public File getFile() {
		return theFile;
	}

	public String getFileName() {
		return theFile.getAbsolutePath();
	}

	public String getScenarioDescription(AbstractScenario abstractScenario) {
		return convertStatementsToString(abstractScenario.getStatements());
	}

	public String getScenarioName(AbstractScenario abstractScenario) {
		return abstractScenario.getName();
	}

	public String getScenarioOutlineDescription(AbstractScenario abstractScenario) {
		return convertStatementsToString(abstractScenario.getStatements());
	}

	public String getScenarioOutlineName(AbstractScenario abstractScenario) {
		return abstractScenario.getName();
	}

	public ArrayList<String> getScenarioOutlineTags(AbstractScenario abstractScenario) {
		ScenarioOutline scenarioOutline = (ScenarioOutline) abstractScenario;
		return getTags(scenarioOutline.getTags());
	}

	public ArrayList<String> getScenarioTags(AbstractScenario abstractScenario) {
		Scenario scenario = (Scenario) abstractScenario;
		return getTags(scenario.getTags());
	}

	public String getStep(Step step) {
		CompositeNodeWithSemanticElement keyword = (CompositeNodeWithSemanticElement) step.eAdapters().getFirst();
		RuleCallImpl rc = (RuleCallImpl) keyword.getGrammarElement();
		String keywordString = rc.getRule().getName();
		if (keywordString.contentEquals("Asterisk")) {
			keywordString = "*";
		}
		return keywordString + " " + step.getName();
	}

	public EList<Step> getStepList(AbstractScenario abstractScenario) {
		return abstractScenario.getSteps();
	}

	public ArrayList<ArrayList<String>> getStepTable(Step stepSrc) {
		ArrayList<ArrayList<String>> stepTableRowList = new ArrayList<ArrayList<String>>();
		ArrayList<String> row;
		for (Row r : stepSrc.getTheStepTable().getRows()) {
			row = new ArrayList<String>();
			for (Cell c : r.getCells()) {
				row.add(c.getName());
			}
			stepTableRowList.add(row);
		}
		return stepTableRowList;
	}

	private ArrayList<String> getTags(EList<Tag> tagList) {
		ArrayList<String> tags = new ArrayList<String>();
		for (Tag t : tagList) {
			tags.add(t.getName().replace("@", ""));
		}
		return tags;
	}

	public boolean hasDocString(Step step) {
		return step.getTheDocString() != null;
	}

	public boolean hasStepTable(Step step) {
		return step.getTheStepTable() != null;
	}

	public boolean isBackground(AbstractScenario abstractScenario) {
		return abstractScenario instanceof Background;
	}

	public boolean isScenarioOutline(AbstractScenario abstractScenario) {
		return abstractScenario instanceof ScenarioOutline;
	}

	@Override
	public void load() throws Exception {
		try {
			URI uri = URI.createFileURI(theFile.getAbsolutePath());
			CucumberStandaloneSetup.doSetup();
			Resource res = new ResourceSetImpl().getResource(uri, true);
			theFeature = (Feature) res.getContents().get(0);
		} catch (Exception e) {
			throw new Exception("There was a problem loading file: " + theFile.getAbsolutePath());
		}
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

	public void setBackgroundDescription(Background background, String backgroundDescription) {
		setDescription(background, backgroundDescription);
	}

	private void setDescription(AbstractScenario abstractScenario, String scenarioDescription) {
		if (!scenarioDescription.isEmpty()) {
			for (String line : scenarioDescription.split("\n")) {
				Statement s = CucumberFactory.eINSTANCE.createStatement();
				s.setName(line);
				abstractScenario.getStatements().add(s);
			}
		}
	}

	public void setFeatureDescription(String featureDescription) {
		if (!featureDescription.isEmpty()) {
			for (String line : featureDescription.split("\n")) {
				Statement s = CucumberFactory.eINSTANCE.createStatement();
				s.setName(line);
				theFeature.getStatements().add(s);
			}
		}
	}

	public void setFeatureName(String featureName) {
		theFeature.setName(featureName);
	}

	public void setFeatureTags(ArrayList<String> featureTags) {
		setTags(theFeature.getTags(), featureTags);
	}

	@Override
	public void setFile(File theFile) {
		this.theFile = theFile;
	}

	public void setScenarioDescription(Scenario scenario, String scenarioDescription) {
		setDescription(scenario, scenarioDescription);
	}

	public void setScenarioOutlineDescription(ScenarioOutline scenarioOutline, String scenarioOutlineDescription) {
		setDescription(scenarioOutline, scenarioOutlineDescription);
	}

	public void setScenarioOutlineTags(ScenarioOutline scenarioOutline, ArrayList<String> scenarioOutlineTags) {
		setTags(scenarioOutline.getTags(), scenarioOutlineTags);
	}

	public void setScenarioTags(Scenario scenario, ArrayList<String> scenarioTags) {
		setTags(scenario.getTags(), scenarioTags);
	}

	private void setTags(EList<Tag> tagList, ArrayList<String> tags) {
		if (!tags.isEmpty()) {
			for (String t : tags) {
				Tag tag = CucumberFactory.eINSTANCE.createTag();
				tag.setName(t);
				tagList.add(tag);
			}
		}
	}
}
