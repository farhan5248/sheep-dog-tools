package org.farhan.mbt.convert;

import java.io.File;
import java.util.ArrayList;
import org.asciidoctor.ast.Section;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.farhan.mbt.uml.UMLClassWrapper;
import org.farhan.mbt.uml.UMLProject;
import org.farhan.mbt.asciidoctor.AsciiDoctorAdocWrapper;
import org.farhan.mbt.asciidoctor.AsciiDoctorProject;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.MojoGoal;

public class ConvertAsciidoctorToUML extends MojoGoal {

	private AsciiDoctorAdocWrapper srcObj;
	private AsciiDoctorProject srcPrj;
	private UMLClassWrapper tgtObj;
	private UMLProject tgtPrj;

	protected void convertAbstractScenarioList() throws Exception {
		for (Section abstractScenario : srcObj.getAbstractScenarioList()) {
			if (srcObj.isBackground(abstractScenario)) {
				convertBackground(abstractScenario);
			} else if (srcObj.isScenarioOutline(abstractScenario)) {
				convertScenarioOutline(abstractScenario);
			} else {
				convertScenario(abstractScenario);
			}
		}
	}

	private void convertBackground(Section abstractScenario) {
		Interaction background = tgtObj.createBackground(srcObj.getBackgroundName(abstractScenario));
		tgtObj.setBackgroundDescription(background, srcObj.getBackgroundDescription(abstractScenario));
		convertStepList(background, srcObj.getStepList(abstractScenario));
		tgtObj.addBackground(background);
	}

	private void convertDocString(Message step, Section stepSrc) {
		tgtObj.createDocString(step, srcObj.getDocString(stepSrc));
	}

	private void convertExamples(Interaction abstractScenario, Section examplesSrc) {
		EAnnotation examples = tgtObj.createExamples(abstractScenario, srcObj.getExamplesName(examplesSrc));
		tgtObj.createExamplesTable(examples, srcObj.getExamplesTable(examplesSrc));
		for (ArrayList<String> examplesRow : srcObj.getExamplesRowList(examplesSrc)) {
			convertExamplesRow(examples, examplesRow);
		}
	}

	private void convertExamplesRow(EAnnotation examples, ArrayList<String> examplesRow) {
		tgtObj.createExamplesRow(examples, examplesRow);
	}

	@Override
	protected void convertFeature(ConvertibleObject theObject) throws Exception {
		srcObj = (AsciiDoctorAdocWrapper) theObject;
		tgtObj = (UMLClassWrapper) tgtPrj.createObject(convertFeatureName(srcObj.getFile().getAbsolutePath()));
		tgtObj.setFeatureName(srcObj.getFeatureName());
		tgtObj.setFeatureTags(srcObj.getFeatureTags());
		tgtObj.setFeatureDescription(srcObj.getFeatureDescription());
		convertAbstractScenarioList();
	}

	protected String convertFeatureName(String fullName) {
		String qualifiedName = fullName.replace(",", "").trim();
		qualifiedName = qualifiedName.replace(srcPrj.getFileExt(ConvertibleProject.FIRST_LAYER), "");
		qualifiedName = qualifiedName.replace(srcPrj.getDir(ConvertibleProject.FIRST_LAYER).getAbsolutePath(), "");
		qualifiedName = qualifiedName.replace(File.separator, "::");
		qualifiedName = "pst::" + ConvertibleProject.FIRST_LAYER + qualifiedName;
		return qualifiedName;
	}

	private void convertScenario(Section abstractScenario) {
		Interaction scenario = tgtObj.createScenario(srcObj.getScenarioName(abstractScenario));
		tgtObj.setScenarioTags(scenario, srcObj.getScenarioTags(abstractScenario));
		tgtObj.setScenarioDescription(scenario, srcObj.getScenarioDescription(abstractScenario));
		convertStepList(scenario, srcObj.getStepList(abstractScenario));
		tgtObj.addScenario(scenario);
	}

	private void convertScenarioOutline(Section abstractScenario) {

		Interaction scenarioOutline = tgtObj.createScenarioOutline(srcObj.getScenarioOutlineName(abstractScenario));
		tgtObj.setScenarioOutlineTags(scenarioOutline, srcObj.getScenarioOutlineTags(abstractScenario));
		tgtObj.setScenarioOutlineDescription(scenarioOutline, srcObj.getScenarioOutlineDescription(abstractScenario));
		convertStepList(scenarioOutline, srcObj.getStepList(abstractScenario));
		tgtObj.addScenarioOutline(scenarioOutline);

		ArrayList<Section> examplesList = srcObj.getExamplesList(abstractScenario);
		for (Section examples : examplesList) {
			convertExamples(scenarioOutline, examples);
		}
	}

	private void convertStep(Interaction abstractScenario, Section stepSrc) {
		Message step = tgtObj.createStep(abstractScenario, srcObj.getStep(stepSrc));
		if (srcObj.hasDocString(stepSrc)) {
			convertDocString(step, stepSrc);
		} else if (srcObj.hasStepTable(stepSrc)) {
			convertStepTable(step, stepSrc);
		}
	}

	private void convertStepList(Interaction abstractScenario, ArrayList<Section> stepList) {
		for (Section step : stepList) {
			convertStep(abstractScenario, step);
		}
	}

	private void convertStepTable(Message step, Section stepSrc) {
		tgtObj.createStepTable(step, srcObj.getStepTable(stepSrc));
	}

	@Override
	protected ArrayList<ConvertibleObject> getFeatures(String layer) {
		return srcPrj.getObjects(layer);
	}

	@Override
	public void initProjects() throws Exception {
		srcPrj = new AsciiDoctorProject();
		tgtPrj = new UMLProject();
	}

	@Override
	protected void loadFeatures() throws Exception {
		srcPrj.load();
	}

	@Override
	public void save() throws Exception {
		tgtPrj.save();
	}

}
