package org.farhan.mbt.convert;

import java.util.ArrayList;

import org.asciidoctor.ast.Section;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.farhan.mbt.asciidoctor.AsciiDoctorAdocWrapper;
import org.farhan.mbt.asciidoctor.AsciiDoctorProject;
import org.farhan.mbt.core.ObjectRepository;
import org.farhan.mbt.core.UMLClassWrapper;
import org.farhan.mbt.core.UMLModel;
import org.farhan.mbt.core.Converter;

public class ConvertUMLToAsciidoctor extends Converter {

	private UMLClassWrapper srcObj;

	private AsciiDoctorAdocWrapper tgtObj;

	public ConvertUMLToAsciidoctor(String tags, ObjectRepository fa) {
		super(tags, fa);
	}

	protected void convertAbstractScenarioList() throws Exception {
		for (Interaction abstractScenario : srcObj.getAbstractScenarioList()) {
			if (srcObj.isBackground(abstractScenario)) {
				convertBackground(abstractScenario);
			} else if (srcObj.isScenarioOutline(abstractScenario)) {
				convertScenarioOutline(abstractScenario);
			} else {
				convertScenario(abstractScenario);
			}
		}
	}

	private void convertBackground(Interaction abstractScenario) {
		Section background = tgtObj.createBackground(srcObj.getBackgroundName(abstractScenario));
		tgtObj.setBackgroundDescription(background, srcObj.getBackgroundDescription(abstractScenario));
		convertStepList(background, srcObj.getStepList(abstractScenario));
	}

	private void convertDocString(Section step, Message stepSrc) {
		tgtObj.createDocString(step, srcObj.getDocString(stepSrc));
	}

	private void convertExamples(Section abstractScenario, EAnnotation examplesSrc) {

		Section examples = tgtObj.createExamples(abstractScenario, srcObj.getExamplesName(examplesSrc));
		tgtObj.createExamplesTable(examples, srcObj.getExamplesTable(examplesSrc));
		for (ArrayList<String> examplesRow : srcObj.getExamplesRowList(examplesSrc)) {
			convertExamplesRow(examples, examplesRow);
		}
	}

	private void convertExamplesRow(Section examples, ArrayList<String> examplesRow) {
		tgtObj.createExamplesRow(examples, examplesRow);
	}

	@Override
	public String convertObject(String path, String content) throws Exception {
		initProjects();
		srcObj = (UMLClassWrapper) model.createObject(findQualifiedName(path));

		tgtObj = (AsciiDoctorAdocWrapper) project.createObject(path);
		tgtObj.parse(content);

		tgtObj.setFeatureName(srcObj.getFeatureName());
		tgtObj.setFeatureTags(srcObj.getFeatureTags());
		tgtObj.setFeatureDescription(srcObj.getFeatureDescription());
		convertAbstractScenarioList();
		return tgtObj.toString();
	}

	private void convertScenario(Interaction abstractScenario) {
		Section scenario = tgtObj.createScenario(srcObj.getScenarioName(abstractScenario));
		tgtObj.setScenarioTags(scenario, srcObj.getScenarioTags(abstractScenario));
		tgtObj.setScenarioDescription(scenario, srcObj.getScenarioDescription(abstractScenario));
		convertStepList(scenario, srcObj.getStepList(abstractScenario));
	}

	private void convertScenarioOutline(Interaction abstractScenario) {

		Section scenarioOutline = tgtObj.createScenarioOutline(srcObj.getScenarioOutlineName(abstractScenario));
		tgtObj.setScenarioOutlineTags(scenarioOutline, srcObj.getScenarioOutlineTags(abstractScenario));
		tgtObj.setScenarioOutlineDescription(scenarioOutline, srcObj.getScenarioOutlineDescription(abstractScenario));
		convertStepList(scenarioOutline, srcObj.getStepList(abstractScenario));

		ArrayList<EAnnotation> examplesList = srcObj.getExamplesList(abstractScenario);
		for (EAnnotation examples : examplesList) {
			convertExamples(scenarioOutline, examples);
		}
	}

	private void convertStep(Section abstractScenario, Message stepSrc) {
		Section step = tgtObj.createStep(abstractScenario, srcObj.getStep(stepSrc));
		if (srcObj.hasDocString(stepSrc)) {
			convertDocString(step, stepSrc);
		} else if (srcObj.hasStepTable(stepSrc)) {
			convertStepTable(step, stepSrc);
		}
	}

	private void convertStepList(Section abstractScenario, ArrayList<Message> stepList) {
		for (Message step : stepList) {
			convertStep(abstractScenario, step);
		}
	}

	private void convertStepTable(Section step, Message stepSrc) {
		tgtObj.createStepTable(step, srcObj.getStepTable(stepSrc));
	}

	protected void initProjects() throws Exception {
		model = new UMLModel(this.tags, this.fa);
		model.init();
		project = new AsciiDoctorProject(this.tags, this.fa);
		project.init();
	}
}
