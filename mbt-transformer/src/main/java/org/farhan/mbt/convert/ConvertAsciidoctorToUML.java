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
import org.farhan.mbt.core.ConvertToUML;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.Utilities;

public class ConvertAsciidoctorToUML extends ConvertToUML {

	private AsciiDoctorAdocWrapper srcObj;

	private AsciiDoctorProject srcPrj;

	private UMLClassWrapper tgtObj;

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

	private void convertStepTable(Message step, Section stepSrc) {
		ArrayList<ArrayList<String>> stepTableRowList = srcObj.getStepTable(stepSrc);
		tgtObj.createStepTable(step, stepTableRowList);
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
	protected void convertFeature(ConvertibleObject anObject) throws Exception {
		srcObj = (AsciiDoctorAdocWrapper) anObject;
		tgtObj = (UMLClassWrapper) tgtPrj.createObject(convertObjectName(srcObj.getFile().getAbsolutePath()));
		tgtObj.setFeatureName(srcObj.getFeatureName());
		tgtObj.setFeatureTags(srcObj.getFeatureTags());
		tgtObj.setFeatureDescription(srcObj.getFeatureDescription());
		convertAbstractScenarioList();
	}

	protected String convertObjectName(String fileName) {
		// TODO add the layer parameter to the super class method
		return convertObjectName(fileName, tgtPrj.FIRST_LAYER);
	}

	private String convertObjectName(String fileName, String layer) {
		String qualifiedName = fileName.replace(",", "").trim();
		qualifiedName = qualifiedName.replace(srcPrj.getFileExt(layer), "");
		qualifiedName = qualifiedName.replace(srcPrj.getDir(layer).getAbsolutePath(), "");
		qualifiedName = qualifiedName.replace(File.separator, "::");
		qualifiedName = "pst::" + layer + qualifiedName;
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

		ArrayList<Section> examplesList = srcObj.getExamplesList(abstractScenario);
		for (Section examples : examplesList) {
			convertExamples(scenarioOutline, examples);
		}
		tgtObj.addScenarioOutline(scenarioOutline);
	}

	private void convertStep(Interaction abstractScenario, Section stepSrc) {
		Message step = tgtObj.createStep(abstractScenario, srcObj.getStep(stepSrc));
		if (srcObj.hasDocString(stepSrc)) {
			convertDocString(step, stepSrc);
		}
		if (srcObj.hasStepTable(stepSrc)) {
			convertStepTable(step, stepSrc);
		}
	}

	private void convertStepList(Interaction abstractScenario, ArrayList<Section> stepList) {
		for (Section step : stepList) {
			convertStep(abstractScenario, step);
		}
	}

	@Override
	protected ArrayList<ConvertibleObject> getFeatures(String layer) {
		return srcPrj.getObjects(layer);
	}

	@Override
	protected void initProjects() throws Exception {
		srcPrj = new AsciiDoctorProject();
		tgtPrj = new UMLProject();
	}

	@Override
	protected void save() throws Exception {
		tgtPrj.save();
	}

	@Override
	protected void loadFeatures() throws Exception {
		ArrayList<File> files = Utilities.recursivelyListFiles(srcPrj.getDir(srcPrj.FIRST_LAYER),
				srcPrj.getFileExt(srcPrj.FIRST_LAYER));
		srcPrj.getObjects(srcPrj.FIRST_LAYER).clear();
		for (File f : files) {
			srcPrj.createObject(f.getAbsolutePath()).load();
		}
	}

}
