package org.farhan.mbt.asciidoctor;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;

import org.asciidoctor.Options;
import org.asciidoctor.Asciidoctor.Factory;
import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.Section;
import org.asciidoctor.ast.StructuralNode;
import org.asciidoctor.jruby.extension.internal.JRubyProcessor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.impl.RuleCallImpl;
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement;
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

	private JRubyProcessor jrp;
	private Document theDoc;
	private Feature theFeature;
	private String thePath;

	public AsciiDoctorAdocWrapper(String thePath) {
		this.thePath = thePath;
		String[] pathParts = thePath.split("/");
		theFeature = SheepDogFactory.eINSTANCE.createFeature();
		theFeature.setName(pathParts[pathParts.length - 1].replace(".asciidoc", ""));
		theDoc = Factory.create().load("= " + pathParts[pathParts.length - 1], Options.builder().build());
		jrp = new JRubyProcessor();
	}

	public Section createBackground(String name) {
		Section background = jrp.createSection(theDoc);
		background.getAttributes().put("background", "true");
		background.setTitle(name);
		theDoc.getBlocks().add(background);
		return background;
	}

	public void createDocString(Section step, String content) {
		Block docString = jrp.createBlock(step, "listing", "");
		step.getBlocks().add(docString);
		docString.setSource(content);
	}

	public Section createExamples(Section scenarioOutline, String examplesName) {
		Section examples = jrp.createSection(scenarioOutline);
		examples.getAttributes().put("examples", "true");
		examples.setTitle(examplesName);
		scenarioOutline.getBlocks().add(examples);
		return examples;
	}

	public void createExamplesRow(Section examples, ArrayList<String> examplesRow) {

	}

	public void createExamplesTable(Section examples, ArrayList<String> headers) {

	}

	public Section createScenario(String scenarioName) {
		Section scenario = jrp.createSection(theDoc);
		scenario.setTitle(scenarioName);
		theDoc.getBlocks().add(scenario);
		return scenario;
	}

	public Section createScenarioOutline(String scenarioName) {
		Section scenarioOutline = jrp.createSection(theDoc);
		scenarioOutline.setTitle(scenarioName);
		theDoc.getBlocks().add(scenarioOutline);
		return scenarioOutline;
	}

	public Section createStep(Section abstractScenario, String stepName) {
		Section step = jrp.createSection(abstractScenario);
		step.setTitle(stepName);
		abstractScenario.getBlocks().add(step);
		return step;
	}

	public void createStepTable(Section step, ArrayList<ArrayList<String>> stepTableRowList) {

	}

	@Override
	public Object get() {
		return theDoc;
	}

	public String getAbstractScenarioDescription(StructuralNode testCaseOrTestSuite) {
		String text = "";
		for (StructuralNode sn : testCaseOrTestSuite.getBlocks()) {
			if (sn instanceof Block) {
				text += "\n\n" + ((Block) sn).getSource();
			} else {
				break;
			}
		}
		return text.trim();
	}

	public EList<AbstractScenario> getAbstractScenarioList() {
		return theFeature.getAbstractScenarios();
	}

	public String getAbstractScenarioName(Section abstractScenario) {
		return substitute(abstractScenario.getTitle());
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
			if (l != null) {
				text += "\n" + l;
			} else {
				text += "\n";
			}
		}
		return text.replaceFirst("\n", "");
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

	public void setBackgroundDescription(Section background, String backgroundDescription) {
		background.getBlocks().add(jrp.createBlock(background, "paragraph", backgroundDescription));
	}

	public void setBackgroundName(Section background, String name) {
		background.setTitle(name);
	}

	public void setExamplesName(Section examples, String examplesName) {
		examples.setTitle(examplesName);
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
		StructuralNode preamble = jrp.createBlock(theDoc, "preamble", "");
		theDoc.getBlocks().add(preamble);
		Block paragraph = jrp.createBlock(preamble, "paragraph", featureDescription);
		preamble.getBlocks().add(paragraph);
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

		return "";
	}

	public void setFeatureName(String featureName) {
		theDoc.setTitle(featureName);
	}

	public void setFeatureTags(ArrayList<String> featureTags) {
		if (!featureTags.isEmpty()) {
			theDoc.getAttributes().put("tags", listAsCsv(featureTags));
		}
	}

	public void setScenarioDescription(Section scenario, String scenarioDescription) {
		scenario.getBlocks().add(jrp.createBlock(scenario, "paragraph", scenarioDescription));
	}

	public void setScenarioName(Section scenario, String scenarioName) {
		scenario.setTitle(scenarioName);
	}

	public void setScenarioOutlineDescription(Section scenarioOutline, String scenarioOutlineDescription) {
		scenarioOutline.getBlocks().add(jrp.createBlock(scenarioOutline, "paragraph", scenarioOutlineDescription));
	}

	public void setScenarioOutlineName(Section scenarioOutline, String scenarioOutlineName) {
		scenarioOutline.setTitle(scenarioOutlineName);
	}

	public void setScenarioOutlineTags(Section scenarioOutline, ArrayList<String> scenarioOutlineTags) {
		if (!scenarioOutlineTags.isEmpty()) {
			scenarioOutline.getAttributes().put("tags", listAsCsv(scenarioOutlineTags));
		}
	}

	public void setScenarioTags(Section scenario, ArrayList<String> scenarioTags) {
		if (!scenarioTags.isEmpty()) {
			scenario.getAttributes().put("tags", listAsCsv(scenarioTags));
		}
	}

	private String listAsCsv(ArrayList<String> list) {
		String csv = "";
		for (String listItem : list) {
			csv += "," + listItem;
		}
		return csv.replaceFirst(",", "");
	}
}
