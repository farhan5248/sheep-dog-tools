package org.farhan.mbt.convert;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import org.asciidoctor.ast.Section;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.farhan.mbt.asciidoctor.AsciiDoctorAdocWrapper;
import org.farhan.mbt.core.ConvertToDocument;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.asciidoctor.AsciiDoctorProject;
import org.farhan.mbt.uml.UMLClassWrapper;
import org.farhan.mbt.uml.UMLProject;

public class ConvertUMLToAsciidoctor extends ConvertToDocument {

	private UMLClassWrapper srcObj;

	private UMLProject srcPrj;

	private AsciiDoctorAdocWrapper tgtObj;

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
		Section background = tgtObj.createBackground();
		tgtObj.setBackgroundName(background, srcObj.getBackgroundName(abstractScenario));
		tgtObj.setBackgroundDescription(background, srcObj.getBackgroundDescription(abstractScenario));
		convertStepList(background, srcObj.getStepList(abstractScenario), new HashMap<String, String>());
		tgtObj.addBackground(background);
	}

	private void convertStepTable(Section step, Message stepSrc, HashMap<String, String> examplesRow) {
		tgtObj.createStepTable(step, srcObj.getStepTable(stepSrc));
	}

	private void convertDocString(Section step, Message stepSrc) {
		tgtObj.createDocString(step, srcObj.getDocString(stepSrc));
	}

	private void convertExamples(Section abstractScenario, EAnnotation examplesSrc) {

		Section examples = tgtObj.createExamples(abstractScenario);
		tgtObj.setExamplesName(examples, srcObj.getExamplesName(examplesSrc));
		tgtObj.createExamplesTable(examples, srcObj.getExamplesTable(examplesSrc));
		for (HashMap<String, String> examplesRow : srcObj.getExamplesRowList(examplesSrc)) {
			convertExamplesRow(examples, examplesRow);
		}
	}

	private void convertExamplesRow(Section examples, HashMap<String, String> examplesRow) {
		tgtObj.createExamplesRow(examples, examplesRow);
	}

	@Override
	protected void convertFeature(ConvertibleObject anObject) throws Exception {
		srcObj = (UMLClassWrapper) anObject;
		tgtObj = (AsciiDoctorAdocWrapper) tgtPrj.createObject(convertObjectName(srcObj.getQualifiedName()));
		tgtObj.setFeatureName(srcObj.getFeatureName());
		tgtObj.setFeatureTags(srcObj.getFeatureTags());
		tgtObj.setFeatureDescription(srcObj.getFeatureDescription());
		convertAbstractScenarioList();
	}

	protected String convertObjectName(String fullName) {
		String pathName = fullName;
		pathName = pathName.replace("pst::" + tgtPrj.FIRST_LAYER, tgtPrj.getDir(tgtPrj.FIRST_LAYER).getAbsolutePath());
		pathName = pathName.replace("::", File.separator);
		pathName = pathName + tgtPrj.getFileExt(tgtPrj.FIRST_LAYER);
		return pathName;
	}

	private String convertObjectName(String name, String layer) {
		String qualifiedName = name.replace(",", "");
		qualifiedName = qualifiedName.replace(srcPrj.getFileExt(layer), "");
		qualifiedName = qualifiedName.replace(srcPrj.getDir(layer).getAbsolutePath() + File.separator, "");
		qualifiedName = tgtPrj.getDir(layer) + File.separator + qualifiedName + tgtPrj.getFileExt(layer);
		return qualifiedName;
	}

	private void convertScenario(Interaction abstractScenario) {
		Section scenario = tgtObj.createScenario();
		tgtObj.setScenarioTags(scenario, srcObj.getScenarioTags(abstractScenario));
		tgtObj.setScenarioName(scenario, srcObj.getScenarioName(abstractScenario));
		tgtObj.setScenarioDescription(scenario, srcObj.getScenarioDescription(abstractScenario));
		convertStepList(scenario, srcObj.getStepList(abstractScenario), new HashMap<String, String>());
		tgtObj.addScenario(scenario);
	}

	private void convertScenarioOutline(Interaction abstractScenario) {

		Section scenarioOutline = tgtObj.createScenarioOutline();
		tgtObj.setScenarioOutlineTags(scenarioOutline, srcObj.getScenarioOutlineTags(abstractScenario));
		tgtObj.setScenarioOutlineName(scenarioOutline, srcObj.getScenarioOutlineName(abstractScenario));
		tgtObj.setScenarioOutlineDescription(scenarioOutline, srcObj.getScenarioOutlineDescription(abstractScenario));
		convertStepList(scenarioOutline, srcObj.getStepList(abstractScenario), new HashMap<String, String>());

		ArrayList<EAnnotation> examplesList = srcObj.getExamplesList(abstractScenario);
		for (EAnnotation examples : examplesList) {
			convertExamples(scenarioOutline, examples);
		}
		tgtObj.addScenarioOutline(scenarioOutline);
	}

	private void convertStep(Section abstractScenario, Message stepSrc) {
		Section step = tgtObj.createStep(abstractScenario, srcObj.getStep(stepSrc));
		if (srcObj.hasDocString(stepSrc)) {
			convertDocString(step, stepSrc);
		} else if (srcObj.hasStepTable(stepSrc)) {
			convertStepTable(step, stepSrc, null);
		}
	}

	private void convertStepList(Section abstractScenario, ArrayList<Message> stepList,
			HashMap<String, String> examplesRow) {
		for (Message step : stepList) {
			convertStep(abstractScenario, step);
		}
	}

	@Override
	protected ArrayList<ConvertibleObject> getFeatures(String layer) {
		return srcPrj.getObjects(layer);
	}

	@Override
	protected void initProjects() throws Exception {
		srcPrj = new UMLProject();
		tgtPrj = new AsciiDoctorProject();
	}

	@Override
	protected void save() throws Exception {
		tgtPrj.save();
	}

	@Override
	protected void loadFeatures() throws Exception {
		srcPrj.load();
	}
}
