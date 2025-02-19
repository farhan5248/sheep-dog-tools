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
import org.farhan.mbt.sheepDog.Statement;
import org.farhan.mbt.sheepDog.Step;
import org.farhan.mbt.sheepDog.StepDefinition;
import org.farhan.mbt.sheepDog.StepObject;
import org.farhan.mbt.sheepDog.StepParameters;

public class AsciiDoctorAdocWrapper implements ConvertibleObject {

	private Feature theFeature;
	private StepObject theStepObject;
	private String thePath;

	public AsciiDoctorAdocWrapper(String thePath) {
		this.thePath = thePath;
		// TODO don't assume it's a feature, it could be a StepObject. Mimic the Java
		// Wrapper and how it handles interfaces vs classes. There's currently no code
		// for UML to Asciidoctor.
		String[] pathParts = thePath.split("/");
		String name = pathParts[pathParts.length - 1].replace(".asciidoc", "");
		if (isStepDef()) {
			theStepObject = SheepDogFactory.eINSTANCE.createStepObject();
			theStepObject.setName(name);
		} else {
			theFeature = SheepDogFactory.eINSTANCE.createFeature();
			theFeature.setName(name);
		}
	}

	private String convertStatementsToString(EList<Statement> statements) {
		String contents = "";
		for (Statement s : statements) {
			contents += s.getName() + "\n";
		}
		return contents.trim();
	}

	public Background createBackground(String backgroundName) {
		deleteAbstractScenario(backgroundName);
		Background background = SheepDogFactory.eINSTANCE.createBackground();
		background.setName(backgroundName);
		theFeature.getAbstractScenarios().add(background);
		return background;
	}

	public void createDocString(Step step, String docString) {
		step.setTheDocString(SheepDogFactory.eINSTANCE.createDocString());
		step.getTheDocString().setName("----\n" + docString.replace("----", "\\----") + "\n----");
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

	public Scenario createScenarioOutline(String scenarioName) {
		return createScenario(scenarioName);
	}

	public Step createStep(AbstractScenario abstractScenario, String name) {
		String keyword = name.split(" ")[0];
		Step step = null;
		switch (keyword) {
		case "Given:":
			step = SheepDogFactory.eINSTANCE.createGiven();
			break;
		case "When:":
			step = SheepDogFactory.eINSTANCE.createWhen();
			break;
		case "Then:":
			step = SheepDogFactory.eINSTANCE.createThen();
			break;
		case "And:":
			step = SheepDogFactory.eINSTANCE.createAnd();
			break;
		}
		step.setName(name.substring(keyword.length() + 1));
		abstractScenario.getSteps().add(step);
		return step;
	}

	public StepDefinition createStepDefinition(String stepDefinitionName) {
		deleteStepDefinition(stepDefinitionName);
		StepDefinition stepDefinition = SheepDogFactory.eINSTANCE.createStepDefinition();
		stepDefinition.setName(stepDefinitionName);
		theStepObject.getStepDefinitions().add(stepDefinition);
		return stepDefinition;
	}

	public StepParameters createStepParameters(StepDefinition stepDefinition, String stepParametersName) {
		StepParameters stepParameters = SheepDogFactory.eINSTANCE.createStepParameters();
		stepParameters.setName(stepParametersName);
		stepDefinition.getStepParameters().add(stepParameters);
		return stepParameters;
	}

	public void createStepParametersRow(StepParameters stepParameters, ArrayList<String> stepParametersRow) {
		Row row = SheepDogFactory.eINSTANCE.createRow();
		for (String srcCell : stepParametersRow) {
			Cell cell = SheepDogFactory.eINSTANCE.createCell();
			cell.setName(srcCell);
			row.getCells().add(cell);
		}
		stepParameters.getParametersTable().getRows().add(row);
	}

	public void createStepParametersTable(StepParameters stepParameters, ArrayList<String> headers) {
		stepParameters.setParametersTable(SheepDogFactory.eINSTANCE.createTable());
		Row row = SheepDogFactory.eINSTANCE.createRow();
		for (String srcCell : headers) {
			Cell cell = SheepDogFactory.eINSTANCE.createCell();
			cell.setName(srcCell);
			row.getCells().add(cell);
		}
		stepParameters.getParametersTable().getRows().add(row);
	}

	public void createStepTable(Step step, ArrayList<ArrayList<String>> stepTableRowList) {
		step.setTheStepTable(SheepDogFactory.eINSTANCE.createTable());
		for (ArrayList<String> srcRow : stepTableRowList) {
			Row row = SheepDogFactory.eINSTANCE.createRow();
			for (String srcCell : srcRow) {
				Cell cell = SheepDogFactory.eINSTANCE.createCell();
				srcCell = srcCell.replace("<", "{").replace(">", "}");
				cell.setName(srcCell);
				row.getCells().add(cell);
			}
			step.getTheStepTable().getRows().add(row);
		}
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

	private void deleteStepDefinition(String name) {
		EList<StepDefinition> list = theStepObject.getStepDefinitions();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().contentEquals(name)) {
				list.remove(i);
				return;
			}
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
		return step.getTheDocString().getName().replaceFirst("^----\n", "").replaceFirst("\n----$", "")
				.replace("\\----", "----");
	}

	public EList<Examples> getExamplesList(AbstractScenario abstractScenario) {
		return ((Scenario) abstractScenario).getExamples();
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
		FeatureTags tags = theFeature.getTags();
		if (tags != null) {
			return getTags(tags.getName());
		} else {
			return new ArrayList<String>();
		}
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

	public String getStep(Step step) {
		CompositeNodeWithSemanticElement keyword = (CompositeNodeWithSemanticElement) step.eAdapters().getFirst();
		RuleCallImpl rc = (RuleCallImpl) keyword.getGrammarElement();
		String keywordString = rc.getRule().getName();
		return keywordString + ": " + step.getName();
	}

	public String getStepDefinitionDescription(StepDefinition stepDefinitionSrc) {
		return convertStatementsToString(stepDefinitionSrc.getStatements());
	}

	public EList<StepDefinition> getStepDefinitionList() {
		return theStepObject.getStepDefinitions();
	}

	public String getStepDefinitionName(StepDefinition stepDefinitionSrc) {
		return stepDefinitionSrc.getName();
	}

	public EList<Step> getStepList(AbstractScenario abstractScenario) {
		return abstractScenario.getSteps();
	}

	public String getStepObjectDescription() {
		return convertStatementsToString(theStepObject.getStatements());
	}

	public String getStepObjectName() {
		return theStepObject.getName();
	}

	public EList<StepParameters> getStepParametersList(StepDefinition stepDefinitionSrc) {
		return stepDefinitionSrc.getStepParameters();
	}

	public String getStepParametersName(StepParameters stepParametersSrc) {
		return stepParametersSrc.getName();
	}

	public ArrayList<String> getStepParametersRow(StepParameters stepParametersSrc, Row parametersRow) {
		ArrayList<String> row = new ArrayList<String>();
		EList<Cell> header = stepParametersSrc.getParametersTable().getRows().getFirst().getCells();
		for (int i = 0; i < header.size(); i++) {
			row.add(parametersRow.getCells().get(i).getName());
		}
		return row;
	}

	public ArrayList<Row> getStepParametersRowList(StepParameters stepParametersSrc) {
		ArrayList<Row> body = new ArrayList<Row>();
		body.addAll(stepParametersSrc.getParametersTable().getRows());
		body.remove(0);
		return body;
	}

	public ArrayList<String> getStepParametersTable(StepParameters stepParametersSrc) {
		ArrayList<String> header = new ArrayList<String>();
		for (Cell c : stepParametersSrc.getParametersTable().getRows().getFirst().getCells()) {
			header.add(c.getName());
		}
		return header;
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

	private ArrayList<String> getTags(String tagList) {
		ArrayList<String> tags = new ArrayList<String>();
		if (tagList != null) {
			for (String t : tagList.replace("\"", "").split(",")) {
				tags.add(t);
			}
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
		if (abstractScenario instanceof Scenario) {
			return !((Scenario) abstractScenario).getExamples().isEmpty();
		}
		return false;
	}

	private boolean isStepDef() {
		if (thePath.startsWith("src/test/resources/asciidoc/stepdefs/")) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void parse(String text) throws Exception {
		try {
			if (text.isEmpty()) {
				return;
			}
			URI uri = URI.createFileURI(thePath);
			Resource resource = new ResourceSetImpl().createResource(uri);
			InputStream content = new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8));
			resource.load(content, Collections.EMPTY_MAP);
			Object o = resource.getContents().get(0);
			if (o instanceof Feature) {
				theFeature = (Feature) resource.getContents().get(0);
			} else {
				theStepObject = (StepObject) resource.getContents().get(0);
			}
		} catch (Exception e) {
			throw new Exception("There was a problem parsing file: " + thePath);
		}
	}

	public void setBackgroundDescription(Background background, String backgroundDescription) {
		setDescription(background, backgroundDescription);
	}

	// TODO duplicate of setFeatureDescription?
	private void setDescription(AbstractScenario abstractScenario, String scenarioDescription) {
		if (!scenarioDescription.isEmpty()) {
			for (String line : scenarioDescription.split("\n")) {
				Statement statement = SheepDogFactory.eINSTANCE.createStatement();
				// TODO test what happens if there's multiple \n, don't assume there's just one.
				// Then create the EOL like Given is created
				statement.setName(line);
				abstractScenario.getStatements().add(statement);
			}
		}
	}

	public void setFeatureDescription(String featureDescription) {
		if (!featureDescription.isEmpty()) {
			theFeature.getStatements().clear();
			for (String line : featureDescription.split("\n")) {
				Statement statement = SheepDogFactory.eINSTANCE.createStatement();
				statement.setName(line);
				theFeature.getStatements().add(statement);
			}
		}
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

	public void setStepDefinitionDescription(StepDefinition stepDefinition, String stepDefinitionDescription) {
		if (!stepDefinitionDescription.isEmpty()) {
			for (String line : stepDefinitionDescription.split("\n")) {
				Statement statement = SheepDogFactory.eINSTANCE.createStatement();
				// TODO test what happens if there's multiple \n, don't assume there's just one.
				// Then create the EOL like Given is created
				statement.setName(line);
				stepDefinition.getStatements().add(statement);
			}
		}
	}

	public void setStepObjectDescription(String stepObjectDescription) {
		if (!stepObjectDescription.isEmpty()) {
			theStepObject.getStatements().clear();
			for (String line : stepObjectDescription.split("\n")) {
				Statement statement = SheepDogFactory.eINSTANCE.createStatement();
				statement.setName(line);
				theStepObject.getStatements().add(statement);
			}
		}
	}

	public void setStepObjectName(String stepObjectName) {
		theStepObject.setName(stepObjectName);
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
		scenario.getTags().setName("\"" + tagList + "\"");
	}

	public String toString() {
		URI uri = URI.createFileURI(thePath);
		Resource resource = new ResourceSetImpl().createResource(uri);
		if (theFeature != null) {
			resource.getContents().add(theFeature);
		} else {
			resource.getContents().add(theStepObject);
		}
		Map<Object, Object> options = SaveOptions.newBuilder().format().getOptions().toOptionsMap();
		OutputStream os = new ByteArrayOutputStream();
		try {
			resource.save(os, options);
		} catch (IOException e) {
			return null;
		}
		return os.toString();
	}

}
