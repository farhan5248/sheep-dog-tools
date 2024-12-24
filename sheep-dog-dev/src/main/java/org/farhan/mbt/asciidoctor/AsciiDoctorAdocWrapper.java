package org.farhan.mbt.asciidoctor;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.impl.RuleCallImpl;
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement;
import org.eclipse.xtext.resource.SaveOptions;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.sheepDog.AbstractScenario;
import org.farhan.mbt.sheepDog.AbstractScenarioTags;
import org.farhan.mbt.sheepDog.Background;
import org.farhan.mbt.sheepDog.Cell;
import org.farhan.mbt.sheepDog.Examples;
import org.farhan.mbt.sheepDog.Feature;
import org.farhan.mbt.sheepDog.FeatureTags;
import org.farhan.mbt.sheepDog.Row;
import org.farhan.mbt.sheepDog.Scenario;
import org.farhan.mbt.sheepDog.SheepDogFactory;
import org.farhan.mbt.sheepDog.Step;

public class AsciiDoctorAdocWrapper implements ConvertibleObject {

	private Feature theFeature;
	private String thePath;

	public AsciiDoctorAdocWrapper(String thePath) {
		this.thePath = thePath;
		String[] pathParts = thePath.split("/");
		theFeature = SheepDogFactory.eINSTANCE.createFeature();
		theFeature.setName(pathParts[pathParts.length - 1].replace(".asciidoc", ""));
	}

	public Background createBackground(String backgroundName) {
		deleteAbstractScenario(backgroundName);
		Background background = SheepDogFactory.eINSTANCE.createBackground();
		background.setName(backgroundName);
		theFeature.getAbstractScenarios().add(background);
		return background;
	}

	private void deleteAbstractScenario(String name) {
		EList<AbstractScenario> list = theFeature.getAbstractScenarios();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().contentEquals(name)) {
				list.remove(i);
				return;
			}
		}
	}

	public void createDocString(Step step, String docString) {
		step.setTheDocString(SheepDogFactory.eINSTANCE.createDocString());
		for (String l : docString.split("\n")) {
			step.getTheDocString().getLines().add(l + "\n");
		}
	}

	public Examples createExamples(Scenario abstractScenario, String examplesName) {
		Examples examples = SheepDogFactory.eINSTANCE.createExamples();
		examples.setName(examplesName);
		abstractScenario.getExamples().add(examples);
		return examples;
	}

	public void createExamplesRow(Examples examples, ArrayList<String> examplesRow) {
		Row row = SheepDogFactory.eINSTANCE.createRow();
		for (String srcCell : examplesRow) {
			Cell cell = SheepDogFactory.eINSTANCE.createCell();
			cell.setName(srcCell);
			row.getCells().add(cell);
		}
		examples.getTheExamplesTable().getRows().add(row);
	}

	public void createExamplesTable(Examples examples, ArrayList<String> headers) {
		examples.setTheExamplesTable(SheepDogFactory.eINSTANCE.createTable());
		Row row = SheepDogFactory.eINSTANCE.createRow();
		for (String srcCell : headers) {
			Cell cell = SheepDogFactory.eINSTANCE.createCell();
			cell.setName(srcCell);
			row.getCells().add(cell);
		}
		examples.getTheExamplesTable().getRows().add(row);
	}

	public Scenario createScenario(String scenarioName) {
		deleteAbstractScenario(scenarioName);
		Scenario scenario = SheepDogFactory.eINSTANCE.createScenario();
		scenario.setName(scenarioName);
		theFeature.getAbstractScenarios().add(scenario);
		return scenario;
	}

	// TODO duplicate of createScenario
	public Scenario createScenarioOutline(String scenarioName) {
		deleteAbstractScenario(scenarioName);
		Scenario scenario = SheepDogFactory.eINSTANCE.createScenario();
		scenario.setName(scenarioName);
		theFeature.getAbstractScenarios().add(scenario);
		return scenario;
	}

	public Step createStep(AbstractScenario abstractScenario, String name) {
		String keyword = name.split(" ")[0];
		Step step = null;
		switch (keyword) {
		case "Given":
			step = SheepDogFactory.eINSTANCE.createGiven();
			break;
		case "When":
			step = SheepDogFactory.eINSTANCE.createWhen();
			break;
		case "Then":
			step = SheepDogFactory.eINSTANCE.createThen();
			break;
		case "And":
			step = SheepDogFactory.eINSTANCE.createAnd();
			break;
		}
		step.setName(name.substring(keyword.length() + 1));
		abstractScenario.getSteps().add(step);
		return step;
	}

	public void createStepTable(Step step, ArrayList<ArrayList<String>> stepTableRowList) {
		step.setTheStepTable(SheepDogFactory.eINSTANCE.createTable());
		for (ArrayList<String> srcRow : stepTableRowList) {
			Row row = SheepDogFactory.eINSTANCE.createRow();
			for (String srcCell : srcRow) {
				Cell cell = SheepDogFactory.eINSTANCE.createCell();
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

	public ArrayList<String> getAbstractScenarioTags(AbstractScenario abstractScenario) {
		AbstractScenarioTags tags = abstractScenario.getTags();
		if (tags != null) {
			return getTags(tags.getName());
		} else {
			return new ArrayList<String>();
		}
	}

	public String getBackgroundDescription(AbstractScenario abstractScenario) {
		return convertStatementsToString(abstractScenario.getStatements());
	}

	public String getBackgroundName(AbstractScenario abstractScenario) {
		return abstractScenario.getName();
	}

	public String getDocString(Step step) {
		String text = "";
		for (String l : step.getTheDocString().getLines()) {
			text += l;
		}
		return text;
	}

	public EList<Examples> getExamplesList(AbstractScenario abstractScenario) {
		return ((Scenario) abstractScenario).getExamples();
	}

	public String getExamplesName(Examples examples) {
		return examples.getName();
	}

	public ArrayList<Row> getExamplesRowList(Examples examples) {
		ArrayList<Row> body = new ArrayList<Row>();
		body.addAll(examples.getTheExamplesTable().getRows());
		body.remove(0);
		return body;
	}

	public ArrayList<String> getExamplesRow(Examples examples, Row examplesRow) {
		ArrayList<String> row = new ArrayList<String>();
		EList<Cell> header = examples.getTheExamplesTable().getRows().getFirst().getCells();
		for (int i = 0; i < header.size(); i++) {
			row.add(examplesRow.getCells().get(i).getName());
		}
		return row;
	}

	public ArrayList<String> getExamplesTable(Examples examples) {
		ArrayList<String> header = new ArrayList<String>();
		for (Cell c : examples.getTheExamplesTable().getRows().getFirst().getCells()) {
			header.add(c.getName());
		}
		return header;
	}

	public String getFeatureName() {
		return theFeature.getName();
	}

	public ArrayList<String> getFeatureTags() {
		FeatureTags tags = theFeature.getTags();
		if (tags != null) {
			return getTags(tags.getName());
		} else {
			return new ArrayList<String>();
		}
	}

	private ArrayList<String> getTags(String tagList) {
		ArrayList<String> tags = new ArrayList<String>();
		if (tagList != null) {
			for (String t : tagList.split(",")) {
				tags.add(t);
			}
		}
		return tags;
	}

	@Override
	public String getPath() {
		return thePath;
	}

	public String getScenarioDescription(AbstractScenario scenario) {
		return convertStatementsToString(scenario.getStatements());
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
		AbstractScenarioTags tags = abstractScenario.getTags();
		if (tags != null) {
			return getTags(tags.getName());
		} else {
			return new ArrayList<String>();
		}
	}

	public ArrayList<String> getScenarioTags(AbstractScenario scenario) {
		AbstractScenarioTags tags = scenario.getTags();
		if (tags != null) {
			return getTags(tags.getName());
		} else {
			return new ArrayList<String>();
		}
	}

	public String getStep(Step step) {
		CompositeNodeWithSemanticElement keyword = (CompositeNodeWithSemanticElement) step.eAdapters().getFirst();
		RuleCallImpl rc = (RuleCallImpl) keyword.getGrammarElement();
		String keywordString = rc.getRule().getName();
		return keywordString + " " + step.getName();
	}

	public EList<Step> getStepList(AbstractScenario abstractScenario) {
		return abstractScenario.getSteps();
	}

	public ArrayList<ArrayList<String>> getStepTable(Step step) {
		ArrayList<ArrayList<String>> stepTableRowList = new ArrayList<ArrayList<String>>();
		ArrayList<String> row;
		for (Row r : step.getTheStepTable().getRows()) {
			row = new ArrayList<String>();
			for (Cell c : r.getCells()) {
				row.add(c.getName());
			}
			stepTableRowList.add(row);
		}
		return stepTableRowList;
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
		if (abstractScenario instanceof Scenario) {
			return !((Scenario) abstractScenario).getExamples().isEmpty();
		}
		return false;
	}

	public void setBackgroundDescription(Background background, String backgroundDescription) {
		setDescription(background, backgroundDescription);
	}

	// TODO duplicate of setFeatureDescription?
	private void setDescription(AbstractScenario abstractScenario, String scenarioDescription) {
		if (!scenarioDescription.isEmpty()) {
			for (String line : scenarioDescription.split("\n")) {
				abstractScenario.getStatements().add(line + "\n");
			}
		}
	}

	public String getFeatureDescription() {
		return convertStatementsToString(theFeature.getStatements());
	}

	private String convertStatementsToString(EList<String> eList) {
		String contents = "";
		for (String s : eList) {
			contents += s;
		}
		return contents.trim();
	}

	public void setFeatureDescription(String featureDescription) {
		if (!featureDescription.isEmpty()) {
			theFeature.getStatements().clear();
			for (String line : featureDescription.split("\n")) {
				theFeature.getStatements().add(line + "\n");
			}
		}
	}

	@Override
	public void parse(String text) throws Exception {
		if (text.isEmpty()) {
			return;
		}
		URI uri = URI.createFileURI(thePath);
		Resource resource = new ResourceSetImpl().createResource(uri);
		InputStream content = new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8));
		resource.load(content, Collections.EMPTY_MAP);
		theFeature = (Feature) resource.getContents().get(0);
	}

	private String substitute(String text) {
		return text.replace("&#8217;", "'").replace("|", "\\|");
	}

	public String toString() {
		URI uri = URI.createFileURI(thePath);
		Resource resource = new ResourceSetImpl().createResource(uri);
		resource.getContents().add(theFeature);
		Map<Object, Object> options = SaveOptions.newBuilder().format().getOptions().toOptionsMap();
		OutputStream os = new ByteArrayOutputStream();
		try {
			resource.save(os, options);
		} catch (IOException e) {
			return null;
		}
		return os.toString();
	}

	public void setFeatureName(String featureName) {
		theFeature.setName(featureName);
	}

	public void setFeatureTags(ArrayList<String> tags) {
		if (tags.isEmpty()) {
			return;
		}
		theFeature.setTags(SheepDogFactory.eINSTANCE.createFeatureTags());
		String tagList = "";
		for (String t : tags) {
			tagList += "," + t;
		}
		tagList = tagList.replaceFirst(",", "");
		theFeature.getTags().setName(tagList);
	}

	public void setScenarioDescription(Scenario scenario, String scenarioDescription) {
		setDescription(scenario, scenarioDescription);
	}

	public void setScenarioOutlineDescription(Scenario scenarioOutline, String scenarioOutlineDescription) {
		setDescription(scenarioOutline, scenarioOutlineDescription);
	}

	public void setScenarioOutlineTags(Scenario scenarioOutline, ArrayList<String> scenarioOutlineTags) {
		setTags(scenarioOutline, scenarioOutlineTags);
	}

	public void setScenarioTags(Scenario scenario, ArrayList<String> scenarioTags) {
		setTags(scenario, scenarioTags);
	}

	// TODO perhaps duplicate of setFeatureTags?
	private void setTags(Scenario scenario, ArrayList<String> tags) {
		if (tags.isEmpty()) {
			return;
		}
		scenario.setTags(SheepDogFactory.eINSTANCE.createAbstractScenarioTags());
		String tagList = "";
		for (String t : tags) {
			tagList += "," + t;
		}
		tagList = tagList.replaceFirst(",", "");
		scenario.getTags().setName(tagList);
	}

	private String listAsCsv(ArrayList<String> list) {
		String csv = "";
		for (String listItem : list) {
			csv += "," + listItem;
		}
		return csv.replaceFirst(",", "");
	}
}
